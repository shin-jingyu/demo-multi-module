package me.nettee;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import me.nettee.dto.BoardCommandDto.BoardCreateCommand;
import me.nettee.dto.BoardCommandDto.BoardCommandResponse;
import me.nettee.mapper.BoardDtoMapper;
import me.nettee.usecase.BoardCreateUseCase;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/boards")
@RequiredArgsConstructor
public class BoardCommandApi {

    private final BoardCreateUseCase boardCreateUseCase;
    private final BoardDtoMapper mapper;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public BoardCommandResponse createBoard(@RequestBody @Valid BoardCreateCommand boardCreateCommand) {
        // Map to Domain
        var board = mapper.toDomain(boardCreateCommand);

        return BoardCommandResponse.builder()
                .board(boardCreateUseCase.createBoard(board))
                .build();
    }
}

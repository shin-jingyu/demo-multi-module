package me.nettee.api;

import lombok.RequiredArgsConstructor;
import me.nettee.dto.BoardQueryDto.BoardDetailResponse;
import me.nettee.mapper.BoardDtoMapper;
import me.nettee.usecase.BoardReadByStatusesUseCase;
import me.nettee.usecase.BoardReadUseCase;
import model.BoardQueryModels.BoardSummary;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import type.BoardStatus;

import java.util.Set;

@RestController
@RequestMapping("/api/v1/boards")
@RequiredArgsConstructor
public class BoardQueryApi {

    private final BoardReadUseCase boardReadUseCase;
    private final BoardReadByStatusesUseCase boardReadByStatusesUseCase;

    private final BoardDtoMapper mapper;

    @GetMapping("/{boardId}")
    public BoardDetailResponse getBoard(@PathVariable("boardId") long boardId) {
        var board = boardReadUseCase.getBoard(boardId);

        return mapper.toDtoDetail(board);
    }

    @GetMapping
    public Page<BoardSummary> getBoardsByStatuses(@RequestParam(defaultValue = "ACTIVE,SUSPENDED") Set<BoardStatus> statuses, Pageable pageable) {
        return boardReadByStatusesUseCase.findByStatuses(statuses, pageable);
    }
}

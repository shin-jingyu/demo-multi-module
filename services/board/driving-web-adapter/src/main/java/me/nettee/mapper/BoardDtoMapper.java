package me.nettee.mapper;

import domain.Board;
import me.nettee.dto.BoardCommandDto.BoardUpdateCommand;
import me.nettee.dto.BoardCommandDto.BoardCreateCommand;
import me.nettee.dto.BoardQueryDto.BoardDetailResponse;
import model.BoardQueryModels.BoardDetail;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface BoardDtoMapper {

    Board toDomain(BoardCreateCommand command);

    Board toDomain(Long id, BoardUpdateCommand command);

    BoardDetailResponse toDtoDetail(BoardDetail board);
}

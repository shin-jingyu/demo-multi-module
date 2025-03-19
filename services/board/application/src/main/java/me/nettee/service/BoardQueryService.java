package me.nettee.service;

import lombok.RequiredArgsConstructor;
import me.nettee.port.BoardQueryPort;
import me.nettee.usecase.BoardReadByStatusesUseCase;
import me.nettee.usecase.BoardReadUseCase;
import model.BoardQueryModels.BoardSummary;
import model.BoardQueryModels.BoardDetail;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import type.BoardStatus;

import java.util.Set;

import static me.nettee.BoardQueryErrorCode.BOARD_FORBIDDEN;
import static me.nettee.BoardQueryErrorCode.BOARD_NOT_FOUND;

@Service
@RequiredArgsConstructor
public class BoardQueryService implements BoardReadUseCase, BoardReadByStatusesUseCase {

    private final BoardQueryPort boardQueryPort;

    @Override
    public BoardDetail getBoard(Long id) {
        BoardDetail boardDetail =  boardQueryPort.findById(id)
                .orElseThrow(BOARD_NOT_FOUND::exception);

        if (boardDetail.status() == BoardStatus.SUSPENDED) {
            throw BOARD_FORBIDDEN.exception();
        }

        return boardDetail;
    }

    @Override
    public Page<BoardSummary> findByStatuses(Set<BoardStatus> statuses, Pageable pageable) {
        var boardPage = boardQueryPort.findByStatusesList(statuses, pageable);

        var filterBoardPage = boardPage.map(board ->
                board.status() == BoardStatus.SUSPENDED
                        ? new BoardSummary(board.id(), null, board.status(), board.createdAt(), board.updatedAt())
                        : board
        );

        return filterBoardPage;
    }
}

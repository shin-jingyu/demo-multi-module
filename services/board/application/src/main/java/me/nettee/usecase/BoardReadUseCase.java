package me.nettee.usecase;

import model.BoardQueryModels.BoardDetail;

public interface BoardReadUseCase {

    BoardDetail getBoard(Long id);
}
package me.nettee.dto;

import com.fasterxml.jackson.annotation.JsonRootName;
import domain.Board;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Builder;
import type.BoardStatus;

public final class BoardCommandDto {

    private BoardCommandDto() {
    }

    public record BoardCreateCommand(
            @NotBlank(message = "제목을 입력하십시오.")
            @Size(min = 3, message = "제목은 세 글자 이상 입력하세요.")
            String title,
            @NotBlank(message = "본문을 입력하십시오")
            @Size(min = 3, message = "제목은 세 글자 이상 입력하세요.")
            String content,

            BoardStatus status
    ) {
    }

    public record BoardUpdateCommand(
            @NotBlank(message = "제목을 입력하십시오.")
            @Size(min = 3, message = "제목은 세 글자 이상 입력하세요.")
            String title,
            @NotBlank(message = "본문을 입력하십시오")
            @Size(min = 3, message = "제목은 세 글자 이상 입력하세요.")
            String content
    ) {
    }

    @Builder
    @JsonRootName("board")
    public record BoardCommandResponse(
            Board board
    ) {
    }
}

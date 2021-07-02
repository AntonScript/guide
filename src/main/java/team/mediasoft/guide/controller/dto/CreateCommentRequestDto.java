package team.mediasoft.guide.controller.dto;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;
import javax.validation.constraints.Size;

public class CreateCommentRequestDto {
    @Positive
    private Long placeId;
    @NotNull
    @NotEmpty
    @Size(min = 1, max = 256)
    private String message;
    @Positive
    private Long userId;
    @Size(min = 1, max = 5)
    private Integer rating;

    public CreateCommentRequestDto() {
    }

    public CreateCommentRequestDto(Long placeId, String message, Long userId, Integer rating) {
        this.placeId = placeId;
        this.message = message;
        this.userId = userId;
        this.rating = rating;
    }

    public Long getPlaceId() {
        return placeId;
    }

    public String getMessage() {
        return message;
    }

    public Long getUserId() {
        return userId;
    }

    public Integer getRating() {
        return rating;
    }
}

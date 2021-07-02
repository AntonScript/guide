package team.mediasoft.guide.controller.dto;

import javax.validation.constraints.*;

public class CommentResponseDto {
    @Positive(message = "id сущности не может быть отрицательным числом")
    private final Long id;
    @Positive(message = "id сущности не может быть отрицательным числом")
    private final Long placeId;
    @NotBlank
    @Size(min = 1, max = 256)
    private final String message;
    @Positive(message = "id сущности не может быть отрицательным числом")
    private final Long userId;
    @Size(min = 1, max = 5)
    private final Integer rating;



    public CommentResponseDto(Long id, Long placeId, String message, Long userId, Integer rating) {
        this.id = id;
        this.placeId = placeId;
        this.message = message;
        this.userId = userId;
        this.rating = rating;
    }

    public Long getId() {
        return id;
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

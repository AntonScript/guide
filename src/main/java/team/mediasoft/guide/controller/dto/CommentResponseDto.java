package team.mediasoft.guide.controller.dto;

import javax.validation.constraints.*;

public class CommentResponseDto {
    @Positive
    private Long id;
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

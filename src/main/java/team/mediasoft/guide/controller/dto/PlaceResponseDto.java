package team.mediasoft.guide.controller.dto;

import javax.validation.constraints.*;
import java.util.Collections;
import java.util.List;

public class PlaceResponseDto {
    @Positive(message = "id сущности не может быть отрицательным числом")
    private final Long id;
    @NotBlank
    @Size(min = 1,max = 128)
    private final String shortName;
    @NotBlank
    @Size(min = 1,max = 256)
    private final String fullName;
    @NotBlank
    @Size(min = 1,max = 1024)
    private final String description;
    @NotBlank
    @Size(min = 1,max = 128)
    private final String typePlace;
    private final List<CommentResponseDto> comments;
    @Min(0L)
    private final Long count;
    @Min(0)
    private final Double rating;


    public PlaceResponseDto(Long id,
                            String shortName,
                            String fullName,
                            String description,
                            String typePlace,
                            List<CommentResponseDto> comments,
                            Long count,
                            Double rating
    ) {
        this.id = id;
        this.shortName = shortName;
        this.fullName = fullName;
        this.description = description;
        this.typePlace = typePlace;
        this.comments = Collections.unmodifiableList(comments);
        this.count = count;
        this.rating = rating;
    }



    public Long getId() {
        return id;
    }

    public String getShortName() {
        return shortName;
    }

    public String getFullName() {
        return fullName;
    }

    public String getDescription() {
        return description;
    }

    public String getTypePlace() {
        return typePlace;
    }

    public List<CommentResponseDto> getComments() {
        return comments;
    }

    public Long getCount() {
        return count;
    }

    public Double getRating() {
        return rating;
    }
}

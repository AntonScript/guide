package team.mediasoft.guide.controller.dto;

import javax.validation.constraints.*;
import java.util.List;

public class PlaceResponseDto {
    @Positive
    private Long id;
    @NotNull
    @NotEmpty
    @Size(min = 1,max = 128)
    private String shortName;
    @NotNull
    @NotEmpty
    @Size(min = 1,max = 256)
    private String fullName;
    @NotNull
    @NotEmpty
    @Size(min = 1,max = 1024)
    private String description;
    @NotNull
    @NotEmpty
    @Size(min = 1,max = 128)
    private String typePlace;
    private final List<CommentResponseDto> comments;
    @Min(0L)
    private Long count;
    @Min(0)
    private Double rating;


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
        this.comments = comments;
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

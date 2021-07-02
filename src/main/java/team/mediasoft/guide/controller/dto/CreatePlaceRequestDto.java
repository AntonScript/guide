package team.mediasoft.guide.controller.dto;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class CreatePlaceRequestDto {
    @NotNull
    @NotEmpty
    @Size(min = 1, max = 128)
    private String shortName;
    @NotNull
    @NotEmpty
    @Size(min = 1, max = 256)
    private String fullName;
    @NotNull
    @NotEmpty
    @Size(min = 1, max = 1024)
    private String description;
    @NotNull
    @Size(min = 1, max = 256)
    private Long typePlace;

    public CreatePlaceRequestDto() {
    }

    public CreatePlaceRequestDto(String shortName, String fullName, String description, Long typePlace) {
        this.shortName = shortName;
        this.fullName = fullName;
        this.description = description;
        this.typePlace = typePlace;
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

    public Long getTypePlace() {
        return typePlace;
    }
}

package team.mediasoft.guide.controller.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class CreatePlaceRequestDto {
    @NotBlank
    @Size(min = 1, max = 128)
    private final String shortName;
    @NotBlank
    @Size(min = 1, max = 256)
    private final String fullName;
    @NotBlank
    @Size(min = 1, max = 1024)
    private final String description;
    @NotNull
    @Size(min = 1, max = 256)
    private final Long typePlace;



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

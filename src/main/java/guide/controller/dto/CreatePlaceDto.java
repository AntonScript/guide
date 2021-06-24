package guide.controller.dto;

import guide.model.TypePlace;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.List;

public class CreatePlaceDto {
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

    public CreatePlaceDto() {
    }

    public String getShortName() {
        return shortName;
    }

    public void setShortName(String shortName) {
        this.shortName = shortName;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Long getTypePlace() {
        return typePlace;
    }

    public void setTypePlace(Long typePlace) {
        this.typePlace = typePlace;
    }
}

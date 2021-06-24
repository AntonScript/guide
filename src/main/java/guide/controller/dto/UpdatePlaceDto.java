package guide.controller.dto;

public class UpdatePlaceDto {
    private String shortName;
    private String fullName;
    private String description;
    private Long typePlace;

    public UpdatePlaceDto() {
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

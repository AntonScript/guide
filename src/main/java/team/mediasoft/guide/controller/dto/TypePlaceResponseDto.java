package team.mediasoft.guide.controller.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Positive;
import javax.validation.constraints.Size;

public class TypePlaceResponseDto {
    @Positive(message = "id сущности не может быть отрицательным числом")
    private final Long id;
    @NotBlank
    @Size(min = 1,max = 128)
    private final String type;


    public TypePlaceResponseDto(Long id, String type) {
        this.id = id;
        this.type = type;
    }

    public Long getId() {
        return id;
    }

    public String getType() {
        return type;
    }
}

package team.mediasoft.guide.controller.dto;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Positive;
import javax.validation.constraints.Size;

public class TypePlaceResponseDto {
    @Positive
    private Long id;
    @NotEmpty
    @Size(min = 1,max = 128)
    private String type;

    public TypePlaceResponseDto() {
    }

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

package team.mediasoft.guide.controller.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class CreateTypePlaceRequestDto {
    @NotBlank
    @Size(min = 1,max = 128)
    private final String type;

    public CreateTypePlaceRequestDto(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

}

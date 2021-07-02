package team.mediasoft.guide.controller.dto;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class CreateTypePlaceRequestDto {
    @NotNull
    @NotEmpty
    @Size(min = 1,max = 128)
    private String type;

    public CreateTypePlaceRequestDto() {
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}

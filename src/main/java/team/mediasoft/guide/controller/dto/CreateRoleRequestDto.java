package team.mediasoft.guide.controller.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class CreateRoleRequestDto {
    @NotBlank
    @Size(min = 1,max = 128)
    private final String role;

    public CreateRoleRequestDto(String role) {
        this.role = role;
    }

    public String getRole() {
        return role;
    }


}

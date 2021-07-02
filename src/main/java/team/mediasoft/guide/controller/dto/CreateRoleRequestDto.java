package team.mediasoft.guide.controller.dto;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class CreateRoleRequestDto {
    @NotNull
    @NotEmpty
    @Size(min = 1,max = 128)
    private String role;

    public CreateRoleRequestDto() {
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}

package team.mediasoft.guide.controller.dto;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;
import javax.validation.constraints.Size;

public class RoleResponseDto {
    @Positive
    private Long id;

    @NotNull
    @NotEmpty
    @Size(min = 1,max = 128)
    private String role;

    public RoleResponseDto() {
    }

    public RoleResponseDto(Long id, String role) {
        this.id = id;
        this.role = role;
    }

    public Long getId() {
        return id;
    }

    public String getRole() {
        return role;
    }
}

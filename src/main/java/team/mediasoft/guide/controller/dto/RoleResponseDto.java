package team.mediasoft.guide.controller.dto;

import javax.validation.constraints.*;

public class RoleResponseDto {
    @Positive(message = "id сущности не может быть отрицательным числом")
    private final Long id;

    @NotBlank
    @Size(min = 1,max = 128)
    private final String role;

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

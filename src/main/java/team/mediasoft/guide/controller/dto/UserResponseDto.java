package team.mediasoft.guide.controller.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Positive;
import java.util.Set;

public class UserResponseDto {
    @Positive(message = "id сущности не может быть отрицательным числом")
    private final Long id;
    @NotBlank
    private final String login;
    private final Set<String> roles;


    public UserResponseDto(Long id, String login, Set<String> roles) {
        this.id = id;
        this.login = login;
        this.roles = roles;
    }

    public Long getId() {
        return id;
    }

    public String getLogin() {
        return login;
    }

    public Set<String> getRoles() {
        return roles;
    }
}

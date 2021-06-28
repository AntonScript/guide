package team.mediasoft.guide.controller.dto;

import java.util.Set;

public class UserResponseDto {
    private Long id;
    private String login;
    private Set<String> roles;

    public UserResponseDto() {
    }

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

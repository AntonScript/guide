package team.mediasoft.guide.controller.dto;

public class UserResponseDto {
    private Long id;
    private String login;
    private Long idRole;

    public UserResponseDto() {
    }

    public UserResponseDto(Long id, String login, Long idRole) {
        this.id = id;
        this.login = login;
        this.idRole = idRole;
    }

    public Long getId() {
        return id;
    }

    public String getLogin() {
        return login;
    }

    public Long getIdRole() {
        return idRole;
    }
}

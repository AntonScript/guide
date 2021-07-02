package team.mediasoft.guide.controller.dto;

import javax.validation.constraints.*;

public class CreateUserRequestDto {
    @NotBlank
    @Size(min = 1,max = 128)
    private String login;

    @NotNull
    @NotEmpty
    @Size(min = 10,max = 128)
    private String password;

    @Positive
    private final Long idRole;


    public CreateUserRequestDto(String login, String password, Long idRole) {
        this.login = login;
        this.password = password;
        this.idRole = idRole;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    public Long getIdRole() {
        return idRole;
    }
}

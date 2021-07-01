package team.mediasoft.guide.controller.dto;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;
import javax.validation.constraints.Size;

public class CreateUserRequestDto {
    @NotNull
    @NotEmpty
    @Size(min = 1,max = 128)
    private String login;
    @NotNull
    @NotEmpty
    @Size(min = 10,max = 128)
    private String password;
    @Positive
    private Long idRole;

    public CreateUserRequestDto() {
    }

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

package pl.sda.java.event.service.dto;

public class UserSessionDto {
    private String email;
    private String nickname;

    public UserSessionDto(String email, String nickname) {
        this.email = email;
        this.nickname = nickname;
    }

    public String getEmail() {
        return email;
    }

    public String getNickname() {
        return nickname;
    }

}

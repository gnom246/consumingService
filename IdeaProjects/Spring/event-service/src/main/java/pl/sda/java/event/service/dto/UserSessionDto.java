package pl.sda.java.event.service.dto;

public class UserSessionDto {
    private String email;

    public UserSessionDto(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

}

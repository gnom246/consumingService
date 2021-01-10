package pl.sda.java.event.service.excetions;

public class UserDoesntExistException extends RuntimeException {
    private String email;

    public UserDoesntExistException(String email) {
        this.email = email;
    }

    @Override
    public String getMessage() {
        return String.format("User identified by %s couldn't be found.", email);
    }

}

package pl.sda.java.event.service.services;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.SessionScope;
import pl.sda.java.event.service.dao.UserRepository;
import pl.sda.java.event.service.dto.UserSessionDto;
import pl.sda.java.event.service.entities.UserEntity;
import pl.sda.java.event.service.excetions.InvalidCredentialsException;
import pl.sda.java.event.service.excetions.UserDoesntExistException;

import java.util.UUID;

@Service
@SessionScope
public class LoginService implements InitializingBean {

    private final UserRepository userRepository;

    private UUID uuid;

    private boolean logged;
    private UserSessionDto userSessionDto;

    public LoginService(UserRepository userRepository) {
        uuid = UUID.randomUUID();
        logged = false;
        this.userRepository = userRepository;
    }

    public void loginUser(String email, String password) {

        final UserEntity userEntity = userRepository.findUserByEmail(email)
                .orElseThrow(() -> new UserDoesntExistException(email));

        if (!userEntity.getPassword().equals(password)) {
            throw new InvalidCredentialsException("invalid password");
        }

        this.userSessionDto = new UserSessionDto(userEntity.getEmail());
        this.logged = true;
    }
    public boolean isLogged() {
        return logged;
    }

    public UserSessionDto getUserSessionDto() {
        return userSessionDto;
    }

    @Override
    public void afterPropertiesSet() throws Exception {
    }
}

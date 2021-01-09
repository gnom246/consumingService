package pl.sda.java.event.service.services;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.SessionScope;
import pl.sda.java.event.service.dao.UserRepository;
import pl.sda.java.event.service.dto.UserSessionDto;

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
    @Override
    public void afterPropertiesSet() throws Exception {
    }
}

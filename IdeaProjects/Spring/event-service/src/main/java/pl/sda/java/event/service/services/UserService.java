package pl.sda.java.event.service.services;

import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import pl.sda.java.event.service.dao.UserDao;
import pl.sda.java.event.service.dao.UserRepository;
import pl.sda.java.event.service.dto.RegisteredUserDto;
import pl.sda.java.event.service.entities.UserEntity;

@Service
public class UserService {
    private final UserDao userDao;
    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;


    public UserService(UserDao userDao, UserRepository userRepository, PasswordEncoder passwordEncoder) {
        this.userDao = userDao;
        this.userRepository = userRepository;
        this.passwordEncoder = passwordEncoder;
    }
    public RegisteredUserDto registerUser(String email, String nickname, String password) {
        final UserEntity userEntity = new UserEntity();
        userEntity.setEmail(email);
        userEntity.setNickname(nickname);

        userEntity.setPassword(passwordEncoder.encode(password));

//        userDao.save(userEntity);
        userRepository.save(userEntity);

        return null;
    }
}

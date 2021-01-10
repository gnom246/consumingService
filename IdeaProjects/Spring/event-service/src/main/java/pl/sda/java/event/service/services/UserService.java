package pl.sda.java.event.service.services;

import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import pl.sda.java.event.service.dao.UserDao;
import pl.sda.java.event.service.dao.UserRepository;
import pl.sda.java.event.service.dao.RoleRepository;
import pl.sda.java.event.service.dto.RegisteredUserDto;
import pl.sda.java.event.service.entities.RolesEntity;
import pl.sda.java.event.service.entities.UserEntity;

import java.util.HashSet;

@Service
public class UserService {
    private final UserDao userDao;
    private final UserRepository userRepository;
    private final RoleRepository roleRepository;
    private final PasswordEncoder passwordEncoder;


    public UserService(UserDao userDao, UserRepository userRepository, RoleRepository roleRepository, PasswordEncoder passwordEncoder) {
        this.userDao = userDao;
        this.userRepository = userRepository;
        this.roleRepository = roleRepository;
        this.passwordEncoder = passwordEncoder;
    }
    public RegisteredUserDto registerUser(String email, String nickname, String password) {
        final UserEntity userEntity = new UserEntity();
        userEntity.setEmail(email);
        userEntity.setNickname(nickname);

        userEntity.setPassword(passwordEncoder.encode(password));

//        final String roleName = "USER";
//        RolesEntity rolesEntity = roleRepository
//                .findRolesEntityByRoleName(roleName)
//                .orElseGet(() -> roleRepository.save(new RolesEntity(roleName)));
//        HashSet<RolesEntity> rolesEntitiesSet = new HashSet<>();
//        rolesEntitiesSet.add(rolesEntity);
//        userEntity.setRoles(rolesEntitiesSet);

        userRepository.save(userEntity);

        return null;
    }
}

package pl.sda.java.event.service.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.sda.java.event.service.entities.UserEntity;

import java.util.Optional;

public interface UserRepository extends JpaRepository<UserEntity, Long> {
    Optional<UserEntity> findUserByEmail(String email);
}

package pl.sda.java.event.service.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.sda.java.event.service.entities.UserEntity;

public interface UserRepository extends JpaRepository<UserEntity, Long> {
}

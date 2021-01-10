package pl.sda.java.event.service.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.sda.java.event.service.entities.RolesEntity;
import pl.sda.java.event.service.entities.UserEntity;

import java.util.Optional;

public interface RoleRepository extends JpaRepository<UserEntity, Long> {
    Optional<RolesEntity> findRolesEntityByRoleName(String roleName);
}

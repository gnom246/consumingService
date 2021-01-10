package pl.sda.java.event.service.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@Entity
@Table(name = "users")
public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true)
    private String email;

    private String nickname;

    private String password;

    private LocalDateTime created = LocalDateTime.now();

    @ManyToMany
    @JoinColumn(name = "users_roles")
    private Set<RolesEntity> roles = new HashSet<>();

    public void addRole(RolesEntity roleEntity) {
        roles.add(roleEntity);
    }
}

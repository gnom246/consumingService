package pl.sda.java.event.service.dao;

import org.springframework.stereotype.Repository;
import pl.sda.java.event.service.entities.UserEntity;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

@Repository
public class UserDao {
    @PersistenceContext
    private EntityManager entityManager;

    @Transactional
    void save(UserEntity userEntity) {
        entityManager.persist(userEntity);
    }
}

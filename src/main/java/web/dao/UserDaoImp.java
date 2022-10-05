package web.dao;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;
import web.model.User;

@Service("studentServiceImpl")
public class UserDaoImp {
    private UserDao userDao;
    @PersistenceContext
    private EntityManager entityManager;
    @Transactional
    public void saveUser(User user) {
        entityManager.persist(user);

    }
}

package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import web.dao.UserDao;
import web.model.User;

import java.util.List;

@Service
public class UserServiceImp implements  UserService{
    @Autowired
    private final UserDao userDao;
    public  UserServiceImp(UserDao userDao) {
        this.userDao = userDao;
    }
    @Override
    @Transactional
    public void save(User user) {
        userDao.save(user);
    }

    @Override
    @Transactional
    public List<User> listAll() {
        return userDao.listAll();
    }

    @Override
    public User get(Long id) {
        return userDao.get(id);
    }

    @Override
    public void delete(Long id) {
        userDao.delete(id);
    }
}


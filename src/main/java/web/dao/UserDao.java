package web.dao;

import web.model.User;

import java.util.List;

public interface UserDao {
    void save(User user);

    public List<User> listAll();
    public User get(Long id);

    public void delete(Long id);
}

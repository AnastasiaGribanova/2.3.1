package web.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import web.model.User;

import java.util.List;
@Service
@Transactional
public interface UserService {

    void save(User user);

    public List<User> listAll();
    public User get(Long id);

    public void delete(Long id);
}

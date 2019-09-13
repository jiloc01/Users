package dao;

import models.User;
import java.util.List;

public interface UserDao {
    public void save(User user);
    public  List<User> findAll();
}

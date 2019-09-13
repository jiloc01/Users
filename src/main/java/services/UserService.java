package services;

import dao.UserDAOImpl;
import models.User;
import java.util.List;

public class UserService {
    private UserDAOImpl userDao = new UserDAOImpl();
    public UserService(){
    }
    public void saveUser(User user){
        userDao.save(user);
    }
    public List<User> findAllUsers(){
        return userDao.findAll();
    }
}

import models.User;
import services.UserService;
import java.sql.SQLException;
import java.util.List;

public class Main {
    public static void main(String[] args) throws SQLException {
        UserService userService = new UserService();
        User userDenis = new User("Denis", 21);
        userService.saveUser(userDenis);
        User userAndrew = new User("Andrew", 26);
        userService.saveUser(userAndrew);
        List<User> userList = userService.findAllUsers();
        System.out.println(userList.size());
        System.out.println(userList.get(1).toString());

    }

}

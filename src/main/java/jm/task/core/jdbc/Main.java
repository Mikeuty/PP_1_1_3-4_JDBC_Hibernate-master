package jm.task.core.jdbc;

import jm.task.core.jdbc.dao.UserDao;
import jm.task.core.jdbc.dao.UserDaoJDBCImpl;
import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;

public class Main {

    public static void main(String[] args) {
        UserDao userDao = new UserDaoJDBCImpl();
        UserService userService = new UserServiceImpl(userDao);
        userService.createUsersTable();
        userService.saveUser("Иван", "Михайлов", (byte) 30);
        userService.saveUser("Петр", "Денисов", (byte) 28);
        userService.saveUser("Михаил", "Иванов", (byte) 27);
        userService.saveUser("Денис", "Петров", (byte) 26);
        userService.getAllUsers();
        userService.cleanUsersTable();
        userService.dropUsersTable();
    }
}

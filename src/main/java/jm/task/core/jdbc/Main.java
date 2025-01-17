package jm.task.core.jdbc;

import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.service.UserServiceImpl;
import jm.task.core.jdbc.util.Util;

public class Main {

    public static void main(String[] args) {
        UserServiceImpl userServiceImpl = new UserServiceImpl();
        userServiceImpl.createUsersTable();
        userServiceImpl.saveUser("Иван", "Михайлов", (byte) 30);
        userServiceImpl.saveUser("Петр", "Денисов", (byte) 28);
        userServiceImpl.saveUser("Михаил", "Иванов", (byte) 27);
        userServiceImpl.saveUser("Денис", "Петров", (byte) 26);
        userServiceImpl.getAllUsers();
        userServiceImpl.cleanUsersTable();
        userServiceImpl.dropUsersTable();
    }
}

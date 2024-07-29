package jm.task.core.jdbc;

import jm.task.core.jdbc.service.UserServiceImpl;

public class Main {
    public static void main(String[] args) {
        UserServiceImpl userService = new UserServiceImpl();
        userService.createUsersTable();
        userService.saveUser("Джими", "Хендрикс", (byte) 27);
        userService.saveUser("Джими", "Моррисон", (byte) 27);
        userService.saveUser("Дженис", "Джоплин", (byte) 27);
        userService.saveUser("Курт", "Кобейн", (byte) 27);
        System.out.println(userService.getAllUsers());
        userService.cleanUsersTable();
        userService.dropUsersTable();
    }
}

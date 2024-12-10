package org.sample;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class UserManagerTest {

    private UserManager manager;

    @BeforeEach
    void create()
    {
        manager = new UserManager();
    }

    @Test
    void addUser()
    {
        User user = new User("Vadim", 19);
        manager.addUser(user);
        Assertions.assertTrue(manager.userExists(user));
    }

    @Test
    void removeUser() {
        User user = new User("Vadim", 19);
        manager.addUser(user);
        Assertions.assertTrue(manager.userExists(user));
        manager.removeUser(user);
        Assertions.assertFalse(manager.userExists(user));
    }

    @Test
    void filterUserByAge() {
        User user1 = new User("Vadim", 19);
        User user2 = new User("Vova", 20);
        User user3 = new User("Max", 19);
    }

    @Test
    void getAllUsers() {
        User user1 = new User("Vadim", 19);
        User user2 = new User("Vova", 20);
        User user3 = new User("Max", 19);

        manager.addUser(user1);
        manager.addUser(user2);
        manager.addUser(user3);

        List<User> users = manager.getAllUsers();
        Assertions.assertTrue(users.contains(user1));
        Assertions.assertTrue(users.contains(user2));
        Assertions.assertTrue(users.contains(user3));
        Assertions.assertFalse(users.contains(new User("Ilya", 23)));
    }

    @Test
    void userExists() {
        User user = new User("Vadim", 19);
        manager.addUser(user);
        Assertions.assertTrue(manager.userExists(user));
        Assertions.assertFalse(manager.userExists(new User("Vova", 20)));
    }
}
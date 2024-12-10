package org.sample;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class UserManager
{
    private ArrayList<User> users;

    UserManager()
    {
        users = new ArrayList<User>();
    }

    void addUser(User user)
    {
        users.add(user);
    }

    void removeUser(User user)
    {
        users.remove(user);
    }

    List<User> filterUserByAge(int age)
    {
        return users.stream().filter(x -> x.age == age).collect(Collectors.toList());
    }

    List<User> getAllUsers()
    {
        return users;
    }

    boolean userExists(User user)
    {
        return users.contains(user);
    }
}

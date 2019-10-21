package com.openclassrooms.magicgithub.api;

import android.util.Log;

import com.openclassrooms.magicgithub.model.User;

import java.util.List;
import java.lang.String;
import java.util.Random;

import static com.openclassrooms.magicgithub.api.FakeApiServiceGenerator.FAKE_USERS;
import static com.openclassrooms.magicgithub.api.FakeApiServiceGenerator.generateUsers;
import static com.openclassrooms.magicgithub.api.FakeApiServiceGenerator.FAKE_USERS_RANDOM;
import static java.sql.DriverManager.println;

public class FakeApiService implements ApiService {

    private List<User> users = generateUsers();

    /**
     * Return a list of {@link User}
     * Those users must be generated by {@link FakeApiServiceGenerator}
     */
    @Override
    public List<User> getUsers() {
        // TODO: A modifier
        return users;
    }

    /**
     * Generate a random {@link User} and add it {@link FakeApiService#users} list.
     * This user must be get from the {@link FakeApiServiceGenerator#FAKE_USERS_RANDOM} list.
     */
    @Override
    public void generateRandomUser() {
        // TODO: A modifier
        User randomUser = User.random();
        users.add(randomUser);
    }

    /**
     * Delete a {@link User} from the {@link FakeApiService#users} list.
     */
    @Override
    public void deleteUser(User user) {
        // TODO: A modifier
        users.remove(user);
    }
}

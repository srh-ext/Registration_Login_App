package database;

import dao.User;

import java.util.ArrayList;

public class InMemoryDatabase {

    private ArrayList<User> userDatabase;

    public InMemoryDatabase() {
        this.userDatabase = new ArrayList<>();
    }

    /**
     * Adds new user to the in memory database. If not empty.
     * @param user User object
     * @return boolean if user successfully added, false if null or not added.
     */
    public boolean addUser(User user) {
        if (user != null) {
            //TODO: check if user already exists
            return this.userDatabase.add(user);
        }
        return false;
    }
}

package logic;

import dao.User;
import database.InMemoryDatabase;

import java.sql.Timestamp;

public class UserManagement {
    private InMemoryDatabase database;

    public UserManagement() {
        this.database = new InMemoryDatabase();
    }

    public boolean saveUser(User user) {
        //TODO: set registration date
        user.setRegistrationDate(new Timestamp(new java.util.Date().getTime()));
        return this.database.addUser(user);
    }

    public User authenticateUser(String email, String password) {
        User user = this.database.getUser(email);
        if (user != null) {
            if (user.getPassword().equals(password)) {
                return user;
            }
        }
        return null;
    }
}

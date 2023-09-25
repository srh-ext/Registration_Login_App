package ui;

import dao.User;

import java.sql.Date;
import java.util.Scanner;

public class LoginUI extends UIMenu {
    public LoginUI() {
        this.setMenuName("Login");
    }

    @Override
    public void showDialog() {
        System.out.println("Menu: " + this.getMenuName());
        //initialize scanner
        Scanner scanner = new Scanner(System.in);
        String email = null;
        String password = null;
        while(true) {
            //email
            System.out.print("Please, enter email: ");
            email = scanner.nextLine();
            if (email == null || email.isBlank()) {
                System.out.println("Please enter correct email.");
            } else {
                //password
                System.out.print("Please, enter password: ");
                password = scanner.nextLine();
                if (password == null || password.isBlank()) {
                    System.out.println("Please enter password.");
                } else {
                    break;
                }
            }
        }

        //speichern in der Datenbank
        User user = this.getUserManagement().authenticateUser(email, password);
        //show success to user
        if (user != null) {
            System.out.println("You are successfully signed in.");
            System.out.println("Welcome back, " + user.getLastname());
        } else {
            System.out.println("Username or password are incorrect. Good bye!");
        }
    }
}

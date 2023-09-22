package ui;

import dao.User;

import java.sql.Date;
import java.sql.Timestamp;
import java.util.Scanner;

public class RegistrationUI extends UIMenu {
    public RegistrationUI() {
        this.setMenuName("Registration");
    }

    @Override
    public void showDialog() {
        System.out.println("Menu: " + this.getMenuName());
        //initialize scanner
        Scanner scanner = new Scanner(System.in);
        //create a new user object
        User user = new User();
        //first name
        System.out.print("Please, enter first name: ");
        user.setFirstname(scanner.nextLine());
        //last name
        System.out.print("Please, enter last name: ");
        user.setLastname(scanner.nextLine());
        //last name
        System.out.print("Please, enter birthday, (yyyy-mm-dd): ");
        Date birthday = Date.valueOf(scanner.nextLine());
        user.setBirthdate(birthday);
        //sex
        System.out.print("Please, enter sex (male, female): ");
        User.Sex sex = User.Sex.valueOf(scanner.nextLine());
        user.setSex(sex);
        //email
        System.out.print("Please, enter email: ");
        user.setEmail(scanner.nextLine());
        //password
        System.out.print("Please, enter password: ");
        user.setPassword(scanner.nextLine());

        //TODO: validieren
        //speichern in der Datenbank
        boolean done = this.getUserManagement().saveUser(user);
        //show success to user
        System.out.println();
    }
}

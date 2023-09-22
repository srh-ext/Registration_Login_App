package ui;

import dao.User;

public class RegistrationUI extends UIMenu {
    public RegistrationUI() {
        this.setMenuName("Registration");
    }

    @Override
    public void showDialog() {
        System.out.println("Menu: " + this.getMenuName());
        User user = new User();
        //scanner
        //firstname maske
        //lastname
        //email
        //geburtstag
        //password

        //validieren
        //speichern in der Datenbank
        boolean done = this.getUserManagement().saveUser(user);
        //show success to user
    }
}

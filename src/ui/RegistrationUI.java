package ui;

public class RegistrationUI implements UIMenuInterface {
    private static final String menuName = "Registration";
    @Override
    public void showDialog() {
        System.out.println("Menu: " + menuName);
        System.out.println("Registration...");
    }

    @Override
    public String getMenuName() {
        return menuName;
    }

    @Override
    public boolean isExit() {
        return false;
    }
}

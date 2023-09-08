package ui;

public class LoginUI implements UIMenuInterface {
    private static final String menuName = "Login";
    @Override
    public void showDialog() {
        System.out.println("Menu: " + menuName);
        System.out.println("Login...");
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

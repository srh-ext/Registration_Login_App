package ui;

public class LogoutUI implements UIMenuInterface {
    private static final String menuName = "Logout";
    @Override
    public void showDialog() {
        System.out.println("Menu: " + menuName);
        System.out.println("Logout...");
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

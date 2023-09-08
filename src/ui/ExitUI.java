package ui;

public class ExitUI implements UIMenuInterface {
    private static final String menuName = "Exit";
    @Override
    public void showDialog() {
        System.out.println("Menu: " + menuName);
        System.out.println("Exiting...");
    }

    @Override
    public String getMenuName() {
        return menuName;
    }

    @Override
    public boolean isExit() {
        return true;
    }
}

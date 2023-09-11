package ui;

public abstract class UIMenu  implements UIMenuInterface {

    private String menuName = "Menu";
    @Override
    public String getMenuName() {
        return menuName;
    }

    public void setMenuName(String menuName) {
        this.menuName = menuName;
    }

    @Override
    public void showDialog() {
        System.out.println("Menu: " + this.getMenuName());
    }

    @Override
    public boolean isExit() {
        return false;
    }
}

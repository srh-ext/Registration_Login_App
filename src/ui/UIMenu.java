package ui;

import logic.UserManagement;

public abstract class UIMenu  implements UIMenuInterface {

    private String menuName = "Menu";
    private UserManagement userManagement;
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

    @Override
    public void setUserManagement(UserManagement userManagement) {
        this.userManagement = userManagement;
    }

    @Override
    public UserManagement getUserManagement() {
        return this.userManagement;
    }
}

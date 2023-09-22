package ui;

import dao.User;
import logic.UserManagement;

public interface UIMenuInterface {

    void showDialog();
    String getMenuName();
    boolean isExit();
    void setUserManagement(UserManagement userManagement);
    UserManagement getUserManagement();
}
package ui;

import org.junit.Assert;
import org.junit.Test;

public class LoginUITest extends UITest {

    public LoginUITest() {
        super.setMenu(new LoginUI());
        super.setMenuName("Login");
    }
}

package ui;

import org.junit.Assert;
import org.junit.Test;

public class RegistrationUITest extends UITest {

    private static final String MENU_NAME = "Registration";

    public RegistrationUITest() {
        super.setMenu(new RegistrationUI());
        super.setMenuName(MENU_NAME);
    }
}

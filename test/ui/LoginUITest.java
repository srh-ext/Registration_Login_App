package ui;

import org.junit.Assert;
import org.junit.Test;

public class LoginUITest {

    @Test
    public void testSetMenuName() {
        System.out.println("testSetMenuName");
        UIMenu loginMenu = new LoginUI();
        Assert.assertEquals(loginMenu.getMenuName(), "Exit");
        loginMenu.setMenuName("Test");
        Assert.assertEquals(loginMenu.getMenuName(), "Test");
    }

    @Test
    public void testGetMenuName() {
        System.out.println("testGetMenuName");
        UIMenuInterface loginMenu = new LoginUI();
        System.out.println(loginMenu.getClass().toString());
        Assert.assertTrue(loginMenu instanceof LoginUI);
        Assert.assertNotNull(loginMenu.getMenuName());
        Assert.assertEquals(loginMenu.getMenuName(), "Login");
    }

    @Test
    public void testIsExit() {
        System.out.println("testIsExit");
        UIMenuInterface loginMenu = new LoginUI();
        Assert.assertFalse(loginMenu.isExit());
    }
}

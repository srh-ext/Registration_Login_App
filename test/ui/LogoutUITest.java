package ui;

import org.junit.Assert;
import org.junit.Test;

public class LogoutUITest {

    @Test
    public void testSetMenuName() {
        System.out.println("testSetMenuName");
        UIMenu logoutMenu = new LogoutUI();
        Assert.assertEquals(logoutMenu.getMenuName(), "Logout");
        logoutMenu.setMenuName("Test");
        Assert.assertEquals(logoutMenu.getMenuName(), "Test");
    }

    @Test
    public void testGetMenuName() {
        System.out.println("testGetMenuName");
        UIMenuInterface logoutMenu = new LogoutUI();
        System.out.println(logoutMenu.getClass().toString());
        Assert.assertTrue(logoutMenu instanceof LogoutUI);
        Assert.assertNotNull(logoutMenu.getMenuName());
        Assert.assertEquals("Logout", logoutMenu.getMenuName());
    }

    @Test
    public void testIsExit() {
        System.out.println("testIsExit");
        UIMenuInterface logoutMenu = new LogoutUI();
        Assert.assertFalse(logoutMenu.isExit());
    }
}

package ui;

import org.junit.Assert;
import org.junit.Test;

public class RegistrationUITest {

    @Test
    public void testSetMenuName() {
        System.out.println("testSetMenuName");
        UIMenu regMenu = new RegistrationUI();
        Assert.assertEquals(regMenu.getMenuName(), "Registration");
        regMenu.setMenuName("Test");
        Assert.assertEquals(regMenu.getMenuName(), "Test");
    }

    @Test
    public void testGetMenuName() {
        System.out.println("testGetMenuName");
        UIMenuInterface regMenu = new RegistrationUI();
        System.out.println(regMenu.getClass().toString());
        Assert.assertTrue(regMenu instanceof RegistrationUI);
        Assert.assertNotNull(regMenu.getMenuName());
        Assert.assertEquals(regMenu.getMenuName(), "Registration");
    }

    @Test
    public void testIsExit() {
        System.out.println("testIsExit");
        UIMenuInterface regMenu = new RegistrationUI();
        Assert.assertFalse(regMenu.isExit());
    }
}

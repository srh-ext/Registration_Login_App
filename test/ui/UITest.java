package ui;

import org.junit.Assert;
import org.junit.Test;

public abstract class UITest {

    @Test
    public final void testSetMenuName() {
        System.out.println("testSetMenuName");
        UIMenu exitMenu = new ExitUI();
        Assert.assertEquals(exitMenu.getMenuName(), "Exit");
        exitMenu.setMenuName("Test");
        Assert.assertEquals(exitMenu.getMenuName(), "Test");
    }

    @Test
    public final void testGetMenuName() {
        System.out.println("testGetMenuName");
        UIMenuInterface exitMenu = new ExitUI();
        System.out.println(exitMenu.getClass().toString());
        Assert.assertTrue(exitMenu instanceof ExitUI);
        Assert.assertNotNull(exitMenu.getMenuName());
        Assert.assertEquals(exitMenu.getMenuName(), "Exit");
    }

    @Test
    public final void testIsExit() {
        System.out.println("testIsExit");
        UIMenuInterface exitMenu = new ExitUI();
        Assert.assertTrue(exitMenu.isExit());
    }
}

package ui;

import org.junit.Assert;
import org.junit.Test;

public abstract class UITest {

    private UIMenu menu = null;
    private String menuName = "Menu";

    public void setMenu(UIMenu menu) {
        this.menu = menu;
    }

    public void setMenuName(String menuName) {
        this.menuName = menuName;
    }

    @Test
    public final void testSetMenuName() {
        System.out.println("testSetMenuName");
        Assert.assertEquals(menu.getMenuName(), menuName);
        menu.setMenuName("Test");
        Assert.assertEquals(menu.getMenuName(), "Test");
    }

    @Test
    public final void testGetMenuName() {
        System.out.println("testGetMenuName");

        System.out.println(menu.getClass().toString());
        Assert.assertNotNull(menu.getMenuName());
        Assert.assertEquals(menu.getMenuName(), this.menuName);
    }

    @Test
    public final void testIsExit() {
        System.out.println("testIsExit");
        System.out.println(menu.getClass().toString());
        System.out.println(menu.isExit());

        if (this.menu instanceof ExitUI) {
            Assert.assertTrue(menu.isExit());
        } else {
            Assert.assertFalse(menu.isExit());
        }
    }
}

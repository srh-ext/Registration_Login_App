import dao.User;
import database.InMemoryDatabase;
import org.junit.Assert;
import org.junit.Test;

public class InMemoryDatabaseTest {
    @Test
    public void testIfInitialDBIsEmpty() {
        System.out.println("testIfInitialDBIsEmpty");
        InMemoryDatabase db = new InMemoryDatabase();
        int size = db.getAllUser().size();
        Assert.assertTrue(size == 0);
    }

    @Test
    public void testIfDBContainsOneUser() {
        System.out.println("testIfDBContainsOneUser");
        InMemoryDatabase db = new InMemoryDatabase();
        int size = db.getAllUser().size();
        Assert.assertTrue(size == 0);

        User user1 = new User();
        db.addUser(user1);
        int size2 = db.getAllUser().size();
        Assert.assertTrue(size2 == 1);
    }

    public void testRemoveUser() {

    }
}

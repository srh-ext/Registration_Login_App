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
        System.out.println("testRemoveUser");
        // Create tmp database
        InMemoryDatabase db = new InMemoryDatabase();

        //User #1
        User user1 = new User();
        user1.setId(1);
        //User #2
        User user2 = new User();
        user2.setId(2);
        //User #3
        User user3 = new User();
        user3.setId(3);
        // Add users to the database
        db.addUser(user1);
        db.addUser(user2);
        db.addUser(user3);
        // check how many user are in the db.
        int size = db.getAllUser().size();
        System.out.println(size + " users added to the database.");
        // test Remove user
        boolean isRemoved = db.removeUser(2);
    }
}

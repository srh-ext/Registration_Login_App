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

    @Test
    public void testGetUserById() {
        System.out.println("testGetUserById");
        InMemoryDatabase db = new InMemoryDatabase();
        //User #1
        User user1 = new User();
        user1.setId(1);
        db.addUser(user1);

        System.out.println("");
        User userT1 = db.getUser(1);
        Assert.assertNotNull(userT1);
        Assert.assertEquals(user1.getId(), userT1.getId());

        System.out.println("");
        User userT2 = db.getUser(2);
        Assert.assertNull(userT2);
    }

    @Test
    public void testGetUserByEmail() {
        System.out.println("testGetUserByEmail");
        InMemoryDatabase db = new InMemoryDatabase();
        //User #1
        User user1 = new User();
        user1.setId(1);
        user1.setEmail("social@solovyov.de");
        db.addUser(user1);

        System.out.println("");
        User userT1 = db.getUser("social@solovyov.de");
        Assert.assertNotNull(userT1);
        Assert.assertEquals(user1.getEmail(), userT1.getEmail());

        System.out.println("");
        User userT2 = db.getUser("test@solovyov.de");
        Assert.assertNull(userT2);
    }

    @Test
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
        System.out.println("Check remove user");
        boolean isRemoved = db.removeUser(2);
        Assert.assertTrue(isRemoved);

        // check amount of users in the database
        System.out.println("Check amount of users in the database.");
        int s = db.getAllUser().size();
        Assert.assertEquals(s,2);

        // try to find removed user by id
        System.out.println("Check if removed user can be found.");
        User removedUser = db.getUser(2);
        Assert.assertNull(removedUser);
    }
}

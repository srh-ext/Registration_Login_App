package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class testDatabase {

    public testDatabase() {

    }

    public void getConnection() {
        try {
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://127.0.0.1:8889/world", "root", "root");
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("select * from city");
            while (rs.next())
                System.out.println(rs.getInt(1) + "  " + rs.getString(2) + "  " + rs.getString(3));
            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

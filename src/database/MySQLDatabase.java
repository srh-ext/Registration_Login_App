package database;

import dao.User;

import java.sql.*;
import java.util.ArrayList;

public class MySQLDatabase {

    private String host = "127.0.0.1";
    private String username = "root";
    private String password = "root";
    private int port = 8889;
    private String dbname = "registration_login_app";

    public MySQLDatabase() {
    }

    public Connection getConnection() {
        Connection con = null;
        try {
            //"jdbc:mysql:///127.0.0.1:8889/registration_login_app"
            con = DriverManager.getConnection("jdbc:mysql://" + host + ":" + port + "/" + dbname,
                    username, password);
        } catch(SQLException ex) {
            System.out.println("ERROR: cannot create database connection!\n" + ex.getMessage());
        }

        return con;
    }

    public ArrayList<User> getAllUser() {
        ArrayList<User> users = new ArrayList<>();
        try {
            Connection con = this.getConnection();
            //PreparredStatement
            Statement state = con.createStatement();
            ResultSet list = state.executeQuery("SELECT * FROM user;");
            while(list.next()) {
                User user = new User();
                user.setId(list.getInt(1));
                user.setFirstname(list.getString(2));
                user.setFirstname(list.getString(3));
                user.setEmail(list.getString("email"));
                user.setPassword(list.getString("password"));
                user.setBirthdate(list.getDate("birthday"));
                user.setRegistrationDate(list.getTimestamp("registrationDate"));
                user.setMailSent(list.getBoolean("mailSent"));
                //output
                System.out.println(list.getInt(1)
                        + " " + list.getString(2)
                        + " " + list.getString(3)
                        + " " + list.getString("email"));

                users.add(user);
            }
            con.close();
        } catch (SQLException ex) {
            System.out.println("ERROR: cannot read data from user table.");
        }

        return users;
    }
}

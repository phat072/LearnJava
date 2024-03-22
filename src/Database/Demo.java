package Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
public class Demo {
    public static void main(String[] args) throws SQLException {
        // TODO Auto-generated method stub

        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/db_testing","root","root");
        System.out.println("connection established---");

        Statement s=con.createStatement();

        s.execute("create database databasename");


    }
}

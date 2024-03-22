package Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class InsertValues
{
    public static void main(String[]args) throws ClassNotFoundException, SQLException
    {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/db_testing","root","root");
        System.out.println("connection established---");

        PreparedStatement ps=con.prepareStatement("insert into employee values(?,?,?,?)");

        Scanner sc=new Scanner(System.in);

        System.out.println("enter id..");
        int id=sc.nextInt();
        System.out.println("enter name..");
        String name=sc.next();
        System.out.println("enter address..");
        String address=sc.next();
        System.out.println("enter designation..");
        String design=sc.next();

        ps.setInt(1, id);
        ps.setString(2, name);
        ps.setString(3, address);
        ps.setString(4, design);

        ps.executeUpdate();
        System.out.println("..........values inserted.........");

    }
}
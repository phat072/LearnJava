package Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class DeleteValues {

    public static void main(String[] args) throws ClassNotFoundException, SQLException
    {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/db_testing","root","root");
        System.out.println("connection established---");

        PreparedStatement ps=con.prepareStatement("delete from employee where empid=?");

        Scanner sc=new Scanner(System.in);

        System.out.println("enter id...");
        int id=sc.nextInt();

        ps.setInt(1, id);

        ps.executeUpdate();
        System.out.println("values deleted...");

        con.close();
    }

}
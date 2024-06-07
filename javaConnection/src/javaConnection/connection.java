package javaConnection;
import java.sql.*;

public class connection {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Class.forName("com.mysql.cj.jdbc.Driver");
	    DriverManager.getConnection("jdbc:mysql://localhost:3306","root","");
		System.out.println("connected successfully!!");
	}

}

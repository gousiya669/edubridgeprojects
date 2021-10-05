package com.edubridge.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBC_Example {

	public static void main(String[] args) {
	
		try {
			//Register driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//Create Connection
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/gousiya", "root", "9908559336");
			
			//Create Statement
			Statement statement = con.createStatement();
			
			//Execute Query
			ResultSet rs = statement.executeQuery("select * from course order by course_id");
			
			//Iterate the ResultSet
			while(rs.next()) {
				System.out.println(rs.getString(1) +" "+ rs.getString("course_name"));
			}
			
			//Close connection
			con.close();
		} catch (ClassNotFoundException e) {
			System.err.println("Please check if the MySql connector jar is added to the build path");
			System.out.println(e.getMessage());
			//e.printStackTrace();
		} catch (SQLException e) {
			System.err.println(e.getMessage());
			//e.printStackTrace();
		}

	}

}

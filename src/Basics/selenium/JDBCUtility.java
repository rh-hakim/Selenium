package Basics.selenium;

import java.io.File;


import java.io.FileWriter;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.opencsv.CSVWriter;

public class JDBCUtility {
	
	// by using jdbc i will be able to check the backend and retrive data from data base 
	//for example i just created and account in tek-school.com/hotel/my-acount at the end i will get the green message as your account have been created
	// so this is the UI part
	// now if i wana to do end to end testing for this scenario once i get the message your account have been created 
	// next state i will connect to database and retrieve the data to see the account is created or not at the backend
	// End to End is will verify for the connection with database 
	
	// we will create 3 object of class
	

	private static Connection connection;
	private static Statement statement;
	private static ResultSet resultset;
	
	
	private static String url = "jdbc:postgresql://localhost:5432/dvdrental";
	
	private static String userName = "postgres";
	
	private static String password = "root";
	
	// we are now building the connection
	
	// create connection to DB
	
	public static void setupDBConnection() {
		try {
			connection = DriverManager.getConnection(url, userName, password);
		} catch (SQLException e) {
			e.printStackTrace();
			

		}
	}
	
	
	// this method return type is resultset
	
	public static ResultSet runQuery(String query) {
		
		try {
			statement = connection.createStatement();
			resultset = statement.executeQuery(query);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return resultset;
		
	}

	// so far we made connection to the databasae and we use statement to get to the that table now we will stoere the data and next will close the database
	
	
	public static void returnResult() {
		

		try {
			while (resultset.next()) {
				
				
			CSVWriter csvWriter;
			
			File file = new File("C:\\Users\\Dell\\eclipse-workspace\\SeleniumProject.Feb2020\\dataoutput\\book.csv");
				try {
					FileWriter filewriter = new FileWriter(file);
					csvWriter = new CSVWriter(filewriter);
					csvWriter.writeAll(resultset, true);
					csvWriter.close();
				
			}catch (SQLException e) {
				
			
		} catch (IOException e) {
			
		}

		
	}
		
		
	}catch (SQLException e) {
		
	}
	
		}
	
	// close the DB connection 
	public static void closeDBConnection() {
		if(connection!=null) {
			try {
				connection.close();
				
			} catch(Exception e) {
				
			}finally {
				try {
					connection.close();
				} catch(SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}
	
}


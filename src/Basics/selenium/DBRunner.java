package Basics.selenium;

public class DBRunner {
	
public static void main(String[] args) {
	JDBCUtility.setupDBConnection();
	JDBCUtility.runQuery("select * from public.actor");
	JDBCUtility.returnResult();
	JDBCUtility.closeDBConnection();
	
	// 1 important classes of JDBC
	      //1.Connection Class - Connects to DB using url(host:port database name, username, password
	      //2.Statement class - execute the query
	      //3. resultSet store the output of the query
	       //4.DriverManager will be use for connectio to DB driver
	
	
	// we have to know the flow for the database to get the data
	  //1. we gonna use the connection class to connect to the database and we gonna pass the url using the exact sytax
	// including the host , username and port and database and and using driver manager
	//2. you gonna use statement class to execute the query 
	 //3. resultSet store the output of the query
    //4.DriverManager will be use for connectio to DB driver
	
	
}

}

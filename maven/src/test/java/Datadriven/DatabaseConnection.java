package Datadriven;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.testng.annotations.Test;

import com.mysql.cj.xdevapi.Statement;

public class DatabaseConnection {
  @Test
  public void f() throws ClassNotFoundException, SQLException {
	  
	  String dburl="jdbc:mysql://localhost:3306/sravanthi";
	  String username="root";
	  String password="magna123";
	 // class.forName(com.mysql.jdbc.Driver);
	  Class.forName("com.mysql.jdbc.Driver");
	  Connection conn=DriverManager.getConnection(dburl,username,password);
	  java.sql.Statement st = conn.createStatement();
	  ResultSet  rs = st.executeQuery("select *from employee");
	  while(rs.next()){   // looping to print all employees information
          System.out.println("Employee id :"+rs.getInt("eid")); // to print emp id
          System.out.println("Employees name :"+rs.getString("name")); // to print emp name
     // System.out.println("Employee Age :"+rs.getInt("eage")); // tp print emp age
     // System.out.println("Employee address :"+rs.getString("emp address")); // to print emp address
         System.out.println("Employee salary :"+rs.getInt("salary"));  // to print emp salary
  }
	  conn.close();// to close the database automatically
}
}

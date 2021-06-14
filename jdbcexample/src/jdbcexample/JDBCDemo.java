package jdbcexample;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.SQLException;

public class JDBCDemo {
public static void main(String[] args) {
	Connection con=null;
	try {
		//step1: Register the driver
		Class.forName("oracle.jdbc.driver.OracleDriver");
		//step2:Establish the connection
		 con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","System","Blahblah!");
		//step3:Create Statement
		Statement stmt=con.createStatement();
		//step4:Execute the SQL Statement or Query
		ResultSet rs=stmt.executeQuery("select * from department");
		while(rs.next()) {
			System.out.println("=============");
			System.out.println("DID"+"\t"+"DNAME");
			System.out.println("=============");
			System.out.println(rs.getInt(1)+"\t"+rs.getString(2));
		}
	
	}catch(Exception e) {
		e.printStackTrace();
	}finally {
		System.out.println("close the connection");
		//step 5:close the connection
		try {
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
	}
}
}
}

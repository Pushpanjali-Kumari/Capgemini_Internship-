package com.capgemni.service;


import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class VendorService {
	static Connection con = null;
	static ResultSet rs = null;
	static Statement statement = null;
	static PreparedStatement preparedStatement = null;
	
	//Check table already created or not
	public boolean tableExists(String tableName, Connection conn) throws SQLException {
	    boolean found = false;
	    DatabaseMetaData databaseMetaData = conn.getMetaData();
	    ResultSet rs = databaseMetaData.getTables(null, null, tableName, null);
	    while (rs.next()) {
	        String name = rs.getString("TABLE_NAME");
	        if (tableName.equals(name)) {
	            found = true;
	            break;
	        }
	    }

	    return found;
	}
	
	//Create table VENDOR_REGISTRATION
	public void createVendorTable() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","System","Blahblah!");
			
			String createTable = "CREATE TABLE VENDOR_REGISTRATION(vendorid VARCHAR2(100) PRIMARY KEY,vendorname VARCHAR2(50),vendorpassword VARCHAR2(50),vendoremail VARCHAR2(50),vendorPhoneNumber VARCHAR2(10))"; 
			statement = con.createStatement();
			int i = statement.executeUpdate(createTable);
					
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			try {
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}//Ending vendor reg
	
		//register vendor
		public void registerVendor(String name,String password ,String email, String phno) {
			String id = 
					email+name;
			
			try {
				Class.forName("oracle.jdbc.driver.OracleDriver");
				con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","System","Blahblah!");
				
				String inserData = "INSERT INTO VENDOR_REGISTRATION VALUES(?,?,?,?,?)";
				preparedStatement = con.prepareStatement(inserData);
				preparedStatement.setString(1, id);
				preparedStatement.setString(2,name);
				preparedStatement.setString(3,password);
				preparedStatement.setString(4,email);
				preparedStatement.setString(5,phno);
				int i = preparedStatement.executeUpdate();
				if(i!=0) {
					System.out.println("Registration completed.");
				}
				else {
					System.out.println("Registration failed.");
				}
			}
			catch(Exception e) {
				e.printStackTrace();
			}
			finally {
				
			}
			
		}//ending register vendor
		
		//login Vendor
		public boolean loginVendor(String email,String password) {
			boolean flag = false;
			//String username = null;
			try {
				Class.forName("oracle.jdbc.driver.OracleDriver");
				con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","System","Blahblah!");
				statement = con.createStatement();
				rs = statement.executeQuery("SELECT * FROM VENDOR_REGISTRATION");
				
				while(rs.next()) {
					if(String.valueOf(rs.getString(4)).equals(email) && String.valueOf(rs.getString(3)).equals(password)) {
						//username = rs.getString(2);
						flag = true;
						break;
					}else {
						flag = false;
					}
				}
				
			} catch (SQLException | ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			finally {
				
			}
			if(flag == true)
				return flag;
			else 
				return flag;
		}//ending login Vendor
		
		public String takeName() {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter Name: ");
			return sc.nextLine();
		}
		
		public String takePassword() {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter Password: ");
			return sc.nextLine();
		}
		public String takeEmail() {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter Email: ");
			return sc.nextLine();
		}
		public String takePhoneNumber() {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter Phone Number: ");
			return sc.nextLine();
		}
	

		
}


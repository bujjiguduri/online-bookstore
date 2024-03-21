package com.bujji;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class jdbc {
public static void main(String args[]) {
	String driver="com.mysql.cj.jdbc.Driver";
	String url="jdbc:mysql://localhost:3306/chinni";
	String username="root";
	String password="root";
	try {
		Class.forName(driver);
		Connection con=DriverManager.getConnection(url,username,password);
		String query="insert into login values(?,?)";
		PreparedStatement st=con.prepareStatement(query);
		st.setString(1, "bujji");
		st.setString(2, "bujji@123");
		st.executeUpdate();
		con.close();
		
		
	}
	catch(Exception e) {
		e.printStackTrace();
		
	}
}
}

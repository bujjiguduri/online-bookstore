package com.bujji;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.security.auth.message.callback.PrivateKeyCallback.Request;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.catalina.connector.Response;
import org.eclipse.jdt.internal.compiler.parser.RecoveredRequiresStatement;
import org.eclipse.jdt.internal.compiler.util.HashtableOfIntValues;

/**
 * Servlet implementation class registrationdatails
 */
@WebServlet("/http://localhost:8080/onlinebookstore/registrationdatails")
public class registrationdatails extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public registrationdatails() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	//protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	////}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		String name=request.getParameter("username");
		String password=request.getParameter("password");
	   PrintWriter pw=response.getWriter();
		
	}
	String driver="com.mysql.cj.jdbc.Driver";
	String url="jdbc:mysql://localhost:3306/chinni";
	String username="root";
	String password="root";
	{
      try {
    	  Class.forName(driver);
    	  Connection con=DriverManager.getConnection(url,username,password);
    	  String query="insert into deepthi('username','password','email','gender','dob')" + "Values('bujji','bujji@123','bujjigud96@gmail.com','female','01-01-2001')";
    	  PreparedStatement s=con.prepareStatement(query);
    	
    	  s.execute("values");
    	  con.close();
    	   }
      catch(Exception e)
      {
    	  
      }
	}

}

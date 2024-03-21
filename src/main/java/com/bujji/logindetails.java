package com.bujji;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Set;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.jasper.tagplugins.jstl.core.Catch;

/**
 * Servlet implementation class logindetails
 */
@WebServlet("/logindetails")
public class logindetails extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public logindetails() {
        super();
        // TODO Auto-generated constructor stub
    }

    
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

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
    	String query="insert into username =? where  password=1";
    	  //String query="insert into deepthi('username','password')" + "Values('bujji','bujji@123')";
   
    	  PreparedStatement s=con.prepareStatement(query);
  
    	  con.close();
    	   }
      catch(Exception e)
      {
    	  
      }
}
}








package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/logindetails")
public class LoginDetailsServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        out.println("<html><head><title>Login Details</title></head><body>");
        out.println("<h2>Login Form</h2>");
        out.println("<form method=\"post\" action=\"logindetails\">");
        out.println("Username: <input type=\"text\" name=\"username\"><br>");
        out.println("Password: <input type=\"password\" name=\"password\"><br>");
        out.println("<input type=\"submit\" value=\"Login\">");
        out.println("</form>");
        out.println("</body></html>");
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        String username = request.getParameter("username");
        String password = request.getParameter("password");

        // Here, you can check the username and password against a database or some other authentication mechanism.
        // For simplicity, we just display them back to the user.

        out.println("<html><head><title>Login Details</title></head><body>");
        out.println("<h2>Login Successful</h2>");
        out.println("<p>Username: " + username + "</p>");
        out.println("<p>Password: " + password + "</p>");
        out.println("</body></html>");
    }
}

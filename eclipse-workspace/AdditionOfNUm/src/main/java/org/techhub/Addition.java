package org.techhub;
import java.io.*;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import java.sql.*;

@WebServlet("/registration")
public class Addition extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
    public Addition() {
        super();
       
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
//		response.getWriter().append("Served at: ").append(request.getContextPath());
		response.setContentType("text/html");
		
		String first=request.getParameter("first");
		String pass=request.getParameter("pass");
		String third=request.getParameter("third");
		String user=request.getParameter("uname");
		String mail=request.getParameter("email");
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/pp50","root","Gokul@6187");
			if(conn!=null)
			{
				PreparedStatement p=conn.prepareStatement("insert into user values('0',?,?,?)");
				p.setString(1, user);
				p.setString(2, mail);
				p.setString(3, pass);
				p.executeUpdate();
				
				System.out.println("connected sucessfully:");
			}
			else
			{
				System.out.println("not connected:");
				
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
		
		PrintWriter out=response.getWriter();
		out.println(first);
		RequestDispatcher r=request.getRequestDispatcher("login.html");
		r.forward(request, response);
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		doGet(request, response);
	}

}

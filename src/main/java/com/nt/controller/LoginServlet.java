package com.nt.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.nt.dao.DaoClass;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	
    

	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		PrintWriter pw=null;
	
		res.setContentType("text/html");
		pw=res.getWriter();
		 String uname=req.getParameter("uname");
		 String upass=req.getParameter("upass");
		 
		 /*if(uname.equalsIgnoreCase("santu")&&upass.equalsIgnoreCase("santu")) {*/
			 
		 DaoClass d=new DaoClass();
		 
		 try {
			if(d.validateUser(uname,upass)) {
				 
				 pw.println("<h1> Valid</h1>");	 
				/*
				 * RequestDispatcher rd=req.getRequestDispatcher("/ListServlet1");
				 * rd.forward(req,res);
				 */
				 res.sendRedirect("./ListServlet1"); 
				 
				 
			}
				
				 else { 
					 
					 pw.println("<h1 > NotValid</h1>");	 

			 pw.println("<h1><a href='login.html'>home</h1>");
				 }
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}

package com.nt.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import com.nt.dao.DaoClass;
import com.nt.dao.User;


@WebServlet("/UserServlet")
public class UserServlet extends HttpServlet {
	
    public UserServlet() {
        super();
       
    }

	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		PrintWriter pw=null;
		res.setContentType("text/html");
		pw=res.getWriter();
		String uname=req.getParameter("uname");
		String upass=req.getParameter("upass");
		String contactno=req.getParameter("contactno");
		String email=req.getParameter("email");
		String gender=req.getParameter("gender");
		String address=req.getParameter("address");
		
		//User class object creation
		 User u=new User(uname,upass,contactno,gender,email,address); 
		
		/*
		 * User u=new User(); u.setUname(uname); u.setUpass(upass);
		 * u.setContactno(contactno); u.setAddress(address); u.setEmail(email);
		 * u.setGender(gender);
		 */
		
		//DaoClass object creation
		DaoClass dc=new DaoClass();
		
		if(dc.addUser(u)) {
			pw.println("<h1>Registration success</h1>");
		}
		else
			pw.println("<h1>Registration Not success Tryagain</h1>");
		
		
	}

}

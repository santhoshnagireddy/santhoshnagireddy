package com.nt.controller;


import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import com.nt.dao.DaoClass;
import com.nt.dao.Question1;
import com.nt.dao.User;


@WebServlet("/AdminQServlet")
public class AdminQServlet extends HttpServlet {
	
    public AdminQServlet() {
        super();
       
    }

	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		PrintWriter pw=null;
		res.setContentType("text/html");
		pw=res.getWriter();
		String Qname=req.getParameter("Qname");
		String Option1=req.getParameter("Option1");
		String Option2=req.getParameter("Option2");
		String Option3=req.getParameter("Option3");
		String Option4 =req.getParameter("Option4");
		String Answer=req.getParameter("Answer");
		
		//User class object creation
		Question1 u=new Question1(Qname,Option1,Option2,Option3,Option4,Answer); 
		
		
		/*
		 * User u=new User(); u.setUname(uname); u.setUpass(upass);
		 * u.setContactno(contactno); u.setAddress(address); u.setEmail(email);
		 * u.setGender(gender);
		 */
		
		//DaoClass object creation
		DaoClass dc=new DaoClass();
		
		if(dc.addQuestion(u)) {
			pw.println("<h1>Questions added successfully</h1>");
		}
		else
			pw.println("<h1>Questions are not added successfully</h1>");
		
		
	}

}

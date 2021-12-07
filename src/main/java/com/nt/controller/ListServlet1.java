package com.nt.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.nt.dao.DaoClass;
import com.nt.dao.Question1;
import com.nt.dao.User;

@WebServlet("/ListServlet1")
public class ListServlet1 extends HttpServlet {
public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		PrintWriter pw=null;
	
		res.setContentType("text/html");
		pw=res.getWriter();
		
		DaoClass dao=new DaoClass();
		
		
  
     List<Question1> list= dao.listusers();
    
		pw.println("<html>");
		pw.println("<body>");
		pw.println("<form action=Score>");
		pw.println("QUESTION PAPER"+"<br>");
		for(Question1 o : list) {
			pw.println(o.getQno() + " ). " + o.getQname() + "<br>");
			pw.println("<input type = radio name="+o.getQno()+" value="+o.getOption1()+">"+o.getOption1()+"");
			pw.println("<input type = radio name="+o.getQno()+" value="+o.getOption2()+">"+o.getOption2()+"");
			pw.println("<input type = radio name="+o.getQno()+" value="+o.getOption3()+">"+o.getOption3()+"");
			pw.println("<input type = radio name="+o.getQno()+" value="+o.getOption4()+">"+o.getOption4()+"");
			pw.println("<br><br>");
		}
		pw.println("<input type=submit value=submit>");
		pw.println("</form>");
		pw.println("</body>");
		pw.println("</html>");
		
	}
 		
}



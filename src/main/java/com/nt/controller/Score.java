package com.nt.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.nt.dao.DaoClass;
import com.nt.dao.Question1;

/**
 * Servlet implementation class Score
 */
@WebServlet("/Score")
public class Score extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Score() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		DaoClass dc = new DaoClass();
		int score = 0;
		List<Question1> li = dc.listusers();
		
		for(Question1 q : li) {
			String res = request.getParameter(""+q.getQno()+"");
			if(res.equalsIgnoreCase(q.getAnswer())) {
				score++;
			}
		}
		
		pw.println("<h1 style=color:green>Score: " + score);
	}

}

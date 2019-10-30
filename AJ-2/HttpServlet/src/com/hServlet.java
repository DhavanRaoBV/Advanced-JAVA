package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class hServlet
 */
@WebServlet("/hServlet")
public class hServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter pw=response.getWriter();
		response.setContentType("text/html");
		String a=request.getParameter("name");
		String b=request.getParameter("pwd");
		
		if(a.equals("mphasis")&&b.equals("mphasis"))
			response.sendRedirect("loginSuccess.html");
		else
			response.sendRedirect("loginFailure.html");
	}

}

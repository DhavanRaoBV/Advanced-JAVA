package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class calculator
 */
@WebServlet("/calculator")
public class calculator extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		
		response.setContentType("text/html");
		PrintWriter pw=response.getWriter();
		String a=request.getParameter("n1");
		String b=request.getParameter("n2");
		
		String button=request.getParameter("bt");
		
		int x=Integer.parseInt(a);
		int y=Integer.parseInt(b);
		
		
		if(button.equals("ADD")) {
			 int res=x+y;
			 pw.println("<h3>Result="+res+"<h3>");
		}
		
		if(button.equals("SUB")) {
			int res=x-y;
			pw.println("<h3>Result="+res+"<h3>");
		}
		
		if(button.equals("MUL")) {
			  int res=x*y;
			  pw.println("<h3>Result="+res+"<h3>");
		}
		
		if(button.equals("DIV")) {
			 int res=x/y;
			 pw.println("<h3>Result="+res+"<h3>");
		}
		
		
	}

}

package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class firstServlet
 */
@WebServlet("/firstServlet")
public class firstServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		try {
			response.setContentType("text/html");
			PrintWriter pw=response.getWriter();
			String a=request.getParameter("name");
			String b=request.getParameter("pwd");
			HttpSession ses=request.getSession(true);
			ses.setAttribute("x", a);
			ses.setAttribute("y", b);
			pw.println("<html>");
			pw.println("<form action=secondServlet method=post>");
			pw.println("Enter Address:");
			pw.println("<input type=text name=addr size=20><br>");
			pw.println("Enter Phone number:");
			pw.println("<input type=text name=pno size=20><br>");
			pw.println("<input type=submit value=submit name=em size=20><br>");
		
			pw.println("</form></html>");
			pw.close();
			
			
		}
		catch(Exception ab)
		{
			ab.printStackTrace();
			
		}
	}
	
}

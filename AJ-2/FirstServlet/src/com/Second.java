package com;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.DriverManager;
import java.sql.*;

import javax.servlet.GenericServlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;





@WebServlet("/Second")
public class Second extends GenericServlet {
	private static final long serialVersionUID = 1L;

	
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		System.out.println("Init");
	}
	
	
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter pw=response.getWriter();
		String a=request.getParameter("t1");
		String b=request.getParameter("t2");
		String c=request.getParameter("t3");
		String d=request.getParameter("t4");
		String e=request.getParameter("t5");
		String button=request.getParameter("b1");
		
		
		pw.println("Employee Id is "+a);
		pw.println("<br>");
		pw.println("Employee Name is "+b);
		pw.println("<br>");
		pw.println("Employee Address is "+c);
		pw.println("<br>");
		pw.println("Employee Email is "+d);
		pw.println("<br>");
		pw.println("Employee Phone Number is "+e);
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","123456789");
			if(button.equals("Insert")) {
				int x=Integer.parseInt(a);
				int y=Integer.parseInt(e);
			PreparedStatement st=con.prepareStatement("insert into employee values(?,?,?,?,?)");
			st.setInt(1, x);
			st.setString(2, b);
			st.setString(3, c);
			st.setString(4, d);
			st.setInt(5, y);
			st.execute();
			pw.println("row inserted");
			
			}
			if(button.equals("Update")) {
				
				int x=Integer.parseInt(a);
				int y=Integer.parseInt(e);
				PreparedStatement st=con.prepareStatement("update employee set name=?,address=?,email=?,phoneno=?where id=?");
				
				st.setString(1, b);
				st.setString(2, c);
				st.setString(3, d);
				st.setInt(4, y);
				st.setInt(5, x);
				st.execute();
				
				pw.println("<br>row updated");
			}
			
			if(button.equals("Delete")) {
				int x=Integer.parseInt(a);
				PreparedStatement st=con.prepareStatement("delete from employee where id=?");
				st.setInt(1, x);
				st.execute();
				pw.println("row got deleted");
				
			}
			
			if(button.equals("Select")) {
				PreparedStatement st=con.prepareStatement("select * from employee");
				ResultSet rs=st.executeQuery();
				while(rs.next())
				{
					System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3));
				}
			}
			
			
			}
		
		catch(Exception ae) {
			
			ae.printStackTrace();
			}
		
		
		}

	
	public void destroy() {
		// TODO Auto-generated method stub
		System.out.println("Destroy");
	}

	

	

}

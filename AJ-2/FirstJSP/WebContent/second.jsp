<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="java.sql.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Jsp</title>
</head>
<body>

<%
String a=request.getParameter("t1");
String b=request.getParameter("t2");
String c=request.getParameter("t3");
String d=request.getParameter("t4");
String e=request.getParameter("t5");
String f=request.getParameter("b1");
%>

<%
out.println("The name is "+a);
out.println("The Password is "+b);
out.println("The Address is "+c);
out.println("The Email is "+d);
out.println("The Phone Number is "+e);
%>

<% 
try{
	Class.forName("oracle.jdbc.driver.OracleDriver");
	Connection con=DriverManager.getConnection
	("jdbc:oracle:thin:@localhost:1521:xe","system","123456789");
	if(f.equals("Insert"))
	{
		PreparedStatement st=con.prepareStatement("insert into employee values(?,?,?,?,?)");
		st.setString(1,a);st.setString(2,b);st.setString(3,c);st.setString(4,d);st.setString(5,e);
		st.execute();
		out.println("Row inserted");
		
	}
	
	if(f.equals("Update"))
	{
		PreparedStatement st=con.prepareStatement("update employee set password=?,address=?,email=?,phoneno=? where name=?");
		
		st.setString(1, b);
		st.setString(2, c);
		st.setString(3, d);
		st.setString(4, e);
		st.setString(5,a);
		st.execute();
		out.println("<br>Row updated");
	}
	
	
	if(f.equals("Delete"))
	{
		PreparedStatement st=con.prepareStatement("delete from employee where name=?");
		st.setString(1, a);
		st.execute();
		out.println("<br>Row got deleted");
	}
	
	
	if(f.equals("Select"))
	{
		PreparedStatement st=con.prepareStatement("select * from employee");
		ResultSet rs=st.executeQuery();
		while(rs.next())
		{
			System.out.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getString(4)+" "+rs.getString(5));
		}
	}
	
	
}
catch(Exception ae){
	ae.printStackTrace();
}
%>

</body>
</html>
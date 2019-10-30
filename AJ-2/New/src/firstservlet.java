import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import javax.servlet.annotation.WebServlet;
@WebServlet("/firstservlet")
public class firstservlet extends HttpServlet
{
public void service(HttpServletRequest req,HttpServletResponse res)
{
try
{
res.setContentType("text/html");
PrintWriter pw=res.getWriter();
String a=req.getParameter("t1");
String b=req.getParameter("t2");
HttpSession ses=req.getSession(true);//new session is created
ses.setAttribute("x",a);
ses.setAttribute("y",b);
pw.println("<html>");
pw.println("<form action=secondServlet method=post>");
pw.println("enter address:");
pw.println("<input type=text name=t3 size=20><br>");
pw.println("enter phone no:");
pw.println("<input type=text name=t4 size=20><br>");
pw.println("<input type=submit value=submit><br>");
pw.println("</form></html>");
pw.close();
}
catch(Exception ab)
{
	ab.printStackTrace();
	}
}}
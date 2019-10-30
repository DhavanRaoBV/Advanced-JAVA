import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import javax.servlet.annotation.WebServlet;
@WebServlet("/secondServlet")
public class secondServlet extends HttpServlet
{
public void service(HttpServletRequest req,HttpServletResponse res)
{
try
{
res.setContentType("text/html");
PrintWriter pw=res.getWriter();
String c=req.getParameter("t3");
String d=req.getParameter("t4");
HttpSession ses=req.getSession(false);//same session
ses.setAttribute("g",c);
ses.setAttribute("h",d);
pw.println("<html>");
pw.println("<form action=third method=post>");
pw.println("enter hobby:");
pw.println("<input type=text name=t5 size=20><br>");
pw.println("enter email:");
pw.println("<input type=text name=t6 size=20><br>");
pw.println("<input type=submit value=submit><br>");
pw.println("</form></html>");
pw.close();
}
catch(Exception ae)
{}}}
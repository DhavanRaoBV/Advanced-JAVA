import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import javax.servlet.annotation.WebServlet;
@WebServlet("/third")
public class third extends HttpServlet
{
public void service(HttpServletRequest req,HttpServletResponse res)
{
try
{
res.setContentType("text/html");
PrintWriter pw=res.getWriter();
String e=req.getParameter("t5");
String f=req.getParameter("t6");
HttpSession ses=req.getSession(false);
ses.setAttribute("i",e);
ses.setAttribute("j",f);
String a=(String)ses.getAttribute("x");
String b=(String)ses.getAttribute("y");
String c=(String)ses.getAttribute("g");
String d=(String)ses.getAttribute("h");
pw.println("the name is :"+a);
pw.println("the password is :"+b);
pw.println("the address is :"+c);
pw.println("the phone no is :"+d);
pw.println("the hobby is :"+e);
pw.println("the email is :"+f);
pw.close();
}
catch(Exception ae)
{}
}}

<%
String result=request.getParameter("result");
String submit=request.getParameter("submit");
%>
<html><body><center>
<%
	if(submit.equals("Add"))          
         {
     		%>
     RESULT OF ADDITION::::::<%=result%>
     <%
     }else if(submit.equals("Sub")) {
     %>
	 RESULT OF SUBTRACTION::::::<%=result%>
	<%
	}else if(submit.equals("Mul")){
	%>
 	RESULT OF MULTIPLICATION::::::<%=result%>
 	<% } else {
 	%>
  	RESULT OF DIVISION::::::<%=result%>
  	<%} %>
  
</center>
<jsp:include page="/home.html"></jsp:include>
</body></html>



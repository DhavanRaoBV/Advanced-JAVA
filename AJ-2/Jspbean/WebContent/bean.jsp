<jsp:useBean id="sr" scope="page" class="myb.srbean" />
<html>
<head>
<body>
<%! String s,t;%>
<% s=request.getParameter("t2");%>
<% t=request.getParameter("t3");%>
<jsp:setProperty name="sr" property="language" value="<%= s%>" />
<jsp:getProperty name="sr" property="language" />
<jsp:getProperty name="sr" property="comment" />

<jsp:setProperty name="sr" property="uid" value="<%= t%>" />
<jsp:getProperty name="sr" property="uid" />
<jsp:getProperty name="sr" property="commentID" />
</body>
</html>


<%--
  Created by IntelliJ IDEA.
  User: strawberry
  Date: 2019/11/20
  Time: 20:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <jsp:include page="head.jsp"></jsp:include>
    <h3>
        <%String message = request.getParameter("message"); %>
        <%=message%>
    </h3>

</body>
</html>

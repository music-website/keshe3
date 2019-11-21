<%--
  Created by IntelliJ IDEA.
  User: strawberry
  Date: 2019/11/20
  Time: 20:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <jsp:include page="head.jsp"></jsp:include>
    <h4>
        <c:if test="${empty information}">
            <%
                out.write("没有了，亲");
            %>
        </c:if>

        <c:forEach items="${information}" var="info">
            <li>
                <a href="${pageContext.request.contextPath}/text.jsp?message=${info.text}">${info.title}</a>
            </li>
        </c:forEach>
    </h4>

</body>
</html>

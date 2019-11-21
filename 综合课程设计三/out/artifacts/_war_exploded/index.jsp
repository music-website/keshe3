<%--
  Created by IntelliJ IDEA.
  User: strawberry
  Date: 2019/11/20
  Time: 16:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>

      <h3>
          <a href="${pageContext.request.contextPath}/WebInformationServlet?id=0">政策法规</a>
          <a href="${pageContext.request.contextPath}/WebInformationServlet?id=1">行政处罚</a>
          <a href="${pageContext.request.contextPath}/WebInformationServlet?id=2">行业活动</a>
          <a href="${pageContext.request.contextPath}/WebInformationServlet?id=-1">其他</a>

      </h3>

      <hr/>

      <h4>
          <a href="${pageContext.request.contextPath}/FlushServlet">刷新</a>
      </h4>
  </body>
</html>

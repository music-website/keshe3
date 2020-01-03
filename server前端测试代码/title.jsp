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
    <link rel="stylesheet" href="css/title.css">
    <link rel="stylesheet" href="css/pageStyle.css">
</head>
<body bgcolor="#F0F0F0">
<jsp:include page="head.jsp"></jsp:include>
<div id="list">
    <img src="images/background1.png" id="image1">
    <div id="list_div">
        <ul>
            <c:if test="${empty information}">
                <%
                    out.write("没有了，亲");
                %>
            </c:if>
            <c:forEach items="${information.currentTitle}" var="info">
                <li>
                    <a href="${pageContext.request.contextPath}/text.jsp?date=${info.date}&source=${info.source}&context=${info.context}">${info.title}</a>
                </li>
            </c:forEach>
        </ul>
        <div id="page" class="page_div"></div>
    </div>
    <img src="images/background2.png" id="image2">
</div>

<script src="js/jquery.min.js"></script>
<script type="text/javascript" src="js/paging.js"></script>
<script type="text/javascript">
    //分页
    $("#page").paging({
        pageNo: ${information.currentPage},  /*当前选中的是哪一页*/
        totalPage: Math.ceil(${sum/15}), /*共多少页*/
        totalSize: ${sum},/*共多少条记录*/
        callback: function(num) {
            $(window).attr('location', "${pageContext.request.contextPath}/WebInformationServlet?id=${id}&&page=" + num);
        }
    })
</script>
<jsp:include page="footer.jsp"></jsp:include>
</body>
</html>

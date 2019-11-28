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
<%--    <h4>--%>
<%--        <c:if test="${empty information}">--%>
<%--            <%--%>
<%--                out.write("没有了，亲");--%>
<%--            %>--%>
<%--        </c:if>--%>

<%--        <c:forEach items="${information}" var="info">--%>
<%--            <li>--%>
<%--                <a href="${pageContext.request.contextPath}/text.jsp?message=${info.text}">${info.title}</a>--%>
<%--            </li>--%>
<%--        </c:forEach>--%>

<%--    </h4>--%>

<div id="list">
    <img src="images/background1.png" id="image1">
    <div id="list_div">
        <ul>
            <li><a href="#">第1条信息（具体多长我也不知道呀）。。。。。。。。。</a></li>
            <li><a href="#">第2条信息</a></li>
            <li><a href="#">第3条信息</a></li>
            <li><a href="#">第4条信息</a></li>
            <li><a href="#">第5条信息</a></li>
            <li><a href="#">第6条信息</a></li>
            <li><a href="#">第7条信息</a></li>
            <li><a href="#">第8条信息</a></li>
            <li><a href="#">第9条信息</a></li>
            <li><a href="#">第10条信息</a></li>
            <li><a href="#">第11条信息</a></li>
            <li><a href="#">第12条信息</a></li>
            <li><a href="#">第13条信息</a></li>
            <li><a href="#">第14条信息</a></li>
            <li><a href="#">第15条信息</a></li>
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
        pageNo:3,  /*当前选中的是哪一页*/
        totalPage: 15, /*共多少页*/
        totalSize: 300,/*共多少条记录*/
        callback: function(num) {
            console.log(num);
        }
    })
</script>
<jsp:include page="footer.jsp"></jsp:include>
</body>
</html>

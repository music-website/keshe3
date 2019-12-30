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
    <link rel="stylesheet" href="css/title.css">
    <link rel="stylesheet" href="css/text.css">
    <link rel="stylesheet" href="css/common.css">
</head>
<body>
    <jsp:include page="head.jsp"></jsp:include>
<%--    <h3>--%>
<%--        <%String message = request.getParameter("message"); %>--%>
<%--        <%=message%>--%>
<%--    </h3>--%>
    <div id="list">
        <div class="blank"></div>
        <div id="text_div">
            <div id="text_title">
                <div id="text_title_div">
                    <i></i>
                    <h1 id="title">这里是title</h1>
                </div>
                <div id="timeAndFrom">
                    <span>
                        <%String date = request.getParameter("date"); %>
                        <%=date%>
                    </span>
                    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                    <span>
                        <%String source = request.getParameter("source"); %>
                        <%=source%>
                    </span>
                </div>
            </div>
            <hr/>
            <div id="text_content">
                1234
                <%String context = "context/" + request.getParameter("context"); %>
                <jsp:include page="<%=context%>"/>
                
            </div>
        </div>
        <div class="blank"></div>
    </div>
    <jsp:include page="footer.jsp"></jsp:include>
</body>
</html>

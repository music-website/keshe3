<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
	<title>ostec</title>
	<link href="css/headAndfoot.css" rel="stylesheet">
</head>
<body>
	<jsp:include page="head.jsp"></jsp:include>
	<div id="main">
		<div style="height: 10%;z-index: -1;"></div>
		<div style="position:absolute;height: 70%;width: 100%;z-index: -1;text-align: center;">
			<img src="images/bg.png" height="auto" width="70%">
		</div>
		<div style="padding-top:6.5%;padding-left: 17%">
			<a href="${pageContext.request.contextPath}/WebInformationServlet?id=0">
			    <img src="images/huodong.png" height="auto" width="15%">
		    </a>
			<a href="${pageContext.request.contextPath}/WebInformationServlet?id=1">
				<img src="images/caigou.png" height="auto" width="15%" style="margin-left: 10px;">
			</a>
			<a href="${pageContext.request.contextPath}/WebInformationServlet?id=2">
			<img src="images/zhengce.png" height="auto" width="15%" style="margin-left: 10px;">
			</a>
		</div>
		<div style="margin-top:-2.5%;padding-left: 3%;">
			<a href="${pageContext.request.contextPath}/WebInformationServlet?id=3">
			    <img src="images/zhaobiao.png" height="auto" width="13%" >
		    </a>
		    <a href="${pageContext.request.contextPath}/WebInformationServlet?id=4">
			    <img src="images/xinwen.png" height="auto" width="12.8%" style="margin-left: 14%;">
		    </a>
		</div>
	</div>
	<jsp:include page="footer.jsp"></jsp:include>
</body>
</html>

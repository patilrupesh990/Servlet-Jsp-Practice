<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User Home</title>
<style type="text/css">
body {
	margin: 0;
	font-family: Arial, Helvetica, sans-serif;
}

.topnav {
	overflow: hidden;
	background-color: #333;
}

.topnav a {
	float: left;
	color: #f2f2f2;
	text-align: center;
	padding: 14px 16px;
	text-decoration: none;
	font-size: 17px;
}

.topnav a:hover {
	background-color: #ddd;
	color: black;
}

.topnav a.active {
	background-color: #4CAF50;
	color: white;
}

.bodybg {
	background-repeat: no-repeat;
	background-image: url("sc4.jpeg");
	background-size: cover;
}
</style>

</head>
<body class="bodybg">
	<%
		if (session.getAttribute("uname") == null)
			response.sendRedirect("UserLogin.jsp");
	%>
	<div class="topnav">
		<span>${uname}</span>
		<br> <a href="view">View Product</a> <a href='viewcart'>ViewCart</a>
		<a href="logout">Logout</a> <br>
	</div>
</body>
</html>



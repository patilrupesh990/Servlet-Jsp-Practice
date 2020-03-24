<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Online Product</title>
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
.bodybg{
background-repeat: no-repeat;
background-image:url("sci1.jpg");
background-size: cover;
}
</style>

</head>
<body class="bodybg">
<div class="topnav">
	<%
		if (session.getAttribute("uname") == null)
			response.sendRedirect("SellerLogin.jsp");
	%>
		<br><a href="ViewProduct.jsp">View Product</a>
			<a href="UpdateProduct.html">Update Product</a>
			<a href="AddProduct.html">Add Product</a>
			<a href="logout">Logout</a>
</div>
</body>
</html>
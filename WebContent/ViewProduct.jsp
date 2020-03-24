<%@page import="com.bridgelabz.shoppingcart.dao.SellerDAO"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.io.PrintWriter"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
		if (session.getAttribute("uname") == null) {
			response.sendRedirect("SellerLoging.html");
		}
	%>
<br><a href='SellerDashBoard.jsp'>Home</a><br>
	<h1 align='center'>----------------Product details
		are-----------------</h1>
	<table border='2' align='center'
		style='color: white; background-Top color: :#000000; border-color: red blue gold teal; font-size: 20'>
		<tr bgcolor='#FF0000'>
			<th>Product Code</th>
			<th>Product Name</th>
			<th>Product Price</th>
			<th>Product Quanttity</th>
			<th>Click For Remove</th>
		</tr>
		<%
			ResultSet resultset = SellerDAO.getProduct(session.getAttribute("uname").toString());
			while (resultset.next()) {
		%>
		<tr bgcolor='#A2B5CD'>
			<td><%=resultset.getString(1)%></td>
			<td><%=resultset.getString(2)%></td>
			<td><%=resultset.getString(3)%></td>
			<td><%=resultset.getString(4)%></td>
			<td><a href='del?pName="+rs.getString(2)+"'>Delete</a></td>
		</tr>

		<%
			}
		%>
	</table>

</body>
</html>
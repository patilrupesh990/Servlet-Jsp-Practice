<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Admin Login</title>
</head>
<style>
body {
	background-image: url(sc4.jpeg);
	-webkit-background-size: cover;
	background-size: cover;
	background-position: center center;
	align-content: center;
	height: 100%;
}

.form-area {
	width: 500px;
	height: 450px;
	margin: 60 auto 0;
	position: relative;
	background: rgba(0, 0, 0, 0.4);
	text-align: center;
	align: center;
	align-content: center;
	padding: 35px;
	border: px solid #fff;
	-webkit-border-radious: 70px 0 70px 0;
	-moz-border-radious: 70px 0 70px 0;
	border-radios
}

.form-area h2 {
	margin-bottom: 45px;
	color: #fff;
}

.img-area {
	width: 50px;
	height: 50px;
	background: tomato;
	position: absolute;
	top: -5%;
	lefft: 45%;
}

.img-area img {
	width: 60%;
	padding: 10px;
}

input {
	width: 100%;
	height: 50px;
	border-radious: 15px 0 15px 0;
	border: 2px solid #fff;
	border-bottom: 15px;
	background-color: trasparent color: #fff;
}

.form area p {
	text-align: left;
	color: #fff;
	text-transform: uppercase;
	font-weight: bold;
}

.btn {
	display: inline-block;
	height: 40px;
	width: 150px;
	line-height: 40px;
	overflow: hidden;
	postion: relative;
	text-align: center;
	background: tomato;
	border-radious: 25px;
	color: #fff;
	text-transform: uppercase;
	margin-top: 20px;
	cursor: pointer;
	text-decoration: none;
}

.btn-text {
	display: block;
	height: 100%;
	position: relative;
	top: 0;
	-webkit-transition: top 0.6s;
	-moz-transition: top 0.6s;
	-o-transition: top 0.6s;
	transition: top 0.6s;
	width: 100%;
}

.btn:hover .btn-text {
	top: 100%;
}

.for-pass {
	text-decoration: none;
	display: block;
	margin-top: 30px;
	font-weight: bold;
	font-size: 20px;
	color: #fff;
}

.pg {
	text-decoration: none;
	display: block;
	margin-top: 30px;
	font-weight: bold;
	font-size: 20px;
	color: #fff;
}
</style>
<body>

	<div class="form-area">

		<div class="img-area">
			<img src="sc4.jpeg" alt="">
		</div>
		<form action="seller_login" align="center" method="post">
			<h2>Seller Login Form</h2>
			<p class="pg">UserName:</p>
			<input type="text" name="uname" placeholder="Enter UserName"
				name="uname">
			<p class="pg">Password:
			<p>
				<input type="password" placeholder="Enter Password" name="password">
				<input type="submit" value="Login" class="btn"> <a
					href="SellerRegister.jsp" class="for-pass">New Seller?</a>
		</form>

	</div>
</body>
</html>





























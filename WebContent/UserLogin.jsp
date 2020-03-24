<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="css\UserLogin.css">
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js"></script>

</head>
<body>
	<!--	<form action="log1" class="registration-form needs-validation forming"
		method="post">
		<div>
			<h1 align="center">User Login</h1>
		</div>
		<div class="form-design">
			<div class="form-row">

				<div class="form-group row-sm-6">
					<label>UserName</label> <input type="text" class="form-control"
						placeholder="Enter UserName" name="uname" autocomplete="off"
						required>
				</div>
				<div class="form-group row-sm-6">
					<label>Password</label> <input type="password"
						placeholder="Enter Password" class="form-control" name="password"> <input
						type="submit" value="Login" name="submit"><br>
				</div>
			</div>
		</div>
	</form>
	<a href="UserRegister.jsp">New User?</a>		!-->
	<div id="form-div" class="container">
		<h2 id="h2">User Login</h2>
		<form action="log1" method="post">
			<div class="form-group">
				<label >Email:</label> <input type="text"
					class="form-control" id="email" placeholder="Enter email or username"
					name="uname">
			</div>
			<div class="form-group">
				<label for="pwd">Password:</label> <input type="password"
					class="form-control" id="pwd" placeholder="Enter password"
					name="password">
			</div>
			<div class="form-group form-check">
				<label class="form-check-label"> <input
					class="form-check-input" type="checkbox" name="remember">
					Remember me
				</label>
			</div>
			<button type="submit" class="btn btn-primary" value="Login" name="submit">Submit</button>
		</form>
		<a href="UserRegister.jsp">New User?</a>
	</div>

</body>
</html>






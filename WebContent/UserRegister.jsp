
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Register</title>
<link rel="stylesheet" href="css\Register.css">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
	crossorigin="anonymous">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-alpha.6/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>


<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.0/js/bootstrap.min.js"></script>
<script src="https://code.jquery.com/jquery-1.11.1.min.js"></script>

<script
	src="https://cdn.rawgit.com/atatanasov/gijgo/master/dist/combined/js/gijgo.min.js"
	type="text/javascript"></script>
<link
	href="https://cdn.rawgit.com/atatanasov/gijgo/master/dist/combined/css/gijgo.min.css"
	rel="stylesheet" type="text/css" />
<title>Insert title here</title>
</head>
<body>
	<form class="registration-form needs-validation forming" action="reg1"
		method="post" novalidate>

		<div class="createAccountHeading">
			<h2>Please fill with your details</h2>
			<hr style="background-color: white;">
		</div>

		<div class="form-design">
			<!-- First Name and Last Name Text Fields -->
			<div class="form-row">
				<div class="form-group col-sm-6">
					<label for="validationCustom01">First Name</label> <input
						type="text" class="form-control" id="validationCustom01"
						name="fname" placeholder="First name" autocomplete="off"
						required>
					<div class="valid-feedback">Looks good!</div>
					<div class="invalid-feedback">Please fill out this field.</div>
				</div>

				<div class="form-group col-sm-6">
					<label for="validationCustom02">Last Name</label> <input
						type="text" class="form-control" id="validationCustom02"
						name="lname" placeholder="Last name" autocomplete="off"
						required>
					<div class="valid-feedback">Looks good!</div>
					<div class="invalid-feedback">Please fill out this field.</div>
				</div>

			</div>

			<!-- First Name and Last Name Text Fields ENDS HERE -->

			<!-- Email and Password Text Fields -->

			<div class="form-row">
				<div class="form-group col-sm-6">
					<label for="validationCustom10">Email</label> <input type="email"
						class="form-control" id="validationCustom10" name="mail"
						placeholder="Email" autocomplete="off" required>
					<div class="valid-feedback">Looks good!</div>
					<div class="invalid-feedback">Please fill out this field.</div>
					<span id="emailErrorSection"
						style="color: red; align-content: center;"></span>
				</div>
				<div class="form-group col-sm-6">
					<label for="validationCustomUsername">Username</label> <input
						type="text" class="form-control" name="uname"
						id="validationCustomUsername" aria-describedby="inputGroupPrepend"
						autocomplete="off" placeholder="Username" required>
					<div class="valid-feedback">Looks good!</div>
					<div class="invalid-feedback">Please fill out this field.</div>
					<span id="usernameErrorSection"
						style="color: red; align-content: center;"></span>
				</div>
			</div>

			<div class="form-row">
				<div class="form-group col-sm-6">
					<label for="validationCustom04">Password</label> <input
						type="password" class="form-control" name="password"
						id="validationCustom04" placeholder="Password" required>
					<div class="invalid-feedback">Please fill out this field.</div>
				</div>
				<div class="form-group col-sm-6">
					<label for="validationCustom05">Confirm Password</label> <input
						type="password" class="form-control" name="confirmPassword"
						id="confirm_password" placeholder="Re-Type Password"
						onblur="hideDiv()" required>
					<div class="invalid-feedback">Please fill out this field.</div>
					<span id="passwordErrorSection"></span>
				</div>
			</div>


			<div class="invalid-feedback">Please fill out this field.</div>
		</div>

		<div class="form-row">
			<div class="form-group col-sm-6">
				<label for="validationCustom06">Contact</label> <input type="text"
					class="form-control" name="phno" id="validationCustom06"
					placeholder="Contact" autocomplete="off" required>
				<div class="invalid-feedback">Please fill out this field.</div>
				<span id="contactErrorSection"
					style="color: red; align-content: center;"></span>
			</div>
			<div class="form-group col-sm-6">
				<label for="validationCustom07">Address</label> <input type="text"
					class="form-control" id="validationCustom07" name="addr"
					autocomplete="off" placeholder="e.g.BTM 1st stage,Bangalore" required>
				<div class="invalid-feedback">Please fill out this field.</div>
			</div>
		</div>

		<!-- <button class="btn btn-primary" id="enableOnInput" type="submit">Submit form</button> -->
		<div class='actions form-group'>
			<input class="btn btn-primary"  type="submit"
				name="submit-btn" value="Submit Form" 
				title="You Still have Invalid inputs">
		</div>

	</form>
	<script type="text/javascript" src="js/script.js"></script>

</body>
</html>
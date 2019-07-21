<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1" />
<title>Login Page</title>

<link href="css/style.css" rel="stylesheet" type="text/css" />
</head>

<body>

	<form method="post" action="LoginServlet">
		<div class="container">
			<div class="login">
				<h1>Lead Management System</h1>
				<p>
					<input type="text" name="userId" value="" placeholder="Username">
				</p>
				<p>
					<input type="password" name="password" value=""
						placeholder="Password">
				</p>
				<p class="submit">
					<input type="submit" name="commit" value="Login">
				</p>
			</div>
		</div>
	</form>

</body>
</html>

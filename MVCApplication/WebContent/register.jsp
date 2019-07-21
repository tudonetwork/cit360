<html>
<head>
<title>New Lead</title>
<link rel="stylesheet" type="text/css" href="css/style.css" />
<style type="text/css">
h3 {
	font-family: arial;
	font-size: 22pt;
	font-style: normal;
	font-weight: bold; #333;
	text-align: center;
}

table {
	font-family: arial;
	color: white;
	font-size: 11pt;
	font-style: normal;
	width: 700px;
	text-align:;
	border-collapse: collapse;
	border: 0px solid navy
}

table.inner {
	border: 0px
}
</style>
</head>

<body>
	<h3>New Lead</h3>
	<a href="home.jsp"><input type="button" value="Home"></a>
	<form action="RegisterServlet" method="POST">

		<table align="center" cellpadding="10">
			<tr>
				<td>First Name*</td>
				<td><input type="text" name="firstName" maxlength="30" /> (max
					30 characters a-z and A-Z)</td>
			</tr>
			<tr>
			<tr>
				<td>Last Name*</td>
				<td><input type="text" name="lastName" maxlength="30" /> (max
					30 characters a-z and A-Z)</td>
			</tr>

			<tr>
				<td>Email*</td>
				<td><input type="text" name="email" maxlength="100" /></td>
			</tr>

			<td>Phone Number*</td>
			<td><input type="text" name="phonenumber" maxlength="30" /></td>
			</tr>

			<tr>
				<td>Country</td>
				<td><input type="text" name="country" maxlength="100" />
					(optional)</td>
			</tr>

			<tr>
				<td colspan="2" align="center"><input type="submit"
					value="Submit"> <input type="reset" value="Reset">
				</td>
			</tr>
		</table>

	</form>

</body>
</html>
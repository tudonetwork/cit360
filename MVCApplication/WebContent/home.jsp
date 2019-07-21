<%@page import="java.util.List"%>
<%@page import="cit360.mvchibernate.controller.UserController"%>
<%@page import="cit360.mvchibernate.controller.LeadController"%>
<%@page import="java.util.Date"%>
<%@page import="cit360.mvchibernate.model.User"%>
<%@page import="cit360.mvchibernate.model.Lead"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" type="text/css" href="css/style.css" />
<title>Result Page</title>
</head>
<body>
	<center>
		<div id="container">
			<h1>Lead Management System</h1>
			<%=new Date()%></br>
			<%
				User user = (User) session.getAttribute("user");
			%>
			<b>Welcome <%=user.getFirstName() + " " + user.getLastName()%></b> <br />
			<a href="logout.jsp">Logout</a>
			</p>
			<p style="width: 100%; text-align: right; margin: 20px 0px;">
				<a href="register.jsp"><input type="button" value="Add New Lead"></a>
			</p>

			<table class="greyGridTable">
				<thead>
					<tr>

						<th>First Name</th>
						<th>Last Name</th>
						<th>email</th>
						<th>Phone Number</th>
						<th>Country</th>
					</tr>
				</thead>
				<tbody>
					<%
						LeadController leadService = new LeadController();
									List<Lead> list = leadService.getListOfLeads();
									for (Lead l : list) {
					%>
					<tr>
						<td><%=l.getFirstName()%></td>
						<td><%=l.getLastName()%></td>
						<td><%=l.getEmail()%></td>
						<td><%=l.getPhoneNumber()%></td>
						<td><%=l.getCountry()%></td>
					</tr>
					<%
						}
					%>
				
				<tbody>
			</table>
			<br />
		</div>
	</center>
</body>
</html>

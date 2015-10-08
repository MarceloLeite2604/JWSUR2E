<%@ page isErrorPage="true" language="java"
	contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Temperature converter - Error</title>
<style type='text/css'>
a {
	color: #151b8d;
	text-decoration: none;
}

a:visited {
	color: #151b8d;
}

a:hover {
	color: #fff;
	background-color: #666
}

.p {color red;
	font-size: large;
}
</style>
</head>
<body>
	<%
		response.setStatus(400);
	%>
	<!-- Bad request -->
	<p class='p'>Numbers only, please.</p>
	<hr />
	<a href='index.html'>Try again.</a>
</body>
</html>
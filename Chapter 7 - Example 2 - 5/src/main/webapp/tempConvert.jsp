<!DOCTYPE html>
<%@ page errorPage="error.jsp" language="java"
	contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!-- wsimport-generated artifacts -->
<%@ page
	import="br.com.acaosistemas.tempconvertclient.TempConvertService"%>
<%@ page import="br.com.acaosistemas.tempconvertclient.TempConvert"%>
<html>
<head>
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

.p {color blue;
	font-size: large;
}

legend {
	color: #990000;
	font-size: large;
}

fieldset {
	width: 600px;
	background-color: rgb(225, 225, 225)
}
</style>
</head>
<%!private float f2c, c2f, temp;%>
<%
	String tempStr = request.getParameter("temperature"); // text field
	if (tempStr != null)
		this.temp = Float.parseFloat(tempStr.trim());
	this.f2c = this.c2f = this.temp;
	TempConvert port = new TempConvertService().getTempConvertPort();
	c2f = port.c2F(temp);
	f2c = port.f2C(temp);
%>
<body>
	<fieldset>
		<legend>Temperature conversions</legend>
		<p><%=this.temp%>F =
			<%=this.c2f%></p>
		<p><%=this.temp%>C =
			<%=this.f2c%></p>
	</fieldset>
	<hr />
	<a href='index.html'>Try another</a>
</body>
</html>
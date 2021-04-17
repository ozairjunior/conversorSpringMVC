<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Conversor</title>
</head>
<body>

	<form:form method="POST" modelAttribute="moedas">
		<p>${dolar}</p>
		<p>${real}</p>
			
		<p>Dolar: <form:input required="required" type="number" onekeypress="return event.charCode >= 48 " min="1" path="dolar" step=".01"/></p>
			
		<p>Real: <form:input required="required" type="number" onekeypress="return event.charCode >= 48 " min="1" path="real" step=".01"/></p>
			
		<p><form:button>Converter</form:button> </p>
		<p>${ContaDolar}</p>
		<p>${ContaReal}</p>
	</form:form>

</body>
</html>
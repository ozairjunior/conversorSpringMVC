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

	<form:form method="POST" modelAttribute="moedas" action="cadastro">
		<p>${euro}</p>
		<p>${iene}</p>
			
		<p>Iene: <form:input required="required" type="number" placeholder="iene" onekeypress="return event.charCode >= 48 " min="1" path="iene" step=".01"/></p>
		<p>Euro: <form:input required="required" type="number" placeholder="euro" onekeypress="return event.charCode >= 48 " min="1" path="euro" step=".01"/></p>
		
		
		<p><form:button>Converter</form:button> </p>
		<p>${ContaEuro}</p>
		<p>${ContaIene}</p>
		
		<p>${mensagem}</p>
	</form:form>
	<button> <a href="/intro-spring" > voltar </a> </button>
</body>
</html>
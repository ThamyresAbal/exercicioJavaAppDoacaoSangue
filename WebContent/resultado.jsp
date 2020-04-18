<%@page import="negocio.Pessoa"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Relatório</title>
</head>
<body>
	<%
	List<Pessoa> pessoas = (List<Pessoa>)request.getAttribute("lista");
	%>
	
	<%
	if(pessoas.isEmpty()) {
	%>
		<h3>Não existem doadores!!!</h3>
	<%
	} else {
		for (Pessoa pessoa : pessoas) {
	%>
			<h4><%=pessoa.toString()%></h4>
	<% 
		}
	}
	%>
</body>
</html>
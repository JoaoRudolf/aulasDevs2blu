<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ page import="Classes.Aluno" %> 
 <%@ page import="infra.DaoAluno" %> 
 <%@ page import="telas.TelaAluno" %> 
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%
	

TelaAluno.criarAluno("nome", "nomMae", "nomPai", null, 0.0, "a");
response.sendRedirect("cadastraaluno.jsp?mensagem=ALuno salvo com sucesso");


%>

</body>
</html>
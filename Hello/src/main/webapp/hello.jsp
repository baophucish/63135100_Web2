<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
	<!DOCTYPE html>
	<html>

	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
	</head>

	<body>
		<% java.util.Date date=new java.util.Date(); %>
			<h1>Hom nay la ngay
				<%=date.toString()%>
			</h1>
	</body>

	</html>
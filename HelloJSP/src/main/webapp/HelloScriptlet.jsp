<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Hello 63CNTT-CLC</h1>
	<h2>Scriptlet</h2>
	
	<%
		// chu thich cua java
		int a = 3;
		int b = 4;
		int c = a + b;
		
		// xuat ra trang web tai vi tri nay
		out.print(a);
		out.print(" + ");
		out.print(b);
		out.print(" = ");
		out.print(c);
		
	%>
</body>
</html>
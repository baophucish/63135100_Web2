<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<%! 
int tong(int a, int b){
	return a + b;
}
%>
<body>
	<%
	int a = 4;
	int b = 6;
	int c = tong(a,b);
	
	out.print(c);
	%>
</body>
</html>
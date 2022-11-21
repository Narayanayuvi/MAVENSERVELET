<%@page import="com.telsuko.web.model.Offices"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor="cyano">

   <%
      Offices of =(Offices)request.getAttribute("offices");
   
       out.println(of);
   %>

</body>
</html>
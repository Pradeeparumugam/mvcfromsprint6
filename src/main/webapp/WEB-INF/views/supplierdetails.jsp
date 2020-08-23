<%@ page language="java" contentType="text/html; charset=UTF-8" 
     pageEncoding="UTF-8"%> 
 
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<!DOCTYPE html>
<html>
<head>
<title>supplier details</title>
</head>
<body>
<h2>supplier details</h2>
Id=<c:out value="${supplier.id}"></c:out><br>
Name=<c:out value="${supplier.name}"></c:out><br>


</body>
</html>
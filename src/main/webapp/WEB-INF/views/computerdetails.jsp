<%@ page language="java" contentType="text/html; charset=UTF-8" 
     pageEncoding="UTF-8"%> 
 
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<!DOCTYPE html>
<html>
<head>
<title>computer details</title>
</head>
<body>
<h2>computer details</h2>
Id=<c:out value="${computer.id}"></c:out><br>
Name=<c:out value="${computer.name}"></c:out><br>
DiskSize=<c:out value="${computer.disksize}"></c:out><br>
</body>
</html>
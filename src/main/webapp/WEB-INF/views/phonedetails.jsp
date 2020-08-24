<%@ page language="java" contentType="text/html; charset=UTF-8" 
     pageEncoding="UTF-8"%> 
 
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<!DOCTYPE html>
<html>
<head>
<title>phone details</title>
</head>
<body>
<h2>phone details</h2>
Id=<c:out value="${phone.id}"></c:out><br>
Name=<c:out value="${phone.name}"></c:out><br>
StorageSize=<c:out value="${phone.storagesize}"></c:out><br>
</body>
</html>
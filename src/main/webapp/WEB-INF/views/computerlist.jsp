<%@ page language="java" contentType="text/html; charset=UTF-8" 
     pageEncoding="UTF-8"%> 
 

 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<!DOCTYPE html>
<html>
<head>
<title>All computers</title>
</head>
<body>
<c:forEach items="${computers}" var="computer">
<c:out value="${computer.id}" ></c:out><br>
<c:out value="${computer.name}"></c:out><br>
<c:out value="${computer.supplier}"></c:out><br>
</c:forEach>

</body>
</html>
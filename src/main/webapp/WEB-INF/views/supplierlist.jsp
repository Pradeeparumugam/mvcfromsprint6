<%@ page language="java" contentType="text/html; charset=UTF-8" 
     pageEncoding="UTF-8"%> 
 

 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<!DOCTYPE html>
<html>
<head>
<title>All suppliers</title>
</head>
<body>
<c:forEach items="${suppliers}" var="supplier">
<c:out value="${supplier.id}" ></c:out><br>
<c:out value="${supplier.name}"></c:out><br>
</c:forEach>

</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8" 
     pageEncoding="UTF-8"%> 
 

 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<!DOCTYPE html>
<html>
<head>
<title>All phones</title>
</head>
<body>
<c:forEach items="${phones}" var="phone">
<c:out value="${phone.id}" ></c:out><br>
<c:out value="${phone.name}"></c:out><br>
</c:forEach>

</body>
</html>
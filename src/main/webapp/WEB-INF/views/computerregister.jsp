<%@ page language="java" contentType="text/html; charset=UTF-8" 
 	pageEncoding="UTF-8"%> 
 

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> 

<!DOCTYPE html> 
<html> 
<head> 
<title>ComputerRegistration</title> 
</head> 
<body> 
<h1>Computer Registration</h1> 
 <form method="get" action="/newcomputerregistering"> 

<div>
<label>Name</label> 
<input type="text"  name="name"> 
</div> 
<div>
<label>DiskSize</label> 
<input type="number"  name="disksize"> 
</div> 
 <input type="submit" value="New Computer"> 
</form> 
</body> 
 </html> 

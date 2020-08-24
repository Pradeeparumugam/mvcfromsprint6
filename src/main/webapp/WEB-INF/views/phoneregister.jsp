<%@ page language="java" contentType="text/html; charset=UTF-8" 
 	pageEncoding="UTF-8"%> 
 

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> 

<!DOCTYPE html> 
<html> 
<head> 
<title>PhoneRegistration</title> 
</head> 
<body> 
<h1>Phone Registration</h1> 
 <form method="get" action="/newphoneregistering"> 

<div>
<label>Name</label> 
<input type="text"  name="name"> 
</div> 
<div>
<label>StorageSize</label> 
<input type="number"  name="storagesize"> 
</div> 
 <input type="submit" value="New Phone"> 
</form> 
</body> 
 </html> 

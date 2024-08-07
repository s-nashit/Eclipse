<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%@ page isELIgnored="false"  %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>Register Here</h1>


<div align="center">
<h3>${reg }</h3>
<form action="success">
<table>
<tr><td>Name</td><td><input type="text" name="name" /></td></tr>
<tr><td>Mail</td><td><input type="text" name="mail" /></td></tr>
<tr><td>Phone</td><td><input type="text" name="phone" /></td></tr>
<tr><td>Age</td><td><input type="text" name="age" /></td></tr>
<tr><td><input type="submit" name="submit" value="register" /></td></tr>
</table>

</form>
</div>

</body>
</html>
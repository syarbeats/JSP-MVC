<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page isELIgnored="false" %>

<!DOCTYPE html>
<html>
<head>
	<title>Your Balance</title>
	<link href="./css/styles.css" rel="stylesheet" type="text/css"/>
</head>
<body>
	<table class="title">
	  <tr><th>Your Balance</th></tr>
	</table>
	<p/>
	<img src="./img/money.gif" align="left" hspace="20"/>
	<ul>
	  <li>First name: ${customer.firstName}</li>
	  <li>Last name: ${customer.lastName}</li>  
	  <li>ID: ${customer.id}</li>
	  <li>Balance: $${customer.balance}</li>
	</ul>  
</body>
</html>
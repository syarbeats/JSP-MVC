<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page isELIgnored="false" %>

<!DOCTYPE html>
<html>
	<head><title>Unknown Customer</title>
	<link href="./css/styles.css" rel="stylesheet" type="text/css"/>
</head>
<body>
	<div align="center">
		<table class="title">
		  <tr><th>Unknown Customer</th></tr>
		</table>
		<p/>
		<h2>No customer found with id "${badId}"</h2>
		<p>Please <a href="index.html">try again</a>.</p>
	</div>
</body>
</html>
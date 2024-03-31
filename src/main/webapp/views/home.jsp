<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Home Page</title>
</head>
<body>
	<h1>Using Request Mapping Annotations In Home Page</h1>

	<ul>
		<li>
			<c:url value="/multiAction" var="multiLink"></c:url>
			<a href="${multiLink}">Multi Actions</a>
		</li>
		<li>
			<c:url value="/inputs" var="inputsLink"></c:url>
			<a href="${inputsLink}">User Inputs</a>
		</li>
		<li>
			<c:url value="/course" var="courseLink"></c:url>
			<a href="${courseLink}">Course Management</a>
		</li>
	</ul>
</body>
</html>
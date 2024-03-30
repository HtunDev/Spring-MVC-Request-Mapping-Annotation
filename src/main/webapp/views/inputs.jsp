<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Url Inputs Page</title>
</head>
<body>
	<h1>User Inputs</h1>

	<div>
		<c:if test="${not empty type and not empty id}">
			<h3>${type}/${id}</h3>
		</c:if>
		<c:if test="${not empty date}">
			<h3>${date}</h3>
		</c:if>
		<c:if test="${not empty level}">
			<h3>${level}</h3>
		</c:if>
	</div>

	<ul>
		<li><c:url value="/inputs/Hello MVC/search/1101" var="pathLink"></c:url>
			<a href="${pathLink}">Path Variable</a></li>
		<li><c:url value="/inputs/2024-03-30" var="pathDateLink"></c:url>
			<a href="${pathDateLink}">Current Today Date</a></li>
		<li><c:url value="/inputs/enum/Basic" var="pathEnumLink"></c:url> <a
			href="${pathEnumLink}">Current Level</a></li>
	</ul>
</body>
</html>
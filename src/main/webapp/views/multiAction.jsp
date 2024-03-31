	<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Muti Action Page</title>
</head>
<body>
	<h1>Multi Actions Controller</h1>

	<h3>${ not empty message ? message : 'Default Action' }</h3>

	<ul>
		<li>
			<c:url value="/multiAction/action1" var="action1"></c:url> 
			<a href="${action1}">Action 1</a>
		</li>
		<li>
			<c:url value="/multiAction/action2" var="action2"></c:url> 
			<a href="${action2}">Action 2</a>
		</li>
		<li>
			<c:url value="/multiAction/action2?id=19" var="action2withId"></c:url> 
			<a href="${action2withId}">Action 2 With Id</a>
		</li>
		<li>
			<c:url value="/multiAction/12" var="digit"></c:url> 
			<a href="${digit}">Action 2 With Digit </a>
		</li>
		<li>
			<c:url value="/multiAction/abbdsdsd" var="action3WithWildCart"></c:url> 
			<a href="${action3WithWildCart}">Action 3 With Wild Cart</a>
		</li>
	</ul>
</body>
</html>
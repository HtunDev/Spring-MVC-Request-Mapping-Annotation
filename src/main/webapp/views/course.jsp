
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Course List Page</title>
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css"
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
	crossorigin="anonymous">
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/js/bootstrap.min.js"
	integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl"
	crossorigin="anonymous"></script>
</head>
<body>
	`
	<div class="container pt-4">
		<h1>Course List</h1>

		<div class="mt-4">

			<div>
				<c:url value="/course/edit" var="courseEditLink"></c:url>
				<a href="${courseEditLink}" class="btn btn-primary">Add New
					Course</a>
			</div>
			<table class="table">

				<thead>
					<tr>
						<th>Id</th>
						<th>Name</th>
						<th>Duration</th>
						<th>Level</th>
						<th>Fees</th>
					</tr>
				</thead>

				<tbody>
					<c:forEach var="c" items="${list}">
						<tr>
							<td>${c.id}</td>
							<td>${c.name}</td>
							<td>${c.duration}</td>
							<td>${c.level}</td>
							<td>${c.fees}</td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
		</div>
	</div>
</body>
</html>
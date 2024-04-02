<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Course Detailse</title>
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
	<div class="container pt-4">

		<h1>Course Details</h1>

		<div class="row">

			<div class="col-6">

				<c:url value="/course" var="saveCourseLink"></c:url>
				<form method="post" action="${ saveCourseLink}">

					<div class="mb-3">
						<label class="form-label mb-1" for=id>Course id</label> <input
							id="id" name="id" type="text" placeholder="Enter Course Name"
							readonly="readonly" class="form-control" />
					</div>

					<div class="mb-3">
						<label class="form-label mb-1" for="name">Course Name</label> <input
							id="name" name="name" type="text" placeholder="Enter Course Name"
							readonly="readonly" class="form-control" />
					</div>
					<div class="mb-3">
						<label class="form-label mb-1" for="duration">Duration</label> <input
							id="duration" name="duration" type="number" readonly="readonly"
							placeholder="Enter Course Duration" class="form-control" />
					</div>
					<div class="mb-3">
						<label class="form-label mb-1" for="level">Level</label> <input
							id="level" name="level" type="text" readonly="readonly"
							placeholder="Enter Course Level" class="form-control" />
					</div>
					<div class="mb-3">
						<label class="form-label mb-1" for="fees">Fees</label> <input
							id="fees" name="fees" type="number" readonly="readonly"
							placeholder="Enter Course Fees" class="form-control" />
					</div>

				</form>

			</div>

		</div>
	</div>
</body>
</html>
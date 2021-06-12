<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-BmbxuPwQa2lc/FVzBcNJ7UAyJxM6wuqIj61tLrc4wSX0szH/Ev+nYRRuWlolflfl"
	crossorigin="anonymous">
<title>Create a new player</title>
</head>
<body>
	<div class="container">
		<div class="row">
			<div class="col">
				<form action="/26TeamRoster/team" method="post">
					<label>First Name:</label> <input type="text" name="firstName">
					<label>Last Name:</label> <input type="text" name="lastName">
					<label>Age:</label> <input type="text" name="age"> <input
						class="btn btn-primary mg-2" type="submit" value="submit player">
				</form>
			</div>
		</div>
	</div>
</body>
</html>
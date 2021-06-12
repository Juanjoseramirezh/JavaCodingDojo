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
<title>New Team</title>
</head>
<body>
	<div class="container">
		<div class="row">
			<div class="col">
				<h2>Create a team</h2>
			</div>
			<div class="row">
				<div class="col">
					<form action="/26TeamRoster/NewTeam" method="post">
						<label>Team Name:</label> <input type="text" name="nameTeam">
						<input class="btn btn-primary mg-2" type="submit"
							value="submit team">
					</form>
				</div>
			</div>
			<div class="row">
				<div class="col-11"></div>
				<div class="col-1">
					<a href="/26TeamRoster/Home">Home</a>
				</div>
			</div>
		</div>
	</div>
</body>
</html>
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
<title>The Great Number</title>
</head>
<body>
	<div class="container">
		<div class="row">
			<div class="col">
				<h1>Welcome to the great number game</h1>
			</div>
		</div>
		<div class="row">
			<div class="col-7">
				<h2>I'm thinking a number between 1 and 10</h2>
			</div>
			<div class="col-4">
				<h3>Take a guess!</h3>
			</div>
		</div>
		<div class="indicador">
			<%
			session = request.getSession();
			String theGame = (String) session.getAttribute("respuesta");
			Boolean firstEntry = (Boolean) session.getAttribute("firstEntry");
			
			if (!firstEntry) {

				if (theGame.equals("correct")) {
			%>
			<div class="correct">
				<h2>Correct!!!</h2>
				<a href="/25GreatNumberGame/ShowGreatNumberGame?reset=true">
					<button class="btn btn-primary mt-2 -mb">Play Again!</button>
				</a>
			</div>
			<%
			} else if (theGame.equals("hight")) {
			%>
			<div class="hight">
				<h2>Too High!!</h2>
			</div>
			<%
			} else {
			%><div class="low">
				<h2>To low!!</h2>
			</div>
			<%
			}
			}else{
				session.setAttribute("firstEntry", false);
			}
			%>
		</div>
		<div class="row">
			<div class="col">
				<form action="/25GreatNumberGame/ShowGreatNumberGame" method="post">
					<input type="text" name="numberPiker"> <input
						class="btn btn-primary mt-2 -mb" type="submit" name="submitNumber"
						value="Submit">
				</form>
			</div>
		</div>

	</div>
</body>
</html>
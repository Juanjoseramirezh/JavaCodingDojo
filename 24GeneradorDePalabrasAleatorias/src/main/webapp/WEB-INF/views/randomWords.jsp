<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" import="java.util.Date"%>
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
<title>Random Words!</title>
</head>
<body>

	<div class="container">
		<div class="principal" style="margin: 3 rem 0 3 rem">
			<h1>
				You have generated a word
				<c:out value="${numberClick}"></c:out>
				times
			</h1>
			<div class="row">
				<div class="col">
					<h2>

						<c:out value="${ randomWord }"></c:out>
					</h2>
				</div>
				<div class="row">
					<div class="col">
						<form action="/24GeneradorDePalabrasAleatorias/RandomWords"
							method="get">
							<input type="submit" class="btn btn-danger mt-2 -mb"
								name="numberClick" value="Generate a Random Word!">
						</form>
					</div>
					<div class="row">
						<div class="col">
							<h3>Last word you generate at:</h3>
							<div class="wordBox">
								<h2><%=(Date) request.getSession().getAttribute("createdAt")%></h2>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
</body>
</html>
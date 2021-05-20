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
<title>Click Button</title>
</head>
<body>

	<div class="container">
		<div class="principal" style="margin: 3 rem 0 3 rem">
			<h1>Welcome!</h1>
			<div class="row">
				<div class="col">
					<form action="/23BotonClicker/ShowPokes" method="get">
						<input type="submit" class="btn btn-danger mt-2 -mb" name="poke"
							value="Click me!">
					</form>
					<p>You have clicked this button <c:out value="${poke}"></c:out></p>
				</div>
			</div>
		</div>
	</div>

</body>
</html>
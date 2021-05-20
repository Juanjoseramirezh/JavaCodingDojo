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

<title>Home Page</title>
</head>
<body>

	<div class="container">
		<div class="principal" style="margin: 3 rem 0 3 rem">
			<h1>Welcome!</h1>
			<div class="row">
				<div class="col-4 m-2 border border-dark">
					<h3>Create a dog</h3>
					<form action="/22Pets/Dogs" method="get">
						<label>Name:</label> <input class="form-control" type="text"
							name="name"> <label>Breed</label> <input
							class="form-control" type="text" name="breed"> <label>Weight</label>
						<input class="form-control" type="text" name="weigth">
						<input class="btn btn-primary mt-2 mb" type="submit"
							value="Create Dog">
					</form>
				</div>
				<div class="col-4 m-2 border border-dark">
					<h3>Create a cat</h3>
					<form action="/22Pets/Cats" method="get">
						<label>Name:</label> <input class="form-control" type="text"
							name="name"> <label>Breed</label> <input
							class="form-control" type="text" name="breed"> <label>Weight</label>
						<input class="form-control" type="text" name="weigth">
						<input class="btn btn-primary mt-2 mb" type="submit"
							value="Create Cat">
					</form>
				</div>
			</div>
		</div>
	</div>

</body>
</html>
<%@page import="com.codingdojo.web.models.Team"%>
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
<title>Roster</title>
</head>
<body>
	<div class="container">
		<div class="row">
			<div class="col-11">
				<h2>Prototype Roster</h2>
			</div>
			<div class="col-1">
				<a href="/26TeamRoster/NewTeam">New Team</a>
			</div>
		</div>
		<div class="row">
			<div class="col">
				<table>
					<thead>
						<tr>
							<th>Team</th>
							<th>Player</th>
							<th>Action</th>
						</tr>
					</thead>
					<tbody>
						<c:forEach items="${teams}" var="i">
         				 <tr> 
         				 	<td> <c:out value="${i.teamName}" /></td>
         				 	<td> <c:out value="${i.getPlayers().size()}" /></td>
         				 	<td><a href="/26TeamRoster/NewPlayer?id=<c:out value="${i.getPosition()}"/>">Details</a> 
         				 	<a href="/26TeamRoster/TeamList?id<c:out value="${i.getPosition()}"/>&delete=true">Delete</a>
         				 	 </td>
         				 </tr> 	
						</c:forEach>
					</tbody>
				</table>
			</div>
		</div>

	</div>
</body>
</html>
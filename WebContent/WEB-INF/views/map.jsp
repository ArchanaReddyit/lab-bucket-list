<%@page import="model.TouristPlace"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page language="java" contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="ISO-8859-1">
<title>Map</title>
<meta charset="utf-8" />
<link rel="stylesheet" type="text/css" href="./assets/collection.css" />
</head>
<body>
	<form action="${pageContext.request.contextPath}/map" method="post">
		<div class="form-group">
			<div class="list">
				<label id="name-id" for="stringText">Name</label> 
				<input type="text" class="form-text" id="name" placeholder="Name" name="name">
				
				<label id="travel-id" for="destination">Travel Destination</label> 
				<input type="text" class="form-text" id="destination" placeholder="Place" name="travel">
				
				<label id="rank-id" for="rank">Rank</label>
				<input type="text" class="form-text" id="rank" placeholder="Rank" name="rank">
				
				<button class="button" type="submit" value="ADDITEM" name="add">ADD	TO BUCKET LIST</button>
				
				<label id="sort-random-id" for="sort">Sort Random </label> 
				<input id="sort-random" type="checkbox" value="sort randomly"	name="sortrandomly"> 
				
				<label id="sort-entry-id" for="sortbyrank">Sort in entry order </label> 
				<input id="sort-entry"	type="checkbox" value="sort in entry order" name="sortinentryorder">
				
				<label id="sort-alphabet-id" for="sortalphabetically">Sort Alphabetically </label> 
				<input id="sort-alphabet"	type="checkbox" value="sort in entry order" name="sortalphabetically">
				
				<button class="button-reset" type="submit" value="reset" name="reset">RESET MY BUCKET LIST</button>
				<button class="button-delete" type="submit" value="delete" name="remove">DELETE MY LAST ENTRY</button>
			</div>
		</div>
	</form>
	<div class="output-border">
		<div class="output">
			<p id="bucket-list">Amy's Bucket list</p>
		</div>

		<table class="table-bordered">
			<tbody>
				<tr>
					<th>SPOT NAME</th>
					<th>DESTINATION</th>
					<th>RANK</th>
				</tr>

				<c:forEach var="bucket" items="${bucketList}">

					<tr>

						<td><c:out value="${bucket.getName()}" /></td>
						<td><c:out value="${bucket.getDestination()}" /></td>
						<td><c:out value="${bucket.getRank()}" /></td>

					</tr>
				</c:forEach>

			</tbody>

		</table>
	</div>
</body>
</html>

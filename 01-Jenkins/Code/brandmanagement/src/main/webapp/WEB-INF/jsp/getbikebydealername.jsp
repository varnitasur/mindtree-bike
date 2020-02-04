<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>


<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>

<style>
div {
	width: 200px;
	height: 200px;
	background-color: yellow;
	border: 1px solid black;
	margin: auto;
}

#rotate {
	-ms-transform: rotate(45deg); /* IE 9 */
	-webkit-transform: rotate(45deg); /* Safari prior 9.0 */
	transform: rotate(45deg); /* Standard syntax */
}
</style>


<!-- <style>
 .simple-form {
 max-width: 1000px;
 padding: 50px 70px;
 border-radius: 10px;
 box-shadow: 4px 4px 15px rgba(0, 0, 0, 0.2);
 background-color: bisque;
 }
 body {
 background-color: darkblue;
 }
 </style> -->
</head>
<body>

	<form action="/getbikedetails" method="get">
		<table class="table">

			<tr class="table-success">

				<td><label for="dealerName">Author Name</label></td>
				<td><input type="text" id="dealerId" class="form-control"
					name="dealerName" placeholder="Emter dealer Name"></td>


			</tr>

		</table>
		<table class="table">
			<tr class="table-danger">
				<td><input type="submit" name="Submit" id="submit"
					value="Submit"><br></td>
			</tr>
			<tr>
				<td><a href="/back">back</a></td>
			</tr>


		</table>
	</form>









	<table class="table-active" border="2" width="70%" cellpadding="2">
		<tr>

			<th>bikeId</th>
			<th>bikeName</th>
			<th>bikePrice</th>



		</tr>




		<c:forEach var="prj" items="${bikes}">

			<tr class="info">
				<td>${prj.bikeId}</td>


				<td>${prj.bikeName}</td>


				<td>${prj.bikePrice}</td>





			</tr>
		</c:forEach>


		</tbody>
	</table>

	<table class="table-active" border="2" width="70%" cellpadding="2">
		<tr>

			<th>totalrevenueofauthor</th>


		</tr>



		<tr class="info">
			<td>${totalrevenueofauthor}</td>



		</tr>
</body>
</html>
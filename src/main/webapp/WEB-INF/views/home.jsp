<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">

<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
    <script src="http://code.jquery.com/jquery.min.js"></script>
    <script src="http://netdna.bootstrapcdn.com/bootstrap/3.1.1/js/bootstrap.min.js"></script>
	<link rel="stylesheet" href="http://netdna.bootstrapcdn.com/bootstrap/3.1.1/css/bootstrap.min.css">
	<link rel="stylesheet" href="http://netdna.bootstrapcdn.com/bootstrap/3.1.1/css/bootstrap-theme.min.css">
</head>

<body>
    <h3>List of all persons</h3>
    <table class="table table-striped table-bordered table-hover" border="1px" cellpadding="0" cellspacing="0" >
		<thead>
			<tr>
			<th width="10%">id</th><th width="15%">name</th><th width="10%">country</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="person" items="${persons}">
			<tr>
				<td>${person.id_person}</td>
				<td>${person.name}</td>
				<td>${person.country_id.name_country}</td>
			</tr>
			</c:forEach>
		</tbody>
	</table>
</body>
</html>


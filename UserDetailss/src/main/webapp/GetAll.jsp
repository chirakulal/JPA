

<!doctype html>
<html lang="en">
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page isELIgnored="false" %>
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>User Data</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.7/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body class="container mt-5">

<h2>Users List</h2>

<table class="table table-bordered table-striped mt-3">
    <thead class="table-dark">
    <tr>
        <th>Name</th>
        <th>Email</th>
        <th>Mobile Number</th>
        <th>Age</th>
        <th>Gender</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach var="dto" items="${dtoList}">
        <tr>
            <td>${dto.name}</td>
            <td>${dto.email}</td>
            <td>${dto.mobileNumber}</td>
            <td>${dto.age}</td>
            <td>${dto.gender}</td>
        </tr>
    </c:forEach>
    </tbody>
</table>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.7/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>

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
<body class="container mt-4">

<!-- Search Form -->
<form action="getId" method="get" class="mb-4">
    <div class="mb-3">
        <input type="number" name="id" placeholder="Enter the Id" class="form-control">
    </div>
    <div>
        <button type="submit" class="btn btn-primary">Search</button>
    </div>
</form>

<!-- Display result if dto is present -->
<c:if test="${not empty dto}">
    <h3>User Details</h3>
    <table class="table table-bordered">
        <tr>
            <th>Name</th>
            <td>${dto.name}</td>
        </tr>
        <tr>
            <th>Email</th>
            <td>${dto.email}</td>
        </tr>
        <tr>
            <th>Mobile Number</th>
            <td>${dto.mobileNumber}</td>
        </tr>
        <tr>
            <th>Age</th>
            <td>${dto.age}</td>
        </tr>
        <tr>
            <th>Gender</th>
            <td>${dto.gender}</td>
        </tr>
    </table>
</c:if>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.7/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>

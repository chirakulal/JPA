<!doctype html>
<html lang="en">
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page isELIgnored="false" %>
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Update User</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.7/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body class="container mt-4">

<h2>Update User Name</h2>

<!-- Update Form -->
<form action="deleteUser" method="get" class="mb-4">
    <div class="mb-3">
        <label for="id" class="form-label">User ID</label>
        <input type="number" id="id" name="id" class="form-control" placeholder="Enter User ID" required>
    </div>
    <button type="submit" class="btn btn-primary">Deleted</button>
</form>

<div class="text-center">
    <c:if test="${not empty result}">
        <c:choose>
            <c:when test="${result eq 'Delete is SuccessFull'}">
                <div class="text-success">Successfully Deleted</div>
            </c:when>
            <c:otherwise>
                <div class="text-danger">Failed to Delete</div>
            </c:otherwise>
        </c:choose>
    </c:if>
</div>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.7/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>

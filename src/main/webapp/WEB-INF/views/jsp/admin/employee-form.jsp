<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
    <%@ include file="../header.jsp" %>
</head>
<body>
<div class="container">
    <div class="page-header">
        <h1>Dodaj pracownika</h1>
    </div>
    <form:form method="POST"
               action="/admin/employee" modelAttribute="employeeDto">
        <form:input path="id" hidden="true" />
        <div class="form-group">
            <form:label path="firstName">Imię</form:label>
            <form:input class="form-control" path="firstName" required="true"/>
        </div>
        <div class="form-group">
            <form:label path="lastName">Nazwisko</form:label>
            <form:input class="form-control" path="lastName" required="true"/>
        </div>
        <div class="form-group">
            <form:label path="role">Stanowisko</form:label>
            <form:select path="role" items="${role}" />
        </div>
        <div class="form-group">
            <form:label path="branch">Oddział</form:label>
            <form:select path="branch" items="${branch}" />
        </div>

        <form:button class="btn btn-primary" type="submit" value="Submit">Wykonaj</form:button>
    </form:form>
</div>
</body>
</html>
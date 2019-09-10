<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
    <%@ include file="../header.jsp" %>
</head>
<body>
<div class="container">
    <div class="page-header">
        <h1>Dodaj model auta</h1>
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
            <form:label path="position">Stanowisko</form:label>
            <form:select path="position" items="${position}" />
        </div>
        <div class="form-group">
            <form:label path="branch">Odział</form:label>
            <form:select path="branch" items="${branch}" />
        </div>
        <div class="form-group">
            <form:label path="gear">Skrzynia biegów</form:label>
            <form:select path="gear" items="${gearType}" />
        </div>
        <div class="form-group">
            <form:label path="fuel">Rodzaj Paliwa</form:label>
            <form:select path="fuel" items="${fuels}"/>
        </div>
        <div class="form-group">
            <form:label path="airCondition">Klimatyzacja <form:checkbox class="form-control" path="airCondition" />
            </form:label>
        </div>
        <div class="form-group">
            <form:label path="price">Cena</form:label>
            <form:input class="form-control" path="price" required="true"/>
        </div>
        <form:button class="btn btn-primary" type="submit" value="Submit">Wykonaj</form:button>
    </form:form>
</div>
</body>
</html>
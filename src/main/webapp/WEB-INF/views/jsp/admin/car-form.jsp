<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
    <%@ include file="../header.jsp" %>
</head>
<body>
<div class="container">
    <div class="page-header">
        <h1>Dodaj auto</h1>
    </div>
    <form:form action="/admin/car" method="post" modelAttribute="carDto">
        <input value="${carmodel}" name="carModelId" hidden />
        <form:input hidden="true" path="status" value="AVAILABLE"></form:input>
    <div class="form-group">
        <form:label path="plateNumber">Numer rejestracyjny</form:label>
        <form:input path="plateNumber" class="form-control" required="true"></form:input>
    </div>
        <div class="form-group">
            <form:label path="productionDate">Rok produkcji</form:label>
            <form:input path="productionDate" class="form-control" required="true"></form:input>
        </div>
        <div class="form-group">
            <form:label path="mileage">Przebieg</form:label>
            <form:input path="mileage" class="form-control" required="true"></form:input>
        </div>
        <div class="form-group">
            <form:label path="color">Kolor</form:label>
            <form:select path="color" items="${color}"></form:select>
        </div>
        <form:button class="btn btn-primary" type="submit" value="Submit">Wykonaj</form:button>
    </form:form>

</div>

</body>
</html>
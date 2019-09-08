<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html>
<head>
    <%@ include file="../header.jsp" %>
</head>
<body>
<div class="container">
    <form:form method="POST"
               action="/admin/carmodel" modelAttribute="carModelDto">
        <div class="form-group">
            <form:label path="mark">Marka</form:label>
            <form:input class="form-control" path="mark" required="true"/>
        </div>
        <div class="form-group">
            <form:label path="model">Model</form:label>
            <form:input class="form-control" path="model" required="true"/>
        </div>
        <div class="form-group">
            <form:label path="carClass">Klasa</form:label>
            <form:input class="form-control" path="carClass" required="true"/>
        </div>
        <div class="form-group">
            <form:label path="bodyType">Skrzynia biegów</form:label>
            <form:input class="form-control" path="bodyType" required="true"/>
        </div>
        <div class="form-group">
            <form:label path="fuel">Rodzaj Paliwa</form:label>
            <form:input class="form-control" path="fuel" required="true"/>
        </div>
        <div class="form-group">
            <form:label path="airCondition">Klimatyzacja <form:checkbox class="form-control" path="airCondition" />
            </form:label>
        </div>
        <div class="form-group">
            <form:label path="price">Cena</form:label>
            <form:input class="form-control" path="price" required="true"/>
        </div>
        <form:button class="btn btn-primary" type="submit" value="Submit">Dodaj model auta</form:button>
    </form:form>
</div>
</body>
</html>
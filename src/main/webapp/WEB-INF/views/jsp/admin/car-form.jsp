<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
    <!-- header z includami -->
    <%@ include file="../header.jsp" %>
</head>
<body>

<div class="d-flex" id="wrapper">

    <!-- Sidebar -->
    <%@ include file="sidebar.jsp" %>

    <!-- Page Content -->
    <div id="page-content-wrapper">
        <!-- Topbar -->
        <%@ include file="topbar.jsp" %>


        <div class="container-fluid">
            <c:if test="${msg.length() > 0}">
                <div class="alert alert-success">${msg}</div>
            </c:if>
            <h2>Dodaj pojazd z modelu ID ${carModel}</h2>
            <form:form action="/admin/car" method="post" modelAttribute="carDto">
                <input value="${carModel}" name="carModelId" hidden />
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
                <div calss="form-group">
                    <form:label path="branche">Oddział</form:label>
                    <form:select path="branchId" items="${branches}" itemLabel="${branches.name}"
                                 itemValue="${branches.id}"></form:select>
                </div>
                <form:button class="btn btn-primary" type="submit" value="Submit">Wykonaj</form:button>
            </form:form>
        </div>
        <!-- /#page-content-wrapper -->

    </div>
    <!-- /#wrapper -->

</body>
</html>
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
            <h2>Dodaj model</h2>
            <form:form method="POST"
                       action="/admin/carmodel" modelAttribute="carModelDto">
                <form:input path="id" hidden="true" />
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
                    <form:select path="carClass" items="${carClasses}" />
                </div>
                <div class="form-group">
                    <form:label path="bodyType">Typ nadwozia</form:label>
                    <form:select path="bodyType" items="${bodyType}" />
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
        <!-- /#page-content-wrapper -->

    </div>
    <!-- /#wrapper -->

</body>
</html>
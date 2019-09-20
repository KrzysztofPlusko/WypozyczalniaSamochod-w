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
            <h2>Dodaj oddział</h2>
            <form:form action="/admin/branches" method="post" modelAttribute="brancheDto">
                <div class="form-group">
                    <form:label path="name">Nazwa oddziału</form:label>
                    <form:input path="name" class="form-control" required="true"></form:input>
                </div>
                <div class="form-group">
                    <form:label path="city">Miasto</form:label>
                    <form:input path="city" class="form-control" required="true"></form:input>
                </div>
                <div class="form-group">
                    <form:label path="address">Adres</form:label>
                    <form:input path="address" class="form-control" required="true"></form:input>
                </div>
                <form:button class="btn btn-primary" type="submit" value="Submit">Wykonaj</form:button>
            </form:form>
        </div>
        <!-- /#page-content-wrapper -->

    </div>
    <!-- /#wrapper -->

</body>
</html>
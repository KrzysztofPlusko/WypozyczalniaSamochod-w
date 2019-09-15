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
            <h2>Dodaj pojazd</h2>
            <form:form action="/admin/branches" method="post" branchesAttribute="branchesDto">
                <input value="${branches}" name="branchesId" hidden />
                <form:input hidden="true" path="status" value="AVAILABLE"></form:input>
                <div class="form-group">
                    <form:label path="car">Samochód</form:label>
                    <form:input path="car" class="form-control" required="true"></form:input>
                </div>
                <div class="form-group">
                    <form:label path="adress">Adres oddziału</form:label>
                    <form:input path="adress" class="form-control" required="true"></form:input>
                </div>
                <div class="form-group">
                    <form:label path="employee">Pracownik</form:label>
                    <form:input path="employee" class="form-control" required="true"></form:input>
                </div>
                <form:button class="btn btn-primary" type="submit" value="Submit">Wykonaj</form:button>
            </form:form>
        </div>
        <!-- /#page-content-wrapper -->

    </div>
    <!-- /#wrapper -->

</body>
</html>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <%@ include file="../header.jsp" %>
</head>
<body>
<%--<div class="container">--%>
<%--    <div class="page-header">--%>

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

        <h1>Dodaj pracownika</h1>

    <form:form method="POST"
               action="/admin/employee" modelAttribute="employeeDto">
        <form:input path="id" hidden="true" />
        <div class="form-group">
            <form:label path="firstName"> Imię</form:label>
            <form:input class="form-control" path="firstName" required="true"/>
        </div>
        <div class="form-group">
            <form:label path="lastName"> Nazwisko</form:label>
            <form:input class="form-control" path="lastName" required="true"/>
        </div>

        <div class="form-group">
        <form:label path="login"> Login</form:label>
        <form:input class="form-control" path="login" required="true"/>
    </div>

        <div class="form-group">
            <form:label path="password"> Hasło </form:label>
            <form:input type="password" class="form-control" path="password" required="true"/>
        </div>
        <div class="form-group">
            <form:label path="role"> Stanowisko</form:label>
            <form:select path="role" items="${role}" />
        </div>
       <div class="form-group">
           <form:label path="branchId"> Oddział</form:label>
           <form:select path="branchId"  >
               <form:options items="${branches}" itemValue="id" itemLabel="name"/>
           </form:select>
       </div>

        <form:button class="btn btn-primary" type="submit" value="Submit">Wykonaj</form:button>
    </form:form>
    </div>
    <!-- /#page-content-wrapper -->
</div>
<!-- /#wrapper -->
</body>
</html>

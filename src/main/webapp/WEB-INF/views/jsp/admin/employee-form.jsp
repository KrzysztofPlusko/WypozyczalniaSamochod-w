<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
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
    </div>
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
            <form:label path="role"> Stanowisko</form:label>
            <form:select path="role" items="${role}" />
        </div>

<%--        <form:form action="/admin/employee" method="post" modelAttribute="branchesDto">--%>
<%--            <input value="${branches}" name="branchesId" hidden />--%>
<%--            <form:input hidden="true" path="status" value="AVAILABLE"></form:input>--%>
<%--&lt;%&ndash;            <div class="form-group">&ndash;%&gt;--%>
<%--&lt;%&ndash;                <form:label path="plateNumber"></form:label>&ndash;%&gt;--%>
<%--&lt;%&ndash;                <form:input path="plateNumber" class="form-control" required="true"></form:input>&ndash;%&gt;--%>
<%--&lt;%&ndash;            </div>&ndash;%&gt;--%>


       <div class="form-group">
           <form:label path="branches"> Oddział</form:label>
          <form:select path="branches" items="${branches}" />
       </div>

        <form:button class="btn btn-primary" type="submit" value="Submit">Wykonaj</form:button>
    </form:form>
</div>
</body>
</html>

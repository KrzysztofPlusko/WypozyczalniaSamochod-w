<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


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
            <h2>Lista Pracowników</h2>
            <table class="table table-striped">
                <tr>
                    <th>Imię</th>
                    <th>Nazwisko</th>
                    <th>Stanowisko</th>
                    <th>Oddział</th>

                </tr>
                <c:forEach items="${employees}" var="employee">
                    <tr>
                        <td>${employee.firstName}</td>
                        <td>${employee.lastName}</td>
                        <td>${employee.role}</td>
                        <td>${employee.branch}</td>

                        <td>
                            <div id="action-buttons-group" class="position-relative">
                                <form id="form-del" action="/admin/employee/del" method="post"
                                      onclick="return confirm('Czy na pewno usunć?');">
                                    <input hidden name="id" value="${employee.id}">
                                    <div class="float-left"><button alt="Usuń pracownika" class="fas fa-trash-alt"/></div>
                                </form>
                                <form action="/admin/employee/edit" method="post">
                                    <input hidden name="id" value="${employee.id}">
                                    <div class="float-left"><button alt="Edytuj pracownika" class="fas fa-edit"/></div>
                                </form>


                            </div>

                        </td>
                    </tr>
                </c:forEach>
            </table>
        </div>
        <!-- /#page-content-wrapper -->

    </div>
    <!-- /#wrapper -->

</body>
</html>


<%--<!DOCTYPE html>--%>
<%--<html>--%>
<%--<head>--%>
<%--    <%@ include file="../header.jsp" %>--%>
<%--</head>--%>
<%--<body>--%>
<%--<div class="container">--%>
<%--    <c:if test="${msg.length() > 0}">--%>
<%--        <div class="alert alert-success">${msg}</div>--%>
<%--    </c:if>--%>
<%--    <table class="table table-striped">--%>
<%--        <tr>--%>
<%--            <th>Imię</th>--%>
<%--            <th>Nazwisko</th>--%>
<%--            <th>Stanowisko</th>--%>
<%--            <th>Odział</th>--%>
<%--        </tr>--%>
<%--        <c:forEach items="${employees}" var="employee">--%>
<%--            <tr>--%>
<%--                <td>${employee.firstName}</td>--%>
<%--                <td>${employee.lastName}</td>--%>
<%--                <td>${employee.role}</td>--%>
<%--                <td>${employee.branch}</td>--%>

<%--                <td>--%>
<%--                    <div id="action-buttons-group" class="position-relative">--%>
<%--                        <form id="form-del" action="/admin/employee/del" method="post"--%>
<%--                              onclick="return confirm('Czy na pewno usunć?');">--%>
<%--                            <input hidden name="id" value="${employee.id}">--%>
<%--                            <div class="float-left">--%>
<%--                                <button alt="Usuń pracownika" class="fas fa-trash-alt"/>--%>
<%--                            </div>--%>
<%--                        </form>--%>
<%--                        <form action="/admin/employee/edit" method="post">--%>
<%--                            <input hidden name="id" value="${employee.id}">--%>
<%--                            <div class="float-left">--%>
<%--                                <button alt="Edytuj pracownika" class="fas fa-edit"/>--%>
<%--                            </div>--%>
<%--                        </form>--%>
<%--                        <form action="/admin/employee/add" method="post">--%>
<%--                            <input hidden name="id" value="${employee.id}">--%>
<%--                            <div class="float-left">--%>
<%--                                <button alt="Dodaj pracownika" class="far fa-plus-square"/>--%>
<%--                            </div>--%>
<%--                        </form>--%>
<%--                    </div>--%>

<%--                </td>--%>
<%--            </tr>--%>
<%--        </c:forEach>--%>
<%--    </table>--%>
<%--</div>--%>
<%--</body>--%>
<%--</html>--%>
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
            <h2>Lista oddziałów</h2>
            <table class="table table-striped">
                <tr>
                    <th>Id oddziału</th>
                    <th>Nazwa oddziału</th>
                    <th>Misto</th>
                    <th>Adres</th>
                </tr>
                <c:forEach items="${branches}" var="branch">
                    <tr>
                        <td>${branch.id}</td>
                        <td>${branch.name}</td>
                        <td>${branch.city}</td>
                        <td>${branch.address}</td>
                        <td>
                            <div id="action-buttons-group" class="position-relative">
                                <form id="form-del" action="/admin/branches/del" method="post"
                                      onclick="return confirm('Czy na pewno usunć?');">
                                    <input hidden name="id" value="${branch.id}">
                                    <div class="float-left"><button alt="Usuń oddział" class="fas fa-trash-alt"/></div>
                                </form>
                                <form action="/admin/branches/edit" method="post">
                                    <input hidden name="id" value="${branch.id}">
                                    <div class="float-left"><button alt="Edytuj oddział" class="fas fa-edit"/></div>
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
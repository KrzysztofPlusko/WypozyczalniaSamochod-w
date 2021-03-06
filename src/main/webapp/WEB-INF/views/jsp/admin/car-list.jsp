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
            <h2>Lista aut</h2>
            <table class="table table-striped">
                <tr>
                    <th>Model</th>
                    <th>Nr rej</th>
                    <th>Nazwa Oddziału</th>
                    <th>Przebieg</th>
                    <th>Rok produkcji</th>
                    <th>Kolor</th>
                    <th>Status</th>
                    <th>Opcje</th>
                </tr>
                <c:forEach items="${cars}" var="car">
                    <tr>
                        <td>${car.carModel.mark} ${car.carModel.model}</td>
                        <td>${car.plateNumber}</td>
                        <td>${car.branches.name}</td>
                        <td>${car.mileage}</td>
                        <td>${car.productionDate}</td>
                        <td>${car.color}</td>
                        <td>${car.status}</td>
                        <td>
                            <div id="action-buttons-group" class="position-relative">
                                <form id="form-del" action="/admin/car/del" method="post"
                                      onclick="return confirm('Czy na pewno usunć?');">
                                    <input hidden name="id" value="${car.id}">
                                    <div class="float-left"><button alt="Usuń pojazd" class="fas fa-trash-alt"/></div>
                                </form>
                                <form action="/admin/car/edit" method="post">
                                    <input hidden name="id" value="${car.id}">
                                    <div class="float-left"><button alt="Edytuj pojazd" class="fas fa-edit"/></div>
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
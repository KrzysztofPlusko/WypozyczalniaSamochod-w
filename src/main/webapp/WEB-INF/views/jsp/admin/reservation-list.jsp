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
            <h2>Lista Rezerwacji</h2>
            <table class="table table-striped">
                <tr>
            <th>Klient</th>
            <th>Data rezerwacji</th>
            <th>Data wypożyczenia</th>
            <th>Data oddania</th>
            <th>Oddział wypożyczenia</th>
            <th>Oddział oddania</th>
            <th>carModel</th>
            <th>Opcje</th>
        </tr>
        <c:forEach items="${reservation}" var="reservation">
            <tr>
                <td>${reservation.client}</td>
                <td>${reservation.dateOfReservation}</td>
                <td>${reservation.startingDate}</td>
                <td>${reservation.endDate}</td>
                <td>${reservation.reservationBranch}</td>
                <td>${reservation.returnBranch}</td>
                <td>${reservation.carModel}</td>

                <td>
                    <div id="action-buttons-group" class="position-relative">
                        <form id="form-del" action="/admin/reservation/del" method="post"
                              onclick="return confirm('Czy na pewno usunć?');">
                            <input hidden name="id" value="${reservation.id}">
                            <div class="float-left"><button alt="Usuń rezerwację" class="fas fa-trash-alt"/></div>
                        </form>
                        <form action="/admin/reservation-form/add" method="post">
                            <input hidden name="id" value="${reservation.id}">
                            <div class="float-left"><button alt="Wypożycz pojazd" class="far fa-plus-square"/></div>
                        </form>
                    </div>

                </td>
            </tr>
        </c:forEach>
    </table>
</div>
</body>
</html>
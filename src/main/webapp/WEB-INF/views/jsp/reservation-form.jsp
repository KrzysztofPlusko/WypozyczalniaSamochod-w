<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
    <!-- header z includami -->
    <%@ include file="header.jsp" %>
</head>
<body>

<div class="d-flex" id="wrapper">

    <!-- Sidebar -->
    <%@ include file="admin/sidebar.jsp" %>

    <!-- Page Content -->
    <div id="page-content-wrapper">
        <!-- Topbar -->
        <%@ include file="admin/topbar.jsp" %>


        <div class="container-fluid">
            <c:if test="${msg.length() > 0}">
                <div class="alert alert-success">${msg}</div>
            </c:if>
            <h2>Dodaj rezerwację</h2>
            <form:form method="POST"
                       action="/admin/reservation" modelAttribute="reservationDto">
                <form:input path="id" hidden="true" />
                <div class="form-group">
                    <form:label path="client">Klient</form:label>
                    <form:input class="form-control" path="client" required="true"/>
                </div>
                <div class="form-group">
                    <form:label path="dateOfReservation">Data rezerwacji</form:label>
                    <form:input id="datepicker" class="form-control" path="dateOfReservation" required="true"/>

                </div>
                <div class="form-group">
                    <form:label path="startingDate">Data wypożyczenia</form:label>
                    <form:input id="datepicker" class="form-control" path="startingDate" required="true"/>
                </div>
                <div class="form-group">
                    <form:label path="endDate">Data oddania</form:label>
                    <form:input id="datepicker" class="form-control" path="endDate" required="true"/>

                </div>
                <div class="form-group">
                    <form:label path="reservationBranch">Oddział wypożyczenia</form:label>
                    <form:select path="reservationBranch" items="${reservationBranch}" />
                </div>
                <div class="form-group">
                    <form:label path="returnBranch">Oddział oddania</form:label>
                    <form:select path="returnBranch" items="${endBranch}" />
                </div>

                <div class="form-group">
                    <form:label path="carModel"></form:label>
                    <form:select path="carModel" items="${carModel}"/>
                </div>


                <form:button class="btn btn-primary" type="submit" value="Submit">Wykonaj</form:button>
            </form:form>
        </div>
        <!-- /#page-content-wrapper -->

    </div>
    <!-- /#wrapper -->
    <script>
        $(function() {
            $( "#datepicker" ).datepicker();
        });
    </script>
</body>
</html>
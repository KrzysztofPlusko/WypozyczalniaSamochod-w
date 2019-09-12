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
            <h2>Lista modeli</h2>
            <table class="table table-striped">
                <tr>
                    <th>Marka</th>
                    <th>Model</th>
                    <th>Typ nadwozia</th>
                    <th>Skrzynia biegów</th>
                    <th>Paliwo</th>
                    <th>Klimatyzacja</th>
                    <th>Cena</th>
                    <th>Action</th>
                </tr>
                <c:forEach items="${carmodels}" var="carmodel">
                    <tr>
                        <td>${carmodel.mark}</td>
                        <td>${carmodel.model}</td>
                        <td>${carmodel.bodyType}</td>
                        <td>${carmodel.gear}</td>
                        <td>${carmodel.fuel}</td>
                        <td>${carmodel.airCondition}</td>
                        <td>${carmodel.price}</td>
                        <td>
                            <div id="action-buttons-group" class="position-relative">
                                <form id="form-del" action="/admin/carmodel/del" method="post"
                                      onclick="return confirm('Czy na pewno usunć?');">
                                    <input hidden name="id" value="${carmodel.id}">
                                    <div class="float-left"><button alt="Usuń model" class="fas fa-trash-alt"/></div>
                                </form>
                                <form action="/admin/carmodel/edit" method="post">
                                    <input hidden name="id" value="${carmodel.id}">
                                    <div class="float-left"><button alt="Edytuj model" class="fas fa-edit"/></div>
                                </form>
                                <form action="/admin/car/add" method="post">
                                    <input hidden name="id" value="${carmodel.id}">
                                    <div class="float-left"><button alt="Dodaj pojazd z modelu" class="far fa-plus-square"/></div>
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
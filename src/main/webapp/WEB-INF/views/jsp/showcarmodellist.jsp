<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <%@ include file="header.jsp" %>
</head>
<body>
<div class="container">
    <c:if test="${msg.length() > 0}">
        <div class="alert alert-success">${msg}</div>
    </c:if>
    <table class="table table-striped">
        <tr>
            <th>Id</th>
            <th>Material</th>
            <th>Color</th>
            <th>Size</th>
            <th>Graphic</th>
            <th>Sign</th>
            <th>Action</th>
        </tr>
        <c:forEach items="${shirts}" var="shirt">
            <tr>
                <td>${shirt.id}</td>
                <td>${shirt.material}</td>
                <td>${shirt.color}</td>
                <td>${shirt.size}</td>
                <td>${shirt.graphic}</td>
                <td>${shirt.sign}</td>
                <td>
                    <form action="/deleteShirt" method="post" onclick="return
                            confirm('Are you sure you want to delete user?');">
                        <input hidden name="id" value="${shirt.id}">
                        <button>
                            DELETE
                        </button>
                    </form></td>
            </tr>
        </c:forEach>
    </table>
</div>
</body>
</html>
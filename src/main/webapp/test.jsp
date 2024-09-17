<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<div>
    <h4>IP Address</h4>
    <p><%= request.getRemoteAddr() %></p>
    <c:forEach var="index" begin="1" end="3" step="1">
        <p>인덱스: ${index}</p>
    </c:forEach>
</div>

</body>
</html>

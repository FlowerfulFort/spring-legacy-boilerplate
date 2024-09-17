<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Account List</title>
</head>
<body>
<c:forEach var="account" items="${requestScope.accountList}">
  <p>${account}</p>
</c:forEach>
</body>
</html>

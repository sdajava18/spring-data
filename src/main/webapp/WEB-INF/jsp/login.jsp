<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<c:set var="contextPath" value="${pageContext.request.contextPath}"/>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <title>Log in with your account</title>

    <%@ include file="header.jsp" %>
</head>

<body>

<form action="/login" method="post">
    Login:
    <input name="username" type="text">
    Password
    <input name="password" type="password">
    <input type="submit">
</form>
</body>
</html>
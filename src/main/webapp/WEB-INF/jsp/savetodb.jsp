<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Save to DB</title>
</head>
<body>
<form action="/savtodb" method="post">
    <label path="login">Login</label>
    <input path="login"/><br><br>

    <label path="pass">Password</label>
    <input path="pass"/><br><br>

    <label path="email">email</label>
    <input path="email"/><br><br>

    <input type="submit" value="Send">
</form>

</body>
</html>

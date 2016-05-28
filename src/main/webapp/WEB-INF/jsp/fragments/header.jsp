<!DOCTYPE html>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>


<html>
<head>
    <link href="<c:url value='/resources/css/style.css'/>" rel="stylesheet">
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Главная страница блога</title>
</head>
<body>
<header>
    <a href="/"><img alt="Логотип" id="top-image" src="/resources/images/main_logo.jpg"/></a>
    <div id="user-panel">
        <%--<span style="float: right"> --%>
				<a href="?lang=en">en</a>
				<a href="?lang=ru">ru</a>
        <%--</span>--%>

        <a href="/registration">Регистрация</a>

    </div>
</header>

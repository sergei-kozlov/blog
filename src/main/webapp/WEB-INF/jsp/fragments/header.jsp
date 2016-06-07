<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <link href="<c:url value='/resources/css/style.css'/>" rel="stylesheet">
    <title>Article page</title>
</head>
<body>
<header>
    <a href="/"><img alt="Логотип" id="top-image" src="/resources/images/main_logo.jpg"/></a>
    <div id="user-panel">

        <a href="/registration"><spring:message code="registration.h1"/> </a>
        <a href="/addarticle"><spring:message code="registration.add"/></a>

    </div>
</header>

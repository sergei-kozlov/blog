
<!DOCTYPE html>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<jsp:include page="fragments/header.jsp"/>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<head>
    <link href="<c:url value='/resources/css/style.css'/>" rel="stylesheet">
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Страница подвердения регистрации</title>
</head>
<body>
<header>
    <a href="/"><img alt="Логотип" id="top-image" src="/resources/images/main_logo.jpg"/></a>
    <div id="user-panel">

    </div>


<div id="main">
    <aside class="leftAside">
        <h2>Добро пожаловать в блог</h2>
        <p>Регистрация прошла успешно</p>
    </aside>
    <section>
        <article>
            <h1>Регистрация</h1>

            <form:form method="POST" commandName="simple" action="/registration/add">
                <div class="text-article">
                    <p>
                        Добро пожаловать ${users.login}
                    </p>

                </div>
            </form:form>
        </article>
    </section>
</div>

<jsp:include page="fragments/footer.jsp"/>

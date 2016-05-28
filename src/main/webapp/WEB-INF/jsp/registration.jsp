<!DOCTYPE html>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<jsp:include page="fragments/header.jsp"/>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<head>
    <link href="<c:url value='/resources/css/style.css'/>" rel="stylesheet">
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Страница регистрации</title>
</head>
<body>


<div id="main">
    <aside class="leftAside">
        <h2>Что нужно для регистрации</h2>
        <p>Что бы регистрация прошла успешно, заполните все поля и нажмите на
            кнопку "Зарегистрироваться"
        </p>
    </aside>
    <section>
        <article>
            <h1>Регистрация</h1>

            <form:form method="POST" commandName="users" action="/registration/add">
                <div class="text-article">
                    <p>
                        <form:label path="login">Login</form:label>
                        <form:input path="login"/>
                        <form:errors path="login" cssClass="error"/>
                    </p>
                    <p>
                        <label for="email">E-Mail</label>
                        <form:input path="email"/>
                        <form:errors path="email" cssClass="error"/>
                    </p>
                    <p>
                        <label for="pass">Пароль</label>
                        <form:input path="pass" cssClass="error"/>
                        <form:errors path="pass" cssClass="error"/>
                    </p>
                    <p>
                        <form:button type="submit" name="action">Зарегистрироваться</form:button>
                            .
                    </p>
                </div>
            </form:form>
        </article>
    </section>
</div>

<jsp:include page="fragments/footer.jsp"/>

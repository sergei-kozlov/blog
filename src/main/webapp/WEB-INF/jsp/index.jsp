<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>



<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <link href="<c:url value='/resources/css/style.css'/>" rel="stylesheet">
    <title><spring:message code="index.title"/></title>
</head>
<body>
<header>
    <a href="/"><img alt="Логотип" id="top-image" src="/resources/images/main_logo.jpg"/></a>
    <div id="user-panel">

        <a href="?lang=ru">Ru</a>
        <a href="?lang=en">En</a>

        <a href="/registration"><spring:message code="index.registration"/> </a>
        <a href="/login">Авторизация</a>

    </div>
</header>

<div id="main">
    <aside class="leftAside">

        <h2><spring:message code="index.head"/></h2>


        <c:forEach var="articles" items="${articles}" begin="0" end="5">
            <ul>
                <li>
                    <a href="article?id=${articles.id}">${articles.title}</a>
                </li>

            </ul>
        </c:forEach>
    </aside>
    <section>
        <c:forEach var="article" items="${articles}" begin="0" end="15">
            <article>
                <h1>${article.title}</h1>

                <div class="text-article">
                        ${fn:substring(article.text,0,500)} ...
                </div>
                <div class="fotter-article">
                    <span class="read"><a href="article?id=${article.id}"><spring:message code="index.read"/></a></span>
                    <span class="date-article"><spring:message code="index.data"/> ${article.date}</span>
                </div>
            </article>
        </c:forEach>
    </section>
</div>

<jsp:include page="fragments/footer.jsp"/>


<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>


<jsp:include page="fragments/header.jsp"/>

<div id="main">
    <aside class="leftAside">
        <h2><spring:message code="head.index"/></h2>
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
                    <span class="read"><a href="article?id=${article.id}">Читать...</a></span>
                    <span class="date-article">Дата статьи: ${article.date}</span>
                </div>
            </article>
        </c:forEach>
    </section>
</div>

<jsp:include page="fragments/footer.jsp"/>

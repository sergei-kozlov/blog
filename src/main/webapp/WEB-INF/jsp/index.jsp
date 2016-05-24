<%--
  Created by IntelliJ IDEA.
  User: Sergey
  Date: 14.05.2016
  Time: 10:06
  To change this template use File | Settings | File Templates.
--%>

<!DOCTYPE html>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%--<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>--%>
<%--<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>--%>
<%--<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>--%>
<%@taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<jsp:include page="fragments/header.jsp"/>

<div id="main">
    <aside class="leftAside">
        <h2>Темы статей</h2>
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

<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="security" uri="http://www.springframework.org/security/tags" %>

<jsp:include page="fragments/header.jsp"/>
<p><security:authentication property="principal.username"/> </p>

<div id="main">
    <section>
        <c:forEach var="article" items="${text}">
            <article>


                <h1>${article.title}</h1>

                <div class="text-article">
                        ${article.text}
                </div>
                <div class="fotter-article">
                    <span class="date-article"><spring:message code="index.data"/> ${article.date}</span>
                </div>

            </article>
        </c:forEach>
    </section>

</div>
<jsp:include page="fragments/footer.jsp"/>

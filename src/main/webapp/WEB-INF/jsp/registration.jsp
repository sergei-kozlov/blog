<!DOCTYPE html>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="security" uri="http://www.springframework.org/security/tags"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<head>
    <link href="<c:url value='/resources/css/style.css'/>" rel="stylesheet">
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title><spring:message code="registration.title"/></title>
</head>
<body>

<header>
    <a href="/"><img alt="Логотип" id="top-image" src="/resources/images/main_logo.jpg"/></a>
</header>

<div id="main">
    <aside class="leftAside">
        <h2><spring:message code="registration.head"/></h2>
        <p><spring:message code="registration.how"/></p>
    </aside>
    <section>
        <article>
            <h1><spring:message code="registration.h1"/></h1>

            <form:form method="POST" commandName="users" action="/registration/add">
                <div class="text-article">
                    <p>

                        <form:label path="username">Login</form:label>
                        <form:input path="username"/>
                        <form:errors path="username" cssClass="error"/>
                    </p>
                    <p>
                        <form:label path="password">Password</form:label>
                        <form:input path="password"/>
                        <form:errors path="password" cssClass="error"/>
                    </p>



                    <p>
                        <form:button type="submit" name="action"><spring:message code="registration.reg"/>
                        </form:button>
                    </p>
                </div>
            </form:form>
        </article>
    </section>
</div>

<jsp:include page="fragments/footer.jsp"/>

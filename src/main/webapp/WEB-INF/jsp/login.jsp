<!DOCTYPE html>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
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
            <c:if test="${not empty param.login_error}">
                <span style="color: red; ">
    Your login attempt was not successful, try again.<br/><br/>
    Reason: <c:out value="${SPRING_SECURITY_LAST_EXCEPTION.message}"/>
                </span>
            </c:if>

            <form name="frm" action="<c:url value='login'/>" method="post">
                <div class="text-article">

                    User:<input type="text" name="username"><br><br>

                    Password:<input type="password" name="password">
                    Remember me <input type="checkbox" name="remember-me-parameter">

                    <p colspan="2"><input name="submit" type="submit"></p>
                    <p colspan="2"><input name="reset" type="reset"></p>


                    <input type="hidden" name="<c:out value="${_csrf.parameterName}"/>"
                           value="<c:out value="${_csrf.token}"/>"/>
                </div>

            </form>


        </article>
    </section>
</div>

<jsp:include page="fragments/footer.jsp"/>

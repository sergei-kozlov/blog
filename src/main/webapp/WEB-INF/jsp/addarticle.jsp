<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="security" uri="http://www.springframework.org/security/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>


<jsp:include page="fragments/header.jsp"/>



<div id="main">
    <section>
        <form:form method="POST" commandName="articles" action="/article/add">
            <div class="text-article">

                <p>
                    <form:label path="title">Заголовок статьи</form:label>
                    <form:textarea path="title"/>
                    <form:errors path="title" cssClass="error"/>
                </p>
                <p>
                    <form:label path="text">Текст статьи</form:label>
                    <form:textarea path="text" />
                    <form:errors path="text" cssClass="error"/>
                </p>


                <p>
                    <form:button type="submit" name="action"><spring:message code="registration.reg"/>
                    </form:button>
                </p>
            </div>
        </form:form>



    </section>

</div>
<jsp:include page="fragments/footer.jsp"/>

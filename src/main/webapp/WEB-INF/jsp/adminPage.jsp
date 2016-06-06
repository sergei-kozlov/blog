<%--<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>--%>
<%--<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>--%>
<%--<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>--%>
<%--<%@ page contentType="text/html;charset=UTF-8" language="java" %>--%>
<%--<html>--%>
<%--<head>--%>
    <%--<title>Admin pfage</title>--%>
<%--</head>--%>
<%--<body>--%>

<%--<a href="<c:url value="/logout" />">Logout--%>
    <%--&lt;%&ndash;<spring:message code="label.logout" />&ndash;%&gt;--%>
<%--</a>--%>

<%--<h2>Page for administrator></h2>--%>

<%--<form:form method="post" action="add" commandName="contact">--%>

    <%--<table>--%>
        <%--<tr>--%>
            <%--<td><form:label path="firstname">--%>
                <%--<spring:message code="label.firstname" />--%>
            <%--</form:label></td>--%>
            <%--<td><form:input path="firstname" /></td>--%>
        <%--</tr>--%>
        <%--<tr>--%>
            <%--<td><form:label path="lastname">--%>
                <%--<spring:message code="label.lastname" />--%>
            <%--</form:label></td>--%>
            <%--<td><form:input path="lastname" /></td>--%>
        <%--</tr>--%>
        <%--<tr>--%>
            <%--<td><form:label path="email">--%>
                <%--<spring:message code="label.email" />--%>
            <%--</form:label></td>--%>
            <%--<td><form:input path="email" /></td>--%>
        <%--</tr>--%>
        <%--<tr>--%>
            <%--<td><form:label path="telephone">--%>
                <%--<spring:message code="label.telephone" />--%>
            <%--</form:label></td>--%>
            <%--<td><form:input path="telephone" /></td>--%>
        <%--</tr>--%>
        <%--<tr>--%>
            <%--<td colspan="2"><input type="submit"--%>
                                   <%--value="<spring:message code="label.addcontact"/>" /></td>--%>
        <%--</tr>--%>
    <%--</table>--%>
<%--</form:form>--%>

<%--<h3><spring:message code="label.contacts" /></h3>--%>
<%--<c:if test="${!empty contactList}">--%>
    <%--<table class="data">--%>
        <%--<tr>--%>
            <%--<th><spring:message code="label.firstname" /></th>--%>
            <%--<th><spring:message code="label.email" /></th>--%>
            <%--<th><spring:message code="label.telephone" /></th>--%>
            <%--<th>&nbsp;</th>--%>
        <%--</tr>--%>
        <%--<c:forEach items="${contactList}" var="contact">--%>
            <%--<tr>--%>
                <%--<td>${contact.lastname}, ${contact.firstname}</td>--%>
                <%--<td>${contact.email}</td>--%>
                <%--<td>${contact.telephone}</td>--%>
                <%--<td><a href="delete/${contact.id}"><spring:message code="label.delete" /></a></td>--%>
            <%--</tr>--%>
        <%--</c:forEach>--%>
    <%--</table>--%>
<%--</c:if>--%>

<%--</body>--%>



<%--</body>--%>
<%--</html>--%>

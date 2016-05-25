<%--
  Created by IntelliJ IDEA.
  User: Sergey
  Date: 14.05.2016
  Time: 11:02
  To change this template use File | Settings | File Templates.
--%>

<!DOCTYPE html>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<jsp:include page="fragments/header.jsp"/>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<jsp:include page="fragments/header.jsp"/>

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

                <form:form method="POST" action="add" commandName="reguser">
                    <div class="text-article">



                        <fieldset class="boxBody">
                    <p>
                        <form:label path="login">Login</form:label>
                        <form:input path="login"/>
                    </p>
                    <p>
                        <label for="email">E-Mail</label>
                        <form:input path="email"/>
                    </p>
                    <p>
                        <label for="password">Пароль</label>
                        <form:input path="password"/>
                        <%--<label for="password2">Повторите пароль</label>--%>
                        <%--<form:input path="password2"/>--%>
                    </p>
                    </fieldset>
                    <p>
                        <form:button type="submit" value="add" name="action">Зарегистрироваться</form:button>
                        <%--<button type="submit">Зарегистрироваться</button>--%>
                    </p>
                    </div>
                 </form:form>
        </article>
    </section>
</div>

<jsp:include page="fragments/footer.jsp"/>

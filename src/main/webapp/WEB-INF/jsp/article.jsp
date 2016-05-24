<%--
  Created by IntelliJ IDEA.
  User: Sergey
  Date: 14.05.2016
  Time: 11:01
  To change this template use File | Settings | File Templates.
--%>
<!DOCTYPE html>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<jsp:include page="fragments/header.jsp"/>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<div id="main">
    <%--<aside class="leftAside">--%>
        <%--<h2>Темы статей</h2>--%>
        <%--<ul>--%>
            <%--<li><a href="#">Тема 1</a></li>--%>
            <%--<li><a href="#">Тема 2</a></li>--%>
            <%--<li><a href="#">Тема 3</a></li>--%>
            <%--<li><a href="#">Тема 3</a></li>--%>

        <%--</ul>--%>
    <%--</aside>--%>



    <%--${param.name}--%>
    <section>
        <c:forEach var="article" items="${text}">
        <article>


            <h1>${article.title}</h1>

            <div class="text-article">
                ${article.text}
            </div>
            <div class="fotter-article">
                <span class="date-article">Дата статьи: ${article.date}</span>
            </div>

        </article>
        </c:forEach>
    </section>

</div>
<jsp:include page="fragments/footer.jsp"/>

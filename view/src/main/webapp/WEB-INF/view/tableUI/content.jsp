<%@ page import="com.levelup.spring.model.User" %>
<%--
  Created by IntelliJ IDEA.
  User: java
  Date: 23.04.2015
  Time: 19:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page isELIgnored="false" %>
<%@ page session="false" %>
<html>
<head>
    <title>TableUI content</title>
</head>
<body>


    <%--<form  action="/user/save" method="post" id="form">--%>
    <form id="form">
        <div class="font-my">Create user-Wizard</div>
        <div id="step-one">
        <div class="font-my">Step 1</div>

            <input type="text" id="name" name="name"
                   <c:if test="${not empty user.name}">value="${user.name}" disabled </c:if>/>
            <label for="name">Name</label><Br>

            <br><br>
            <input type="text" id="lastName" name="lastName"
                   <c:if test="${not empty user.lastName}">value="${user.lastName}" disabled </c:if>/>
            <label for="lastName">LastName</label><Br>


            <br><br>
            <input type="button" id="nextStep1" name="nextStep1" value="Next">
        <%--</form>--%>
        </div>


        <div id="step-two" style="display: none">
          <div class="font-my">Step 2</div>

          <input type="text" id="pid" name="pid"
                 <c:if test="${not empty user.pid}">value="${user.pid}" disabled </c:if>/>
          <label for="pid">PID</label><Br>

          <br><br>
          <input type="button"  id="previous" name="previous" value="Back">
          <input type="button" id="nextStep2" name="nextStep2" value="Next">
        </div>
    </form>



    <div id="formStep3" style="display: none">

        <table class="bordered">
        <caption class="font-my">User</caption>
            <thead>
            <tr>
                <th>Name</th>
                <th>LastName</th>
                <th>PID</th>
            </tr>
            </thead>
            <tbody id="form3">
            <%--<c:forEach items="${user}" var="userW">--%>
                <tr id=${user.name}>
                    <td id="name-user"></td>
                    <td id="lastName-user"></td>
                    <td id="pid-user"></td>
                </tr>
            <%--</c:forEach>--%>
            </tbody>
        </table>
    </div>

</body>
</html>

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

    <div id="form1">
    <div>Create user-Wizard</div>
    <div>Step 1</div>
    <%--<form action="/user/wizard2" method="post" id="formStep1">--%>
        <div>Name</div>
        <%--<input type="text" id="name" name="name" value="${user.name}">--%>
        <input type="text" id="name" name="name"value='<%=((User)request.getSession().getAttribute("user")).getName()%>'/>

        <div>LastName</div>
        <%--<input type="text" id="lastName" name="lastName" value="${user.lastName}">--%>
        <input type="text" id="lastName" name="lastName" value='<%=((User)request.getSession().getAttribute("user")).getLastName()%>'/>

        <div></div>
        <input type="button" id="nextStep1" name="nextStep1" value="Next">
    <%--</form>--%>
    </div>


    <form  action="/user/save" method="post" id="form2" style="display: none" >
      <div>Step 2</div>
      <div>PID</div>
      <input type="text" id="pid" name="pid" value="${user.pid}">
      <div></div>
      <input type="button"  id="previous" name="previous" value="Back">
      <input type="button" id="nextStep2" name="nextStep2" value="Next">
    </form>



    <div id="formStep3" style="display: none">
        <table class="user-table">
            <thead>
            <tr>
                <th>Name</th>
                <th>LastName</th>
                <th>PID</th>
            </tr>
            </thead>
            <tbody id="form3">
            <%--<c:forEach items="${user}" var="userW">--%>
                <tr id="${user.id}">
                    <td>${user.name}</td>
                    <td>${user.lastName}</td>
                    <td>${user.pid}</td>
                </tr>
            <%--</c:forEach>--%>
            </tbody>
        </table>
    </div>

</body>
</html>

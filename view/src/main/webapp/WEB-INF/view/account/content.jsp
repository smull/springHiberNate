<%--
  Created by IntelliJ IDEA.
  User: java
  Date: 18.04.2015
  Time: 11:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page isELIgnored="false" %>
<html>
<head>
    <title>Account Page</title>
</head>
<body>

<div>Create Account</div>
  <form>
    <div> User Name</div>
    <div><input type="text" id="userName" name="userName"/></div>
    <div> Password</div>
    <div><input type="text" id="password" name="password"/></div>
    <input type="button" id="save" name="save" value="Save"/>
  </form>



<div>All Accounts</div>
<table class="account-table">
  <thead>
    <tr>
      <th>User Name</th>
      <th>Password</th>
    </tr>
  </thead>
  <tbody id="tbody">
    <c:forEach items="${accounts}" var="account">
      <tr id="${account.id}">
        <td>${account.userName}</td>
        <td>${account.password}</td>
      </tr>
    </c:forEach>
  </tbody>
</table>


</body>
</html>

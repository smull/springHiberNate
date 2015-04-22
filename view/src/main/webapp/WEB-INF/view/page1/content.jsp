<%@ page import="com.levelup.spring.model.User" %>
<%--
  Created by IntelliJ IDEA.
  User: java
  Date: 21.04.2015
  Time: 19:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page isELIgnored="false" %>
<%@ page session="false" %>
<html>
<head>
    <title></title>
</head>
<body>

      <div>Create user-Wizard</div>
      <div>Step 1</div>
      <form action="/user/wizard2" method="post" id="formStep1">
          <div>Name</div>
          <%--<input type="text" id="name" name="name" value="${user.name}">--%>
          <input type="text" id="name" name="name"value='<%=((User)request.getSession().getAttribute("user")).getName()%>'/>

          <div>LastName</div>
          <%--<input type="text" id="lastName" name="lastName" value="${user.lastName}">--%>
          <input type="text" id="lastName" name="lastName" value='<%=((User)request.getSession().getAttribute("user")).getLastName()%>'/>

          <div></div>
          <input type="submit" id="nextStep1" name="nextStep1" value="Next">
      </form>



      <div><c:out value="${user.name}"></c:out></div>
      <div><c:out value="${user.lastName}"></c:out></div>






</body>
</html>

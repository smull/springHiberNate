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



    <form  action="/user/wizard3" method="post" id="formStep2">
        <div>Step 2</div>
      <div>PID</div>
      <input type="text" id="pid" name="pid" value="${user.pid}">
        <div></div>
      <input type="submit" formaction = "/user/wizard1" formmethod="get" id="previous" name="previous" value="Back">
      <input type="submit" id="nextStep2" name="nextStep2" value="Next">
    </form>

    <div><c:out value='<%=request.getSession().getAttribute("user")%>'/></div>
    <div><c:out value="${user.name}"></c:out></div>
    <div><c:out value="${user.lastName}"></c:out></div>




</body>
</html>

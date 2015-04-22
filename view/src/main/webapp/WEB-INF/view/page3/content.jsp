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



      <form  action="/user/save" method="post" id="formStep3">
        <div>Congratulations</div>
        <div> <c:out value='<%=request.getSession().getAttribute("user")%>'/></div>
          <div><c:out value='<%=request.getSession().getAttribute("user")%>'/></div>
          <div><c:out value="${user.name}"></c:out></div>
          <div><c:out value="${user.lastName}"></c:out></div>
          <div><c:out value="${user.pid}"></c:out></div>


          <div>Session</div>
          <div><c:out value='<%=((User)request.getSession().getAttribute("user")).getName()%>'/></div>
          <div><c:out value='<%=((User)request.getSession().getAttribute("user")).getLastName()%>'/></div>
          <div><c:out value='<%=((User)request.getSession().getAttribute("user")).getPid()%>'/></div>

        <input type="submit" formaction="/user/wizard2"  id = "previousStep2" name= "previousStep2" value="Previous">
        <input type="submit" id="finish" name="finish" value="Finish">
      </form>



</body>
</html>

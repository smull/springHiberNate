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
<html>
<head>
    <title></title>
</head>
<body>

      <div>Create user-Wizard</div>
      <div>Step 1</div>
      <form action="/user/create" method="get" id="formStep1">
          <div>Name</div>
          <input type="text" id="name" name="name">
          <div>LastName</div>
          <input type="text" id="lastName" name="lastName">
          <div></div>
          <input type="submit" id="nextStep1" name="nextStep1" value="Next">
      </form>


    <form style="display: none" action="/user/create" method="get" id="formStep2">
        <div>Step 2</div>
      <div>PID</div>
      <input type="text" id="pid" name="pid">
        <div></div>
      <input type="button" id="previous" name="previous" value="Back">
      <input type="button" id="nextStep2" name="nextStep2" value="Next">
    </form>


      <form style="display: none" action="/user/save" method="get" id="formStep3">
        <div>Congratulations</div>
        <div></div>
        <input type="button" id="finish" name="finish" value="Finish">
      </form>



</body>
</html>

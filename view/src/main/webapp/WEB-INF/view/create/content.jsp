<%--
  Created by IntelliJ IDEA.
  User: denis_zavadsky
  Date: 4/4/15
  Time: 10:50 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page isELIgnored="false" %>
<div class="index-product">

  <div>Create Product</div>
  <form>
    <div> article</div>
      <div><input type="text" id="article" name="article"/></div>
    <div> description</div>
      <div><input type="text" id="description" name="description"/></div>
    <div> mainPrice</div>
      <div><input type="text" id="mainPrice" name="mainPrice"/></div>
    <div> categoryId</div>
      <div><input type="text" id="categoryId" name="categoryId"/></div>
    <input type="button" id="save" name="save" value="Save"/>
  </form>


  <table class="user-table">
    <%--<tr>--%>
      <%--<th colspan="9"><span class="users-label">--%>
                    <%--<spring:message code="products"/></span></th>--%>
    <%--</tr>--%>
      <thead>
          <tr>
            <th>Article</th>
            <th>Description</th>
            <th>MainPrice</th>
            <th>CategoryId</th>
            <%--<th><spring:message code="label.tel"/></th>--%>
            <%--<th><spring:message code="label.email"/></th>--%>
            <%--<th><spring:message code="label.login"/></th>--%>
            <%--<th><spring:message code="label.category"/></th>--%>
          </tr>
      </thead>
      <tbody id="tbody">
          <c:forEach items="${products}" var="product">
            <tr id="${product.article}">
              <td>${product.article}</td>
              <td>${product.description}</td>
              <td>${product.mainPrice}</td>
              <td>${product.categoryId}</td>
            </tr>
          </c:forEach>
      </tbody>
  </table>

  <input type="button" id="nextPage" name="nextPage" value="Next">

<%--<table>--%>
  <%--<thead>--%>
    <%--<th>Id</th><th>Account Number</th><th>Amount</th><th>Date</th><th>Edit transaction</th>--%>
  <%--</thead>--%>
  <%--<c:forEach var="transaction" items="${transactions}">--%>
    <%--<tr>--%>
      <%--<td>${transaction.id}</td>--%>
      <%--<td>${transaction.accountNumber}</td>--%>
      <%--<td>${transaction.amount}</td>--%>
      <%--<td>${transaction.date}</td>--%>
      <%--<td><button class="edit-transaction" data-id="${transaction.id}" data-account-number="${transaction.accountNumber}" >Edit</button></td>--%>
    <%--</tr>--%>
  <%--</c:forEach>--%>
<%--</table>--%>

</div>

<%--
Author: Thái Văn Tùng
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="/common/taglib.jsp"%>
<c:url var="formUrl" value="/login.html"/>
<html>
<head>
    <title><fmt:message key="label.test" bundle="${lang}"/></title>
</head>
<body>
<h3>Welcome to IN+</h3>
<form class="m-t" role="form" action="${formUrl}" method="post">
    <c:if test="${not empty messageResponse}">
    <div class="alert alert-${alert} alert-dismissable">
        <button aria-hidden="true" data-dismiss="alert" class="close" type="button">×</button>
        <a> ${messageResponse} </a>.
    </div>
    </c:if>
    <div class="form-group">
        <input type="text" class="form-control" placeholder="Username" required="" name="pojo.name">
    </div>
    <div class="form-group">
        <input type="password" class="form-control" placeholder="Password" required="" name="pojo.password">
    </div>
    <button type="submit" class="btn btn-primary block full-width m-b">Login</button>

    <a href="#"><small>Forgot password?</small></a>
    <p class="text-muted text-center"><small>Do not have an account?</small></p>
    <a class="btn btn-sm btn-white btn-block" href="register.html">Create an account</a>
</form>
<p class="m-t"> <small>Inspinia we app framework base on Bootstrap 3 &copy; 2014</small> </p>
</body>
</html>


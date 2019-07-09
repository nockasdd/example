<%--
Author: Thái Văn Tùng
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="/common/taglib.jsp"%>
<html>
<head>
    <title><fmt:message key="label.test" bundle="${lang}"/></title>
</head>
<body>
<h3>Welcome to IN+</h3>
<p>Perfectly designed and precisely prepared admin theme with over 50 pages with extra new web app views.
    <!--Continually expanded and constantly improved Inspinia Admin Them (IN+)-->
</p>
<p>Login in. To see it in action.</p>
<form class="m-t" role="form" action="index.html">
    <div class="form-group">
        <input type="email" class="form-control" placeholder="Username" required="">
    </div>
    <div class="form-group">
        <input type="password" class="form-control" placeholder="Password" required="">
    </div>
    <button type="submit" class="btn btn-primary block full-width m-b">Login</button>

    <a href="#"><small>Forgot password?</small></a>
    <p class="text-muted text-center"><small>Do not have an account?</small></p>
    <a class="btn btn-sm btn-white btn-block" href="register.html">Create an account</a>
</form>
<p class="m-t"> <small>Inspinia we app framework base on Bootstrap 3 &copy; 2014</small> </p>
</body>
</html>


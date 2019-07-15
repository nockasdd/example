

<%@ page contentType="text/html; charset=UTF-8" language="java" %>
<%@ include file="/common/taglib.jsp"%>
<!DOCTYPE html>
<html>
<head>
    <title><dec:title default="Home Page"/> </title>
    <!-- Favicon -->
    <link rel="icon" href="<c:url value="/template/web/img/core-img/favicon.ico"/>">

    <!-- Core Stylesheet -->
    <link href="<c:url value="/template/web/style.css"/>" rel="stylesheet">

    <!-- Responsive CSS -->
    <link href="<c:url value="/template/web/css/responsive.css"/>" rel="stylesheet">
    <dec:head/>
</head>
<body>
<!-- Preloader Start -->
<div id="preloader">
    <div class="colorlib-load"></div>
</div>
<%@ include file="/common/web/header.jsp"%>
<%@ include file="/common/web/menu.jsp"%>
<dec:body/>
<%@ include file="/common/web/footer.jsp"%>
<!-- Jquery-2.2.4 JS -->
<script src="<c:url value="/template/web/js/jquery-2.2.4.min.js"/>"></script>
<!-- Popper js -->
<script src="<c:url value="/template/web/js/popper.min.js"/>"></script>
<!-- Bootstrap-4 Beta JS -->
<script src="<c:url value="/template/web/js/bootstrap.min.js"/>"></script>
<!-- All Plugins JS -->
<script src="<c:url value="/template/web/js/plugins.js"/>"></script>
<!-- Slick Slider Js-->
<script src="<c:url value="/template/web/js/slick.min.js"/>"></script>
<!-- Footer Reveal JS -->
<script src="<c:url value="/template/web/js/footer-reveal.min.js"/>"></script>
<!-- Active JS -->
<script src="<c:url value="/template/web/js/active.js"/>"></script>
</body>
</html>
<%--
Author: Thái Văn Tùng
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="/common/taglib.jsp" %>
<c:url var="requestUrl" value="/admin-guideline-listen-list.html"/>
<html>
<head>
    <title>Title</title>
    <link href="<c:url value="/template/admin/css/plugins/dataTables/datatables.min.css"/>" rel="stylesheet">
</head>
<body>
<display:table id="tableList" name="items.listResult" partialList="true" defaultsort="1" size="${items.totalItems}"
               pagesize="${items.maxPageItems}" sort="external" requestURI="${requestUrl}" class="table table-striped table-bordered table-hover dataTables-example"
                style="margin: 3em 0 1.5 em;">
            <display:column property="title" titleKey="Tiêu Đề" sortable="true" sortName="title"/>
            <display:column property="content" titleKey="Nội Dung" sortable="true" sortName="content"/>
</display:table>
<script src="<c:url value="/template/admin/js/plugins/dataTables/datatables.min.js"/>"></script>
<script src="<c:url value="/template/admin/js/plugins/dataTables/dataTables.bootstrap4.min.js"/>"></script>
</body>
</html>

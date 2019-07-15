<%@ page contentType="text/html; charset=UTF-8" language="java" %>
<%@ include file="/common/taglib.jsp" %>
<!DOCTYPE html>
<html>
<head>
    <title><dec:title default="Admin Page"/></title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1"/>
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <meta name="keywords" content=""/>
    <!-- Mobile specific meta -->
    <meta name="description" content="">
    <meta name="author" content="Thái Văn Tùng">
    <meta name="copyright" content="Copyright (c) 2019 Nockasdd">
    <!-- Favicons -->
    <link rel="icon" type="image/png" href="icon/favicon-32x32.png" sizes="32x32">
    <link rel="apple-touch-icon" href="icon/favicon-32x32.png">
    <link rel="apple-touch-icon" sizes="72x72" href="icon/apple-touch-icon-72x72.png">
    <link rel="apple-touch-icon" sizes="114x114" href="icon/apple-touch-icon-114x114.png">
    <link rel="apple-touch-icon" sizes="144x144" href="icon/apple-touch-icon-144x144.png">
    <link href="<c:url value="/template/admin/css/bootstrap.min.css"/>" rel="stylesheet">
    <link href="<c:url value="/template/admin/font-awesome/css/font-awesome.css"/>" rel="stylesheet">

    <!-- Toastr style -->
    <link href="<c:url value="/template/admin/css/plugins/toastr/toastr.min.css"/>" rel="stylesheet">

    <!-- Gritter -->
    <link href="<c:url value="/template/admin/js/plugins/gritter/jquery.gritter.css"/>" rel="stylesheet">
    <link href="<c:url value="/template/admin/css/plugins/jsTree/style.min.css"/>"  rel="stylesheet">
    <link href="<c:url value="/template/admin/css/animate.css"/>" rel="stylesheet">
    <link href="<c:url value="/template/admin/css/style.css"/>" rel="stylesheet">
    <dec:head/>
</head>
<body>
<div id="wrapper">
    <%@ include file="/common/admin/menu.jsp" %>
    <div id="page-wrapper" class="gray-bg">
        <%@ include file="/common/admin/header.jsp" %>
        <dec:body/>
        <%@ include file="/common/admin/footer.jsp" %>
    </div>


</div>

<!-- Mainly scripts -->
<script src="<c:url value="/template/admin/js/jquery-3.1.1.min.js"/>"></script>
<script src="<c:url value="/template/admin/js/popper.min.js"/>"></script>
<script src="<c:url value="/template/admin/js/bootstrap.js"/>"></script>
<script src="<c:url value="/template/admin/js/plugins/metisMenu/jquery.metisMenu.js"/>"></script>
<script src="<c:url value="/template/admin/js/plugins/slimscroll/jquery.slimscroll.min.js"/>"></script>

<!-- Flot -->
<script src="<c:url value="/template/admin/js/plugins/flot/jquery.flot.js"/>"></script>
<script src="<c:url value="/template/admin/js/plugins/flot/jquery.flot.tooltip.min.js"/>"></script>
<script src="<c:url value="/template/admin/js/plugins/flot/jquery.flot.spline.js"/>"></script>
<script src="<c:url value="/template/admin/js/plugins/flot/jquery.flot.resize.js"/>"></script>
<script src="<c:url value="/template/admin/js/plugins/flot/jquery.flot.pie.js"/>"></script>

<!-- Peity -->
<script src="<c:url value="/template/admin/js/plugins/peity/jquery.peity.min.js"/>"></script>
<script src="<c:url value="/template/admin/js/demo/peity-demo.js"/>"></script>

<!-- Custom and plugin javascript -->
<script src="<c:url value="/template/admin/js/inspinia.js"/>"></script>
<script src="<c:url value="/template/admin/js/plugins/pace/pace.min.js"/>"></script>

<!-- jQuery UI -->
<script src="<c:url value="/template/admin/js/plugins/jquery-ui/jquery-ui.min.js"/>"></script>

<!-- GITTER -->
<script src="<c:url value="/template/admin/js/plugins/gritter/jquery.gritter.min.js"/>"></script>

<!-- Sparkline -->
<script src="<c:url value="/template/admin/js/plugins/sparkline/jquery.sparkline.min.js"/>"></script>

<!-- Sparkline demo data  -->
<script src="<c:url value="/template/admin/js/demo/sparkline-demo.js"/>"></script>

<!-- ChartJS-->
<script src="<c:url value="/template/admin/js/plugins/chartJs/Chart.min.js"/>"></script>

<!-- Toastr -->
<script src="<c:url value="/template/admin/js/plugins/toastr/toastr.min.js"/>"></script>
<script src="<c:url value="/template/admin/js/plugins/jsTree/jstree.min.js"/>"></script>
<style>
    .jstree-open > .jstree-anchor > .fa-folder:before {
        content: "\f07c";
    }

    .jstree-default .jstree-icon.none {
        width: 0;
    }
</style>
<script>
    $(document).ready(function () {

        $('#jstree1').jstree({
            'core': {
                'check_callback': true
            },
            'plugins': ['types', 'dnd'],
            'types': {
                'default': {
                    'icon': 'fa fa-folder'
                },
                'html': {
                    'icon': 'fa fa-file-code-o'
                },
                'svg': {
                    'icon': 'fa fa-file-picture-o'
                },
                'css': {
                    'icon': 'fa fa-file-code-o'
                },
                'img': {
                    'icon': 'fa fa-file-image-o'
                },
                'js': {
                    'icon': 'fa fa-file-text-o'
                }

            }
        });

        $('#using_json').jstree({
            'core': {
                'data': [
                    'Empty Folder',
                    {
                        'text': 'Resources',
                        'state': {
                            'opened': true
                        },
                        'children': [
                            {
                                'text': 'css',
                                'children': [
                                    {
                                        'text': 'animate.css', 'icon': 'none'
                                    },
                                    {
                                        'text': 'bootstrap.css', 'icon': 'none'
                                    },
                                    {
                                        'text': 'main.css', 'icon': 'none'
                                    },
                                    {
                                        'text': 'style.css', 'icon': 'none'
                                    }
                                ],
                                'state': {
                                    'opened': true
                                }
                            },
                            {
                                'text': 'js',
                                'children': [
                                    {
                                        'text': 'bootstrap.js', 'icon': 'none'
                                    },
                                    {
                                        'text': 'inspinia.min.js', 'icon': 'none'
                                    },
                                    {
                                        'text': 'jquery.min.js', 'icon': 'none'
                                    },
                                    {
                                        'text': 'jsTree.min.js', 'icon': 'none'
                                    },
                                    {
                                        'text': 'custom.min.js', 'icon': 'none'
                                    }
                                ],
                                'state': {
                                    'opened': true
                                }
                            },
                            {
                                'text': 'html',
                                'children': [
                                    {
                                        'text': 'layout.html', 'icon': 'none'
                                    },
                                    {
                                        'text': 'navigation.html', 'icon': 'none'
                                    },
                                    {
                                        'text': 'navbar.html', 'icon': 'none'
                                    },
                                    {
                                        'text': 'footer.html', 'icon': 'none'
                                    },
                                    {
                                        'text': 'sidebar.html', 'icon': 'none'
                                    }
                                ],
                                'state': {
                                    'opened': true
                                }
                            }
                        ]
                    },
                    'Fonts',
                    'Images',
                    'Scripts',
                    'Templates',
                ]
            }
        });

    });
</script>
</body>
</html>
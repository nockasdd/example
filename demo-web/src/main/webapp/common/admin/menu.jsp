<nav class="navbar-default navbar-static-side" role="navigation">
    <div class="sidebar-collapse">
        <ul class="nav metismenu" id="side-menu">
            <li class="nav-header">
                <div class="dropdown profile-element">
                    <img alt="image" class="rounded-circle"
                         src="<c:url value="/template/admin/img/profile_small.jpg"/>"/>
                    <a data-toggle="dropdown" class="dropdown-toggle" href="#">
                        <span class="block m-t-xs font-bold">Nockasdd</span>
                        <span class="text-muted text-xs block">ADMIN <b class="caret"></b></span>
                    </a>
                    <ul class="dropdown-menu animated fadeInRight m-t-xs">
                        <li><a class="dropdown-item" href="profile.html">Thông Tin</a></li>
                        <li><a class="dropdown-item" href="contacts.html">Liên Hệ</a></li>
                        <li><a class="dropdown-item" href="mailbox.html">Mail</a></li>
                        <li class="dropdown-divider"></li>
                        <li><a class="dropdown-item" href="login.html">Đăng Xuất</a></li>
                    </ul>
                </div>
                <div class="logo-element">
                    IN+
                </div>
            </li>
            <li>
                <a href=""><i class="fa fa-th-large"></i> <span class="nav-label"><fmt:message key="label.menu" bundle="${lang}"/> </span> <span
                        class="fa arrow"></span></a>
                <ul class="nav nav-second-level collapse">
                    <li><a href="./admin-guideline-listen-list.html"><fmt:message key="label.submenu" bundle="${lang}"/> </a></li>
                </ul>
            </li>

        </ul>

    </div>
</nav>
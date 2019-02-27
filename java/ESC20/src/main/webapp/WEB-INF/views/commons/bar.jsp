<button id="skipNav" data-localize="label.skipNav"></button>
<!-- Navbar -->
  <nav class="main-header navbar navbar-expand navbar-light clearfix">
  	
    <!-- Left navbar links -->
    <ul class="navbar-nav">
      <li class="nav-item">
        <a class="nav-link" data-widget="pushmenu" href="#"><span class="hide" data-localize="accessHint.collapseOrExpand"></span> <i class="fa fa-bars"></i></a>
      </li>
    </ul>

    
    <%@ include file="logo.jsp"%>
    
    <!-- Right navbar links -->
    <ul class="navbar-nav nav-right">
      <!-- Notifications Dropdown Menu -->
      <li class="nav-item dropdown">
        <button class="nav-link nobtn-style" data-toggle="dropdown">
          <span class="hide" data-localize="accessHint.showOrHideNote"></span>
          <i class="fa fa-bell-o"></i>
          <span id="navBadge" class="navbar-badge"></span>
        </button>
        <div class="dropdown-menu dropdown-menu-right note-dropdown">
          <div class="dropdown-header">
            <span id="budgeCount">0</span> <span data-localize="label.notification"></span>
          </div>
          	  <a href="/<%=request.getContextPath().split("/")[1]%>/notifications">
		          <div class="dropdown-divider"></div>
		          <div class="dropdown-item">
		            <div id="top5Alert"></div>
		          </div>
		          <div class="dropdown-divider"></div>
	          </a>
          <a data-localize="label.seeAllNote" href="/<%=request.getContextPath().split("/")[1]%>/notifications" class="dropdown-footer"></a>
        </div>
      </li>
      <li class="nav-item">
      <a class="nav-link" 
      <c:if test="${sessionScope.options.enableSelfServiceDemographic||sessionScope.options.enableSelfServicePayroll}">
          href="/<%=request.getContextPath().split("/")[1]%>/profile/profile" 
        </c:if>
      >
        <span class="hide" data-localize="accessHint.goMyAccount"></span>
        <i class="fa fa-user"></i>
      </a>
      </li>
      <li class="nav-item flex-middle">
          <%@ include file="global-select.jsp"%>
      </li>
    </ul>
  </nav>
  <!-- /.navbar -->
  
  <!-- Main Sidebar Container -->
  <aside class="main-sidebar sidebar-dark-primary">
  
    <!-- Sidebar -->
    <div class="sidebar">
      <!-- Sidebar user panel (optional) -->
      <%@ include file="logo.jsp"%>
      <div class="user-panel mt-3 pb-3 mb-3 d-flex">
        <div class="image">
            <c:if test="${sessionScope.userDetail.avatar!=null}" >
                <a 
                <c:if test="${sessionScope.options.enableSelfServiceDemographic||sessionScope.options.enableSelfServicePayroll}">
                    href="/<%=request.getContextPath().split("/")[1]%>/profile/profile" 
                  </c:if>
                class="d-block"  style="background-image:url(${sessionScope.userDetail.avatar})">
                  <span class="hide" data-localize="accessHint.goMyAccount"></span>
              </a>
            </c:if>
            <c:if test="${sessionScope.userDetail.avatar==null}">
                <a 
                <c:if test="${sessionScope.options.enableSelfServiceDemographic||sessionScope.options.enableSelfServicePayroll}">
                    href="/<%=request.getContextPath().split("/")[1]%>/profile/profile" 
                  </c:if>
                class="d-block noImage">
                  <span class="hide" data-localize="accessHint.goMyAccount"></span>
                  <i class="fa fa-user"></i>
                </a>
            </c:if>
       		
        </div>
        <div class="info">
          <a 
          <c:if test="${sessionScope.options.enableSelfServiceDemographic||sessionScope.options.enableSelfServicePayroll}">
            href="/<%=request.getContextPath().split("/")[1]%>/profile/profile" 
          </c:if>
            class="d-block">${sessionScope.userDetail.nameF} ${sessionScope.userDetail.nameL}</a>
        </div>
      </div>

      <!-- Sidebar Menu -->
      <nav class="mt-2">
        <ul class="nav nav-pills nav-sidebar flex-column" data-widget="treeview" role="menu" data-accordion="false">
          <!-- Add icons to the links using the .nav-icon class
               with font-awesome or any other icon font library -->
          <!-- menu-open -->
          <li class="nav-item has-treeview" id="inquiry">
            <a href="#" class="nav-link"><!--  active -->
              <i class="nav-icon fa fa-list"></i>
              <p>
                <span data-localize="nav.inquiry"></span>
                <i class="right fa fa-angle-left"></i>
              </p>
            </a>
            <ul class="nav nav-treeview">
              <c:if test="${sessionScope.options.enableCalendarYearToDate}">
                <li class="nav-item">
                  <a href="/<%=request.getContextPath().split("/")[1]%>/inquiry/calendarYearToDate" class="nav-link" id="calendarYearToDate">
                    <i class="fa fa-circle-o nav-icon"></i>
                    <p data-localize="nav.calendarYearToDate"></p>
                  </a>
                </li>
              </c:if>
              <c:if test="${sessionScope.options.enableCurrentPayInformation}">
              <li class="nav-item" >
                <a href="/<%=request.getContextPath().split("/")[1]%>/inquiry/currentPayInformation" class="nav-link" id="currentPayInformation">
                  <i class="fa fa-circle-o nav-icon"></i>
                  <p data-localize="nav.currentPayInfo"></p>
                </a>
              </li>
            </c:if>
              <c:if test="${sessionScope.options.enableDeductions}">
              <li class="nav-item">
                <a href="/<%=request.getContextPath().split("/")[1]%>/inquiry/deductions" class="nav-link" id="deductions">
                  <i class="fa fa-circle-o nav-icon"></i>
                  <p data-localize="nav.deductions"></p>
                </a>
              </li>
            </c:if>
              <c:if test="${sessionScope.options.enableEarnings}">
              <li class="nav-item">
                <a href="/<%=request.getContextPath().split("/")[1]%>/inquiry/earnings" class="nav-link" id="earnings">
                  <i class="fa fa-circle-o nav-icon"></i>
                  <p data-localize="nav.earning"></p>
                </a>
              </li>
            </c:if>
              <c:if test="${sessionScope.options.enableW2}">
              <li class="nav-item">
                <a href="/<%=request.getContextPath().split("/")[1]%>/inquiry/w2Information" class="nav-link" id="w2Information">
                  <i class="fa fa-circle-o nav-icon"></i>
                  <p data-localize="nav.w2Info"></p>
                </a>
              </li>
            </c:if>
              <c:if test="${sessionScope.options.enable1095}">
              <li class="nav-item">
                <a href="/<%=request.getContextPath().split("/")[1]%>/inquiry/information1095" class="nav-link" id="information1095">
                  <i class="fa fa-circle-o nav-icon"></i>
                  <p data-localize="nav.info1095"></p>
                </a>
              </li>
            </c:if>
            </ul>
          </li>
          <li class="nav-item">
            <a href="/<%=request.getContextPath().split("/")[1]%>/leaveRequest/leaveBalance" class="nav-link" id="leaveBalance">
              <i class="nav-icon fa fa-hourglass-start text-info"></i>
              <p data-localize="nav.leaveBalances"></p>
            </a>
          </li>
          <c:if test="${sessionScope.options.enableLeaveReq}">
          <li class="nav-item">
            <a id="leaveRequest" href="/<%=request.getContextPath().split("/")[1]%>/leaveRequest/leaveRequest" class="nav-link">
              <i class="nav-icon fa  fa-pencil-square-o text-info"></i>
              <p data-localize="nav.leaveRequests"></p>
            </a>
          </li>
        </c:if>
        <c:if test="${sessionScope.isSupervisor || sessionScope.isTempApprover}">
          <li class="nav-item has-treeview" id="supervisor">
            <a href="#" class="nav-link" > <!--  active -->
              <i class="nav-icon fa fa-users"></i>
              <p>
                <span data-localize="nav.supervisor"></span>
                <i class="right fa fa-angle-left"></i>
              </p>
            </a>
            <ul class="nav nav-treeview">
              <li class="nav-item">
                <a href="/<%=request.getContextPath().split("/")[1]%>/supervisor/approveLeaveRequestList" class="nav-link" id="approveLeaveRequestList">
                  <i class="fa fa-circle-o nav-icon"></i>
                  <p data-localize="nav.approveLeaveRequests"></p>
                </a>
              </li>
              <li class="nav-item">
                <a  href="/<%=request.getContextPath().split("/")[1]%>/supervisor/leaveOverviewList" class="nav-link" id="leaveOverviewList">
                  <i class="fa fa-circle-o nav-icon"></i>
                  <p data-localize="nav.leaveOverview"></p>
                </a>
              </li>
              <li class="nav-item">
                <a href="/<%=request.getContextPath().split("/")[1]%>/supervisor/calendarView" class="nav-link" id="calendarView">
                  <i class="fa fa-circle-o nav-icon"></i>
                  <p data-localize="nav.calendar"></p>
                </a>
              </li>
              <li class="nav-item">
                <a href="/<%=request.getContextPath().split("/")[1]%>/supervisor/leaveRequestTemporaryApprovers" class="nav-link" id="leaveRequestTemporaryApprovers">
                  <i class="fa fa-circle-o nav-icon"></i>
                  <p data-localize="nav.setTemporary"></p>
                </a>
              </li>
              
            </ul>
          </li>
        </c:if>
        </ul>
      </nav>
      <!-- /.sidebar-menu -->
    </div>
    <!-- /.sidebar -->
    <ul class="sidebar-btm">
        <c:if test="${sessionScope.options.enableSelfServiceDemographic||sessionScope.options.enableSelfServicePayroll}">
        <li><a href="/<%=request.getContextPath().split("/")[1]%>/profile/profile">
          <span class="hide" data-localize="accessHint.goMyAccount"></span>
          <i class="fa fa-user"></i>
        </a></li>
        </c:if>
        <!-- <li><a href="/" title="Full Screen"><i class="fa fa-arrows-alt"></i></a></li> -->
        <li><a href="https://tcc-help.net/txeis/employeeaccess/doku.php/leave/supervisor/settemporaryapprovers?version=3.3" 
          title=""  target="_blank">
          <span class="hide" data-localize="accessHint.goHelp"></span>
          <i class="fa fa-question-circle"></i>
        </a></li>
        <li><a href="/<%=request.getContextPath().split("/")[1]%>/logout">
          <span class="hide" data-localize="accessHint.logout"></span>
          <i class="fa fa-sign-out "></i></a></li>
    </ul>
    <script>
    $(document).ready(function() {
        var path = (window.location+"").split("/");
        var menuItem = path[path.length-2];
        var item = path[path.length -1];
        console.log(path)
        console.log(menuItem)
        console.log(item)
        if(item=='eventCalendar'){
          item = 'leaveRequest'
        }
        if(item=='getCalendarYearToDateByYear'){
            item = 'calendarYearToDate';
        }
        if(item=='earningsByPayDate'){
            item = 'earnings';
        }
        if(item=='w2InformationByYear'){
            item = 'w2Information';
        }
        if(item=='information1095ByYear'){
            item = 'information1095';
        }
        var menuElement = $("#"+menuItem);
        var itemElement = $("#"+item);
        console.log(itemElement)
        if(menuElement){
            menuElement.addClass("menu-open");
            menuElement.children("ul").attr("style","display: block;");
        }
        if(itemElement)
        	itemElement.addClass("active");
        //update budgeCount and info every second
        getBudgeDetail();
    	updateBudgeCountAndInfo();
    });
    </script>
  </aside>

   <%@ include file="../modal/logoutModal.jsp"%>
   <script src="/<%=request.getContextPath().split("/")[1]%>/js/viewJs/commons/bar.js"></script>

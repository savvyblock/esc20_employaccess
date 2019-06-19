<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> <%@ page
language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html> 
<html lang="en">
    <head>
        <title>${sessionScope.languageJSON.headTitle.approveLeaveRequest}</title>
        <meta name="viewport" content="width=device-width, initial-scale=1" />
        <link rel="stylesheet" href="/<%=request.getContextPath().split("/")[1]%>/css/fullcalendar.min.css" />
        <%@ include file="../commons/header.jsp"%>
    </head>
    <body class="hold-transition sidebar-mini">
        <div class="wrapper">
            <%@ include file="../commons/bar.jsp"%>
			
            <main class="content-wrapper" tabindex="-1">
                    <section class="content">
                            <div class="clearfix section-title">
                                    <h1 class="pageTitle">${sessionScope.languageJSON.title.approveLeaveRequests}</h1>
                                <button class="btn btn-primary pull-right" onclick="showCalendarModal()"
                                data-toggle="modal" data-target="#leaveListCalendarModal" aria-label="${sessionScope.languageJSON.label.switchToCalendarView}">
                                    <i class="fa fa-calendar"></i>
                                </button>
                            </div>
                            <div class="showSelectSupervisor">
                                <label class="form-title"><span>${sessionScope.languageJSON.label.supervisorHierarchy}</span>: </label>
                                <c:forEach var="item" items="${chain}" varStatus="status">
                                    <b> ${item.employeeNumber}:${item.lastName},${item.firstName}</b>
                                 <c:if test="${!status.last}"> ➝ </c:if>
                                </c:forEach>
                            </div>
                            <br/>
                            <div class="container-fluid">
                                    <form
                                    class="no-print searchForm"
                                    action="nextLevelFromApproveLeave"
                                    id="filterSupervisor"
                                    method="POST"
                                >
                                <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
                                <span hidden="hidden" id="chainValue">${chain}</span>
                                    <input hidden="hidden" id="chain" name="chain" type="text" value="" aria-label="${sessionScope.languageJSON.accessHint.chain}"/>
                                    <div class="form-group in-line flex-auto">
                                        <label class="form-title" for="selectEmpNbr"><span>${sessionScope.languageJSON.label.directReportSupervisor}</span>:</label>
                                        <select  class="form-control" name="selectEmpNbr" onchange="changeLevel()"
                                            id="selectEmpNbr">
                                            <c:forEach var="item" items="${directReportEmployee}" varStatus="count">
                                               <c:choose>
												   <c:when test="${item.selectOptionLabel==''}">
											   			<option value="${item.employeeNumber}">&nbsp;</option>
												   </c:when>
												   <c:otherwise>
												         <option value="${item.employeeNumber}">${item.selectOptionLabel}</option>
												   </c:otherwise>
												</c:choose>
                                            </c:forEach>
                                        </select>
                                    </div>
                                    <div class="form-group in-line flex-auto">
                                            <button type="button" role="button" class="btn btn-primary disabled" 
                                                id="prevLevel" 
                                                disabled
                                                >${sessionScope.languageJSON.label.previousLevel}</button>
                                            <button type="button" role="button" class="btn btn-primary  disabled" 
                                            id="nextLevel" 
                                            disabled
                                            >${sessionScope.languageJSON.label.nextLevel}</button>
                                    </div>
                                </form>
                                <form hidden="hidden" action="previousLevelFromApproveLeave" id="previousLevel" method="POST">
                                		<input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
                                        <input hidden="hidden" type="text" value="${level}" name="level" id="preLevel" aria-label="${sessionScope.languageJSON.accessHint.level}"/>
                                        <input hidden="hidden" name="chain" type="text" value="" id="preChain" aria-label="${sessionScope.languageJSON.accessHint.chain}"/>
                                </form>
                                <h2 id="approveTableTitle" class="tableTitle" style="padding:0 10px;">
                                    <b>
                                        <span>${sessionScope.languageJSON.approveRequest.leavePendingActionBy}</span>
                                        <span>
                                                <c:forEach var="item" items="${chain}" varStatus="status">
                                                     <c:if test="${status.last}"> 
                                                            ${item.employeeNumber}:${item.lastName},${item.firstName}     
                                                    </c:if>
                                                    </c:forEach>
                                        </span>
                                    </b>
                                </h2>
                                <div class="content-white">
                                    
                                    <table class="table request-list responsive-table">
                                            <thead>
                                                <tr>
                                                        <th scope="col">${sessionScope.languageJSON.approveRequest.employee}</th>
                                                        <th scope="col">${sessionScope.languageJSON.approveRequest.leaveStartDate}</th>
                                                        <th scope="col">${sessionScope.languageJSON.approveRequest.leaveEndDate}</th>
                                                        <th scope="col">${sessionScope.languageJSON.approveRequest.leaveType}</th>
                                                        <th scope="col">${sessionScope.languageJSON.approveRequest.absenceReason}</th>
                                                        <th scope="col">${sessionScope.languageJSON.approveRequest.leaveRequested}</th>
                                                        <th scope="col">${sessionScope.languageJSON.approveRequest.commentLog}</th>
                                                        <th scope="col">${sessionScope.languageJSON.approveRequest.supervisorAction}</th>
                                                </tr>
                                            </thead>
                                            <tbody>
                                                    <c:if test="${isEmpty==false}">
                                                    <c:forEach var="item" items="${leaves}" varStatus="status">
                                                        <c:if test="${item.statusCd !='A' && item.statusCd !='D'}">
                                                        <tr id="actionList_${status.index}">
                                                            <td data-title="${sessionScope.languageJSON.approveRequest.employee}">${item.lastName} ${item.firstName}</td>
                                                            <td data-title="${sessionScope.languageJSON.approveRequest.leaveStartDate}">${item.LeaveStartDate}</td>
                                                            <td data-title="${sessionScope.languageJSON.approveRequest.leaveEndDate}" >${item.LeaveEndDate}</td>
                                                            <td data-title="${sessionScope.languageJSON.approveRequest.leaveType}">
                                                                    <c:forEach var="type" items="${leaveTypes}" varStatus="statusType">
                                                                            <c:if test="${type.code==item.LeaveType}">${type.description}</c:if>
                                                                    </c:forEach>
                                                            </td>
                                                            <td data-title="${sessionScope.languageJSON.approveRequest.absenceReason}" >
                                                                    <c:forEach var="reason" items="${absRsns}" varStatus="statusReason">
                                                                            <c:if test="${reason.code==item.LeaveType}">${reason.description}</c:if>
                                                                    </c:forEach>
                                                            </td>
                                                            
                                                            <td data-title="${sessionScope.languageJSON.approveRequest.leaveRequested}"> 
                                                                    ${item.lvUnitsUsed}
                                                                <span>${sessionScope.languageJSON.label.days}</span>
                                                            </td>
                                                            <td>
                                                                    <c:forEach var="comment" items="${item.comments}" varStatus="statusComment">
                                                                        <p>${comment.detail}</p>
                                                                    </c:forEach>
                                                                    <div class="form-group hide" id="supervisorComment_${status.index}">
                                                                            <textarea  class="form-control form-text" cols="30" rows="4" aria-label="${sessionScope.languageJSON.label.supervisorComment}" data-index="${status.index}"></textarea>
                                                                            <div class="error-hint hide" id="errorComment_${status.index}" role="alert">${sessionScope.languageJSON.validator.pleaseEnterComment}</div>
                                                                    </div>
                                                            </td>
                                                            <td data-title="${sessionScope.languageJSON.approveRequest.supervisorAction}"  style="width:150px;">
                                                                <!-- <button class="btn btn-primary sm" data-toggle="modal" data-target="#approveModal" 
                                                                onClick="actionLeave('${item.id}')"><span>${sessionScope.languageJSON.label.action}</span></button> -->
                                                                <div role="group" aria-labelledby="groupLabelAction_${status.index}">
                                                                    <div class="forAria" aria-hidden="true" id="groupLabelAction_${status.index}">${sessionScope.languageJSON.approveRequest.supervisorAction} ${sessionScope.languageJSON.label.for}  ${item.lastName} ${item.firstName}</div>
                                                                    <div class="form-group">
                                                                            <input class="approveRadio" type="radio" name="actionRadio_${status.index}" id="approveAction_${status.index}" value="1" data-id="${item.id}" data-index="${status.index}">
                                                                            <label for="approveAction_${status.index}">${sessionScope.languageJSON.label.approve}</label>
                                                                    </div>
                                                                    <div class="form-group">
                                                                        <input class="disapproveRadio" type="radio" name="actionRadio_${status.index}" id="disapproveAction_${status.index}" value="0" data-id="${item.id}" data-index="${status.index}">
                                                                        <label for="disapproveAction_${status.index}">${sessionScope.languageJSON.label.disapprove}</label>
                                                                    </div>
                                                                </div>
                                                            </td>
                                                        </tr>
                                                    </c:if>
                                                    </c:forEach>
                                                    </c:if>
                                                    <c:if test="${isEmpty==true}">
                                                        <tr>
                                                            <td colspan="8" class="text-center">
                                                                <span>${sessionScope.languageJSON.label.noData}</span>
                                                            </td>
                                                        </tr>
                                                    </c:if>
                                            </tbody>
                    
                                        </table>
                                        <br/><hr/><br/>
                                        <div class="text-right">
                                            <button id="saveRequestListBtn" class="btn btn-primary" aria-label="${sessionScope.languageJSON.label.saveSuperAction}">${sessionScope.languageJSON.label.save}</button>
                                        </div>
                                </div>
                            </div>
                        </section>
                        <form hidden="hidden" action="submitRequests" method="POST" id="actionForm">
                                <input type="hidden" value="${level}" name="level"/>
                                <input type="hidden" name="chain" id="actionChain"/>
                                <input type="hidden" name="actionList" id="actionList">
                                <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
                        </form>
            </main>
        </div>
        <%@ include file="../modal/leaveListCalendar.jsp"%>
        <%@ include file="../modal/approveLeaveModal.jsp"%>
        <%@ include file="../commons/footer.jsp"%>
    </body>
    <script>
	    var directReportEmployee = eval(${directReportEmployee});
	    var chain = eval(${chain});
	    var leaves = eval(${leaves});
	    var leaveTypes = eval(${leaveTypes});
	    var absRsns = eval(${absRsns});
    </script>
    <script src="/<%=request.getContextPath().split("/")[1]%>/js/viewJs/supervisor/approveLeaveRequestList.js"></script>

</html>
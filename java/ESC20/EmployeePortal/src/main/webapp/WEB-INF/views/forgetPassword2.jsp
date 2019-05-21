<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%> <%@ taglib
uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%> <%@ page
language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html> 
<html lang="en">
    <head>
        <title>${sessionScope.languageJSON.headTitle.forgotPassword}</title>
        <meta name="viewport" content="width=device-width, initial-scale=1" />
        <%@ include file="commons/header.jsp"%>
    </head>
    <body class="account-wrap">
        <%@ include file="commons/bar-account.jsp"%>
        <div class="account-top content-body answerQuestion"  tabindex="-1">
                <div class="account-inner sm">
                        <form action="answerHintQuestion" method="post">
                        	<input type="hidden" name="count" value="${count}"/>
                        	<input type="hidden" name="empNbr" value="${user.empNumber}"/>
                        	<input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
                            <div class="form-group">
                                <label class="form-title">${sessionScope.languageJSON.label.employeeNumber}</label>
                                <div class="valid-wrap">
                                   ${user.empNumber}
                                </div>
                                <input type="hidden" name="empNumber" value="${newUser.empNumber}" />
                            </div>
                            <div class="form-group">
                                <label class="form-title">${sessionScope.languageJSON.label.dateOfBirth}</label>
                                <div class="valid-wrap">
                                   ${ user.searchFormattedDateofBirth}
                                </div>
                            </div>
                            <div class="form-group">
                                <label class="form-title">${sessionScope.languageJSON.label.zipCode}</label>
                                <div class="valid-wrap">
                                    ${user.zipCode}
                                </div>
                            </div>
                            <div class="form-group">
                                <label class="form-title">${sessionScope.languageJSON.label.lastname}</label>
                                <div class="valid-wrap">
                                    ${user.nameL}
                                </div>
                            </div>
                            <div class="form-group">
                                <label class="form-title">${sessionScope.languageJSON.label.firstname}</label>
                                <div class="valid-wrap">
                                    ${user.nameF}
                                </div>
                            </div>
                            <p>
                                <b>${sessionScope.languageJSON.label.pleaseAnswerYourHintQuestion}</b>
                            </p>
                            <div class="form-group">
                                <label class="form-title" for="answerQuestion">
                                 	${user.hintQuestion}
                                </label>
                                <div class="valid-wrap">
                                    <input
                                        type="text"
                                        class="form-control"
                                        name="answer"
                                        id="answerQuestion"
                                    />
                                </div>
                            </div>
                            
                            <c:if test="${errorMessage!=null && errorMessage!=''}">
                            	<p class="error-hint" role="alert" aria-atomic="true" id="noUserError">
                                        ${sessionScope.languageJSON.validator.answerError}
                                </p>
                            </c:if>
                            <div class="form-group account-btn">
                                <button type="submit" role="button" class="btn btn-primary">
                                        ${sessionScope.languageJSON.label.submit}
                                </button>
                            </div> 
                    </form>
                </div>
            </div>
    </body>
    <script src="/<%=request.getContextPath().split("/")[1]%>/js/viewJs/forgetPassword2.js"></script>

</html>
<div
    class="modal fade"
    id="changePasswordModal"
    tabindex="-1"
    role="dialog"
    aria-labelledby="changePasswordModal"
    aria-hidden="true"
    data-backdrop="static"
>
    <div class="modal-dialog approveForm" style="max-width:350px;">
        <div class="modal-content">
            <div class="modal-header">
                <h4 class="modal-title">${sessionScope.languageJSON.label.changePassword}</h4>
                <button
                    type="button" role="button"
                    class="close closeModal"
                    data-dismiss="modal"
                    aria-label="${sessionScope.languageJSON.label.closeModal}">
                    &times;
                </button>
            </div>
              
                  <form id="updatePassword" action="updatePassword" method="post" style="max-width:350px;">
                  	<input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
                    <input type="text" id="sessionPsd" value="${decryptedPwd}" style = "display:none" aria-label="${sessionScope.languageJSON.accessHint.sessionPassword}"/> 
                    <input type="text" name="id" id="userId" value="${sessionScope.user.empNbr}" style = "display:none" aria-label="${sessionScope.languageJSON.accessHint.employeeNumber}"/> 
                    <div class="modal-body">
                      <div class="form-group">
                          <label class="form-title" for="oldPassword">${sessionScope.languageJSON.label.oldPassword}</label>
                          <div class="valid-wrap">
                              <input
                                  type="password"
                                  class="form-control"
                                  placeholder="${sessionScope.languageJSON.label.oldPassword}"
                                  name="oldPassword"
                                  id="oldPassword"
                              />
                          </div>
                      </div>  
                      <div class="form-group has-error oldPsdValidator" style = "display:none">
                            <small class="help-block" role="alert" aria-atomic="true">${sessionScope.languageJSON.validator.oldPasswordWrong}</small>
                        </div>
                    <div class="form-group">
                          <label class="form-title" for="newPassword">${sessionScope.languageJSON.label.newPassword}</label>
                          <div class="valid-wrap">
                              <input
                                  type="password"
                                  class="form-control"
                                  placeholder="${sessionScope.languageJSON.label.newPassword}"
                                  name="password"
                                  id="newPassword"
                              />
                          </div>
                      </div>
                      <div class="form-group">
                          <label class="form-title" for="newCheckPassword">${sessionScope.languageJSON.label.confirmPassword}</label>
                          <div class="valid-wrap">
                              <input
                                  type="password"
                                  class="form-control"
                                  placeholder="${sessionScope.languageJSON.label.confirmPassword}"
                                  name="newPassword"
                                  id="newCheckPassword"
                              />
                          </div>
                      </div>
                    </div>
                    <div class="modal-footer">
                        <button type="button" role="button" id="changePsd" class="btn btn-primary">
                        	${sessionScope.languageJSON.label.submit}
                        </button>
                        <button
                        type="button" role="button"
                            class="btn btn-secondary closeModal"
                            data-dismiss="modal"
                            id="cancelAdd"
                        >
                        	${sessionScope.languageJSON.label.cancel}
                        </button>
                    </div>
                  </form>
                
              
              
        </div>
        <!-- /.modal-content -->
    </div>
    <!-- /.modal -->
</div>

<script src="/<%=request.getContextPath().split("/")[1]%>/js/viewJs/modal/changePassword.js"></script>
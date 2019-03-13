<div
    class="modal fade"
    id="changeAvatarModal"
    tabindex="-1"
    role="dialog"
    aria-labelledby="changeAvatarModal"
    aria-hidden="true"
    data-backdrop="static"
>
    <div class="modal-dialog approveForm" style="max-width:350px;">
        <div class="modal-content">
            <div class="modal-header">
                <button
                    type="button"
                    class="close closeModal"
                    data-dismiss="modal"
                    aria-hidden="true"
                    aria-label="" data-localize="label.closeModal" data-localize-location="aria-label" data-localize-notText="true"
                    >
                    &times;
                </button>
                <h4 class="modal-title" data-localize="label.changeAvatar"></h4>
            </div>
            <form id="changeAvatar" action="changeAvatar" method="POST">
            		<input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
                      <div class="modal-body">
                        <input id="userName" hidden="hidden" type="text" value="${sessionScope.userDetail.nameF}" aria-label="" data-localize="accessHint.userName">
                        <input id="avatarImg" hidden="hidden" type="text" name="file" aria-label="" data-localize="accessHint.file">
                        <input id="avatarImgName" hidden="hidden" type="text" name="fileName" aria-label="" data-localize="accessHint.fileName">
                        <p>
                            <label data-localize="label.chooseImageSize" for="imgUpFile"></label>
                        </p>
                        <input class="avatar-file" type="file" name="file"  id="imgUpFile"  onchange="startRead()" accept=".jpg, .jpeg, .png"/>
                        <p class="error-hint hide" id="pictureError" data-localize="validator.pictureTooLarge"></p>
                        <br>
                        <img class="showUploadImg" src="${sessionScope.userDetail.avatar}" alt="">
                      </div>
                    <div class="modal-footer">
                        <button type="button" id="saveAvatar"  class="btn btn-primary disabled" data-localize="label.ok" disabled>
                        </button>
                        <button
                          type="button"
                            class="btn btn-secondary closeModal"
                            data-dismiss="modal"
                            aria-hidden="true"
                            id="cancelAdd"
                            data-localize="label.cancel"
                        >
                        </button>
                    </div>
              </form>
              
        </div>
        <!-- /.modal-content -->
    </div>
    <!-- /.modal -->
</div>
<script src="/<%=request.getContextPath().split("/")[1]%>/js/viewJs/modal/changeAvatar.js"></script>

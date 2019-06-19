var reasonOption
$(document).ready(function() {
    reasonOption = $("#absenceReason").html()
    $('#requestForm').attr('action', 'submitLeaveRequestFromCalendar')
    initThemeChooser({
        init: function(themeSystem) {
            $('#calendar').fullCalendar({
                themeSystem: themeSystem,
                header: {
                    left: 'prev,next today',
                    center: 'title',
                    right: ''
                    // right: 'month,agendaWeek,agendaDay,listMonth'
                },
                timeFormat: 'hh:mm A',
                displayEventEnd: true,
                defaultDate: new Date(),
                weekNumbers: false,
                navLinks: true, // can click day/week names to navigate views
                editable: false,
                eventLimit: true, // allow "more" link when too many events
                events: leaveList,
                locale: initialLocaleCode,
                eventClick: function(calEvent, jsEvent, view) {
                    console.log(calEvent)
                    if (calEvent.statusCd != 'A') {
                        $('.dateValidator').hide()
                        $('#requestForm')
                            .data('bootstrapValidator')
                            .destroy()
                        $('#requestForm').data('bootstrapValidator', null)
                        formValidator()
                        $('.dateValidator').hide()
                        var leaveStartDate = calEvent.start._i
                        var leaveEndDate = calEvent.end._i

                        var start_arry = leaveStartDate.split(' ')
                        var end_arry = leaveEndDate.split(' ')
                        var startTime = start_arry[1].split(':')
                        var endTime = end_arry[1].split(':')
                        var startH = parseInt(startTime[0])
                        var endH = parseInt(endTime[0])
                        var startAMOrPM, endAMOrPM
                        startH = startTime[0].trim()
                        startAMOrPM = start_arry[2].trim()
                        endH = endTime[0].trim()
                        endAMOrPM = end_arry[2].trim()
                        $('#startHour').val(startH)
                        $('#endHour').val(endH)
                        $('#startAmOrPm').val(startAMOrPM)
                        $('#endAmOrPm').val(endAMOrPM)
                        var startTimeValue =
                            startH + ':' + startTime[1] + ' ' + startAMOrPM
                        var endTimeValue =
                            endH + ':' + endTime[1] + ' ' + endAMOrPM
                        $('#startTimeValue').val(startTimeValue)
                        $('#endTimeValue').val(endTimeValue)
                        $('#startMinute').val(startTime[1])
                        $('#endMinute').val(endTime[1])
                        $('#commentList').html('')
                        for (var i = 0; i < calEvent.comments.length; i++) {
                            var html =
                                '<p>' + calEvent.comments[i].detail + '</p>'
                            $('#commentList').append(html)
                        }
                        $('#cancelAdd').hide()
                        $('#deleteLeave').show()
                        $('.edit-title').show()
                        $('.new-title').hide()
                        $('.firstSubmit').hide()
                        $(".availableError").hide()
                        $('.secondSubmit').show()
                        // $('#requestModal').modal('show')
                        $("[name='leaveType']").val(calEvent.LeaveType)
                        changeLeaveType()
                        $("[name='absenseReason']").val(calEvent.AbsenseReason)
                        $('#leaveId').attr('value', calEvent.id + '')
                        $('#startDateInput').val(calEvent.LeaveStartDate)
                        $('#endDateInput').val(calEvent.LeaveEndDate)
                        console.log(calEvent.lvUnitsDaily)
                        console.log(calEvent.lvUnitsUsed)
                        $("#leaveHoursDaily").val(Number(calEvent.lvUnitsDaily).toFixed(3));
		                $("#totalRequested").val(Number(calEvent.lvUnitsUsed).toFixed(3));
                        
                        //Initializes the time control when edit event modal show
                    } else {
                        var leaveRequest = calEvent
                        console.log(leaveRequest)
                        var type
                        leaveTypes.forEach(function(element){
                            if (element.code == leaveRequest.LeaveType) {
                                type = element.description
                            }
                        })
                        var reason
                        absRsns.forEach(function(element) {
                            if (element.code == leaveRequest.AbsenseReason) {
                                reason = element.description
                            }
                        })
                        var leaveStartDate = leaveRequest.start._i
                        var leaveEndDate = leaveRequest.end._i

                        var start_arry = leaveStartDate.split(' ')
                        var end_arry = leaveEndDate.split(' ')

                        var startTime = changeFormatTimeAm(start_arry[1])
                        var endTime = changeFormatTimeAm(end_arry[1])

                        var startDate = changeMMDDFormat(start_arry[0])
                        var endDate = changeMMDDFormat(end_arry[0])

                        var start = startDate + ' ' + startTime
                        var end = endDate + ' ' + endTime

                        // $("#leaveIdStatic").attr("value", leaveRequest.id+"");
                        $('#disIdStatic').attr('value', leaveRequest.id + '')
                        $('#appIdStatic').attr('value', leaveRequest.id + '')
                        $('#employeeStatic').text(leaveRequest.lastName)
                        $('#startDateInputStatic').html(leaveRequest.start._i)
                        $('#endDateInputStatic').html(leaveRequest.end._i)
                        $('#leaveTypeStatic').html(type)
                        $('#absenceReasonStatic').html(reason)
                        $('#leaveRequestedStatic').html(
                            leaveRequest.lvUnitsUsed
                        )
                        $('#commentLogStatic').html('')
                        $('#leaveStatusStatic').text(leaveRequest.statusDescr)
                        $('#leaveApproverStatic').text(leaveRequest.approver)
                        var comments = leaveRequest.comments
                        for (var i = 0; i < comments.length; i++) {
                            var html = '<p>' + comments[i].detail + '</p>'
                            $('#commentLogStatic').append(html)
                        }
                        $('infoEmpNameStatic').html(
                            leaveRequest.empNbr +
                                ':' +
                                leaveRequest.firstName +
                                ',' +
                                leaveRequest.firstName
                        )
                        $('#infoDetailStatic').html('')
                        //   $('#EventDetailModal').modal('show')
                        initLocalize(initialLocaleCode)
                    }
                },
                dayClick: function(date, allDay, jsEvent, view) {
                    console.log(date)
                    console.log(allDay)
                    console.log(jsEvent)
                    console.log(view)
                    newEvent($(this))
                    $("#requestModal").modal("show")
                    $("#absenceReason").html(reasonOption)
                },
                // eventMouseover: function (calEvent, jsEvent, view) {   
                //     console.log(calEvent)
                //     console.log(jsEvent)
                //     console.log(view)
                // },
                eventRender: function(event, element, view) {
                    if (event.statusCd != 'A') {
                        element.attr('data-toggle', 'modal')
                        element.attr('data-target', '#requestModal')
                        element.attr('role','button')
                    } else {
                        element.attr('data-toggle', 'modal')
                        element.attr('data-target', '#EventDetailModal')
                        element.attr('role','button')
                    }
                    var startEv = changeYMDFormat(event.LeaveStartDate)
                    var endEv = changeYMDFormat(event.LeaveEndDate)
                    var time = element.find(".fc-time").text()
                    // var ariaLabel = "from " + startEv + " to " + endEv
                    var ariaLabel = startEv + " / " + endEv +" " + time + " " + event.title
                    element.attr('aria-label', ariaLabel)
                    element.attr('tabindex', 0)
                    element.bind('keypress', function(e)  {
                        console.log(e)
                        var eCode = e.keyCode
                            ? e.keyCode
                            : e.which
                            ? e.which
                            : e.charCode
                        if (eCode == 13) {
                            $(this).click()
                        }
                    })
                    initLocalize(initialLocaleCode)
                },
                viewRender: function(view, element) {
                    console.log(view)
                    $('.fc-day-top').each(function() {
                        var title = $(this).attr('data-date')
                        // var newBtn = `<button class="btn btn-primary xs"  data-title="${title}" title="Add a new request" onclick="newEvent(this)">Add</button>`
                        var newBtn =
                            '<button class="btn btn-primary xs calendarAddBtn" data-title="'+title+'" aria-label="'+addNewRequestLabel+' ' +title +'" onclick="newEvent(this)"  data-toggle="modal" data-target="#requestModal"><span>'
                            + addLabel +
                            '</span></button>'
                        $(this).prepend(newBtn)
                    })
                    var currentHtml = '<span>' + currentMonthLabel + '</span>'
                    $(".fc-today-button").html(currentHtml)
                    initLocalize(initialLocaleCode) //Initialize multilingual function
                }
            })
        },
        change: function(themeSystem) {
            $('#calendar').fullCalendar('option', 'themeSystem', themeSystem)
        }
    })
    
    

    $('.sureDelete').click(function() {
        $('#deleteForm')[0].submit()
    })
})
function newEvent(dom) {
    $('.dateValidator').hide()
    console.log(dom)
    console.log($(dom).attr('data-title'))
    console.log($(dom).attr('data-date'))
    var date = changeMMDDFormat($(dom).attr('data-title')?$(dom).attr('data-title'):$(dom).attr('data-date'))
    console.log(date)
    $('#leaveId').attr('value', '')
    $("[name='Remarks']").text('')
    $('#requestForm')[0].reset()
    $('#requestForm')
        .data('bootstrapValidator')
        .destroy()
    $('#requestForm').data('bootstrapValidator', null)
    formValidator()
    $('#cancelAdd').show()
    $('#deleteLeave').hide()
    $('.edit-title').hide()
    $(".availableError").hide()
    $('.new-title').show()
    $('#startDateInput').val(date)
    $('#endDateInput').val(date)
    $('#commentList').html('')
    $('.firstSubmit').show()
    $('.secondSubmit').hide()
    //Initializes the time control when new event modal show
}

function changeMMDDFormat(date) {
    var dateArry = date.split('-')
    return dateArry[1] + '/' + dateArry[2] + '/' + dateArry[0]
}
function changeYMDFormat(date) {
    var dateArry = date.split('/')
    return dateArry[2] + '-' + dateArry[0] + '-' + dateArry[1]
}
function changeFormatTimeAm(value) {
    var array = value.split(/[,: ]/)
    var hour, minute, time
    hour = parseInt(array[0])
    minute = parseInt(array[1])
    if (minute >= 0 && minute < 30) {
        minute = '00'
    } else {
        minute = '30'
    }
    if (hour > 12) {
        hour = hour - 12 < 10 ? '0' + (hour - 12) : hour - 12
        time = hour + ':' + minute + ' PM'
    } else {
        if (hour == 12) {
            time = hour + ':' + minute + ' PM'
        } else {
            hour = hour < 10 ? '0' + hour : hour
            time = hour + ':' + minute + ' AM'
        }
    }
    return time
}
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> <%@ page
language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<html lang="en">
    <head>
        <title data-localize="headTitle.leaveRequestCalendar"></title>
        <meta name="viewport" content="width=device-width, initial-scale=1" />
        <link rel="stylesheet" href="/<%=request.getContextPath().split("/")[1]%>/css/fullcalendar.min.css" />
        <%@ include file="../commons/header.jsp"%>
    </head>
    <body class="hold-transition sidebar-mini">
        <div class="wrapper">
            <%@ include file="../commons/bar.jsp"%>
			
            <main class="content-wrapper">
                <section class="content">
                    <h2 class="clearfix section-title">
                        <span data-localize="title.leaveRequest"></span>
                        <a class="btn btn-primary pull-right" href="/<%=request.getContextPath().split("/")[1]%>/leaveRequest/leaveRequest" data-localize="label.switchToTableView"></a>
                    </h2>
                    <div class="content-white"><div id="calendar"></div></div>
                </section>
            </main>
            <form hidden="true" id="deleteForm" action="deleteLeaveRequestFromCalendar" method="post">
                    <input type="text" id="deleteId" name="id"/>
            </form>
        </div>
        <%@ include file="../commons/footer.jsp"%>
        <%@ include file="../modal/eventModal.jsp"%>
    </body>
    <script>
        $(document).ready(function() {
            $("#requestForm").attr("action", "submitLeaveRequestFromCalendar");
			var leaveList = eval(${leaves});
			console.log(leaveList)
            initThemeChooser({
                init: function(themeSystem) {
                    $('#calendar').fullCalendar({
                        themeSystem: themeSystem,
                        header: {
                            left: 'prev,next today',
                            center: 'title',
                            right: 'month'
                            // right: 'month,agendaWeek,agendaDay,listMonth'
                        },
                        defaultDate: new Date(),
                        weekNumbers: false,
                        navLinks: true, // can click day/week names to navigate views
                        editable: false,
                        eventLimit: true, // allow "more" link when too many events
                        events: leaveList,
                        locale: initialLocaleCode,
                        eventClick: function(calEvent, jsEvent, view) {
                            console.log(calEvent)
                            $('.dateValidator').hide()
                            $('#requestForm')
                                .data('bootstrapValidator')
                                .destroy()
                            $('#requestForm').data('bootstrapValidator', null)
                            formValidator()
                            $('.dateValidator').hide()
                            let leaveStartDate = calEvent.start._i
                            let leaveEndDate = calEvent.end._i

                            let start_arry = leaveStartDate.split(" ")
                            let end_arry = leaveEndDate.split(" ")
                            let startTime = start_arry[1].split(":")
                            let endTime = end_arry[1].split(":")
                            console.log(startTime)
                            console.log(endTime)
                            let startH = parseInt(startTime[0])
                            let endH = parseInt(endTime[0])
                            let startAMOrPM,endAMOrPM;
                            if(startH>=12){
                                startAMOrPM = 'PM'
                                if(startH==12){
                                    startH = 12
                                }else{
                                    startH = startH - 12
                                }
                            }else{
                                startAMOrPM = 'AM'
                                startH = startH
                            }
                            if(endH>=12){
                                endAMOrPM = 'PM'
                                if(endH == 12){
                                    endH = 12
                                }else{
                                    endH = endH - 12
                                }
                            }else{
                                endAMOrPM = 'AM'
                                endH = endH
                            }

                            if(startH>=10){
                                $("#startHour").val(startH)
                            }else{
                                $("#startHour").val("0" + startH)
                            }

                            if(endH>=10){
                                $("#endHour").val(endH)
                            }else{
                                $("#endHour").val("0" + endH)
                            }
                            $("#startAmOrPm").val(startAMOrPM)
                            $("#endAmOrPm").val(endAMOrPM)
                            let startTimeValue = startH + ":" + startTime[1] + " " + startAMOrPM
                            let endTimeValue = endH + ":" + endTime[1] + " " + endAMOrPM
                            $("#startTimeValue").val(startTimeValue)
                            $("#endTimeValue").val(endTimeValue)
                            $("#startMinute").val(startTime[1])
                            $("#endMinute").val(endTime[1])
                            $("#commentList").html("")
                            for(let i=0;i<calEvent.comments.length;i++){
                                    let html = '<p>'+calEvent.comments[i].detail+'</p>'
                                    $("#commentList").append(html)
                            }
							$("#cancelAdd").hide();
                            $("#deleteLeave").show();
                            $(".edit-title").show();
                            $(".new-title").hide();
                            $('#requestModal').modal('show')
                            $("[name='leaveType']").val(calEvent.LeaveType);
				            $("[name='absenseReason']").val(calEvent.AbsenseReason);
							$("#leaveId").attr("value", calEvent.id+"");
                            $("#startDate").val(calEvent.LeaveStartDate);
                            $("#endDate").val(calEvent.LeaveEndDate);
                            calcTime()
                            //Initializes the time control when edit event modal show
                        },
                        viewRender:function(){
                            $(".fc-event").attr("tabindex",0)
                            $(".fc-event").keypress(function(e){
                                console.log(e)
                                var eCode = e.keyCode ? e.keyCode : e.which ? e.which : e.charCode;
                                if (eCode == 13){
                                    $(this).click()
                                }
                            })
                            $(".fc-day-top").each(function(){
                                let title = $(this).attr("data-date")
                                // let newBtn = `<button class="btn btn-primary xs"  data-title="${title}" title="Add a new request" onclick="newEvent(this)">Add</button>`
                                let newBtn = `<button class="btn btn-primary xs" data-title="`
                                                + title +
                                                `" title="Add a new request" data-localize="label.add" onclick="newEvent(this)"></button>`
                                $(this).prepend(newBtn)
                            })
                            initLocalize(initialLocaleCode)//Initialize multilingual function
                        }
                    })
                },
                change: function(themeSystem) {
                    console.log("111111111")
                    $('#calendar').fullCalendar(
                        'option',
                        'themeSystem',
                        themeSystem
                    )
                }
            })
        })
        function newEvent(dom){
            $('.dateValidator').hide()
            console.log(dom)
            let date = changeMMDDFormat($(dom).attr("data-title"))
            console.log(date)
            $("#leaveId").attr("value","");
            $("[name='Remarks']").text("");
            $('#requestForm')[0].reset();
            $('#requestForm').data('bootstrapValidator').destroy()
            $('#requestForm').data('bootstrapValidator', null)
            formValidator()
            $("#cancelAdd").show();
            $("#deleteLeave").hide();
            $(".edit-title").hide();
            $(".new-title").show();
            $('#requestModal').modal('show')
            $("#startDate").val(date);
            $("#endDate").val(date);
            $("#commentList").html("")
            calcTime()
            //Initializes the time control when new event modal show
        }

        function changeMMDDFormat(date){
			let dateArry = date.split("-")
			return dateArry[1]+"/"+dateArry[2]+"/"+dateArry[0]
		}
       
        function changeFormatTimeAm(value){
				let array = value.split(/[,: ]/);
				let hour,minute,time
				hour = parseInt(array[0])
				minute = parseInt(array[1])
				if(minute>=0 && minute <30){
					minute = "00"
				}else{
					minute = "30"
				}
				if(hour>12){
					hour = (hour-12) < 10 ? "0" + (hour-12) : hour-12;
					time = hour+ ":" +minute+" PM"
				}else{
					if(hour==12){
						time = hour+ ":" +minute+" PM"
					}else{
						hour = hour < 10 ? "0" + hour : hour;
						time = hour+ ":" +minute+" AM"
					}

				}
				return time
		}
    </script>
</html>

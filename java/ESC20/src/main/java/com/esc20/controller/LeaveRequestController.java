package com.esc20.controller;

import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Set;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.esc20.model.BeaEmpLvComments;
import com.esc20.model.BeaEmpLvRqst;
import com.esc20.model.BeaEmpLvWorkflow;
import com.esc20.model.BeaUsers;
import com.esc20.model.BhrEmpDemo;
import com.esc20.model.BhrEmpLvXmital;
import com.esc20.nonDBModels.AppLeaveRequest;
import com.esc20.nonDBModels.Code;
import com.esc20.nonDBModels.LeaveInfo;
import com.esc20.nonDBModels.LeaveParameters;
import com.esc20.nonDBModels.LeaveRequestModel;
import com.esc20.service.LeaveRequestService;
import com.esc20.service.ReferenceService;

import net.sf.json.JSONArray;

@Controller
@RequestMapping("/leaveRequest")
public class LeaveRequestController {

    @Autowired
    private LeaveRequestService service;


    @Autowired
    private ReferenceService referenceService;
    
    @RequestMapping(value="", method=RequestMethod.GET)
    public ModelAndView getIndexPage(ModelAndView mav){
        mav.setViewName("index");
        return mav;
    }

    @RequestMapping("eventCalendar")
    public ModelAndView getEventCalendar(HttpServletRequest req, String freq){
        HttpSession session = req.getSession();
        BeaUsers user = (BeaUsers)session.getAttribute("user");
        ModelAndView mav = new ModelAndView();
        if(null == user){
        	return this.getIndexPage(mav);
        }
        mav.setViewName("/leaveRequest/fullCalendar");
        AppLeaveRequest request = new AppLeaveRequest();
        BhrEmpDemo demo = ((BhrEmpDemo)session.getAttribute("userDetail"));
        List<Code> availableFreqs = this.service.getAvailableFrequencies(demo.getEmpNbr());
        List<AppLeaveRequest> requests = new ArrayList<AppLeaveRequest>();
        if(freq==null||("").equals(freq)) {
	        if(availableFreqs.size()>0) {
	        	freq = availableFreqs.get(0).getCode();
	        	requests = this.service.getLeaveRequests(request,demo.getEmpNbr(),freq);
		        List<LeaveRequestModel> requestModels = new ArrayList<LeaveRequestModel>();
		        List<Code> leaveStatus = this.referenceService.getLeaveStatus();
		        LeaveRequestModel model;
		        JSONArray json = new JSONArray();
		        for(int i=0;i<requests.size();i++) {
		        	model = new LeaveRequestModel(requests.get(i));
		        	requestModels.add(model);
		        }
		        for(int i=0;i<requestModels.size();i++) {
		        	json.add(requestModels.get(i).toJSON(leaveStatus));
		        }
	            List<Code> absRsns = this.service.getAbsRsns(demo.getEmpNbr(), freq, "");
	            List<Code> leaveTypes = this.service.getLeaveTypes(demo.getEmpNbr(), freq, "");
	            List<LeaveInfo> leaveInfo = this.service.getLeaveInfo(demo.getEmpNbr(), freq, false);
	            mav.addObject("selectedFreq", freq);
	            mav.addObject("absRsns", absRsns);
	            mav.addObject("leaveTypes", leaveTypes);
	            mav.addObject("leaveInfo", leaveInfo);
		        mav.addObject("leaves", json); 
	        }
        } else {
	        	requests = this.service.getLeaveRequests(request,demo.getEmpNbr(),freq);
		        List<LeaveRequestModel> requestModels = new ArrayList<LeaveRequestModel>();
		        List<Code> leaveStatus = this.referenceService.getLeaveStatus();
		        LeaveRequestModel model;
		        JSONArray json = new JSONArray();
		        for(int i=0;i<requests.size();i++) {
		        	model = new LeaveRequestModel(requests.get(i));
		        	requestModels.add(model);
		        }
		        for(int i=0;i<requestModels.size();i++) {
		        	json.add(requestModels.get(i).toJSON(leaveStatus));
		        }
	            List<Code> absRsns = this.service.getAbsRsns(demo.getEmpNbr(), freq, "");
	            List<Code> leaveTypes = this.service.getLeaveTypes(demo.getEmpNbr(), freq, "");
	            List<LeaveInfo> leaveInfo = this.service.getLeaveInfo(demo.getEmpNbr(), freq, false);
	            mav.addObject("selectedFreq", freq);
	            mav.addObject("absRsns", absRsns);
	            mav.addObject("leaveTypes", leaveTypes);
	            mav.addObject("leaveInfo", leaveInfo);
		        mav.addObject("leaves", json); 
        }
        return mav;
    }
    
    @RequestMapping("leaveRequestByFreqency")
    public ModelAndView leaveRequestByFrequency(HttpServletRequest req, String freq) throws ParseException {
    	return this.leaveRequest(req, null, null, null, freq);
    }
    
    @RequestMapping("leaveRequest")
    public ModelAndView leaveRequest(HttpServletRequest req, String SearchType, String SearchStart, String SearchEnd, String freq) throws ParseException{
        HttpSession session = req.getSession();
        BeaUsers user = (BeaUsers)session.getAttribute("user");
        ModelAndView mav = new ModelAndView();
        if(null == user){
        	return this.getIndexPage(mav);
        }
        SimpleDateFormat sdf1 = new SimpleDateFormat("MM/dd/yyyy");
        mav.setViewName("/leaveRequest/leaveRequest");
        AppLeaveRequest request = new AppLeaveRequest();
        BhrEmpDemo demo = ((BhrEmpDemo)session.getAttribute("userDetail"));
        LeaveParameters params = this.service.getLeaveParameters();
        List<Code> availableFreqs = this.service.getAvailableFrequencies(demo.getEmpNbr());
        String supervisorEmpNbr = this.service.getFirstLineSupervisor(demo.getEmpNbr(), params.isUsePMIS());
		if (supervisorEmpNbr == null) {
			supervisorEmpNbr = "";
		}
        request.setLvTyp(SearchType);
        if(SearchStart!=null&&!("").equals(SearchStart))
        	request.setDatetimeFrom(sdf1.parse(SearchStart));
        if(SearchEnd!=null&&!("").equals(SearchEnd))
        	request.setDatetimeTo(sdf1.parse(SearchEnd));
        if(freq==null||("").equals(freq)) {
        	if(availableFreqs.size()>0) {
        		List<Code> leaveStatus = this.referenceService.getLeaveStatus();
        		freq = availableFreqs.get(0).getCode();
                List<AppLeaveRequest> requests = this.service.getLeaveRequests(request,demo.getEmpNbr(),freq);
                List<LeaveRequestModel> requestModels = new ArrayList<LeaveRequestModel>();
                LeaveRequestModel model;
                for(int i=0;i<requests.size();i++) {
                	model = new LeaveRequestModel(requests.get(i));
                	requestModels.add(model);
                }
                JSONArray json = new JSONArray();
		        for(int i=0;i<requestModels.size();i++) {
		        	json.add(requestModels.get(i).toJSON(leaveStatus));
		        }
                List<Code> absRsns = this.service.getAbsRsns(demo.getEmpNbr(), freq, "");
                List<Code> leaveTypes = this.service.getLeaveTypes(demo.getEmpNbr(), freq, "");
                List<LeaveInfo> leaveInfo = this.service.getLeaveInfo(demo.getEmpNbr(), freq, false);
                mav.addObject("selectedFreq", freq);
                mav.addObject("absRsns", absRsns);
                mav.addObject("leaveTypes", leaveTypes);
                mav.addObject("leaveInfo", leaveInfo);
                mav.addObject("leaves", json);
        	}
        }else {
            List<AppLeaveRequest> requests = this.service.getLeaveRequests(request,demo.getEmpNbr(),freq);
            List<LeaveRequestModel> requestModels = new ArrayList<LeaveRequestModel>();
            LeaveRequestModel model;
            for(int i=0;i<requests.size();i++) {
            	model = new LeaveRequestModel(requests.get(i));
            	requestModels.add(model);
            }
            List<Code> absRsns = this.service.getAbsRsns(demo.getEmpNbr(), freq, "");
            List<Code> leaveTypes = this.service.getLeaveTypes(demo.getEmpNbr(), freq, "");
            List<LeaveInfo> leaveInfo = this.service.getLeaveInfo(demo.getEmpNbr(), freq, false);
            mav.addObject("selectedFreq", freq);
            mav.addObject("leaves", requestModels);
            mav.addObject("absRsns", absRsns);
            mav.addObject("leaveTypes", leaveTypes);
            mav.addObject("leaveInfo", leaveInfo);
        	
        }
        mav.addObject("SearchType", SearchType);
        mav.addObject("SearchStart", SearchStart);
        mav.addObject("SearchEnd", SearchEnd);
        mav.addObject("params", params);
        mav.addObject("availableFreqs", availableFreqs);
        mav.addObject("supervisorEmpNbr", supervisorEmpNbr);
        return mav;
    }
    
    @RequestMapping("submitLeaveRequest")
    public ModelAndView submitLeaveRequest(HttpServletRequest req, String leaveId, String leaveType, String absenseReason, String LeaveStartDate, String startTimeValue,
			String LeaveEndDate, String endTimeValue, String lvUnitsDaily, String lvUnitsUsed, String Remarks, String freq) throws ParseException{
        HttpSession session = req.getSession();
        BeaUsers user = (BeaUsers)session.getAttribute("user");
        ModelAndView mav = new ModelAndView();
        if(null == user){
        	return this.getIndexPage(mav);
        }
        BhrEmpDemo demo = ((BhrEmpDemo)session.getAttribute("userDetail"));
        this.saveLeaveRequest(leaveId, leaveType, absenseReason, LeaveStartDate, startTimeValue, LeaveEndDate, endTimeValue, lvUnitsDaily, lvUnitsUsed, Remarks, freq, demo.getEmpNbr());   
        return this.leaveRequest(req,null,null,null,null);
    }

    
    @RequestMapping("submitLeaveRequestFromCalendar")
    public ModelAndView submitLeaveRequestFromCalendar(HttpServletRequest req, String leaveId, String leaveType, String absenseReason, String LeaveStartDate, String startTimeValue,
			String LeaveEndDate, String endTimeValue,  String lvUnitsDaily, String lvUnitsUsed, String Remarks, String freq) throws ParseException{
        HttpSession session = req.getSession();
        BeaUsers user = (BeaUsers)session.getAttribute("user");
        ModelAndView mav = new ModelAndView();
        if(null == user){
        	return this.getIndexPage(mav);
        }
        BhrEmpDemo demo = ((BhrEmpDemo)session.getAttribute("userDetail"));
        this.saveLeaveRequest(leaveId, leaveType, absenseReason, LeaveStartDate, startTimeValue, LeaveEndDate, endTimeValue, lvUnitsDaily, lvUnitsUsed, Remarks, freq, demo.getEmpNbr());   
        return this.getEventCalendar(req,freq);
    }
    
	private void saveLeaveRequest(String leaveId, String leaveType, String absenseReason, String LeaveStartDate, String startTimeValue,
			String LeaveEndDate, String endTimeValue, String lvUnitsDaily, String lvUnitsUsed, String Remarks, String freq, String empNbr) throws ParseException {
		BeaEmpLvRqst request;
		if(leaveId==null||("").equals(leaveId))
        	request = new BeaEmpLvRqst();
        else
        	request = this.service.getleaveRequestById(Integer.parseInt(leaveId+""));
        SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy hh:mm a",Locale.ENGLISH);
        request.setEmpNbr(empNbr);
        request.setPayFreq(freq.charAt(0));
        request.setLvTyp(leaveType);
        request.setAbsRsn(absenseReason);
        request.setDatetimeFrom(formatter.parse(LeaveStartDate+" "+ startTimeValue));
        request.setDatetimeTo(formatter.parse(LeaveEndDate+" "+ endTimeValue));
        request.setDatetimeSubmitted(new Date());
        request.setLvUnitsDaily(BigDecimal.valueOf(Double.parseDouble(lvUnitsDaily)));
        request.setLvUnitsUsed(BigDecimal.valueOf(Double.parseDouble(lvUnitsUsed)));
        if(leaveId==null||("").equals(leaveId)) {
        	request.setStatusCd('P');
        	request.setDtOfPay("");
        } else {
        	request.setDtOfPay(request.getDtOfPay()==null?"":request.getDtOfPay());
        }
        BeaEmpLvRqst res = this.service.saveLeaveRequest(request, (leaveId!=null&&!("").equals(leaveId)));
        //Create Comments
        if(Remarks!=null && !("").equals(Remarks)) {
	        BeaEmpLvComments comments = new BeaEmpLvComments();
	        comments.setBeaEmpLvRqst(res);
	        comments.setLvCommentEmpNbr(empNbr);
	        comments.setLvCommentDatetime(new Date());
	        comments.setLvComment(Remarks);
	        comments.setLvCommentTyp('C');
	        this.service.saveLvComments(comments);
        }
        //Create Workflow
        if((leaveId!=null&&!("").equals(leaveId))) {
	        LeaveParameters params = this.service.getLeaveParameters();
	        String supervisorEmpNbr = this.service.getFirstLineSupervisor(empNbr, params.isUsePMIS());
	        BeaEmpLvWorkflow flow = new BeaEmpLvWorkflow();
	        flow.setBeaEmpLvRqst(res);
	        flow.setInsertDatetime(new Date());
	        flow.setSeqNum(1);
	        flow.setApprvrEmpNbr(supervisorEmpNbr==null?"":supervisorEmpNbr);
	        flow.setTmpApprvrExpDatetime(null);
	        this.service.saveLvWorkflow(flow);
        }
	}

    @RequestMapping("deleteLeaveRequest")
    public ModelAndView deleteLeaveRequest(HttpServletRequest req, String id) throws ParseException{
        HttpSession session = req.getSession();
        BeaUsers user = (BeaUsers)session.getAttribute("user");
        ModelAndView mav = new ModelAndView();
        if(null == user){
        	return this.getIndexPage(mav);
        }
        deleteLeaveRequest(id);   
        return this.leaveRequest(req,null,null,null,null);
    }

    @RequestMapping("deleteLeaveRequestFromCalendar")
    public ModelAndView deleteLeaveRequestFromCalendar(HttpServletRequest req, String id, String  freq){
        HttpSession session = req.getSession();
        BeaUsers user = (BeaUsers)session.getAttribute("user");
        ModelAndView mav = new ModelAndView();
        if(null == user){
        	return this.getIndexPage(mav);
        }
        deleteLeaveRequest(id);   
        return this.getEventCalendar(req,freq);
    }

	private void deleteLeaveRequest(String id) {
		BeaEmpLvRqst request = new BeaEmpLvRqst();
        request = this.service.getBeaEmpLvRqstById(Integer.parseInt(id));
        BeaEmpLvComments comments = new BeaEmpLvComments();
        comments.setBeaEmpLvRqst(request);
        this.service.deleteLeaveComments(comments);
        BeaEmpLvWorkflow flow = new BeaEmpLvWorkflow();
        flow.setBeaEmpLvRqst(request);
        this.service.deleteLeaveFlow(flow);
        this.service.deleteLeaveRequest(request);
	}

    @RequestMapping("leaveBalance")
    public ModelAndView leaveBalance(HttpServletRequest req, String SearchType, String SearchStart, String SearchEnd,String freq) throws ParseException{
        HttpSession session = req.getSession();
        BeaUsers user = (BeaUsers)session.getAttribute("user");
        ModelAndView mav = new ModelAndView();
        if(null == user){
        	return this.getIndexPage(mav);
        }
        SimpleDateFormat sdf1 = new SimpleDateFormat("MM/dd/yyyy");
        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyyMMdd");
        String start = SearchStart;
        String end = SearchEnd;
        if(SearchStart!=null && !("").equals(SearchStart)) {
        	start =sdf2.format(sdf1.parse(SearchStart));
        }
        if(SearchEnd!=null && !("").equals(SearchEnd)) {
        	end =sdf2.format(sdf1.parse(SearchEnd));
        }
        BhrEmpDemo demo = ((BhrEmpDemo)session.getAttribute("userDetail"));
        List<Code> availableFreqs = this.service.getAvailableFrequencies(demo.getEmpNbr());
        if(freq==null||("").equals(freq)) {
        	if(availableFreqs.size()>0) {
        		freq = availableFreqs.get(0).getCode();
            	List<BhrEmpLvXmital> approvedLeaves = this.service.getApprovedLeaves(demo.getEmpNbr(),SearchType,start, end,freq);
                List<Code> absRsns = this.service.getAbsRsns(demo.getEmpNbr(), freq, "");
                List<Code> leaveTypes = this.service.getLeaveTypes(demo.getEmpNbr(), freq, "");
                List<LeaveInfo> leaveInfo = this.service.getLeaveInfo(demo.getEmpNbr(), freq, false);
            	mav.setViewName("/leaveBalance/leaveBalance");
                mav.addObject("selectedFreq", freq);
                mav.addObject("absRsns", absRsns);
                mav.addObject("leaveTypes", leaveTypes);
                mav.addObject("leaveInfo", leaveInfo);
                mav.addObject("leaves", approvedLeaves);
        	}
        }else {
        	List<BhrEmpLvXmital> approvedLeaves = this.service.getApprovedLeaves(demo.getEmpNbr(),SearchType,start, end,freq);
            List<Code> absRsns = this.service.getAbsRsns(demo.getEmpNbr(), freq, "");
            List<Code> leaveTypes = this.service.getLeaveTypes(demo.getEmpNbr(), freq, "");
            List<LeaveInfo> leaveInfo = this.service.getLeaveInfo(demo.getEmpNbr(), freq, false);
        	mav.setViewName("/leaveBalance/leaveBalance");
            mav.addObject("selectedFreq", freq);
            mav.addObject("absRsns", absRsns);
            mav.addObject("leaveTypes", leaveTypes);
            mav.addObject("leaveInfo", leaveInfo);
            mav.addObject("leaves", approvedLeaves);
        }
        mav.addObject("SearchType", SearchType);
        mav.addObject("SearchStart", SearchStart);
        mav.addObject("SearchEnd", SearchEnd);
        mav.addObject("availableFreqs", availableFreqs);
    	return mav;
    }
    
    @RequestMapping("leaveBalanceByFreqency")
    public ModelAndView leaveBalanceByFreqency(HttpServletRequest req, String freq) throws ParseException {
    	ModelAndView mav = this.leaveBalance(req, null, null, null, freq);
    	mav.setViewName("/leaveBalance/leaveBalance");
    	return mav;
    }
}

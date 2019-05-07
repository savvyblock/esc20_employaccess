package com.esc20.controller;

import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.util.List;
import java.util.Map;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.commons.io.FileUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.esc20.model.BeaUsers;
import com.esc20.model.BhrEmpDemo;
import com.esc20.nonDBModels.Account;
import com.esc20.nonDBModels.CurrentPayInformation;
import com.esc20.nonDBModels.District;
import com.esc20.nonDBModels.EmployeeInfo;
import com.esc20.nonDBModels.Frequency;
import com.esc20.nonDBModels.Options;
import com.esc20.nonDBModels.PayInfo;
import com.esc20.nonDBModels.PayPrint;
import com.esc20.nonDBModels.Stipend;
import com.esc20.service.IndexService;
import com.esc20.service.InquiryService;
import com.esc20.util.DataSourceContextHolder;
import com.esc20.util.StringUtil;

import net.sf.json.JSONObject;

@Controller
@RequestMapping("/currentPayInformation")
public class CurrentPayInformationController{
	
	@Autowired
	private InquiryService service;
	
    @Autowired
    private IndexService indexService;
	
	@RequestMapping("currentPayInformation")
	public ModelAndView getCurrentPayInformation(HttpServletRequest req) throws IOException {
		HttpSession session = req.getSession();
		ModelAndView mav = new ModelAndView();
		BhrEmpDemo userDetail = (BhrEmpDemo) session.getAttribute("userDetail");
		String employeeNumber = userDetail.getEmpNbr();
		
		Map<Frequency, List<CurrentPayInformation>> jobs = this.service.getJob(employeeNumber);
		Map<Frequency, List<Stipend>> stipends = this.service.getStipends(employeeNumber);
		Map<Frequency, List<Account>> accounts = this.service.getAccounts(employeeNumber);
		List<Frequency> frequencies = this.service.getFrequencies(jobs);
		Map<Frequency, PayInfo> payInfos = this.service.retrievePayInfo(employeeNumber, frequencies);
		Map<Frequency, String> payCampuses = this.service.retrievePayCampuses(employeeNumber);
		EmployeeInfo employeeInfo = this.service.getEmployeeInfo(employeeNumber);
		String message = ((Options) session.getAttribute("options")).getMessageCurrentPayInformation();
		mav.setViewName("/inquiry/currentPayInformation");
		mav.addObject("jobs", jobs);
		mav.addObject("stipends", stipends);
		mav.addObject("accounts", accounts);
		mav.addObject("frequencies", frequencies);
		mav.addObject("payInfos", payInfos);
		mav.addObject("message", message);
		mav.addObject("payCampuses", payCampuses);
		mav.addObject("employeeInfo", employeeInfo);
		mav.addObject("isPrintPDF", true);
		return mav;
	}
	
//	@RequestMapping("exportPDF")
//	public void exportPDF(HttpServletRequest request, HttpServletResponse response) throws Exception {
//		String strBackUrl = "http://" + request.getServerName() + ":" + request.getServerPort()  + request.getContextPath();
//		System.out.println("prefix" + strBackUrl);
//		byte[] pdf = PDFUtil.getCurrentPayInformationPDF(strBackUrl+"/currentPayInformation/currentPayInformationUnprotectedPDF", request);
//		response.reset();
//		response.setHeader("Content-Disposition", "attachment; filename=\"Current Pay Information.pdf\"");
//		response.setContentType("application/octet-stream;charset=UTF-8");
//		OutputStream out = response.getOutputStream();
//		out.write(pdf);
//		out.flush();
//	}
	
	@RequestMapping("currentPayInformationUnprotectedPDF")
	public ModelAndView getCurrentPayInformation(HttpServletRequest req, String empNbr, String districtId,String language) throws IOException {
		DataSourceContextHolder.setDataSourceType("java:jboss/DBNEW"+districtId);
		HttpSession session = req.getSession();
		ModelAndView mav = new ModelAndView();
		String employeeNumber = empNbr;
		BhrEmpDemo userDetail = this.indexService.getUserDetail(empNbr);
		session.setAttribute("userDetail", userDetail);
		District districtInfo = this.indexService.getDistrict(districtId);
		session.setAttribute("district", districtInfo);
		Map<Frequency, List<CurrentPayInformation>> jobs = this.service.getJob(employeeNumber);
		Map<Frequency, List<Stipend>> stipends = this.service.getStipends(employeeNumber);
		Map<Frequency, List<Account>> accounts = this.service.getAccounts(employeeNumber);
		List<Frequency> frequencies = this.service.getFrequencies(jobs);
		Map<Frequency, PayInfo> payInfos = this.service.retrievePayInfo(employeeNumber, frequencies);
		Map<Frequency, String> payCampuses = this.service.retrievePayCampuses(employeeNumber);
		EmployeeInfo employeeInfo = this.service.getEmployeeInfo(employeeNumber);
		mav.setViewName("/inquiry/currentPayInformation");
		String path = req.getSession().getServletContext().getRealPath("/") +"/static/js/lang/text-"+language+".json";
		File file = new File(path);
		String input = FileUtils.readFileToString(file, "UTF-8");
		JSONObject jsonObject = JSONObject.fromObject(input);
		req.getSession().setAttribute("languageJSON", jsonObject);
		mav.addObject("jobs", jobs);
		mav.addObject("stipends", stipends);
		mav.addObject("isPrintPDF", true);
		mav.addObject("accounts", accounts);
		mav.addObject("frequencies", frequencies);
		mav.addObject("payInfos", payInfos);
		mav.addObject("payCampuses", payCampuses);
		mav.addObject("employeeInfo", employeeInfo);
		return mav;
	}
	
	
	public PayPrint generatePayPrint(HttpServletRequest request, HttpServletResponse response)
	{
		PayPrint print = new PayPrint();
		District district = (District) request.getSession().getAttribute("district");
		BhrEmpDemo userDetail = (BhrEmpDemo) request.getSession().getAttribute("userDetail");
		print.setDname(district.getName());
		print.setDaddress(district.getAddress());
		print.setDcityst(district.getCity() + ", " + district.getState() + " " + district.getZip());
		
		if(district.getZip4()!=null && district.getZip4().length() > 0)
		{
			print.setDcityst(print.getDcityst() + "-" + district.getZip4());
		}
		
		String middleName = userDetail.getNameM();
		if (middleName!=null && (middleName.trim()).length() > 0) {
			middleName = middleName.trim() + " ";
		} else {
			middleName = "";
		}
		
		print.setEname(userDetail.getNameF() + " " + middleName + userDetail.getNameL() + " " + (userDetail.getGenDescription()==null?"":userDetail.getGenDescription()));
		print.setEaddress(StringUtil.trim(userDetail.getAddrNbr())+ " "+ StringUtil.trim(userDetail.getAddrStr()));
		String apt = StringUtil.trim(userDetail.getAddrApt());
		if(apt.length() > 0)
		{
			print.setEaddress(print.getEaddress() + " " + apt);
		}
		print.setEcityst(userDetail.getAddrCity() + ", " + userDetail.getAddrSt() + " " + userDetail.getAddrZip());
		
		if(userDetail.getAddrZip4()!=null && userDetail.getAddrZip4().length() > 0)
		{
			print.setEcityst(print.getEcityst() + "-" + userDetail.getAddrZip4());
		}
		
		print.setPhoneNumber(userDetail.getPhoneNbr());
		print.setEmployeeNumber(userDetail.getEmpNbr());
		if(userDetail.getDob()!=null && userDetail.getDob().length()>=8)
			print.setDateOfBirth(StringUtil.mid(userDetail.getDob(), 5, 2) + "-" + StringUtil.right(userDetail.getDob(), 2) + "-" + StringUtil.left(userDetail.getDob(), 4));
		else
			print.setDateOfBirth("");
		String gender;
		if (userDetail.getSex() == 'M') {
			gender = "Male";
		} else if (userDetail.getSex() == 'F') {
			gender = "Female";
		} else {
			gender = "";
		}
		print.setGender(gender);
		
		EmployeeInfo employeeInfo = this.service.getEmployeeInfo(userDetail.getEmpNbr());
		
		if (employeeInfo.getHighDegree() != null) {
			if (employeeInfo.getHighDegreeDescription()!= null) {
				print.setDegree(employeeInfo.getHighDegreeDescription());
			}
		}
		if (employeeInfo.getYrsProExper() != null) {
			print.setProExperience(employeeInfo.getYrsProExper());
		}
		if (employeeInfo.getYrsExpDist() != null) {
			print.setNonProExperience(employeeInfo.getYrsExpDist());
		}
		if (employeeInfo.getYrsProExperLoc() != null) {
			print.setProExperienceDistrict(employeeInfo.getYrsProExperLoc());
		}
		if (employeeInfo.getYrsExpDistLoc() != null) {
			print.setNonProExperienceDistrict(employeeInfo.getYrsExpDistLoc());
		}
		
		return print;
	}
}

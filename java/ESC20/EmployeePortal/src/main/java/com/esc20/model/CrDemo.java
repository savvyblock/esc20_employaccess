package com.esc20.model;
// Generated Jan 4, 2019 3:55:15 PM by Hibernate Tools 4.3.5.Final

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * CrDemo generated by hbm2java
 */
@Entity
@Table(name = "CR_DEMO", schema = "rsccc", catalog = "rsccc")
public class CrDemo implements java.io.Serializable {

	private CrDemoId id;
	private String campusName;
	private String strNbr;
	private String strName;
	private String cityName;
	private String tbCampusState;
	private String zip;
	private String zip4;
	private String phoneAreaCd;
	private String phoneNbr;
	private String grdRngLow;
	private String grdRngHi;
	private char schAccrdFlg;
	private String collegeBrdCampusCd;
	private char stuInfoAmtPrint;
	private char stuInfoTypeForm;
	private char nbrSemSch;
	private char inclCampusDelStu;
	private String distId;
	private char allowCampusDelStu;
	private char usingSubsidiaryCampuses;
	private String defaultAttendTrk;
	private String faxAc;
	private String faxNbr;
	private char demoRevWarn;
	private String whseRteNbr;
	private char exclDistRptng;
	private String campusType;
	private char sglSexIathl;
	private char sglSexAcadm;
	private char cplPunDiscpln;

	public CrDemo() {
	}

	public CrDemo(CrDemoId id, String campusName, String strNbr, String strName, String cityName, String tbCampusState,
			String zip, String zip4, String phoneAreaCd, String phoneNbr, String grdRngLow, String grdRngHi,
			char schAccrdFlg, String collegeBrdCampusCd, char stuInfoAmtPrint, char stuInfoTypeForm, char nbrSemSch,
			char inclCampusDelStu, String distId, char allowCampusDelStu, char usingSubsidiaryCampuses,
			String defaultAttendTrk, String faxAc, String faxNbr, char demoRevWarn, String whseRteNbr,
			char exclDistRptng, String campusType, char sglSexIathl, char sglSexAcadm, char cplPunDiscpln) {
		this.id = id;
		this.campusName = campusName;
		this.strNbr = strNbr;
		this.strName = strName;
		this.cityName = cityName;
		this.tbCampusState = tbCampusState;
		this.zip = zip;
		this.zip4 = zip4;
		this.phoneAreaCd = phoneAreaCd;
		this.phoneNbr = phoneNbr;
		this.grdRngLow = grdRngLow;
		this.grdRngHi = grdRngHi;
		this.schAccrdFlg = schAccrdFlg;
		this.collegeBrdCampusCd = collegeBrdCampusCd;
		this.stuInfoAmtPrint = stuInfoAmtPrint;
		this.stuInfoTypeForm = stuInfoTypeForm;
		this.nbrSemSch = nbrSemSch;
		this.inclCampusDelStu = inclCampusDelStu;
		this.distId = distId;
		this.allowCampusDelStu = allowCampusDelStu;
		this.usingSubsidiaryCampuses = usingSubsidiaryCampuses;
		this.defaultAttendTrk = defaultAttendTrk;
		this.faxAc = faxAc;
		this.faxNbr = faxNbr;
		this.demoRevWarn = demoRevWarn;
		this.whseRteNbr = whseRteNbr;
		this.exclDistRptng = exclDistRptng;
		this.campusType = campusType;
		this.sglSexIathl = sglSexIathl;
		this.sglSexAcadm = sglSexAcadm;
		this.cplPunDiscpln = cplPunDiscpln;
	}

	@EmbeddedId

	@AttributeOverrides({
			@AttributeOverride(name = "schYr", column = @Column(name = "SCH_YR", nullable = false, length = 4)),
			@AttributeOverride(name = "campusId", column = @Column(name = "CAMPUS_ID", nullable = false, length = 3)) })
	public CrDemoId getId() {
		return this.id;
	}

	public void setId(CrDemoId id) {
		this.id = id;
	}

	@Column(name = "CAMPUS_NAME", nullable = false, length = 34)
	public String getCampusName() {
		return this.campusName;
	}

	public void setCampusName(String campusName) {
		this.campusName = campusName;
	}

	@Column(name = "STR_NBR", nullable = false, length = 9)
	public String getStrNbr() {
		return this.strNbr;
	}

	public void setStrNbr(String strNbr) {
		this.strNbr = strNbr;
	}

	@Column(name = "STR_NAME", nullable = false, length = 19)
	public String getStrName() {
		return this.strName;
	}

	public void setStrName(String strName) {
		this.strName = strName;
	}

	@Column(name = "CITY_NAME", nullable = false, length = 17)
	public String getCityName() {
		return this.cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	@Column(name = "TB_CAMPUS_STATE", nullable = false, length = 2)
	public String getTbCampusState() {
		return this.tbCampusState;
	}

	public void setTbCampusState(String tbCampusState) {
		this.tbCampusState = tbCampusState;
	}

	@Column(name = "ZIP", nullable = false, length = 5)
	public String getZip() {
		return this.zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

	@Column(name = "ZIP4", nullable = false, length = 4)
	public String getZip4() {
		return this.zip4;
	}

	public void setZip4(String zip4) {
		this.zip4 = zip4;
	}

	@Column(name = "PHONE_AREA_CD", nullable = false, length = 3)
	public String getPhoneAreaCd() {
		return this.phoneAreaCd;
	}

	public void setPhoneAreaCd(String phoneAreaCd) {
		this.phoneAreaCd = phoneAreaCd;
	}

	@Column(name = "PHONE_NBR", nullable = false, length = 7)
	public String getPhoneNbr() {
		return this.phoneNbr;
	}

	public void setPhoneNbr(String phoneNbr) {
		this.phoneNbr = phoneNbr;
	}

	@Column(name = "GRD_RNG_LOW", nullable = false, length = 2)
	public String getGrdRngLow() {
		return this.grdRngLow;
	}

	public void setGrdRngLow(String grdRngLow) {
		this.grdRngLow = grdRngLow;
	}

	@Column(name = "GRD_RNG_HI", nullable = false, length = 2)
	public String getGrdRngHi() {
		return this.grdRngHi;
	}

	public void setGrdRngHi(String grdRngHi) {
		this.grdRngHi = grdRngHi;
	}

	@Column(name = "SCH_ACCRD_FLG", nullable = false, length = 1)
	public char getSchAccrdFlg() {
		return this.schAccrdFlg;
	}

	public void setSchAccrdFlg(char schAccrdFlg) {
		this.schAccrdFlg = schAccrdFlg;
	}

	@Column(name = "COLLEGE_BRD_CAMPUS_CD", nullable = false, length = 6)
	public String getCollegeBrdCampusCd() {
		return this.collegeBrdCampusCd;
	}

	public void setCollegeBrdCampusCd(String collegeBrdCampusCd) {
		this.collegeBrdCampusCd = collegeBrdCampusCd;
	}

	@Column(name = "STU_INFO_AMT_PRINT", nullable = false, length = 1)
	public char getStuInfoAmtPrint() {
		return this.stuInfoAmtPrint;
	}

	public void setStuInfoAmtPrint(char stuInfoAmtPrint) {
		this.stuInfoAmtPrint = stuInfoAmtPrint;
	}

	@Column(name = "STU_INFO_TYPE_FORM", nullable = false, length = 1)
	public char getStuInfoTypeForm() {
		return this.stuInfoTypeForm;
	}

	public void setStuInfoTypeForm(char stuInfoTypeForm) {
		this.stuInfoTypeForm = stuInfoTypeForm;
	}

	@Column(name = "NBR_SEM_SCH", nullable = false, length = 1)
	public char getNbrSemSch() {
		return this.nbrSemSch;
	}

	public void setNbrSemSch(char nbrSemSch) {
		this.nbrSemSch = nbrSemSch;
	}

	@Column(name = "INCL_CAMPUS_DEL_STU", nullable = false, length = 1)
	public char getInclCampusDelStu() {
		return this.inclCampusDelStu;
	}

	public void setInclCampusDelStu(char inclCampusDelStu) {
		this.inclCampusDelStu = inclCampusDelStu;
	}

	@Column(name = "DIST_ID", nullable = false, length = 6)
	public String getDistId() {
		return this.distId;
	}

	public void setDistId(String distId) {
		this.distId = distId;
	}

	@Column(name = "ALLOW_CAMPUS_DEL_STU", nullable = false, length = 1)
	public char getAllowCampusDelStu() {
		return this.allowCampusDelStu;
	}

	public void setAllowCampusDelStu(char allowCampusDelStu) {
		this.allowCampusDelStu = allowCampusDelStu;
	}

	@Column(name = "USING_SUBSIDIARY_CAMPUSES", nullable = false, length = 1)
	public char getUsingSubsidiaryCampuses() {
		return this.usingSubsidiaryCampuses;
	}

	public void setUsingSubsidiaryCampuses(char usingSubsidiaryCampuses) {
		this.usingSubsidiaryCampuses = usingSubsidiaryCampuses;
	}

	@Column(name = "DEFAULT_ATTEND_TRK", nullable = false, length = 2)
	public String getDefaultAttendTrk() {
		return this.defaultAttendTrk;
	}

	public void setDefaultAttendTrk(String defaultAttendTrk) {
		this.defaultAttendTrk = defaultAttendTrk;
	}

	@Column(name = "FAX_AC", nullable = false, length = 3)
	public String getFaxAc() {
		return this.faxAc;
	}

	public void setFaxAc(String faxAc) {
		this.faxAc = faxAc;
	}

	@Column(name = "FAX_NBR", nullable = false, length = 7)
	public String getFaxNbr() {
		return this.faxNbr;
	}

	public void setFaxNbr(String faxNbr) {
		this.faxNbr = faxNbr;
	}

	@Column(name = "DEMO_REV_WARN", nullable = false, length = 1)
	public char getDemoRevWarn() {
		return this.demoRevWarn;
	}

	public void setDemoRevWarn(char demoRevWarn) {
		this.demoRevWarn = demoRevWarn;
	}

	@Column(name = "WHSE_RTE_NBR", nullable = false, length = 3)
	public String getWhseRteNbr() {
		return this.whseRteNbr;
	}

	public void setWhseRteNbr(String whseRteNbr) {
		this.whseRteNbr = whseRteNbr;
	}

	@Column(name = "EXCL_DIST_RPTNG", nullable = false, length = 1)
	public char getExclDistRptng() {
		return this.exclDistRptng;
	}

	public void setExclDistRptng(char exclDistRptng) {
		this.exclDistRptng = exclDistRptng;
	}

	@Column(name = "CAMPUS_TYPE", nullable = false, length = 2)
	public String getCampusType() {
		return this.campusType;
	}

	public void setCampusType(String campusType) {
		this.campusType = campusType;
	}

	@Column(name = "SGL_SEX_IATHL", nullable = false, length = 1)
	public char getSglSexIathl() {
		return this.sglSexIathl;
	}

	public void setSglSexIathl(char sglSexIathl) {
		this.sglSexIathl = sglSexIathl;
	}

	@Column(name = "SGL_SEX_ACADM", nullable = false, length = 1)
	public char getSglSexAcadm() {
		return this.sglSexAcadm;
	}

	public void setSglSexAcadm(char sglSexAcadm) {
		this.sglSexAcadm = sglSexAcadm;
	}

	@Column(name = "CPL_PUN_DISCPLN", nullable = false, length = 1)
	public char getCplPunDiscpln() {
		return this.cplPunDiscpln;
	}

	public void setCplPunDiscpln(char cplPunDiscpln) {
		this.cplPunDiscpln = cplPunDiscpln;
	}

}
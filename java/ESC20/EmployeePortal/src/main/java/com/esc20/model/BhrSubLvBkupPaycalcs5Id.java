package com.esc20.model;
// Generated Jan 4, 2019 3:46:21 PM by Hibernate Tools 4.3.5.Final

import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * BhrSubLvBkupPaycalcs5Id generated by hbm2java
 */
@Embeddable
public class BhrSubLvBkupPaycalcs5Id implements java.io.Serializable {

	private char cyrNyrFlg;
	private char teachPayFreq;
	private String teachEmpNbr;
	private String teachDtOfPay;
	private short teachLvSeq;
	private char suppPayFreq;
	private String suppEmpNbr;
	private String suppDtOfPay;
	private String suppDts;
	private String suppSeqNbr;
	private char subPayFreq;
	private String subEmpNbr;
	private String subDtOfPay;
	private char glFileId;
	private String fund;
	private String func;
	private String obj;
	private String sobj;
	private String org;
	private char fsclYr;
	private String pgm;
	private char edSpan;
	private String projDtl;
	private BigDecimal teachLvUnitsUsed;
	private char tmOfDay;
	private char wrkComp;
	private String subTyp;
	private String campusId;
	private char dept;
	private String trsGrantCd;
	private BigDecimal payAmt;
	private String dtCreate;
	private String dtLUpdate;
	private String absRsn;
	private String dtOfAbs;
	private String userId;
	private char taxedBenefitFlg;
	private char expense373;
	private String processDt;
	private BigDecimal unitsPerDay;
	private String module;
	private BigDecimal actHrs;
	private String actDt;
	private String lvTyp;

	public BhrSubLvBkupPaycalcs5Id() {
	}

	public BhrSubLvBkupPaycalcs5Id(char cyrNyrFlg, char teachPayFreq, String teachEmpNbr, String teachDtOfPay,
			short teachLvSeq, char suppPayFreq, String suppEmpNbr, String suppDtOfPay, String suppDts,
			String suppSeqNbr, char subPayFreq, String subEmpNbr, String subDtOfPay, char glFileId, String fund,
			String func, String obj, String sobj, String org, char fsclYr, String pgm, char edSpan, String projDtl,
			BigDecimal teachLvUnitsUsed, char tmOfDay, char wrkComp, String subTyp, String campusId, char dept,
			String trsGrantCd, BigDecimal payAmt, String dtCreate, String dtLUpdate, String absRsn, String dtOfAbs,
			String userId, char taxedBenefitFlg, char expense373, String processDt, BigDecimal unitsPerDay,
			String module, BigDecimal actHrs, String actDt, String lvTyp) {
		this.cyrNyrFlg = cyrNyrFlg;
		this.teachPayFreq = teachPayFreq;
		this.teachEmpNbr = teachEmpNbr;
		this.teachDtOfPay = teachDtOfPay;
		this.teachLvSeq = teachLvSeq;
		this.suppPayFreq = suppPayFreq;
		this.suppEmpNbr = suppEmpNbr;
		this.suppDtOfPay = suppDtOfPay;
		this.suppDts = suppDts;
		this.suppSeqNbr = suppSeqNbr;
		this.subPayFreq = subPayFreq;
		this.subEmpNbr = subEmpNbr;
		this.subDtOfPay = subDtOfPay;
		this.glFileId = glFileId;
		this.fund = fund;
		this.func = func;
		this.obj = obj;
		this.sobj = sobj;
		this.org = org;
		this.fsclYr = fsclYr;
		this.pgm = pgm;
		this.edSpan = edSpan;
		this.projDtl = projDtl;
		this.teachLvUnitsUsed = teachLvUnitsUsed;
		this.tmOfDay = tmOfDay;
		this.wrkComp = wrkComp;
		this.subTyp = subTyp;
		this.campusId = campusId;
		this.dept = dept;
		this.trsGrantCd = trsGrantCd;
		this.payAmt = payAmt;
		this.dtCreate = dtCreate;
		this.dtLUpdate = dtLUpdate;
		this.absRsn = absRsn;
		this.dtOfAbs = dtOfAbs;
		this.userId = userId;
		this.taxedBenefitFlg = taxedBenefitFlg;
		this.expense373 = expense373;
		this.processDt = processDt;
		this.unitsPerDay = unitsPerDay;
		this.module = module;
		this.actHrs = actHrs;
		this.actDt = actDt;
		this.lvTyp = lvTyp;
	}

	@Column(name = "CYR_NYR_FLG", nullable = false, length = 1)
	public char getCyrNyrFlg() {
		return this.cyrNyrFlg;
	}

	public void setCyrNyrFlg(char cyrNyrFlg) {
		this.cyrNyrFlg = cyrNyrFlg;
	}

	@Column(name = "TEACH_PAY_FREQ", nullable = false, length = 1)
	public char getTeachPayFreq() {
		return this.teachPayFreq;
	}

	public void setTeachPayFreq(char teachPayFreq) {
		this.teachPayFreq = teachPayFreq;
	}

	@Column(name = "TEACH_EMP_NBR", nullable = false, length = 6)
	public String getTeachEmpNbr() {
		return this.teachEmpNbr;
	}

	public void setTeachEmpNbr(String teachEmpNbr) {
		this.teachEmpNbr = teachEmpNbr;
	}

	@Column(name = "TEACH_DT_OF_PAY", nullable = false, length = 8)
	public String getTeachDtOfPay() {
		return this.teachDtOfPay;
	}

	public void setTeachDtOfPay(String teachDtOfPay) {
		this.teachDtOfPay = teachDtOfPay;
	}

	@Column(name = "TEACH_LV_SEQ", nullable = false, precision = 3, scale = 0)
	public short getTeachLvSeq() {
		return this.teachLvSeq;
	}

	public void setTeachLvSeq(short teachLvSeq) {
		this.teachLvSeq = teachLvSeq;
	}

	@Column(name = "SUPP_PAY_FREQ", nullable = false, length = 1)
	public char getSuppPayFreq() {
		return this.suppPayFreq;
	}

	public void setSuppPayFreq(char suppPayFreq) {
		this.suppPayFreq = suppPayFreq;
	}

	@Column(name = "SUPP_EMP_NBR", nullable = false, length = 6)
	public String getSuppEmpNbr() {
		return this.suppEmpNbr;
	}

	public void setSuppEmpNbr(String suppEmpNbr) {
		this.suppEmpNbr = suppEmpNbr;
	}

	@Column(name = "SUPP_DT_OF_PAY", nullable = false, length = 8)
	public String getSuppDtOfPay() {
		return this.suppDtOfPay;
	}

	public void setSuppDtOfPay(String suppDtOfPay) {
		this.suppDtOfPay = suppDtOfPay;
	}

	@Column(name = "SUPP_DTS", nullable = false, length = 16)
	public String getSuppDts() {
		return this.suppDts;
	}

	public void setSuppDts(String suppDts) {
		this.suppDts = suppDts;
	}

	@Column(name = "SUPP_SEQ_NBR", nullable = false, length = 5)
	public String getSuppSeqNbr() {
		return this.suppSeqNbr;
	}

	public void setSuppSeqNbr(String suppSeqNbr) {
		this.suppSeqNbr = suppSeqNbr;
	}

	@Column(name = "SUB_PAY_FREQ", nullable = false, length = 1)
	public char getSubPayFreq() {
		return this.subPayFreq;
	}

	public void setSubPayFreq(char subPayFreq) {
		this.subPayFreq = subPayFreq;
	}

	@Column(name = "SUB_EMP_NBR", nullable = false, length = 6)
	public String getSubEmpNbr() {
		return this.subEmpNbr;
	}

	public void setSubEmpNbr(String subEmpNbr) {
		this.subEmpNbr = subEmpNbr;
	}

	@Column(name = "SUB_DT_OF_PAY", nullable = false, length = 8)
	public String getSubDtOfPay() {
		return this.subDtOfPay;
	}

	public void setSubDtOfPay(String subDtOfPay) {
		this.subDtOfPay = subDtOfPay;
	}

	@Column(name = "GL_FILE_ID", nullable = false, length = 1)
	public char getGlFileId() {
		return this.glFileId;
	}

	public void setGlFileId(char glFileId) {
		this.glFileId = glFileId;
	}

	@Column(name = "FUND", nullable = false, length = 3)
	public String getFund() {
		return this.fund;
	}

	public void setFund(String fund) {
		this.fund = fund;
	}

	@Column(name = "FUNC", nullable = false, length = 2)
	public String getFunc() {
		return this.func;
	}

	public void setFunc(String func) {
		this.func = func;
	}

	@Column(name = "OBJ", nullable = false, length = 4)
	public String getObj() {
		return this.obj;
	}

	public void setObj(String obj) {
		this.obj = obj;
	}

	@Column(name = "SOBJ", nullable = false, length = 2)
	public String getSobj() {
		return this.sobj;
	}

	public void setSobj(String sobj) {
		this.sobj = sobj;
	}

	@Column(name = "ORG", nullable = false, length = 3)
	public String getOrg() {
		return this.org;
	}

	public void setOrg(String org) {
		this.org = org;
	}

	@Column(name = "FSCL_YR", nullable = false, length = 1)
	public char getFsclYr() {
		return this.fsclYr;
	}

	public void setFsclYr(char fsclYr) {
		this.fsclYr = fsclYr;
	}

	@Column(name = "PGM", nullable = false, length = 2)
	public String getPgm() {
		return this.pgm;
	}

	public void setPgm(String pgm) {
		this.pgm = pgm;
	}

	@Column(name = "ED_SPAN", nullable = false, length = 1)
	public char getEdSpan() {
		return this.edSpan;
	}

	public void setEdSpan(char edSpan) {
		this.edSpan = edSpan;
	}

	@Column(name = "PROJ_DTL", nullable = false, length = 2)
	public String getProjDtl() {
		return this.projDtl;
	}

	public void setProjDtl(String projDtl) {
		this.projDtl = projDtl;
	}

	@Column(name = "TEACH_LV_UNITS_USED", nullable = false, precision = 7, scale = 3)
	public BigDecimal getTeachLvUnitsUsed() {
		return this.teachLvUnitsUsed;
	}

	public void setTeachLvUnitsUsed(BigDecimal teachLvUnitsUsed) {
		this.teachLvUnitsUsed = teachLvUnitsUsed;
	}

	@Column(name = "TM_OF_DAY", nullable = false, length = 1)
	public char getTmOfDay() {
		return this.tmOfDay;
	}

	public void setTmOfDay(char tmOfDay) {
		this.tmOfDay = tmOfDay;
	}

	@Column(name = "WRK_COMP", nullable = false, length = 1)
	public char getWrkComp() {
		return this.wrkComp;
	}

	public void setWrkComp(char wrkComp) {
		this.wrkComp = wrkComp;
	}

	@Column(name = "SUB_TYP", nullable = false, length = 2)
	public String getSubTyp() {
		return this.subTyp;
	}

	public void setSubTyp(String subTyp) {
		this.subTyp = subTyp;
	}

	@Column(name = "CAMPUS_ID", nullable = false, length = 3)
	public String getCampusId() {
		return this.campusId;
	}

	public void setCampusId(String campusId) {
		this.campusId = campusId;
	}

	@Column(name = "DEPT", nullable = false, length = 1)
	public char getDept() {
		return this.dept;
	}

	public void setDept(char dept) {
		this.dept = dept;
	}

	@Column(name = "TRS_GRANT_CD", nullable = false, length = 2)
	public String getTrsGrantCd() {
		return this.trsGrantCd;
	}

	public void setTrsGrantCd(String trsGrantCd) {
		this.trsGrantCd = trsGrantCd;
	}

	@Column(name = "PAY_AMT", nullable = false, precision = 5)
	public BigDecimal getPayAmt() {
		return this.payAmt;
	}

	public void setPayAmt(BigDecimal payAmt) {
		this.payAmt = payAmt;
	}

	@Column(name = "DT_CREATE", nullable = false, length = 8)
	public String getDtCreate() {
		return this.dtCreate;
	}

	public void setDtCreate(String dtCreate) {
		this.dtCreate = dtCreate;
	}

	@Column(name = "DT_L_UPDATE", nullable = false, length = 8)
	public String getDtLUpdate() {
		return this.dtLUpdate;
	}

	public void setDtLUpdate(String dtLUpdate) {
		this.dtLUpdate = dtLUpdate;
	}

	@Column(name = "ABS_RSN", nullable = false, length = 2)
	public String getAbsRsn() {
		return this.absRsn;
	}

	public void setAbsRsn(String absRsn) {
		this.absRsn = absRsn;
	}

	@Column(name = "DT_OF_ABS", nullable = false, length = 8)
	public String getDtOfAbs() {
		return this.dtOfAbs;
	}

	public void setDtOfAbs(String dtOfAbs) {
		this.dtOfAbs = dtOfAbs;
	}

	@Column(name = "USER_ID", nullable = false, length = 12)
	public String getUserId() {
		return this.userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	@Column(name = "TAXED_BENEFIT_FLG", nullable = false, length = 1)
	public char getTaxedBenefitFlg() {
		return this.taxedBenefitFlg;
	}

	public void setTaxedBenefitFlg(char taxedBenefitFlg) {
		this.taxedBenefitFlg = taxedBenefitFlg;
	}

	@Column(name = "EXPENSE_373", nullable = false, length = 1)
	public char getExpense373() {
		return this.expense373;
	}

	public void setExpense373(char expense373) {
		this.expense373 = expense373;
	}

	@Column(name = "PROCESS_DT", nullable = false, length = 8)
	public String getProcessDt() {
		return this.processDt;
	}

	public void setProcessDt(String processDt) {
		this.processDt = processDt;
	}

	@Column(name = "UNITS_PER_DAY", nullable = false, precision = 3, scale = 1)
	public BigDecimal getUnitsPerDay() {
		return this.unitsPerDay;
	}

	public void setUnitsPerDay(BigDecimal unitsPerDay) {
		this.unitsPerDay = unitsPerDay;
	}

	@Column(name = "MODULE", nullable = false, length = 25)
	public String getModule() {
		return this.module;
	}

	public void setModule(String module) {
		this.module = module;
	}

	@Column(name = "ACT_HRS", nullable = false, precision = 5)
	public BigDecimal getActHrs() {
		return this.actHrs;
	}

	public void setActHrs(BigDecimal actHrs) {
		this.actHrs = actHrs;
	}

	@Column(name = "ACT_DT", nullable = false, length = 8)
	public String getActDt() {
		return this.actDt;
	}

	public void setActDt(String actDt) {
		this.actDt = actDt;
	}

	@Column(name = "LV_TYP", nullable = false, length = 2)
	public String getLvTyp() {
		return this.lvTyp;
	}

	public void setLvTyp(String lvTyp) {
		this.lvTyp = lvTyp;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof BhrSubLvBkupPaycalcs5Id))
			return false;
		BhrSubLvBkupPaycalcs5Id castOther = (BhrSubLvBkupPaycalcs5Id) other;

		return (this.getCyrNyrFlg() == castOther.getCyrNyrFlg())
				&& (this.getTeachPayFreq() == castOther.getTeachPayFreq())
				&& ((this.getTeachEmpNbr() == castOther.getTeachEmpNbr())
						|| (this.getTeachEmpNbr() != null && castOther.getTeachEmpNbr() != null
								&& this.getTeachEmpNbr().equals(castOther.getTeachEmpNbr())))
				&& ((this.getTeachDtOfPay() == castOther.getTeachDtOfPay())
						|| (this.getTeachDtOfPay() != null && castOther.getTeachDtOfPay() != null
								&& this.getTeachDtOfPay().equals(castOther.getTeachDtOfPay())))
				&& (this.getTeachLvSeq() == castOther.getTeachLvSeq())
				&& (this.getSuppPayFreq() == castOther.getSuppPayFreq())
				&& ((this.getSuppEmpNbr() == castOther.getSuppEmpNbr()) || (this.getSuppEmpNbr() != null
						&& castOther.getSuppEmpNbr() != null && this.getSuppEmpNbr().equals(castOther.getSuppEmpNbr())))
				&& ((this.getSuppDtOfPay() == castOther.getSuppDtOfPay())
						|| (this.getSuppDtOfPay() != null && castOther.getSuppDtOfPay() != null
								&& this.getSuppDtOfPay().equals(castOther.getSuppDtOfPay())))
				&& ((this.getSuppDts() == castOther.getSuppDts()) || (this.getSuppDts() != null
						&& castOther.getSuppDts() != null && this.getSuppDts().equals(castOther.getSuppDts())))
				&& ((this.getSuppSeqNbr() == castOther.getSuppSeqNbr()) || (this.getSuppSeqNbr() != null
						&& castOther.getSuppSeqNbr() != null && this.getSuppSeqNbr().equals(castOther.getSuppSeqNbr())))
				&& (this.getSubPayFreq() == castOther.getSubPayFreq())
				&& ((this.getSubEmpNbr() == castOther.getSubEmpNbr()) || (this.getSubEmpNbr() != null
						&& castOther.getSubEmpNbr() != null && this.getSubEmpNbr().equals(castOther.getSubEmpNbr())))
				&& ((this.getSubDtOfPay() == castOther.getSubDtOfPay()) || (this.getSubDtOfPay() != null
						&& castOther.getSubDtOfPay() != null && this.getSubDtOfPay().equals(castOther.getSubDtOfPay())))
				&& (this.getGlFileId() == castOther.getGlFileId())
				&& ((this.getFund() == castOther.getFund()) || (this.getFund() != null && castOther.getFund() != null
						&& this.getFund().equals(castOther.getFund())))
				&& ((this.getFunc() == castOther.getFunc()) || (this.getFunc() != null && castOther.getFunc() != null
						&& this.getFunc().equals(castOther.getFunc())))
				&& ((this.getObj() == castOther.getObj()) || (this.getObj() != null && castOther.getObj() != null
						&& this.getObj().equals(castOther.getObj())))
				&& ((this.getSobj() == castOther.getSobj()) || (this.getSobj() != null && castOther.getSobj() != null
						&& this.getSobj().equals(castOther.getSobj())))
				&& ((this.getOrg() == castOther.getOrg()) || (this.getOrg() != null
						&& castOther.getOrg() != null && this.getOrg().equals(castOther.getOrg())))
				&& (this.getFsclYr() == castOther.getFsclYr())
				&& ((this.getPgm() == castOther.getPgm()) || (this.getPgm() != null
						&& castOther.getPgm() != null && this.getPgm().equals(castOther.getPgm())))
				&& (this.getEdSpan() == castOther.getEdSpan())
				&& ((this.getProjDtl() == castOther.getProjDtl()) || (this.getProjDtl() != null
						&& castOther.getProjDtl() != null && this.getProjDtl().equals(castOther.getProjDtl())))
				&& ((this.getTeachLvUnitsUsed() == castOther.getTeachLvUnitsUsed())
						|| (this.getTeachLvUnitsUsed() != null && castOther.getTeachLvUnitsUsed() != null
								&& this.getTeachLvUnitsUsed().equals(castOther.getTeachLvUnitsUsed())))
				&& (this.getTmOfDay() == castOther.getTmOfDay()) && (this.getWrkComp() == castOther.getWrkComp())
				&& ((this.getSubTyp() == castOther.getSubTyp()) || (this.getSubTyp() != null
						&& castOther.getSubTyp() != null && this.getSubTyp().equals(castOther.getSubTyp())))
				&& ((this.getCampusId() == castOther.getCampusId()) || (this.getCampusId() != null
						&& castOther.getCampusId() != null && this.getCampusId().equals(castOther.getCampusId())))
				&& (this.getDept() == castOther.getDept())
				&& ((this.getTrsGrantCd() == castOther.getTrsGrantCd()) || (this.getTrsGrantCd() != null
						&& castOther.getTrsGrantCd() != null && this.getTrsGrantCd().equals(castOther.getTrsGrantCd())))
				&& ((this.getPayAmt() == castOther.getPayAmt()) || (this.getPayAmt() != null
						&& castOther.getPayAmt() != null && this.getPayAmt().equals(castOther.getPayAmt())))
				&& ((this.getDtCreate() == castOther.getDtCreate()) || (this.getDtCreate() != null
						&& castOther.getDtCreate() != null && this.getDtCreate().equals(castOther.getDtCreate())))
				&& ((this.getDtLUpdate() == castOther.getDtLUpdate()) || (this.getDtLUpdate() != null
						&& castOther.getDtLUpdate() != null && this.getDtLUpdate().equals(castOther.getDtLUpdate())))
				&& ((this.getAbsRsn() == castOther.getAbsRsn()) || (this.getAbsRsn() != null
						&& castOther.getAbsRsn() != null && this.getAbsRsn().equals(castOther.getAbsRsn())))
				&& ((this.getDtOfAbs() == castOther.getDtOfAbs()) || (this.getDtOfAbs() != null
						&& castOther.getDtOfAbs() != null && this.getDtOfAbs().equals(castOther.getDtOfAbs())))
				&& ((this.getUserId() == castOther.getUserId()) || (this.getUserId() != null
						&& castOther.getUserId() != null && this.getUserId().equals(castOther.getUserId())))
				&& (this.getTaxedBenefitFlg() == castOther.getTaxedBenefitFlg())
				&& (this.getExpense373() == castOther.getExpense373())
				&& ((this.getProcessDt() == castOther.getProcessDt()) || (this.getProcessDt() != null
						&& castOther.getProcessDt() != null && this.getProcessDt().equals(castOther.getProcessDt())))
				&& ((this.getUnitsPerDay() == castOther.getUnitsPerDay())
						|| (this.getUnitsPerDay() != null && castOther.getUnitsPerDay() != null
								&& this.getUnitsPerDay().equals(castOther.getUnitsPerDay())))
				&& ((this.getModule() == castOther.getModule()) || (this.getModule() != null
						&& castOther.getModule() != null && this.getModule().equals(castOther.getModule())))
				&& ((this.getActHrs() == castOther.getActHrs()) || (this.getActHrs() != null
						&& castOther.getActHrs() != null && this.getActHrs().equals(castOther.getActHrs())))
				&& ((this.getActDt() == castOther.getActDt()) || (this.getActDt() != null
						&& castOther.getActDt() != null && this.getActDt().equals(castOther.getActDt())))
				&& ((this.getLvTyp() == castOther.getLvTyp()) || (this.getLvTyp() != null
						&& castOther.getLvTyp() != null && this.getLvTyp().equals(castOther.getLvTyp())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getCyrNyrFlg();
		result = 37 * result + this.getTeachPayFreq();
		result = 37 * result + (getTeachEmpNbr() == null ? 0 : this.getTeachEmpNbr().hashCode());
		result = 37 * result + (getTeachDtOfPay() == null ? 0 : this.getTeachDtOfPay().hashCode());
		result = 37 * result + this.getTeachLvSeq();
		result = 37 * result + this.getSuppPayFreq();
		result = 37 * result + (getSuppEmpNbr() == null ? 0 : this.getSuppEmpNbr().hashCode());
		result = 37 * result + (getSuppDtOfPay() == null ? 0 : this.getSuppDtOfPay().hashCode());
		result = 37 * result + (getSuppDts() == null ? 0 : this.getSuppDts().hashCode());
		result = 37 * result + (getSuppSeqNbr() == null ? 0 : this.getSuppSeqNbr().hashCode());
		result = 37 * result + this.getSubPayFreq();
		result = 37 * result + (getSubEmpNbr() == null ? 0 : this.getSubEmpNbr().hashCode());
		result = 37 * result + (getSubDtOfPay() == null ? 0 : this.getSubDtOfPay().hashCode());
		result = 37 * result + this.getGlFileId();
		result = 37 * result + (getFund() == null ? 0 : this.getFund().hashCode());
		result = 37 * result + (getFunc() == null ? 0 : this.getFunc().hashCode());
		result = 37 * result + (getObj() == null ? 0 : this.getObj().hashCode());
		result = 37 * result + (getSobj() == null ? 0 : this.getSobj().hashCode());
		result = 37 * result + (getOrg() == null ? 0 : this.getOrg().hashCode());
		result = 37 * result + this.getFsclYr();
		result = 37 * result + (getPgm() == null ? 0 : this.getPgm().hashCode());
		result = 37 * result + this.getEdSpan();
		result = 37 * result + (getProjDtl() == null ? 0 : this.getProjDtl().hashCode());
		result = 37 * result + (getTeachLvUnitsUsed() == null ? 0 : this.getTeachLvUnitsUsed().hashCode());
		result = 37 * result + this.getTmOfDay();
		result = 37 * result + this.getWrkComp();
		result = 37 * result + (getSubTyp() == null ? 0 : this.getSubTyp().hashCode());
		result = 37 * result + (getCampusId() == null ? 0 : this.getCampusId().hashCode());
		result = 37 * result + this.getDept();
		result = 37 * result + (getTrsGrantCd() == null ? 0 : this.getTrsGrantCd().hashCode());
		result = 37 * result + (getPayAmt() == null ? 0 : this.getPayAmt().hashCode());
		result = 37 * result + (getDtCreate() == null ? 0 : this.getDtCreate().hashCode());
		result = 37 * result + (getDtLUpdate() == null ? 0 : this.getDtLUpdate().hashCode());
		result = 37 * result + (getAbsRsn() == null ? 0 : this.getAbsRsn().hashCode());
		result = 37 * result + (getDtOfAbs() == null ? 0 : this.getDtOfAbs().hashCode());
		result = 37 * result + (getUserId() == null ? 0 : this.getUserId().hashCode());
		result = 37 * result + this.getTaxedBenefitFlg();
		result = 37 * result + this.getExpense373();
		result = 37 * result + (getProcessDt() == null ? 0 : this.getProcessDt().hashCode());
		result = 37 * result + (getUnitsPerDay() == null ? 0 : this.getUnitsPerDay().hashCode());
		result = 37 * result + (getModule() == null ? 0 : this.getModule().hashCode());
		result = 37 * result + (getActHrs() == null ? 0 : this.getActHrs().hashCode());
		result = 37 * result + (getActDt() == null ? 0 : this.getActDt().hashCode());
		result = 37 * result + (getLvTyp() == null ? 0 : this.getLvTyp().hashCode());
		return result;
	}

}
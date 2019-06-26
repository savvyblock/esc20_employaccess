package com.esc20.model;
// Generated Jan 4, 2019 3:36:55 PM by Hibernate Tools 4.3.5.Final

import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * BhrActHrsWrkedBkupPaycalcs5Id generated by hbm2java
 */
@Embeddable
public class BhrActHrsWrkedBkupPaycalcs5Id implements java.io.Serializable {
	private static final long serialVersionUID = 6715142900654758429L;
	private char cyrNyrFlg;
	private char payFreq;
	private String empNbr;
	private String dtOfPay;
	private String actDt;
	private BigDecimal actHrs;
	private String trsMon;
	private String module;
	private String jobCd;

	public BhrActHrsWrkedBkupPaycalcs5Id() {
	}

	public BhrActHrsWrkedBkupPaycalcs5Id(char cyrNyrFlg, char payFreq, String empNbr, String dtOfPay, String actDt,
			BigDecimal actHrs, String trsMon, String module, String jobCd) {
		this.cyrNyrFlg = cyrNyrFlg;
		this.payFreq = payFreq;
		this.empNbr = empNbr;
		this.dtOfPay = dtOfPay;
		this.actDt = actDt;
		this.actHrs = actHrs;
		this.trsMon = trsMon;
		this.module = module;
		this.jobCd = jobCd;
	}

	@Column(name = "CYR_NYR_FLG", nullable = false, length = 1)
	public char getCyrNyrFlg() {
		return this.cyrNyrFlg;
	}

	public void setCyrNyrFlg(char cyrNyrFlg) {
		this.cyrNyrFlg = cyrNyrFlg;
	}

	@Column(name = "PAY_FREQ", nullable = false, length = 1)
	public char getPayFreq() {
		return this.payFreq;
	}

	public void setPayFreq(char payFreq) {
		this.payFreq = payFreq;
	}

	@Column(name = "EMP_NBR", nullable = false, length = 6)
	public String getEmpNbr() {
		return this.empNbr;
	}

	public void setEmpNbr(String empNbr) {
		this.empNbr = empNbr;
	}

	@Column(name = "DT_OF_PAY", nullable = false, length = 8)
	public String getDtOfPay() {
		return this.dtOfPay;
	}

	public void setDtOfPay(String dtOfPay) {
		this.dtOfPay = dtOfPay;
	}

	@Column(name = "ACT_DT", nullable = false, length = 8)
	public String getActDt() {
		return this.actDt;
	}

	public void setActDt(String actDt) {
		this.actDt = actDt;
	}

	@Column(name = "ACT_HRS", nullable = false, precision = 5)
	public BigDecimal getActHrs() {
		return this.actHrs;
	}

	public void setActHrs(BigDecimal actHrs) {
		this.actHrs = actHrs;
	}

	@Column(name = "TRS_MON", nullable = false, length = 2)
	public String getTrsMon() {
		return this.trsMon;
	}

	public void setTrsMon(String trsMon) {
		this.trsMon = trsMon;
	}

	@Column(name = "MODULE", nullable = false, length = 25)
	public String getModule() {
		return this.module;
	}

	public void setModule(String module) {
		this.module = module;
	}

	@Column(name = "JOB_CD", nullable = false, length = 4)
	public String getJobCd() {
		return this.jobCd;
	}

	public void setJobCd(String jobCd) {
		this.jobCd = jobCd;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof BhrActHrsWrkedBkupPaycalcs5Id))
			return false;
		BhrActHrsWrkedBkupPaycalcs5Id castOther = (BhrActHrsWrkedBkupPaycalcs5Id) other;

		return (this.getCyrNyrFlg() == castOther.getCyrNyrFlg()) && (this.getPayFreq() == castOther.getPayFreq())
				&& ((this.getEmpNbr() == castOther.getEmpNbr()) || (this.getEmpNbr() != null
						&& castOther.getEmpNbr() != null && this.getEmpNbr().equals(castOther.getEmpNbr())))
				&& ((this.getDtOfPay() == castOther.getDtOfPay()) || (this.getDtOfPay() != null
						&& castOther.getDtOfPay() != null && this.getDtOfPay().equals(castOther.getDtOfPay())))
				&& ((this.getActDt() == castOther.getActDt()) || (this.getActDt() != null
						&& castOther.getActDt() != null && this.getActDt().equals(castOther.getActDt())))
				&& ((this.getActHrs() == castOther.getActHrs()) || (this.getActHrs() != null
						&& castOther.getActHrs() != null && this.getActHrs().equals(castOther.getActHrs())))
				&& ((this.getTrsMon() == castOther.getTrsMon()) || (this.getTrsMon() != null
						&& castOther.getTrsMon() != null && this.getTrsMon().equals(castOther.getTrsMon())))
				&& ((this.getModule() == castOther.getModule()) || (this.getModule() != null
						&& castOther.getModule() != null && this.getModule().equals(castOther.getModule())))
				&& ((this.getJobCd() == castOther.getJobCd()) || (this.getJobCd() != null
						&& castOther.getJobCd() != null && this.getJobCd().equals(castOther.getJobCd())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getCyrNyrFlg();
		result = 37 * result + this.getPayFreq();
		result = 37 * result + (getEmpNbr() == null ? 0 : this.getEmpNbr().hashCode());
		result = 37 * result + (getDtOfPay() == null ? 0 : this.getDtOfPay().hashCode());
		result = 37 * result + (getActDt() == null ? 0 : this.getActDt().hashCode());
		result = 37 * result + (getActHrs() == null ? 0 : this.getActHrs().hashCode());
		result = 37 * result + (getTrsMon() == null ? 0 : this.getTrsMon().hashCode());
		result = 37 * result + (getModule() == null ? 0 : this.getModule().hashCode());
		result = 37 * result + (getJobCd() == null ? 0 : this.getJobCd().hashCode());
		return result;
	}

}
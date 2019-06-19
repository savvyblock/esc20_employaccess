package com.esc20.model;
// Generated Jan 4, 2019 3:53:34 PM by Hibernate Tools 4.3.5.Final

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * BthrPayDatesBkupPaycalcs5Id generated by hbm2java
 */
@Embeddable
public class BthrPayDatesBkupPaycalcs5Id implements java.io.Serializable {

	private char payFreq;
	private String dtOfPay;
	private String dtPayperBeg;
	private String dtPayperEnd;
	private String trsMonth;
	private char twcQtr;
	private char useAltAddr;
	private String module;
	private String lvReqCutoffDt;
	private String lvLastAprvDt;

	public BthrPayDatesBkupPaycalcs5Id() {
	}

	public BthrPayDatesBkupPaycalcs5Id(char payFreq, String dtOfPay, String dtPayperBeg, String dtPayperEnd,
			String trsMonth, char twcQtr, char useAltAddr, String module, String lvReqCutoffDt, String lvLastAprvDt) {
		this.payFreq = payFreq;
		this.dtOfPay = dtOfPay;
		this.dtPayperBeg = dtPayperBeg;
		this.dtPayperEnd = dtPayperEnd;
		this.trsMonth = trsMonth;
		this.twcQtr = twcQtr;
		this.useAltAddr = useAltAddr;
		this.module = module;
		this.lvReqCutoffDt = lvReqCutoffDt;
		this.lvLastAprvDt = lvLastAprvDt;
	}

	@Column(name = "PAY_FREQ", nullable = false, length = 1)
	public char getPayFreq() {
		return this.payFreq;
	}

	public void setPayFreq(char payFreq) {
		this.payFreq = payFreq;
	}

	@Column(name = "DT_OF_PAY", nullable = false, length = 8)
	public String getDtOfPay() {
		return this.dtOfPay;
	}

	public void setDtOfPay(String dtOfPay) {
		this.dtOfPay = dtOfPay;
	}

	@Column(name = "DT_PAYPER_BEG", nullable = false, length = 8)
	public String getDtPayperBeg() {
		return this.dtPayperBeg;
	}

	public void setDtPayperBeg(String dtPayperBeg) {
		this.dtPayperBeg = dtPayperBeg;
	}

	@Column(name = "DT_PAYPER_END", nullable = false, length = 8)
	public String getDtPayperEnd() {
		return this.dtPayperEnd;
	}

	public void setDtPayperEnd(String dtPayperEnd) {
		this.dtPayperEnd = dtPayperEnd;
	}

	@Column(name = "TRS_MONTH", nullable = false, length = 2)
	public String getTrsMonth() {
		return this.trsMonth;
	}

	public void setTrsMonth(String trsMonth) {
		this.trsMonth = trsMonth;
	}

	@Column(name = "TWC_QTR", nullable = false, length = 1)
	public char getTwcQtr() {
		return this.twcQtr;
	}

	public void setTwcQtr(char twcQtr) {
		this.twcQtr = twcQtr;
	}

	@Column(name = "USE_ALT_ADDR", nullable = false, length = 1)
	public char getUseAltAddr() {
		return this.useAltAddr;
	}

	public void setUseAltAddr(char useAltAddr) {
		this.useAltAddr = useAltAddr;
	}

	@Column(name = "MODULE", nullable = false, length = 25)
	public String getModule() {
		return this.module;
	}

	public void setModule(String module) {
		this.module = module;
	}

	@Column(name = "LV_REQ_CUTOFF_DT", nullable = false, length = 8)
	public String getLvReqCutoffDt() {
		return this.lvReqCutoffDt;
	}

	public void setLvReqCutoffDt(String lvReqCutoffDt) {
		this.lvReqCutoffDt = lvReqCutoffDt;
	}

	@Column(name = "LV_LAST_APRV_DT", nullable = false, length = 8)
	public String getLvLastAprvDt() {
		return this.lvLastAprvDt;
	}

	public void setLvLastAprvDt(String lvLastAprvDt) {
		this.lvLastAprvDt = lvLastAprvDt;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof BthrPayDatesBkupPaycalcs5Id))
			return false;
		BthrPayDatesBkupPaycalcs5Id castOther = (BthrPayDatesBkupPaycalcs5Id) other;

		return (this.getPayFreq() == castOther.getPayFreq())
				&& ((this.getDtOfPay() == castOther.getDtOfPay()) || (this.getDtOfPay() != null
						&& castOther.getDtOfPay() != null && this.getDtOfPay().equals(castOther.getDtOfPay())))
				&& ((this.getDtPayperBeg() == castOther.getDtPayperBeg())
						|| (this.getDtPayperBeg() != null && castOther.getDtPayperBeg() != null
								&& this.getDtPayperBeg().equals(castOther.getDtPayperBeg())))
				&& ((this.getDtPayperEnd() == castOther.getDtPayperEnd())
						|| (this.getDtPayperEnd() != null && castOther.getDtPayperEnd() != null
								&& this.getDtPayperEnd().equals(castOther.getDtPayperEnd())))
				&& ((this.getTrsMonth() == castOther.getTrsMonth()) || (this.getTrsMonth() != null
						&& castOther.getTrsMonth() != null && this.getTrsMonth().equals(castOther.getTrsMonth())))
				&& (this.getTwcQtr() == castOther.getTwcQtr()) && (this.getUseAltAddr() == castOther.getUseAltAddr())
				&& ((this.getModule() == castOther.getModule()) || (this.getModule() != null
						&& castOther.getModule() != null && this.getModule().equals(castOther.getModule())))
				&& ((this.getLvReqCutoffDt() == castOther.getLvReqCutoffDt())
						|| (this.getLvReqCutoffDt() != null && castOther.getLvReqCutoffDt() != null
								&& this.getLvReqCutoffDt().equals(castOther.getLvReqCutoffDt())))
				&& ((this.getLvLastAprvDt() == castOther.getLvLastAprvDt())
						|| (this.getLvLastAprvDt() != null && castOther.getLvLastAprvDt() != null
								&& this.getLvLastAprvDt().equals(castOther.getLvLastAprvDt())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getPayFreq();
		result = 37 * result + (getDtOfPay() == null ? 0 : this.getDtOfPay().hashCode());
		result = 37 * result + (getDtPayperBeg() == null ? 0 : this.getDtPayperBeg().hashCode());
		result = 37 * result + (getDtPayperEnd() == null ? 0 : this.getDtPayperEnd().hashCode());
		result = 37 * result + (getTrsMonth() == null ? 0 : this.getTrsMonth().hashCode());
		result = 37 * result + this.getTwcQtr();
		result = 37 * result + this.getUseAltAddr();
		result = 37 * result + (getModule() == null ? 0 : this.getModule().hashCode());
		result = 37 * result + (getLvReqCutoffDt() == null ? 0 : this.getLvReqCutoffDt().hashCode());
		result = 37 * result + (getLvLastAprvDt() == null ? 0 : this.getLvLastAprvDt().hashCode());
		return result;
	}

}
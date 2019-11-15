package com.esc20.model;
// Generated Jan 4, 2019 3:44:43 PM by Hibernate Tools 4.3.5.Final

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * BhrPmisCipDistrId generated by hbm2java
 */
@Embeddable
public class BhrPmisCipDistrId implements java.io.Serializable {
	private static final long serialVersionUID = 6715142900654758429L;
	private char cyrNyrFlg;
	private char payFreq;
	private String empNbr;
	private String dtEff;
	private String dtsCipTrans;
	private String jobCd;
	private String extraDutyCd;
	private String posNbr;
	private String billetNbr;
	private char posTyp;
	private short distrSeq;

	public BhrPmisCipDistrId() {
	}

	public BhrPmisCipDistrId(char cyrNyrFlg, char payFreq, String empNbr, String dtEff, String dtsCipTrans,
			String jobCd, String extraDutyCd, String posNbr, String billetNbr, char posTyp, short distrSeq) {
		this.cyrNyrFlg = cyrNyrFlg;
		this.payFreq = payFreq;
		this.empNbr = empNbr;
		this.dtEff = dtEff;
		this.dtsCipTrans = dtsCipTrans;
		this.jobCd = jobCd;
		this.extraDutyCd = extraDutyCd;
		this.posNbr = posNbr;
		this.billetNbr = billetNbr;
		this.posTyp = posTyp;
		this.distrSeq = distrSeq;
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

	@Column(name = "DT_EFF", nullable = false, length = 8)
	public String getDtEff() {
		return this.dtEff;
	}

	public void setDtEff(String dtEff) {
		this.dtEff = dtEff;
	}

	@Column(name = "DTS_CIP_TRANS", nullable = false, length = 16)
	public String getDtsCipTrans() {
		return this.dtsCipTrans;
	}

	public void setDtsCipTrans(String dtsCipTrans) {
		this.dtsCipTrans = dtsCipTrans;
	}

	@Column(name = "JOB_CD", nullable = false, length = 4)
	public String getJobCd() {
		return this.jobCd;
	}

	public void setJobCd(String jobCd) {
		this.jobCd = jobCd;
	}

	@Column(name = "EXTRA_DUTY_CD", nullable = false, length = 2)
	public String getExtraDutyCd() {
		return this.extraDutyCd;
	}

	public void setExtraDutyCd(String extraDutyCd) {
		this.extraDutyCd = extraDutyCd;
	}

	@Column(name = "POS_NBR", nullable = false, length = 13)
	public String getPosNbr() {
		return this.posNbr;
	}

	public void setPosNbr(String posNbr) {
		this.posNbr = posNbr;
	}

	@Column(name = "BILLET_NBR", nullable = false, length = 5)
	public String getBilletNbr() {
		return this.billetNbr;
	}

	public void setBilletNbr(String billetNbr) {
		this.billetNbr = billetNbr;
	}

	@Column(name = "POS_TYP", nullable = false, length = 1)
	public char getPosTyp() {
		return this.posTyp;
	}

	public void setPosTyp(char posTyp) {
		this.posTyp = posTyp;
	}

	@Column(name = "DISTR_SEQ", nullable = false, precision = 3, scale = 0)
	public short getDistrSeq() {
		return this.distrSeq;
	}

	public void setDistrSeq(short distrSeq) {
		this.distrSeq = distrSeq;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof BhrPmisCipDistrId))
			return false;
		BhrPmisCipDistrId castOther = (BhrPmisCipDistrId) other;

		return (this.getCyrNyrFlg() == castOther.getCyrNyrFlg()) && (this.getPayFreq() == castOther.getPayFreq())
				&& ((this.getEmpNbr() == castOther.getEmpNbr()) || (this.getEmpNbr() != null
						&& castOther.getEmpNbr() != null && this.getEmpNbr().equals(castOther.getEmpNbr())))
				&& ((this.getDtEff() == castOther.getDtEff()) || (this.getDtEff() != null
						&& castOther.getDtEff() != null && this.getDtEff().equals(castOther.getDtEff())))
				&& ((this.getDtsCipTrans() == castOther.getDtsCipTrans())
						|| (this.getDtsCipTrans() != null && castOther.getDtsCipTrans() != null
								&& this.getDtsCipTrans().equals(castOther.getDtsCipTrans())))
				&& ((this.getJobCd() == castOther.getJobCd()) || (this.getJobCd() != null
						&& castOther.getJobCd() != null && this.getJobCd().equals(castOther.getJobCd())))
				&& ((this.getExtraDutyCd() == castOther.getExtraDutyCd())
						|| (this.getExtraDutyCd() != null && castOther.getExtraDutyCd() != null
								&& this.getExtraDutyCd().equals(castOther.getExtraDutyCd())))
				&& ((this.getPosNbr() == castOther.getPosNbr()) || (this.getPosNbr() != null
						&& castOther.getPosNbr() != null && this.getPosNbr().equals(castOther.getPosNbr())))
				&& ((this.getBilletNbr() == castOther.getBilletNbr()) || (this.getBilletNbr() != null
						&& castOther.getBilletNbr() != null && this.getBilletNbr().equals(castOther.getBilletNbr())))
				&& (this.getPosTyp() == castOther.getPosTyp()) && (this.getDistrSeq() == castOther.getDistrSeq());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getCyrNyrFlg();
		result = 37 * result + this.getPayFreq();
		result = 37 * result + (getEmpNbr() == null ? 0 : this.getEmpNbr().hashCode());
		result = 37 * result + (getDtEff() == null ? 0 : this.getDtEff().hashCode());
		result = 37 * result + (getDtsCipTrans() == null ? 0 : this.getDtsCipTrans().hashCode());
		result = 37 * result + (getJobCd() == null ? 0 : this.getJobCd().hashCode());
		result = 37 * result + (getExtraDutyCd() == null ? 0 : this.getExtraDutyCd().hashCode());
		result = 37 * result + (getPosNbr() == null ? 0 : this.getPosNbr().hashCode());
		result = 37 * result + (getBilletNbr() == null ? 0 : this.getBilletNbr().hashCode());
		result = 37 * result + this.getPosTyp();
		result = 37 * result + this.getDistrSeq();
		return result;
	}

}
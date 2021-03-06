package com.esc20.model;
// Generated Jan 4, 2019 3:50:10 PM by Hibernate Tools 4.3.5.Final

import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * BthrAccrualDaysBkupPaycalcs5Id generated by hbm2java
 */
@Embeddable
public class BthrAccrualDaysBkupPaycalcs5Id implements java.io.Serializable {

	private char payFreq;
	private char accruCd;
	private String dtOfPay;
	private BigDecimal calWrkDays;
	private String module;

	public BthrAccrualDaysBkupPaycalcs5Id() {
	}

	public BthrAccrualDaysBkupPaycalcs5Id(char payFreq, char accruCd, String dtOfPay, BigDecimal calWrkDays,
			String module) {
		this.payFreq = payFreq;
		this.accruCd = accruCd;
		this.dtOfPay = dtOfPay;
		this.calWrkDays = calWrkDays;
		this.module = module;
	}

	@Column(name = "PAY_FREQ", nullable = false, length = 1)
	public char getPayFreq() {
		return this.payFreq;
	}

	public void setPayFreq(char payFreq) {
		this.payFreq = payFreq;
	}

	@Column(name = "ACCRU_CD", nullable = false, length = 1)
	public char getAccruCd() {
		return this.accruCd;
	}

	public void setAccruCd(char accruCd) {
		this.accruCd = accruCd;
	}

	@Column(name = "DT_OF_PAY", nullable = false, length = 8)
	public String getDtOfPay() {
		return this.dtOfPay;
	}

	public void setDtOfPay(String dtOfPay) {
		this.dtOfPay = dtOfPay;
	}

	@Column(name = "CAL_WRK_DAYS", nullable = false, precision = 5)
	public BigDecimal getCalWrkDays() {
		return this.calWrkDays;
	}

	public void setCalWrkDays(BigDecimal calWrkDays) {
		this.calWrkDays = calWrkDays;
	}

	@Column(name = "MODULE", nullable = false, length = 25)
	public String getModule() {
		return this.module;
	}

	public void setModule(String module) {
		this.module = module;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof BthrAccrualDaysBkupPaycalcs5Id))
			return false;
		BthrAccrualDaysBkupPaycalcs5Id castOther = (BthrAccrualDaysBkupPaycalcs5Id) other;

		return (this.getPayFreq() == castOther.getPayFreq()) && (this.getAccruCd() == castOther.getAccruCd())
				&& ((this.getDtOfPay() == castOther.getDtOfPay()) || (this.getDtOfPay() != null
						&& castOther.getDtOfPay() != null && this.getDtOfPay().equals(castOther.getDtOfPay())))
				&& ((this.getCalWrkDays() == castOther.getCalWrkDays()) || (this.getCalWrkDays() != null
						&& castOther.getCalWrkDays() != null && this.getCalWrkDays().equals(castOther.getCalWrkDays())))
				&& ((this.getModule() == castOther.getModule()) || (this.getModule() != null
						&& castOther.getModule() != null && this.getModule().equals(castOther.getModule())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getPayFreq();
		result = 37 * result + this.getAccruCd();
		result = 37 * result + (getDtOfPay() == null ? 0 : this.getDtOfPay().hashCode());
		result = 37 * result + (getCalWrkDays() == null ? 0 : this.getCalWrkDays().hashCode());
		result = 37 * result + (getModule() == null ? 0 : this.getModule().hashCode());
		return result;
	}

}

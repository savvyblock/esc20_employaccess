package com.esc20.model;
// Generated Jan 4, 2019 3:38:35 PM by Hibernate Tools 4.3.5.Final

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * BhrCalSchDaysBkupPaycalcs5Id generated by hbm2java
 */
@Embeddable
public class BhrCalSchDaysBkupPaycalcs5Id implements java.io.Serializable {
	private static final long serialVersionUID = 6715142900654758429L;
	private String calCd;
	private char payFreq;
	private String dayDate;
	private char dayTyp;
	private String julDay;
	private String julYr;
	private String module;

	public BhrCalSchDaysBkupPaycalcs5Id() {
	}

	public BhrCalSchDaysBkupPaycalcs5Id(String calCd, char payFreq, String dayDate, char dayTyp, String julDay,
			String julYr, String module) {
		this.calCd = calCd;
		this.payFreq = payFreq;
		this.dayDate = dayDate;
		this.dayTyp = dayTyp;
		this.julDay = julDay;
		this.julYr = julYr;
		this.module = module;
	}

	@Column(name = "CAL_CD", nullable = false, length = 2)
	public String getCalCd() {
		return this.calCd;
	}

	public void setCalCd(String calCd) {
		this.calCd = calCd;
	}

	@Column(name = "PAY_FREQ", nullable = false, length = 1)
	public char getPayFreq() {
		return this.payFreq;
	}

	public void setPayFreq(char payFreq) {
		this.payFreq = payFreq;
	}

	@Column(name = "DAY_DATE", nullable = false, length = 8)
	public String getDayDate() {
		return this.dayDate;
	}

	public void setDayDate(String dayDate) {
		this.dayDate = dayDate;
	}

	@Column(name = "DAY_TYP", nullable = false, length = 1)
	public char getDayTyp() {
		return this.dayTyp;
	}

	public void setDayTyp(char dayTyp) {
		this.dayTyp = dayTyp;
	}

	@Column(name = "JUL_DAY", nullable = false, length = 3)
	public String getJulDay() {
		return this.julDay;
	}

	public void setJulDay(String julDay) {
		this.julDay = julDay;
	}

	@Column(name = "JUL_YR", nullable = false, length = 4)
	public String getJulYr() {
		return this.julYr;
	}

	public void setJulYr(String julYr) {
		this.julYr = julYr;
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
		if (!(other instanceof BhrCalSchDaysBkupPaycalcs5Id))
			return false;
		BhrCalSchDaysBkupPaycalcs5Id castOther = (BhrCalSchDaysBkupPaycalcs5Id) other;

		return ((this.getCalCd() == castOther.getCalCd()) || (this.getCalCd() != null && castOther.getCalCd() != null
				&& this.getCalCd().equals(castOther.getCalCd())))
				&& (this.getPayFreq() == castOther.getPayFreq())
				&& ((this.getDayDate() == castOther.getDayDate()) || (this.getDayDate() != null
						&& castOther.getDayDate() != null && this.getDayDate().equals(castOther.getDayDate())))
				&& (this.getDayTyp() == castOther.getDayTyp())
				&& ((this.getJulDay() == castOther.getJulDay()) || (this.getJulDay() != null
						&& castOther.getJulDay() != null && this.getJulDay().equals(castOther.getJulDay())))
				&& ((this.getJulYr() == castOther.getJulYr()) || (this.getJulYr() != null
						&& castOther.getJulYr() != null && this.getJulYr().equals(castOther.getJulYr())))
				&& ((this.getModule() == castOther.getModule()) || (this.getModule() != null
						&& castOther.getModule() != null && this.getModule().equals(castOther.getModule())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getCalCd() == null ? 0 : this.getCalCd().hashCode());
		result = 37 * result + this.getPayFreq();
		result = 37 * result + (getDayDate() == null ? 0 : this.getDayDate().hashCode());
		result = 37 * result + this.getDayTyp();
		result = 37 * result + (getJulDay() == null ? 0 : this.getJulDay().hashCode());
		result = 37 * result + (getJulYr() == null ? 0 : this.getJulYr().hashCode());
		result = 37 * result + (getModule() == null ? 0 : this.getModule().hashCode());
		return result;
	}

}

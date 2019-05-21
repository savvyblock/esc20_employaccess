package com.esc20.model;
// Generated Jan 4, 2019 3:54:58 PM by Hibernate Tools 4.3.5.Final

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * BthrZeroDaysRsnCdId generated by hbm2java
 */
@Embeddable
public class BthrZeroDaysRsnCdId implements java.io.Serializable {

	private String zeroDaysRecTyp;
	private char zeroDaysRsnCd;

	public BthrZeroDaysRsnCdId() {
	}

	public BthrZeroDaysRsnCdId(String zeroDaysRecTyp, char zeroDaysRsnCd) {
		this.zeroDaysRecTyp = zeroDaysRecTyp;
		this.zeroDaysRsnCd = zeroDaysRsnCd;
	}

	@Column(name = "ZERO_DAYS_REC_TYP", nullable = false, length = 4)
	public String getZeroDaysRecTyp() {
		return this.zeroDaysRecTyp;
	}

	public void setZeroDaysRecTyp(String zeroDaysRecTyp) {
		this.zeroDaysRecTyp = zeroDaysRecTyp;
	}

	@Column(name = "ZERO_DAYS_RSN_CD", nullable = false, length = 1)
	public char getZeroDaysRsnCd() {
		return this.zeroDaysRsnCd;
	}

	public void setZeroDaysRsnCd(char zeroDaysRsnCd) {
		this.zeroDaysRsnCd = zeroDaysRsnCd;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof BthrZeroDaysRsnCdId))
			return false;
		BthrZeroDaysRsnCdId castOther = (BthrZeroDaysRsnCdId) other;

		return ((this.getZeroDaysRecTyp() == castOther.getZeroDaysRecTyp())
				|| (this.getZeroDaysRecTyp() != null && castOther.getZeroDaysRecTyp() != null
						&& this.getZeroDaysRecTyp().equals(castOther.getZeroDaysRecTyp())))
				&& (this.getZeroDaysRsnCd() == castOther.getZeroDaysRsnCd());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getZeroDaysRecTyp() == null ? 0 : this.getZeroDaysRecTyp().hashCode());
		result = 37 * result + this.getZeroDaysRsnCd();
		return result;
	}

}
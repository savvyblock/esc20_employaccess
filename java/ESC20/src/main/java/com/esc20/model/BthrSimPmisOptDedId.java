package com.esc20.model;
// Generated Jan 4, 2019 3:54:39 PM by Hibernate Tools 4.3.5.Final

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * BthrSimPmisOptDedId generated by hbm2java
 */
@Embeddable
public class BthrSimPmisOptDedId implements java.io.Serializable {

	private char cyrNyrFlg;
	private String simName;
	private String dedCd;

	public BthrSimPmisOptDedId() {
	}

	public BthrSimPmisOptDedId(char cyrNyrFlg, String simName, String dedCd) {
		this.cyrNyrFlg = cyrNyrFlg;
		this.simName = simName;
		this.dedCd = dedCd;
	}

	@Column(name = "CYR_NYR_FLG", nullable = false, length = 1)
	public char getCyrNyrFlg() {
		return this.cyrNyrFlg;
	}

	public void setCyrNyrFlg(char cyrNyrFlg) {
		this.cyrNyrFlg = cyrNyrFlg;
	}

	@Column(name = "SIM_NAME", nullable = false, length = 7)
	public String getSimName() {
		return this.simName;
	}

	public void setSimName(String simName) {
		this.simName = simName;
	}

	@Column(name = "DED_CD", nullable = false, length = 3)
	public String getDedCd() {
		return this.dedCd;
	}

	public void setDedCd(String dedCd) {
		this.dedCd = dedCd;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof BthrSimPmisOptDedId))
			return false;
		BthrSimPmisOptDedId castOther = (BthrSimPmisOptDedId) other;

		return (this.getCyrNyrFlg() == castOther.getCyrNyrFlg())
				&& ((this.getSimName() == castOther.getSimName()) || (this.getSimName() != null
						&& castOther.getSimName() != null && this.getSimName().equals(castOther.getSimName())))
				&& ((this.getDedCd() == castOther.getDedCd()) || (this.getDedCd() != null
						&& castOther.getDedCd() != null && this.getDedCd().equals(castOther.getDedCd())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getCyrNyrFlg();
		result = 37 * result + (getSimName() == null ? 0 : this.getSimName().hashCode());
		result = 37 * result + (getDedCd() == null ? 0 : this.getDedCd().hashCode());
		return result;
	}

}
package com.esc20.model;
// Generated Jan 4, 2019 3:44:43 PM by Hibernate Tools 4.3.5.Final

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * BhrPermitAreaId generated by hbm2java
 */
@Embeddable
public class BhrPermitAreaId implements java.io.Serializable {
	private static final long serialVersionUID = 6715142900654758429L;
	private String empNbr;
	private String prmtTyp;
	private String prmtIssueDt;
	private String prmtIssueStat;
	private String roleId;
	private String popSrvd;
	private String prmtGrdRnge;
	private String prmtSubjArea;

	public BhrPermitAreaId() {
	}

	public BhrPermitAreaId(String empNbr, String prmtTyp, String prmtIssueDt, String prmtIssueStat, String roleId,
			String popSrvd, String prmtGrdRnge, String prmtSubjArea) {
		this.empNbr = empNbr;
		this.prmtTyp = prmtTyp;
		this.prmtIssueDt = prmtIssueDt;
		this.prmtIssueStat = prmtIssueStat;
		this.roleId = roleId;
		this.popSrvd = popSrvd;
		this.prmtGrdRnge = prmtGrdRnge;
		this.prmtSubjArea = prmtSubjArea;
	}

	@Column(name = "EMP_NBR", nullable = false, length = 6)
	public String getEmpNbr() {
		return this.empNbr;
	}

	public void setEmpNbr(String empNbr) {
		this.empNbr = empNbr;
	}

	@Column(name = "PRMT_TYP", nullable = false, length = 2)
	public String getPrmtTyp() {
		return this.prmtTyp;
	}

	public void setPrmtTyp(String prmtTyp) {
		this.prmtTyp = prmtTyp;
	}

	@Column(name = "PRMT_ISSUE_DT", nullable = false, length = 6)
	public String getPrmtIssueDt() {
		return this.prmtIssueDt;
	}

	public void setPrmtIssueDt(String prmtIssueDt) {
		this.prmtIssueDt = prmtIssueDt;
	}

	@Column(name = "PRMT_ISSUE_STAT", nullable = false, length = 2)
	public String getPrmtIssueStat() {
		return this.prmtIssueStat;
	}

	public void setPrmtIssueStat(String prmtIssueStat) {
		this.prmtIssueStat = prmtIssueStat;
	}

	@Column(name = "ROLE_ID", nullable = false, length = 3)
	public String getRoleId() {
		return this.roleId;
	}

	public void setRoleId(String roleId) {
		this.roleId = roleId;
	}

	@Column(name = "POP_SRVD", nullable = false, length = 2)
	public String getPopSrvd() {
		return this.popSrvd;
	}

	public void setPopSrvd(String popSrvd) {
		this.popSrvd = popSrvd;
	}

	@Column(name = "PRMT_GRD_RNGE", nullable = false, length = 2)
	public String getPrmtGrdRnge() {
		return this.prmtGrdRnge;
	}

	public void setPrmtGrdRnge(String prmtGrdRnge) {
		this.prmtGrdRnge = prmtGrdRnge;
	}

	@Column(name = "PRMT_SUBJ_AREA", nullable = false, length = 2)
	public String getPrmtSubjArea() {
		return this.prmtSubjArea;
	}

	public void setPrmtSubjArea(String prmtSubjArea) {
		this.prmtSubjArea = prmtSubjArea;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof BhrPermitAreaId))
			return false;
		BhrPermitAreaId castOther = (BhrPermitAreaId) other;

		return ((this.getEmpNbr() == castOther.getEmpNbr()) || (this.getEmpNbr() != null
				&& castOther.getEmpNbr() != null && this.getEmpNbr().equals(castOther.getEmpNbr())))
				&& ((this.getPrmtTyp() == castOther.getPrmtTyp()) || (this.getPrmtTyp() != null
						&& castOther.getPrmtTyp() != null && this.getPrmtTyp().equals(castOther.getPrmtTyp())))
				&& ((this.getPrmtIssueDt() == castOther.getPrmtIssueDt())
						|| (this.getPrmtIssueDt() != null && castOther.getPrmtIssueDt() != null
								&& this.getPrmtIssueDt().equals(castOther.getPrmtIssueDt())))
				&& ((this.getPrmtIssueStat() == castOther.getPrmtIssueStat())
						|| (this.getPrmtIssueStat() != null && castOther.getPrmtIssueStat() != null
								&& this.getPrmtIssueStat().equals(castOther.getPrmtIssueStat())))
				&& ((this.getRoleId() == castOther.getRoleId()) || (this.getRoleId() != null
						&& castOther.getRoleId() != null && this.getRoleId().equals(castOther.getRoleId())))
				&& ((this.getPopSrvd() == castOther.getPopSrvd()) || (this.getPopSrvd() != null
						&& castOther.getPopSrvd() != null && this.getPopSrvd().equals(castOther.getPopSrvd())))
				&& ((this.getPrmtGrdRnge() == castOther.getPrmtGrdRnge())
						|| (this.getPrmtGrdRnge() != null && castOther.getPrmtGrdRnge() != null
								&& this.getPrmtGrdRnge().equals(castOther.getPrmtGrdRnge())))
				&& ((this.getPrmtSubjArea() == castOther.getPrmtSubjArea())
						|| (this.getPrmtSubjArea() != null && castOther.getPrmtSubjArea() != null
								&& this.getPrmtSubjArea().equals(castOther.getPrmtSubjArea())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getEmpNbr() == null ? 0 : this.getEmpNbr().hashCode());
		result = 37 * result + (getPrmtTyp() == null ? 0 : this.getPrmtTyp().hashCode());
		result = 37 * result + (getPrmtIssueDt() == null ? 0 : this.getPrmtIssueDt().hashCode());
		result = 37 * result + (getPrmtIssueStat() == null ? 0 : this.getPrmtIssueStat().hashCode());
		result = 37 * result + (getRoleId() == null ? 0 : this.getRoleId().hashCode());
		result = 37 * result + (getPopSrvd() == null ? 0 : this.getPopSrvd().hashCode());
		result = 37 * result + (getPrmtGrdRnge() == null ? 0 : this.getPrmtGrdRnge().hashCode());
		result = 37 * result + (getPrmtSubjArea() == null ? 0 : this.getPrmtSubjArea().hashCode());
		return result;
	}

}

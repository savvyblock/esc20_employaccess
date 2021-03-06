package com.esc20.model;
// Generated Jan 4, 2019 3:42:31 PM by Hibernate Tools 4.3.5.Final

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * BhrEmpUnemployBkupPaycalcs5 generated by hbm2java
 */
@Entity
@Table(name = "BHR_EMP_UNEMPLOY_BKUP_PAYCALCS_5", schema = "rsccc", catalog = "rsccc")
public class BhrEmpUnemployBkupPaycalcs5 implements java.io.Serializable {
	private static final long serialVersionUID = 6715142900654758429L;
	private BhrEmpUnemployBkupPaycalcs5Id id;

	public BhrEmpUnemployBkupPaycalcs5() {
	}

	public BhrEmpUnemployBkupPaycalcs5(BhrEmpUnemployBkupPaycalcs5Id id) {
		this.id = id;
	}

	@EmbeddedId

	@AttributeOverrides({
			@AttributeOverride(name = "cyrNyrFlg", column = @Column(name = "CYR_NYR_FLG", nullable = false, length = 1)),
			@AttributeOverride(name = "payFreq", column = @Column(name = "PAY_FREQ", nullable = false, length = 1)),
			@AttributeOverride(name = "empNbr", column = @Column(name = "EMP_NBR", nullable = false, length = 6)),
			@AttributeOverride(name = "calYr", column = @Column(name = "CAL_YR", nullable = false, length = 4)),
			@AttributeOverride(name = "quarter", column = @Column(name = "QUARTER", nullable = false, length = 1)),
			@AttributeOverride(name = "unempGross", column = @Column(name = "UNEMP_GROSS", nullable = false, precision = 9)),
			@AttributeOverride(name = "unempInsAmt", column = @Column(name = "UNEMP_INS_AMT", nullable = false, precision = 9)),
			@AttributeOverride(name = "module", column = @Column(name = "MODULE", nullable = false, length = 25)) })
	public BhrEmpUnemployBkupPaycalcs5Id getId() {
		return this.id;
	}

	public void setId(BhrEmpUnemployBkupPaycalcs5Id id) {
		this.id = id;
	}

}

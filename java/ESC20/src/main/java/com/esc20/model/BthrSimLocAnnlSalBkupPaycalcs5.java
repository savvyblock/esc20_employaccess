package com.esc20.model;
// Generated Jan 4, 2019 3:54:39 PM by Hibernate Tools 4.3.5.Final

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * BthrSimLocAnnlSalBkupPaycalcs5 generated by hbm2java
 */
@Entity
@Table(name = "BTHR_SIM_LOC_ANNL_SAL_BKUP_PAYCALCS_5", schema = "rsccc", catalog = "rsccc")
public class BthrSimLocAnnlSalBkupPaycalcs5 implements java.io.Serializable {

	private BthrSimLocAnnlSalBkupPaycalcs5Id id;

	public BthrSimLocAnnlSalBkupPaycalcs5() {
	}

	public BthrSimLocAnnlSalBkupPaycalcs5(BthrSimLocAnnlSalBkupPaycalcs5Id id) {
		this.id = id;
	}

	@EmbeddedId

	@AttributeOverrides({
			@AttributeOverride(name = "cyrNyrFlg", column = @Column(name = "CYR_NYR_FLG", nullable = false, length = 1)),
			@AttributeOverride(name = "simName", column = @Column(name = "SIM_NAME", nullable = false, length = 7)),
			@AttributeOverride(name = "payGrd", column = @Column(name = "PAY_GRD", nullable = false, length = 3)),
			@AttributeOverride(name = "payStp", column = @Column(name = "PAY_STP", nullable = false, length = 2)),
			@AttributeOverride(name = "sched", column = @Column(name = "SCHED", nullable = false, length = 1)),
			@AttributeOverride(name = "maxDays", column = @Column(name = "MAX_DAYS", nullable = false, length = 3)),
			@AttributeOverride(name = "amtChg", column = @Column(name = "AMT_CHG", nullable = false, precision = 9)),
			@AttributeOverride(name = "pctChg", column = @Column(name = "PCT_CHG", nullable = false, precision = 5, scale = 4)),
			@AttributeOverride(name = "module", column = @Column(name = "MODULE", nullable = false, length = 25)) })
	public BthrSimLocAnnlSalBkupPaycalcs5Id getId() {
		return this.id;
	}

	public void setId(BthrSimLocAnnlSalBkupPaycalcs5Id id) {
		this.id = id;
	}

}

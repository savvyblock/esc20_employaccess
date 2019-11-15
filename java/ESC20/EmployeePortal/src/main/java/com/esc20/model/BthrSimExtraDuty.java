package com.esc20.model;
// Generated Jan 4, 2019 3:54:39 PM by Hibernate Tools 4.3.5.Final

import java.math.BigDecimal;
import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * BthrSimExtraDuty generated by hbm2java
 */
@Entity
@Table(name = "BTHR_SIM_EXTRA_DUTY", schema = "rsccc", catalog = "rsccc")
public class BthrSimExtraDuty implements java.io.Serializable {

	private BthrSimExtraDutyId id;
	private BigDecimal amtChg;
	private BigDecimal pctChg;
	private BigDecimal supplExtraDays;
	private String module;

	public BthrSimExtraDuty() {
	}

	public BthrSimExtraDuty(BthrSimExtraDutyId id, BigDecimal amtChg, BigDecimal pctChg, BigDecimal supplExtraDays,
			String module) {
		this.id = id;
		this.amtChg = amtChg;
		this.pctChg = pctChg;
		this.supplExtraDays = supplExtraDays;
		this.module = module;
	}

	@EmbeddedId

	@AttributeOverrides({
			@AttributeOverride(name = "cyrNyrFlg", column = @Column(name = "CYR_NYR_FLG", nullable = false, length = 1)),
			@AttributeOverride(name = "simName", column = @Column(name = "SIM_NAME", nullable = false, length = 7)),
			@AttributeOverride(name = "extraDutyCd", column = @Column(name = "EXTRA_DUTY_CD", nullable = false, length = 2)) })
	public BthrSimExtraDutyId getId() {
		return this.id;
	}

	public void setId(BthrSimExtraDutyId id) {
		this.id = id;
	}

	@Column(name = "AMT_CHG", nullable = false, precision = 9)
	public BigDecimal getAmtChg() {
		return this.amtChg;
	}

	public void setAmtChg(BigDecimal amtChg) {
		this.amtChg = amtChg;
	}

	@Column(name = "PCT_CHG", nullable = false, precision = 5, scale = 4)
	public BigDecimal getPctChg() {
		return this.pctChg;
	}

	public void setPctChg(BigDecimal pctChg) {
		this.pctChg = pctChg;
	}

	@Column(name = "SUPPL_EXTRA_DAYS", nullable = false, precision = 3, scale = 1)
	public BigDecimal getSupplExtraDays() {
		return this.supplExtraDays;
	}

	public void setSupplExtraDays(BigDecimal supplExtraDays) {
		this.supplExtraDays = supplExtraDays;
	}

	@Column(name = "MODULE", nullable = false, length = 25)
	public String getModule() {
		return this.module;
	}

	public void setModule(String module) {
		this.module = module;
	}

}
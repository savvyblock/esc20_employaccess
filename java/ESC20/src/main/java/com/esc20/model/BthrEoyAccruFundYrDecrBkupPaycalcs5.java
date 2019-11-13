package com.esc20.model;
// Generated Jan 4, 2019 3:51:06 PM by Hibernate Tools 4.3.5.Final

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * BthrEoyAccruFundYrDecrBkupPaycalcs5 generated by hbm2java
 */
@Entity
@Table(name = "BTHR_EOY_ACCRU_FUND_YR_DECR_BKUP_PAYCALCS_5", schema = "rsccc", catalog = "rsccc")
public class BthrEoyAccruFundYrDecrBkupPaycalcs5 implements java.io.Serializable {

	private BthrEoyAccruFundYrDecrBkupPaycalcs5Id id;

	public BthrEoyAccruFundYrDecrBkupPaycalcs5() {
	}

	public BthrEoyAccruFundYrDecrBkupPaycalcs5(BthrEoyAccruFundYrDecrBkupPaycalcs5Id id) {
		this.id = id;
	}

	@EmbeddedId

	@AttributeOverrides({
			@AttributeOverride(name = "cyrNyrFlg", column = @Column(name = "CYR_NYR_FLG", nullable = false, length = 1)),
			@AttributeOverride(name = "payFreq", column = @Column(name = "PAY_FREQ", nullable = false, length = 1)),
			@AttributeOverride(name = "fund", column = @Column(name = "FUND", nullable = false, length = 3)),
			@AttributeOverride(name = "fsclYr", column = @Column(name = "FSCL_YR", nullable = false, length = 1)) })
	public BthrEoyAccruFundYrDecrBkupPaycalcs5Id getId() {
		return this.id;
	}

	public void setId(BthrEoyAccruFundYrDecrBkupPaycalcs5Id id) {
		this.id = id;
	}

}
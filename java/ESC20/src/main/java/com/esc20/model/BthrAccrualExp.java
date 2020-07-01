package com.esc20.model;
// Generated Jan 4, 2019 3:50:10 PM by Hibernate Tools 4.3.5.Final

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * BthrAccrualExp generated by hbm2java
 */
@Entity
@Table(name = "BTHR_ACCRUAL_EXP", schema = "rsccc", catalog = "rsccc")
public class BthrAccrualExp implements java.io.Serializable {

	private BthrAccrualExpId id;
	private char expFsclYr;
	private String fundDescr;
	private String module;

	public BthrAccrualExp() {
	}

	public BthrAccrualExp(BthrAccrualExpId id, char expFsclYr, String fundDescr, String module) {
		this.id = id;
		this.expFsclYr = expFsclYr;
		this.fundDescr = fundDescr;
		this.module = module;
	}

	@EmbeddedId

	@AttributeOverrides({
			@AttributeOverride(name = "payFreq", column = @Column(name = "PAY_FREQ", nullable = false, length = 1)),
			@AttributeOverride(name = "fund", column = @Column(name = "FUND", nullable = false, length = 3)) })
	public BthrAccrualExpId getId() {
		return this.id;
	}

	public void setId(BthrAccrualExpId id) {
		this.id = id;
	}

	@Column(name = "EXP_FSCL_YR", nullable = false, length = 1)
	public char getExpFsclYr() {
		return this.expFsclYr;
	}

	public void setExpFsclYr(char expFsclYr) {
		this.expFsclYr = expFsclYr;
	}

	@Column(name = "FUND_DESCR", nullable = false, length = 30)
	public String getFundDescr() {
		return this.fundDescr;
	}

	public void setFundDescr(String fundDescr) {
		this.fundDescr = fundDescr;
	}

	@Column(name = "MODULE", nullable = false, length = 25)
	public String getModule() {
		return this.module;
	}

	public void setModule(String module) {
		this.module = module;
	}

}
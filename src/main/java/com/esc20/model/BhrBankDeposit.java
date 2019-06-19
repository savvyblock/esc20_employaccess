package com.esc20.model;
// Generated Jan 4, 2019 3:38:21 PM by Hibernate Tools 4.3.5.Final

import java.math.BigDecimal;
import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * BhrBankDeposit generated by hbm2java
 */
@Entity
@Table(name = "BHR_BANK_DEPOSIT", schema = "rsccc", catalog = "rsccc")
public class BhrBankDeposit implements java.io.Serializable {
	private static final long serialVersionUID = 6715142900654758429L;
	private BhrBankDepositId id;
	private char bankStat;
	private BigDecimal bankAcctAmt;
	private String module;

	public BhrBankDeposit() {
	}

	public BhrBankDeposit(BhrBankDepositId id, char bankStat, BigDecimal bankAcctAmt, String module) {
		this.id = id;
		this.bankStat = bankStat;
		this.bankAcctAmt = bankAcctAmt;
		this.module = module;
	}

	@EmbeddedId

	@AttributeOverrides({
			@AttributeOverride(name = "payFreq", column = @Column(name = "PAY_FREQ", nullable = false, length = 1)),
			@AttributeOverride(name = "empNbr", column = @Column(name = "EMP_NBR", nullable = false, length = 6)),
			@AttributeOverride(name = "cyrNyrFlg", column = @Column(name = "CYR_NYR_FLG", nullable = false, length = 1)),
			@AttributeOverride(name = "bankAcctNbr", column = @Column(name = "BANK_ACCT_NBR", nullable = false, length = 17)),
			@AttributeOverride(name = "bankAcctTyp", column = @Column(name = "BANK_ACCT_TYP", nullable = false, length = 1)),
			@AttributeOverride(name = "bankCd", column = @Column(name = "BANK_CD", nullable = false, length = 3)) })
	public BhrBankDepositId getId() {
		return this.id;
	}

	public void setId(BhrBankDepositId id) {
		this.id = id;
	}

	@Column(name = "BANK_STAT", nullable = false, length = 1)
	public char getBankStat() {
		return this.bankStat;
	}

	public void setBankStat(char bankStat) {
		this.bankStat = bankStat;
	}

	@Column(name = "BANK_ACCT_AMT", nullable = false, precision = 9)
	public BigDecimal getBankAcctAmt() {
		return this.bankAcctAmt;
	}

	public void setBankAcctAmt(BigDecimal bankAcctAmt) {
		this.bankAcctAmt = bankAcctAmt;
	}

	@Column(name = "MODULE", nullable = false, length = 25)
	public String getModule() {
		return this.module;
	}

	public void setModule(String module) {
		this.module = module;
	}

}
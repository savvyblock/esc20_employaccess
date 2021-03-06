package com.esc20.model;
// Generated Jan 4, 2019 3:45:09 PM by Hibernate Tools 4.3.5.Final

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * BhrSchYtdBkupPaycalcs5 generated by hbm2java
 */
@Entity
@Table(name = "BHR_SCH_YTD_BKUP_PAYCALCS_5", schema = "rsccc", catalog = "rsccc")
public class BhrSchYtdBkupPaycalcs5 implements java.io.Serializable {
	private static final long serialVersionUID = 6715142900654758429L;
	private BhrSchYtdBkupPaycalcs5Id id;

	public BhrSchYtdBkupPaycalcs5() {
	}

	public BhrSchYtdBkupPaycalcs5(BhrSchYtdBkupPaycalcs5Id id) {
		this.id = id;
	}

	@EmbeddedId

	@AttributeOverrides({
			@AttributeOverride(name = "cyrNyrFlg", column = @Column(name = "CYR_NYR_FLG", nullable = false, length = 1)),
			@AttributeOverride(name = "payFreq", column = @Column(name = "PAY_FREQ", nullable = false, length = 1)),
			@AttributeOverride(name = "empNbr", column = @Column(name = "EMP_NBR", nullable = false, length = 6)),
			@AttributeOverride(name = "schYr", column = @Column(name = "SCH_YR", nullable = false, length = 4)),
			@AttributeOverride(name = "contrAmt", column = @Column(name = "CONTR_AMT", nullable = false, precision = 9)),
			@AttributeOverride(name = "noncontrAmt", column = @Column(name = "NONCONTR_AMT", nullable = false, precision = 9)),
			@AttributeOverride(name = "extraDutyAmt", column = @Column(name = "EXTRA_DUTY_AMT", nullable = false, precision = 9)),
			@AttributeOverride(name = "ficaTax", column = @Column(name = "FICA_TAX", nullable = false, precision = 9)),
			@AttributeOverride(name = "trsDeposit", column = @Column(name = "TRS_DEPOSIT", nullable = false, precision = 9)),
			@AttributeOverride(name = "absDedAmt", column = @Column(name = "ABS_DED_AMT", nullable = false, precision = 7)),
			@AttributeOverride(name = "regHrsWrk", column = @Column(name = "REG_HRS_WRK", nullable = false, precision = 7)),
			@AttributeOverride(name = "regGrossAmt", column = @Column(name = "REG_GROSS_AMT", nullable = false, precision = 9)),
			@AttributeOverride(name = "ovtmHrsWrk", column = @Column(name = "OVTM_HRS_WRK", nullable = false, precision = 6)),
			@AttributeOverride(name = "ovtmGross", column = @Column(name = "OVTM_GROSS", nullable = false, precision = 9)),
			@AttributeOverride(name = "emplrAnnuitContrib", column = @Column(name = "EMPLR_ANNUIT_CONTRIB", nullable = false, precision = 9)),
			@AttributeOverride(name = "emplr457Contrib", column = @Column(name = "EMPLR_457_CONTRIB", nullable = false, precision = 9)),
			@AttributeOverride(name = "medTax", column = @Column(name = "MED_TAX", nullable = false, precision = 9)),
			@AttributeOverride(name = "accruPay", column = @Column(name = "ACCRU_PAY", nullable = false, precision = 9)),
			@AttributeOverride(name = "accruFedGrant", column = @Column(name = "ACCRU_FED_GRANT", nullable = false, precision = 9)),
			@AttributeOverride(name = "accruFicaTax", column = @Column(name = "ACCRU_FICA_TAX", nullable = false, precision = 9)),
			@AttributeOverride(name = "accruUnemplIns", column = @Column(name = "ACCRU_UNEMPL_INS", nullable = false, precision = 9)),
			@AttributeOverride(name = "accruEmplrAnnuitContrib", column = @Column(name = "ACCRU_EMPLR_ANNUIT_CONTRIB", nullable = false, precision = 9)),
			@AttributeOverride(name = "accruEmplrNonAnnuitContrib", column = @Column(name = "ACCRU_EMPLR_NON_ANNUIT_CONTRIB", nullable = false, precision = 9)),
			@AttributeOverride(name = "accruFedCare", column = @Column(name = "ACCRU_FED_CARE", nullable = false, precision = 9)),
			@AttributeOverride(name = "accruFedIns", column = @Column(name = "ACCRU_FED_INS", nullable = false, precision = 9)),
			@AttributeOverride(name = "accruEmplr457Contrib", column = @Column(name = "ACCRU_EMPLR_457_CONTRIB", nullable = false, precision = 9)),
			@AttributeOverride(name = "daysEarned", column = @Column(name = "DAYS_EARNED", nullable = false, precision = 5)),
			@AttributeOverride(name = "nontrsReimbrExcess", column = @Column(name = "NONTRS_REIMBR_EXCESS", nullable = false, precision = 9)),
			@AttributeOverride(name = "nontrsReimbrBase", column = @Column(name = "NONTRS_REIMBR_BASE", nullable = false, precision = 9)),
			@AttributeOverride(name = "nontrsBusAllow", column = @Column(name = "NONTRS_BUS_ALLOW", nullable = false, precision = 9)),
			@AttributeOverride(name = "nontrsNontaxBusAllow", column = @Column(name = "NONTRS_NONTAX_BUS_ALLOW", nullable = false, precision = 9)),
			@AttributeOverride(name = "trsSupplComp", column = @Column(name = "TRS_SUPPL_COMP", nullable = false, precision = 7)),
			@AttributeOverride(name = "teaHealthInsContrib", column = @Column(name = "TEA_HEALTH_INS_CONTRIB", nullable = false, precision = 7)),
			@AttributeOverride(name = "accruTeaHealthInsContrib", column = @Column(name = "ACCRU_TEA_HEALTH_INS_CONTRIB", nullable = false, precision = 7)),
			@AttributeOverride(name = "emplrTrsCareContrib", column = @Column(name = "EMPLR_TRS_CARE_CONTRIB", nullable = false, precision = 9)),
			@AttributeOverride(name = "accruEmplrTrsCareContrib", column = @Column(name = "ACCRU_EMPLR_TRS_CARE_CONTRIB", nullable = false, precision = 9)),
			@AttributeOverride(name = "accruCafeAmt", column = @Column(name = "ACCRU_CAFE_AMT", nullable = false, precision = 9)),
			@AttributeOverride(name = "nontrsNonpayBusAllow", column = @Column(name = "NONTRS_NONPAY_BUS_ALLOW", nullable = false, precision = 9)),
			@AttributeOverride(name = "nontrsNontaxNonpayAllow", column = @Column(name = "NONTRS_NONTAX_NONPAY_ALLOW", nullable = false, precision = 9)),
			@AttributeOverride(name = "emplrRetPensnSurchg", column = @Column(name = "EMPLR_RET_PENSN_SURCHG", nullable = false, precision = 7)),
			@AttributeOverride(name = "accruEmplrRetPensnSurchg", column = @Column(name = "ACCRU_EMPLR_RET_PENSN_SURCHG", nullable = false, precision = 7)),
			@AttributeOverride(name = "emplrTrsCareSurchg", column = @Column(name = "EMPLR_TRS_CARE_SURCHG", nullable = false, precision = 7)),
			@AttributeOverride(name = "accruEmplrTrsCareSurchg", column = @Column(name = "ACCRU_EMPLR_TRS_CARE_SURCHG", nullable = false, precision = 7)),
			@AttributeOverride(name = "emplrNewTrsPensnContrib", column = @Column(name = "EMPLR_NEW_TRS_PENSN_CONTRIB", nullable = false, precision = 7)),
			@AttributeOverride(name = "emplrDependCare", column = @Column(name = "EMPLR_DEPEND_CARE", nullable = false, precision = 9)),
			@AttributeOverride(name = "accruEmplrDependCare", column = @Column(name = "ACCRU_EMPLR_DEPEND_CARE", nullable = false, precision = 9)),
			@AttributeOverride(name = "emplrMiscDedContrib", column = @Column(name = "EMPLR_MISC_DED_CONTRIB", nullable = false, precision = 9)),
			@AttributeOverride(name = "accruEmplrMiscDedContrib", column = @Column(name = "ACCRU_EMPLR_MISC_DED_CONTRIB", nullable = false, precision = 9)),
			@AttributeOverride(name = "module", column = @Column(name = "MODULE", nullable = false, length = 25)) })
	public BhrSchYtdBkupPaycalcs5Id getId() {
		return this.id;
	}

	public void setId(BhrSchYtdBkupPaycalcs5Id id) {
		this.id = id;
	}

}

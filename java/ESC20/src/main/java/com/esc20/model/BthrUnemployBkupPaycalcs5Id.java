package com.esc20.model;
// Generated Jan 4, 2019 3:54:58 PM by Hibernate Tools 4.3.5.Final

import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * BthrUnemployBkupPaycalcs5Id generated by hbm2java
 */
@Embeddable
public class BthrUnemployBkupPaycalcs5Id implements java.io.Serializable {

	private String taxYr;
	private char expenseUnemployTax;
	private char emplrTyp;
	private BigDecimal unemployRate;
	private BigDecimal unemployFicaMax;
	private BigDecimal unemployGrossSalary;
	private String module;

	public BthrUnemployBkupPaycalcs5Id() {
	}

	public BthrUnemployBkupPaycalcs5Id(String taxYr, char expenseUnemployTax, char emplrTyp, BigDecimal unemployRate,
			BigDecimal unemployFicaMax, BigDecimal unemployGrossSalary, String module) {
		this.taxYr = taxYr;
		this.expenseUnemployTax = expenseUnemployTax;
		this.emplrTyp = emplrTyp;
		this.unemployRate = unemployRate;
		this.unemployFicaMax = unemployFicaMax;
		this.unemployGrossSalary = unemployGrossSalary;
		this.module = module;
	}

	@Column(name = "TAX_YR", nullable = false, length = 4)
	public String getTaxYr() {
		return this.taxYr;
	}

	public void setTaxYr(String taxYr) {
		this.taxYr = taxYr;
	}

	@Column(name = "EXPENSE_UNEMPLOY_TAX", nullable = false, length = 1)
	public char getExpenseUnemployTax() {
		return this.expenseUnemployTax;
	}

	public void setExpenseUnemployTax(char expenseUnemployTax) {
		this.expenseUnemployTax = expenseUnemployTax;
	}

	@Column(name = "EMPLR_TYP", nullable = false, length = 1)
	public char getEmplrTyp() {
		return this.emplrTyp;
	}

	public void setEmplrTyp(char emplrTyp) {
		this.emplrTyp = emplrTyp;
	}

	@Column(name = "UNEMPLOY_RATE", nullable = false, precision = 7, scale = 6)
	public BigDecimal getUnemployRate() {
		return this.unemployRate;
	}

	public void setUnemployRate(BigDecimal unemployRate) {
		this.unemployRate = unemployRate;
	}

	@Column(name = "UNEMPLOY_FICA_MAX", nullable = false, precision = 9)
	public BigDecimal getUnemployFicaMax() {
		return this.unemployFicaMax;
	}

	public void setUnemployFicaMax(BigDecimal unemployFicaMax) {
		this.unemployFicaMax = unemployFicaMax;
	}

	@Column(name = "UNEMPLOY_GROSS_SALARY", nullable = false, precision = 9)
	public BigDecimal getUnemployGrossSalary() {
		return this.unemployGrossSalary;
	}

	public void setUnemployGrossSalary(BigDecimal unemployGrossSalary) {
		this.unemployGrossSalary = unemployGrossSalary;
	}

	@Column(name = "MODULE", nullable = false, length = 25)
	public String getModule() {
		return this.module;
	}

	public void setModule(String module) {
		this.module = module;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof BthrUnemployBkupPaycalcs5Id))
			return false;
		BthrUnemployBkupPaycalcs5Id castOther = (BthrUnemployBkupPaycalcs5Id) other;

		return ((this.getTaxYr() == castOther.getTaxYr()) || (this.getTaxYr() != null && castOther.getTaxYr() != null
				&& this.getTaxYr().equals(castOther.getTaxYr())))
				&& (this.getExpenseUnemployTax() == castOther.getExpenseUnemployTax())
				&& (this.getEmplrTyp() == castOther.getEmplrTyp())
				&& ((this.getUnemployRate() == castOther.getUnemployRate())
						|| (this.getUnemployRate() != null && castOther.getUnemployRate() != null
								&& this.getUnemployRate().equals(castOther.getUnemployRate())))
				&& ((this.getUnemployFicaMax() == castOther.getUnemployFicaMax())
						|| (this.getUnemployFicaMax() != null && castOther.getUnemployFicaMax() != null
								&& this.getUnemployFicaMax().equals(castOther.getUnemployFicaMax())))
				&& ((this.getUnemployGrossSalary() == castOther.getUnemployGrossSalary())
						|| (this.getUnemployGrossSalary() != null && castOther.getUnemployGrossSalary() != null
								&& this.getUnemployGrossSalary().equals(castOther.getUnemployGrossSalary())))
				&& ((this.getModule() == castOther.getModule()) || (this.getModule() != null
						&& castOther.getModule() != null && this.getModule().equals(castOther.getModule())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getTaxYr() == null ? 0 : this.getTaxYr().hashCode());
		result = 37 * result + this.getExpenseUnemployTax();
		result = 37 * result + this.getEmplrTyp();
		result = 37 * result + (getUnemployRate() == null ? 0 : this.getUnemployRate().hashCode());
		result = 37 * result + (getUnemployFicaMax() == null ? 0 : this.getUnemployFicaMax().hashCode());
		result = 37 * result + (getUnemployGrossSalary() == null ? 0 : this.getUnemployGrossSalary().hashCode());
		result = 37 * result + (getModule() == null ? 0 : this.getModule().hashCode());
		return result;
	}

}

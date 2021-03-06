package com.esc20.model;
// Generated Jan 4, 2019 3:50:32 PM by Hibernate Tools 4.3.5.Final

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * BthrAddToStdGrossCd generated by hbm2java
 */
@Entity
@Table(name = "BTHR_ADD_TO_STD_GROSS_CD", schema = "rsccc", catalog = "rsccc")
public class BthrAddToStdGrossCd implements java.io.Serializable {

	private char addStdGrossCd;
	private String addStdGrossCdDescr;

	public BthrAddToStdGrossCd() {
	}

	public BthrAddToStdGrossCd(char addStdGrossCd, String addStdGrossCdDescr) {
		this.addStdGrossCd = addStdGrossCd;
		this.addStdGrossCdDescr = addStdGrossCdDescr;
	}

	@Id

	@Column(name = "ADD_STD_GROSS_CD", nullable = false, length = 1)
	public char getAddStdGrossCd() {
		return this.addStdGrossCd;
	}

	public void setAddStdGrossCd(char addStdGrossCd) {
		this.addStdGrossCd = addStdGrossCd;
	}

	@Column(name = "ADD_STD_GROSS_CD_DESCR", nullable = false, length = 20)
	public String getAddStdGrossCdDescr() {
		return this.addStdGrossCdDescr;
	}

	public void setAddStdGrossCdDescr(String addStdGrossCdDescr) {
		this.addStdGrossCdDescr = addStdGrossCdDescr;
	}

}

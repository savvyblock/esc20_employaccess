package com.esc20.model;
// Generated Jan 4, 2019 3:51:06 PM by Hibernate Tools 4.3.5.Final

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * BthrEeocCd generated by hbm2java
 */
@Entity
@Table(name = "BTHR_EEOC_CD", schema = "rsccc", catalog = "rsccc")
public class BthrEeocCd implements java.io.Serializable {

	private String eeoc;
	private String eeocDescr;

	public BthrEeocCd() {
	}

	public BthrEeocCd(String eeoc, String eeocDescr) {
		this.eeoc = eeoc;
		this.eeocDescr = eeocDescr;
	}

	@Id

	@Column(name = "EEOC", nullable = false, length = 2)
	public String getEeoc() {
		return this.eeoc;
	}

	public void setEeoc(String eeoc) {
		this.eeoc = eeoc;
	}

	@Column(name = "EEOC_DESCR", nullable = false, length = 20)
	public String getEeocDescr() {
		return this.eeocDescr;
	}

	public void setEeocDescr(String eeocDescr) {
		this.eeocDescr = eeocDescr;
	}

}
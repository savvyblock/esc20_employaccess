package com.esc20.model;
// Generated Jan 4, 2019 3:54:58 PM by Hibernate Tools 4.3.5.Final

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * BthrSubTyp generated by hbm2java
 */
@Entity
@Table(name = "BTHR_SUB_TYP", schema = "rsccc", catalog = "rsccc")
public class BthrSubTyp implements java.io.Serializable {

	private String subTyp;
	private String subDescr;
	private String module;
	private Set<BthrSubTime> bthrSubTimes = new HashSet<BthrSubTime>(0);

	public BthrSubTyp() {
	}

	public BthrSubTyp(String subTyp, String subDescr, String module) {
		this.subTyp = subTyp;
		this.subDescr = subDescr;
		this.module = module;
	}

	public BthrSubTyp(String subTyp, String subDescr, String module, Set<BthrSubTime> bthrSubTimes) {
		this.subTyp = subTyp;
		this.subDescr = subDescr;
		this.module = module;
		this.bthrSubTimes = bthrSubTimes;
	}

	@Id

	@Column(name = "SUB_TYP", nullable = false, length = 2)
	public String getSubTyp() {
		return this.subTyp;
	}

	public void setSubTyp(String subTyp) {
		this.subTyp = subTyp;
	}

	@Column(name = "SUB_DESCR", nullable = false, length = 30)
	public String getSubDescr() {
		return this.subDescr;
	}

	public void setSubDescr(String subDescr) {
		this.subDescr = subDescr;
	}

	@Column(name = "MODULE", nullable = false, length = 25)
	public String getModule() {
		return this.module;
	}

	public void setModule(String module) {
		this.module = module;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "bthrSubTyp")
	public Set<BthrSubTime> getBthrSubTimes() {
		return this.bthrSubTimes;
	}

	public void setBthrSubTimes(Set<BthrSubTime> bthrSubTimes) {
		this.bthrSubTimes = bthrSubTimes;
	}

}

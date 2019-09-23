package com.esc20.model;
// Generated Jan 4, 2019 3:30:30 PM by Hibernate Tools 4.3.5.Final

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * BeaMrtlStat generated by hbm2java
 */
@Entity
@Table(name = "BEA_MRTL_STAT", schema = "rsccc", catalog = "rsccc")
public class BeaMrtlStat implements java.io.Serializable {
	private static final long serialVersionUID = 6715142900654758429L;
	private BeaMrtlStatId id;
	private Character maritalStat;
	private Character maritalStatNew;
	private String apprvdDts;
	private Integer apprvrUsrId;
	private Character statCd;

	public BeaMrtlStat() {
	}

	public BeaMrtlStat(BeaMrtlStatId id, Character maritalStat, Character maritalStatNew, String apprvdDts, Integer apprvrUsrId,
			Character statCd) {
		this.id = id;
		this.maritalStat = maritalStat;
		this.maritalStatNew = maritalStatNew;
		this.apprvdDts = apprvdDts;
		this.apprvrUsrId = apprvrUsrId;
		this.statCd = statCd;
	}

	public BeaMrtlStat(BhrEmpDemo demo) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmssSS");
		BeaMrtlStatId id = new BeaMrtlStatId();
		id.setEmpNbr(demo.getEmpNbr());
		id.setReqDts(sdf.format(new Date()).substring(0,16));
		this.id = id;
		this.maritalStat = demo.getMaritalStat();
		this.maritalStatNew = demo.getMaritalStat();
		this.apprvdDts = "";
		this.apprvrUsrId = -1;
		this.statCd = 'P';
	}
	public BeaMrtlStat(BhrEmpDemo demo, String empNbr, String reqDts, String maritalStatNew, Character statCd) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmssSS");
		BeaMrtlStatId id = new BeaMrtlStatId();
		id.setEmpNbr(empNbr);
		id.setReqDts(reqDts);
		this.id = id;
		this.maritalStat = demo.getMaritalStat()==null?'S':demo.getMaritalStat();
		if(maritalStatNew==null) {
			this.maritalStatNew='S';
		}else {
			if(maritalStatNew.length()>0) {
				this.maritalStatNew = maritalStatNew.charAt(0);
			}
			else {
				this.maritalStatNew='S';
			}
		}
		
		
		if("A".equals(statCd.toString())) {
			this.apprvdDts = sdf.format(new Date()).substring(0, 16);
			this.apprvrUsrId = 0;
		}else {
			this.apprvdDts = "";
			this.apprvrUsrId = -1;
		}
		this.statCd = statCd;
	}
	@EmbeddedId

	@AttributeOverrides({
			@AttributeOverride(name = "empNbr", column = @Column(name = "EMP_NBR", nullable = false, length = 6)),
			@AttributeOverride(name = "reqDts", column = @Column(name = "REQ_DTS", nullable = false, length = 16)) })
	public BeaMrtlStatId getId() {
		return this.id;
	}

	public void setId(BeaMrtlStatId id) {
		this.id = id;
	}

	@Column(name = "MARITAL_STAT", nullable = false, length = 1)
	public Character getMaritalStat() {
		return this.maritalStat;
	}

	public void setMaritalStat(Character maritalStat) {
		this.maritalStat = maritalStat;
	}

	@Column(name = "MARITAL_STAT_NEW", nullable = false, length = 1)
	public Character getMaritalStatNew() {
		return this.maritalStatNew;
	}

	public void setMaritalStatNew(Character maritalStatNew) {
		this.maritalStatNew = maritalStatNew;
	}

	@Column(name = "APPRVD_DTS", nullable = false, length = 16)
	public String getApprvdDts() {
		return this.apprvdDts;
	}

	public void setApprvdDts(String apprvdDts) {
		this.apprvdDts = apprvdDts;
	}

	@Column(name = "APPRVR_USR_ID", nullable = false)
	public Integer getApprvrUsrId() {
		return this.apprvrUsrId;
	}

	public void setApprvrUsrId(Integer apprvrUsrId) {
		this.apprvrUsrId = apprvrUsrId;
	}

	@Column(name = "STAT_CD", nullable = false, length = 1)
	public Character getStatCd() {
		return this.statCd;
	}

	public void setStatCd(Character statCd) {
		this.statCd = statCd;
	}

}

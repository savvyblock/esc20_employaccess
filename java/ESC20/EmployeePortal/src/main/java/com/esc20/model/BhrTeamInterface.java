package com.esc20.model;
// Generated Jan 4, 2019 3:55:15 PM by Hibernate Tools 4.3.5.Final

import java.math.BigDecimal;
import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * BhrTeamInterface generated by hbm2java
 */
@Entity
@Table(name = "bhr_team_interface", schema = "rsccc", catalog = "rsccc")
public class BhrTeamInterface implements java.io.Serializable {

	private BhrTeamInterfaceId id;
	private char glFileId;
	private String dts;
	private String transDt;
	private String jeDescr;
	private BigDecimal jeAppropAmt;
	private BigDecimal jeEncumAmt;
	private BigDecimal jeExpendAmt;
	private BigDecimal jeEstRevnuAmt;
	private BigDecimal jeRlzdRevnuAmt;
	private BigDecimal balAmt;
	private String userId;
	private String applictnId;
	private char transCorrectionFlg;
	private char jvTotDisp;

	public BhrTeamInterface() {
	}

	public BhrTeamInterface(BhrTeamInterfaceId id, char glFileId, String dts, String transDt, String jeDescr,
			BigDecimal jeAppropAmt, BigDecimal jeEncumAmt, BigDecimal jeExpendAmt, BigDecimal jeEstRevnuAmt,
			BigDecimal jeRlzdRevnuAmt, BigDecimal balAmt, String userId, String applictnId, char transCorrectionFlg,
			char jvTotDisp) {
		this.id = id;
		this.glFileId = glFileId;
		this.dts = dts;
		this.transDt = transDt;
		this.jeDescr = jeDescr;
		this.jeAppropAmt = jeAppropAmt;
		this.jeEncumAmt = jeEncumAmt;
		this.jeExpendAmt = jeExpendAmt;
		this.jeEstRevnuAmt = jeEstRevnuAmt;
		this.jeRlzdRevnuAmt = jeRlzdRevnuAmt;
		this.balAmt = balAmt;
		this.userId = userId;
		this.applictnId = applictnId;
		this.transCorrectionFlg = transCorrectionFlg;
		this.jvTotDisp = jvTotDisp;
	}

	@EmbeddedId

	@AttributeOverrides({
			@AttributeOverride(name = "rptYr", column = @Column(name = "rpt_yr", nullable = false, length = 4)),
			@AttributeOverride(name = "rptMo", column = @Column(name = "rpt_mo", nullable = false, length = 2)),
			@AttributeOverride(name = "adjNbr", column = @Column(name = "adj_nbr", nullable = false, precision = 3, scale = 0)),
			@AttributeOverride(name = "recTyp", column = @Column(name = "rec_typ", nullable = false, length = 6)),
			@AttributeOverride(name = "fund", column = @Column(name = "fund", nullable = false, length = 3)),
			@AttributeOverride(name = "fsclYr", column = @Column(name = "fscl_yr", nullable = false, length = 1)),
			@AttributeOverride(name = "func", column = @Column(name = "func", nullable = false, length = 2)),
			@AttributeOverride(name = "sobj", column = @Column(name = "sobj", nullable = false, length = 2)),
			@AttributeOverride(name = "obj", column = @Column(name = "obj", nullable = false, length = 4)),
			@AttributeOverride(name = "org", column = @Column(name = "org", nullable = false, length = 3)),
			@AttributeOverride(name = "pgm", column = @Column(name = "pgm", nullable = false, length = 2)),
			@AttributeOverride(name = "edSpan", column = @Column(name = "ed_span", nullable = false, length = 1)),
			@AttributeOverride(name = "projDtl", column = @Column(name = "proj_dtl", nullable = false, length = 2)),
			@AttributeOverride(name = "jvNbr", column = @Column(name = "jv_nbr", nullable = false, length = 6)),
			@AttributeOverride(name = "seqNbr", column = @Column(name = "seq_nbr", nullable = false, length = 5)) })
	public BhrTeamInterfaceId getId() {
		return this.id;
	}

	public void setId(BhrTeamInterfaceId id) {
		this.id = id;
	}

	@Column(name = "gl_file_id", nullable = false, length = 1)
	public char getGlFileId() {
		return this.glFileId;
	}

	public void setGlFileId(char glFileId) {
		this.glFileId = glFileId;
	}

	@Column(name = "dts", nullable = false, length = 16)
	public String getDts() {
		return this.dts;
	}

	public void setDts(String dts) {
		this.dts = dts;
	}

	@Column(name = "trans_dt", nullable = false, length = 8)
	public String getTransDt() {
		return this.transDt;
	}

	public void setTransDt(String transDt) {
		this.transDt = transDt;
	}

	@Column(name = "je_descr", nullable = false, length = 30)
	public String getJeDescr() {
		return this.jeDescr;
	}

	public void setJeDescr(String jeDescr) {
		this.jeDescr = jeDescr;
	}

	@Column(name = "je_approp_amt", nullable = false, precision = 11)
	public BigDecimal getJeAppropAmt() {
		return this.jeAppropAmt;
	}

	public void setJeAppropAmt(BigDecimal jeAppropAmt) {
		this.jeAppropAmt = jeAppropAmt;
	}

	@Column(name = "je_encum_amt", nullable = false, precision = 11)
	public BigDecimal getJeEncumAmt() {
		return this.jeEncumAmt;
	}

	public void setJeEncumAmt(BigDecimal jeEncumAmt) {
		this.jeEncumAmt = jeEncumAmt;
	}

	@Column(name = "je_expend_amt", nullable = false, precision = 11)
	public BigDecimal getJeExpendAmt() {
		return this.jeExpendAmt;
	}

	public void setJeExpendAmt(BigDecimal jeExpendAmt) {
		this.jeExpendAmt = jeExpendAmt;
	}

	@Column(name = "je_est_revnu_amt", nullable = false, precision = 11)
	public BigDecimal getJeEstRevnuAmt() {
		return this.jeEstRevnuAmt;
	}

	public void setJeEstRevnuAmt(BigDecimal jeEstRevnuAmt) {
		this.jeEstRevnuAmt = jeEstRevnuAmt;
	}

	@Column(name = "je_rlzd_revnu_amt", nullable = false, precision = 11)
	public BigDecimal getJeRlzdRevnuAmt() {
		return this.jeRlzdRevnuAmt;
	}

	public void setJeRlzdRevnuAmt(BigDecimal jeRlzdRevnuAmt) {
		this.jeRlzdRevnuAmt = jeRlzdRevnuAmt;
	}

	@Column(name = "bal_amt", nullable = false, precision = 11)
	public BigDecimal getBalAmt() {
		return this.balAmt;
	}

	public void setBalAmt(BigDecimal balAmt) {
		this.balAmt = balAmt;
	}

	@Column(name = "user_id", nullable = false, length = 12)
	public String getUserId() {
		return this.userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	@Column(name = "applictn_id", nullable = false, length = 4)
	public String getApplictnId() {
		return this.applictnId;
	}

	public void setApplictnId(String applictnId) {
		this.applictnId = applictnId;
	}

	@Column(name = "trans_correction_flg", nullable = false, length = 1)
	public char getTransCorrectionFlg() {
		return this.transCorrectionFlg;
	}

	public void setTransCorrectionFlg(char transCorrectionFlg) {
		this.transCorrectionFlg = transCorrectionFlg;
	}

	@Column(name = "jv_tot_disp", nullable = false, length = 1)
	public char getJvTotDisp() {
		return this.jvTotDisp;
	}

	public void setJvTotDisp(char jvTotDisp) {
		this.jvTotDisp = jvTotDisp;
	}

}
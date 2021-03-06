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
 * BeaCellPhone generated by hbm2java
 */
@Entity
@Table(name = "BEA_CELL_PHONE", schema = "rsccc", catalog = "rsccc")
public class BeaCellPhone implements java.io.Serializable {
	private static final long serialVersionUID = 6715142900654758429L;
	private BeaCellPhoneId id;
	private String phoneAreaCell;
	private String phoneNbrCell;
	private String phoneAreaCellNew;
	private String phoneNbrCellNew;
	private String apprvdDts;
	private Integer apprvrUsrId;
	private Character statCd;

	public BeaCellPhone() {
	}

	public BeaCellPhone(BeaCellPhoneId id, String phoneAreaCell, String phoneNbrCell, String phoneAreaCellNew,
			String phoneNbrCellNew, String apprvdDts, Integer apprvrUsrId, Character statCd) {
		this.id = id;
		this.phoneAreaCell = phoneAreaCell;
		this.phoneNbrCell = phoneNbrCell;
		this.phoneAreaCellNew = phoneAreaCellNew;
		this.phoneNbrCellNew = phoneNbrCellNew;
		this.apprvdDts = apprvdDts;
		this.apprvrUsrId = apprvrUsrId;
		this.statCd = statCd;
	}

	public BeaCellPhone(BhrEmpDemo demo) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmssSS");
		BeaCellPhoneId id = new BeaCellPhoneId();
		id.setEmpNbr(demo.getEmpNbr());
		id.setReqDts(sdf.format(new Date()).substring(0, 16));
		this.id = id;
		this.phoneAreaCell = demo.getPhoneAreaCell();
		this.phoneNbrCell = demo.getPhoneNbrCell();
		this.phoneAreaCellNew = demo.getPhoneAreaCell();
		this.phoneNbrCellNew = demo.getPhoneNbrCell();
		this.apprvdDts = "";
		this.apprvrUsrId = -1;
		this.statCd = 'P';
	}
	public BeaCellPhone(BhrEmpDemo demo, String empNbr, String reqDts, String phoneAreaCellNew, String phoneNbrCellNew, Character statCd) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmssSS");
		BeaCellPhoneId id = new BeaCellPhoneId();
		id.setEmpNbr(empNbr);
		id.setReqDts(reqDts);
		this.id = id;
		this.phoneAreaCell = demo.getPhoneAreaCell()==null?"":demo.getPhoneAreaCell();
		this.phoneAreaCellNew = phoneAreaCellNew;
		this.phoneNbrCell = demo.getPhoneNbrCell()==null?"":demo.getPhoneNbrCell();
		this.phoneNbrCellNew = phoneNbrCellNew;
		
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
	public BeaCellPhoneId getId() {
		return this.id;
	}

	public void setId(BeaCellPhoneId id) {
		this.id = id;
	}

	@Column(name = "PHONE_AREA_CELL", nullable = false, length = 3)
	public String getPhoneAreaCell() {
		return this.phoneAreaCell;
	}

	public void setPhoneAreaCell(String phoneAreaCell) {
		this.phoneAreaCell = phoneAreaCell;
	}

	@Column(name = "PHONE_NBR_CELL", nullable = false, length = 7)
	public String getPhoneNbrCell() {
		return this.phoneNbrCell;
	}

	public void setPhoneNbrCell(String phoneNbrCell) {
		this.phoneNbrCell = phoneNbrCell;
	}

	@Column(name = "PHONE_AREA_CELL_NEW", nullable = false, length = 3)
	public String getPhoneAreaCellNew() {
		return this.phoneAreaCellNew;
	}

	public void setPhoneAreaCellNew(String phoneAreaCellNew) {
		this.phoneAreaCellNew = phoneAreaCellNew;
	}

	@Column(name = "PHONE_NBR_CELL_NEW", nullable = false, length = 7)
	public String getPhoneNbrCellNew() {
		return this.phoneNbrCellNew;
	}

	public void setPhoneNbrCellNew(String phoneNbrCellNew) {
		this.phoneNbrCellNew = phoneNbrCellNew;
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

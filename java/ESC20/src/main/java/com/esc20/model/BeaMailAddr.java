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
 * BeaMailAddr generated by hbm2java
 */
@Entity
@Table(name = "BEA_MAIL_ADDR", schema = "rsccc", catalog = "rsccc")
public class BeaMailAddr implements java.io.Serializable {
	private static final long serialVersionUID = 6715142900654758429L;
	private BeaMailAddrId id;
	private String addrNbr;
	private String addrStr;
	private String addrApt;
	private String addrCity;
	private String addrSt;
	private String addrZip;
	private String addrZip4;
	private String addrNbrNew;
	private String addrStrNew;
	private String addrAptNew;
	private String addrCityNew;
	private String addrStNew;
	private String addrZipNew;
	private String addrZip4New;
	private String apprvdDts;
	private int apprvrUsrId;
	private char statCd;

	public BeaMailAddr() {
	}

	public BeaMailAddr(BeaMailAddrId id, String addrNbr, String addrStr, String addrApt, String addrCity, String addrSt,
			String addrZip, String addrZip4, String addrNbrNew, String addrStrNew, String addrAptNew,
			String addrCityNew, String addrStNew, String addrZipNew, String addrZip4New, String apprvdDts,
			int apprvrUsrId, char statCd) {
		this.id = id;
		this.addrNbr = addrNbr;
		this.addrStr = addrStr;
		this.addrApt = addrApt;
		this.addrCity = addrCity;
		this.addrSt = addrSt;
		this.addrZip = addrZip;
		this.addrZip4 = addrZip4;
		this.addrNbrNew = addrNbrNew;
		this.addrStrNew = addrStrNew;
		this.addrAptNew = addrAptNew;
		this.addrCityNew = addrCityNew;
		this.addrStNew = addrStNew;
		this.addrZipNew = addrZipNew;
		this.addrZip4New = addrZip4New;
		this.apprvdDts = apprvdDts;
		this.apprvrUsrId = apprvrUsrId;
		this.statCd = statCd;
	}

	public BeaMailAddr(BhrEmpDemo demo) {
		BeaMailAddrId id = new BeaMailAddrId();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmssSS");
		id.setEmpNbr(demo.getEmpNbr());
		id.setReqDts(sdf.format(new Date()).substring(0, 16));
		this.id = id;
		this.addrNbr = demo.getAddrNbr();
		this.addrStr = demo.getAddrStr();
		this.addrApt = demo.getAddrApt();
		this.addrCity = demo.getAddrCity();
		this.addrSt = demo.getAddrSt();
		this.addrZip = demo.getAddrZip();
		this.addrZip4 = demo.getAddrZip4();
		this.addrNbrNew = demo.getAddrNbr();
		this.addrStrNew = demo.getAddrStr();
		this.addrAptNew = demo.getAddrApt();
		this.addrCityNew = demo.getAddrCity();
		this.addrStNew = demo.getAddrSt();
		this.addrZipNew = demo.getAddrZip();
		this.addrZip4New = demo.getAddrZip4();
		this.apprvdDts = "";
		this.apprvrUsrId = -1;
		this.statCd = 'P';
	}
	public BeaMailAddr(BhrEmpDemo demo, String empNbr, String reqDts, String addrNbrNew, String addrStrNew,String addrAptNew,
			String addrCityNew, String addrStNew, String addrZipNew,String addrZip4New, Character statCd) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmssSS");
		BeaMailAddrId id = new BeaMailAddrId();
		id.setEmpNbr(empNbr);
		id.setReqDts(reqDts);
		this.id = id;
		this.addrNbr = demo.getAddrNbr()==null?"":demo.getAddrNbr();
		this.addrNbrNew = addrNbrNew;
		this.addrStr = demo.getAddrStr()==null?"":demo.getAddrStr();
		this.addrStrNew = addrStrNew;
		this.addrApt = demo.getAddrApt()==null?"":demo.getAddrApt();
		this.addrAptNew = addrAptNew;
		this.addrCity = demo.getAddrCity()==null?"":demo.getAddrCity();
		this.addrCityNew = addrCityNew;
		this.addrSt = demo.getAddrSt()==null?"":demo.getAddrSt();
		this.addrStNew = addrStNew;
		this.addrZip = demo.getAddrZip()==null?"":demo.getAddrZip();
		this.addrZipNew = addrZipNew;
		this.addrZip4 = demo.getAddrZip4()==null?"":demo.getAddrZip4();
		this.addrZip4New = addrZip4New;
		
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
	public BeaMailAddrId getId() {
		return this.id;
	}

	public void setId(BeaMailAddrId id) {
		this.id = id;
	}

	@Column(name = "ADDR_NBR", nullable = false, length = 8)
	public String getAddrNbr() {
		return this.addrNbr;
	}

	public void setAddrNbr(String addrNbr) {
		this.addrNbr = addrNbr;
	}

	@Column(name = "ADDR_STR", nullable = false, length = 20)
	public String getAddrStr() {
		return this.addrStr;
	}

	public void setAddrStr(String addrStr) {
		this.addrStr = addrStr;
	}

	@Column(name = "ADDR_APT", nullable = false, length = 7)
	public String getAddrApt() {
		return this.addrApt;
	}

	public void setAddrApt(String addrApt) {
		this.addrApt = addrApt;
	}

	@Column(name = "ADDR_CITY", nullable = false, length = 25)
	public String getAddrCity() {
		return this.addrCity;
	}

	public void setAddrCity(String addrCity) {
		this.addrCity = addrCity;
	}

	@Column(name = "ADDR_ST", nullable = false, length = 2)
	public String getAddrSt() {
		return this.addrSt;
	}

	public void setAddrSt(String addrSt) {
		this.addrSt = addrSt;
	}

	@Column(name = "ADDR_ZIP", nullable = false, length = 5)
	public String getAddrZip() {
		return this.addrZip;
	}

	public void setAddrZip(String addrZip) {
		this.addrZip = addrZip;
	}

	@Column(name = "ADDR_ZIP4", nullable = false, length = 4)
	public String getAddrZip4() {
		return this.addrZip4;
	}

	public void setAddrZip4(String addrZip4) {
		this.addrZip4 = addrZip4;
	}

	@Column(name = "ADDR_NBR_NEW", nullable = false, length = 8)
	public String getAddrNbrNew() {
		return this.addrNbrNew;
	}

	public void setAddrNbrNew(String addrNbrNew) {
		this.addrNbrNew = addrNbrNew;
	}

	@Column(name = "ADDR_STR_NEW", nullable = false, length = 20)
	public String getAddrStrNew() {
		return this.addrStrNew;
	}

	public void setAddrStrNew(String addrStrNew) {
		this.addrStrNew = addrStrNew;
	}

	@Column(name = "ADDR_APT_NEW", nullable = false, length = 7)
	public String getAddrAptNew() {
		return this.addrAptNew;
	}

	public void setAddrAptNew(String addrAptNew) {
		this.addrAptNew = addrAptNew;
	}

	@Column(name = "ADDR_CITY_NEW", nullable = false, length = 25)
	public String getAddrCityNew() {
		return this.addrCityNew;
	}

	public void setAddrCityNew(String addrCityNew) {
		this.addrCityNew = addrCityNew;
	}

	@Column(name = "ADDR_ST_NEW", nullable = false, length = 2)
	public String getAddrStNew() {
		return this.addrStNew;
	}

	public void setAddrStNew(String addrStNew) {
		this.addrStNew = addrStNew;
	}

	@Column(name = "ADDR_ZIP_NEW", nullable = false, length = 5)
	public String getAddrZipNew() {
		return this.addrZipNew;
	}

	public void setAddrZipNew(String addrZipNew) {
		this.addrZipNew = addrZipNew;
	}

	@Column(name = "ADDR_ZIP4_NEW", nullable = false, length = 4)
	public String getAddrZip4New() {
		return this.addrZip4New;
	}

	public void setAddrZip4New(String addrZip4New) {
		this.addrZip4New = addrZip4New;
	}

	@Column(name = "APPRVD_DTS", nullable = false, length = 16)
	public String getApprvdDts() {
		return this.apprvdDts;
	}

	public void setApprvdDts(String apprvdDts) {
		this.apprvdDts = apprvdDts;
	}

	@Column(name = "APPRVR_USR_ID", nullable = false)
	public int getApprvrUsrId() {
		return this.apprvrUsrId;
	}

	public void setApprvrUsrId(int apprvrUsrId) {
		this.apprvrUsrId = apprvrUsrId;
	}

	@Column(name = "STAT_CD", nullable = false, length = 1)
	public char getStatCd() {
		return this.statCd;
	}

	public void setStatCd(char statCd) {
		this.statCd = statCd;
	}

}
package jms.board.domain;

import java.util.Date;

public class JobVO {
	String bzwr_dstc;
	String job_cd;
	String sqno;
	String bzwr_sts; 
	String bzwr_reg_dt; 
	String bzwr_cmpl_dt; 
	String bzwr_indc_chgr; 
	String bzwr_exc_chgr; 
	String bzwr_ttl; 
	String bzwr_cntn; 
	String temp_one; 
	String temp_two; 
	String remark; 
	String chng_dt; 
	String chng_tm;
	String del_yn; 
	Date frst_reg_tmsp; 
	String frst_reg_guid; 
	String frst_reg_usrno; 
	Date last_chng_tmsp; 
	String last_chng_guid; 
	String last_chng_usrno;
	public String getBzwr_dstc() {
		return bzwr_dstc;
	}
	public void setBzwr_dstc(String bzwr_dstc) {
		this.bzwr_dstc = bzwr_dstc;
	}
	public String getJob_cd() {
		return job_cd;
	}
	public void setJob_cd(String job_cd) {
		this.job_cd = job_cd;
	}
	public String getSqno() {
		return sqno;
	}
	public void setSqno(String sqno) {
		this.sqno = sqno;
	}
	public String getBzwr_sts() {
		return bzwr_sts;
	}
	public void setBzwr_sts(String bzwr_sts) {
		this.bzwr_sts = bzwr_sts;
	}
	public String getBzwr_reg_dt() {
		return bzwr_reg_dt;
	}
	public void setBzwr_reg_dt(String bzwr_reg_dt) {
		this.bzwr_reg_dt = bzwr_reg_dt;
	}
	public String getBzwr_cmpl_dt() {
		return bzwr_cmpl_dt;
	}
	public void setBzwr_cmpl_dt(String bzwr_cmpl_dt) {
		this.bzwr_cmpl_dt = bzwr_cmpl_dt;
	}
	public String getBzwr_indc_chgr() {
		return bzwr_indc_chgr;
	}
	public void setBzwr_indc_chgr(String bzwr_indc_chgr) {
		this.bzwr_indc_chgr = bzwr_indc_chgr;
	}
	public String getBzwr_exc_chgr() {
		return bzwr_exc_chgr;
	}
	public void setBzwr_exc_chgr(String bzwr_exc_chgr) {
		this.bzwr_exc_chgr = bzwr_exc_chgr;
	}
	public String getBzwr_ttl() {
		return bzwr_ttl;
	}
	public void setBzwr_ttl(String bzwr_ttl) {
		this.bzwr_ttl = bzwr_ttl;
	}
	public String getBzwr_cntn() {
		return bzwr_cntn;
	}
	public void setBzwr_cntn(String bzwr_cntn) {
		this.bzwr_cntn = bzwr_cntn;
	}
	public String getTemp_one() {
		return temp_one;
	}
	public void setTemp_one(String temp_one) {
		this.temp_one = temp_one;
	}
	public String getTemp_two() {
		return temp_two;
	}
	public void setTemp_two(String temp_two) {
		this.temp_two = temp_two;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public String getChng_dt() {
		return chng_dt;
	}
	public void setChng_dt(String chng_dt) {
		this.chng_dt = chng_dt;
	}
	public String getChng_tm() {
		return chng_tm;
	}
	public void setChng_tm(String chng_tm) {
		this.chng_tm = chng_tm;
	}
	public String getDel_yn() {
		return del_yn;
	}
	public void setDel_yn(String del_yn) {
		this.del_yn = del_yn;
	}
	public Date getFrst_reg_tmsp() {
		return frst_reg_tmsp;
	}
	public void setFrst_reg_tmsp(Date frst_reg_tmsp) {
		this.frst_reg_tmsp = frst_reg_tmsp;
	}
	public String getFrst_reg_guid() {
		return frst_reg_guid;
	}
	public void setFrst_reg_guid(String frst_reg_guid) {
		this.frst_reg_guid = frst_reg_guid;
	}
	public String getFrst_reg_usrno() {
		return frst_reg_usrno;
	}
	public void setFrst_reg_usrno(String frst_reg_usrno) {
		this.frst_reg_usrno = frst_reg_usrno;
	}
	public Date getLast_chng_tmsp() {
		return last_chng_tmsp;
	}
	public void setLast_chng_tmsp(Date last_chng_tmsp) {
		this.last_chng_tmsp = last_chng_tmsp;
	}
	public String getLast_chng_guid() {
		return last_chng_guid;
	}
	public void setLast_chng_guid(String last_chng_guid) {
		this.last_chng_guid = last_chng_guid;
	}
	public String getLast_chng_usrno() {
		return last_chng_usrno;
	}
	public void setLast_chng_usrno(String last_chng_usrno) {
		this.last_chng_usrno = last_chng_usrno;
	}
	
	@Override
	public String toString() {
		return "JobVO [bzwr_dstc=" + bzwr_dstc + ", job_cd=" + job_cd + ", sqno=" + sqno + ", bzwr_sts=" + bzwr_sts
				+ ", bzwr_reg_dt=" + bzwr_reg_dt + ", bzwr_cmpl_dt=" + bzwr_cmpl_dt + ", bzwr_indc_chgr="
				+ bzwr_indc_chgr + ", bzwr_exc_chgr=" + bzwr_exc_chgr + ", bzwr_ttl=" + bzwr_ttl + ", bzwr_cntn="
				+ bzwr_cntn + ", temp_one=" + temp_one + ", temp_two=" + temp_two + ", remark=" + remark + ", chng_dt="
				+ chng_dt + ", chng_tm=" + chng_tm + ", del_yn=" + del_yn + ", frst_reg_tmsp=" + frst_reg_tmsp
				+ ", frst_reg_guid=" + frst_reg_guid + ", frst_reg_usrno=" + frst_reg_usrno + ", last_chng_tmsp="
				+ last_chng_tmsp + ", last_chng_guid=" + last_chng_guid + ", last_chng_usrno=" + last_chng_usrno + "]";
	}

	
	
}

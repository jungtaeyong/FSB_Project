package jms.board.domain;

import java.util.Date;

public class JobVO {
	String BZWR_DSTC;
	String JOB_CD;
	String SQNO;
	String BZWR_STS; 
	String BZWR_REG_DT; 
	String BZWR_CMPL_DT; 
	String BZWR_INDC_CHGR; 
	String BZWR_EXC_CHGR; 
	String BZWR_TTL; 
	String BZWR_CNTN; 
	String TEMP_ONE; 
	String TEMP_TWO; 
	String REMARK; 
	String CHNG_DT; 
	String CHNG_TM;
	String DEL_YN; 
	Date FRST_REG_TMSP; 
	String FRST_REG_GUID; 
	String FRST_REG_USRNO; 
	Date LAST_CHNG_TMSP; 
	String LAST_CHNG_GUID; 
	String LAST_CHNG_USRNO;
	public String getBZWR_DSTC() {
		return BZWR_DSTC;
	}
	public void setBZWR_DSTC(String bZWR_DSTC) {
		BZWR_DSTC = bZWR_DSTC;
	}
	public String getJOB_CD() {
		return JOB_CD;
	}
	public void setJOB_CD(String jOB_CD) {
		JOB_CD = jOB_CD;
	}
	public String getSQNO() {
		return SQNO;
	}
	public void setSQNO(String sQNO) {
		SQNO = sQNO;
	}
	public String getBZWR_STS() {
		return BZWR_STS;
	}
	public void setBZWR_STS(String bZWR_STS) {
		BZWR_STS = bZWR_STS;
	}
	public String getBZWR_REG_DT() {
		return BZWR_REG_DT;
	}
	public void setBZWR_REG_DT(String bZWR_REG_DT) {
		BZWR_REG_DT = bZWR_REG_DT;
	}
	public String getBZWR_CMPL_DT() {
		return BZWR_CMPL_DT;
	}
	public void setBZWR_CMPL_DT(String bZWR_CMPL_DT) {
		BZWR_CMPL_DT = bZWR_CMPL_DT;
	}
	public String getBZWR_INDC_CHGR() {
		return BZWR_INDC_CHGR;
	}
	public void setBZWR_INDC_CHGR(String bZWR_INDC_CHGR) {
		BZWR_INDC_CHGR = bZWR_INDC_CHGR;
	}
	public String getBZWR_EXC_CHGR() {
		return BZWR_EXC_CHGR;
	}
	public void setBZWR_EXC_CHGR(String bZWR_EXC_CHGR) {
		BZWR_EXC_CHGR = bZWR_EXC_CHGR;
	}
	public String getBZWR_TTL() {
		return BZWR_TTL;
	}
	public void setBZWR_TTL(String bZWR_TTL) {
		BZWR_TTL = bZWR_TTL;
	}
	public String getBZWR_CNTN() {
		return BZWR_CNTN;
	}
	public void setBZWR_CNTN(String bZWR_CNTN) {
		BZWR_CNTN = bZWR_CNTN;
	}
	public String getTEMP_ONE() {
		return TEMP_ONE;
	}
	public void setTEMP_ONE(String tEMP_ONE) {
		TEMP_ONE = tEMP_ONE;
	}
	public String getTEMP_TWO() {
		return TEMP_TWO;
	}
	public void setTEMP_TWO(String tEMP_TWO) {
		TEMP_TWO = tEMP_TWO;
	}
	public String getREMARK() {
		return REMARK;
	}
	public void setREMARK(String rEMARK) {
		REMARK = rEMARK;
	}
	public String getCHNG_DT() {
		return CHNG_DT;
	}
	public void setCHNG_DT(String cHNG_DT) {
		CHNG_DT = cHNG_DT;
	}
	public String getCHNG_TM() {
		return CHNG_TM;
	}
	public void setCHNG_TM(String cHNG_TM) {
		CHNG_TM = cHNG_TM;
	}
	public String getDEL_YN() {
		return DEL_YN;
	}
	public void setDEL_YN(String dEL_YN) {
		DEL_YN = dEL_YN;
	}
	public Date getFRST_REG_TMSP() {
		return FRST_REG_TMSP;
	}
	public void setFRST_REG_TMSP(Date fRST_REG_TMSP) {
		FRST_REG_TMSP = fRST_REG_TMSP;
	}
	public String getFRST_REG_GUID() {
		return FRST_REG_GUID;
	}
	public void setFRST_REG_GUID(String fRST_REG_GUID) {
		FRST_REG_GUID = fRST_REG_GUID;
	}
	public String getFRST_REG_USRNO() {
		return FRST_REG_USRNO;
	}
	public void setFRST_REG_USRNO(String fRST_REG_USRNO) {
		FRST_REG_USRNO = fRST_REG_USRNO;
	}
	public Date getLAST_CHNG_TMSP() {
		return LAST_CHNG_TMSP;
	}
	public void setLAST_CHNG_TMSP(Date lAST_CHNG_TMSP) {
		LAST_CHNG_TMSP = lAST_CHNG_TMSP;
	}
	public String getLAST_CHNG_GUID() {
		return LAST_CHNG_GUID;
	}
	public void setLAST_CHNG_GUID(String lAST_CHNG_GUID) {
		LAST_CHNG_GUID = lAST_CHNG_GUID;
	}
	public String getLAST_CHNG_USRNO() {
		return LAST_CHNG_USRNO;
	}
	public void setLAST_CHNG_USRNO(String lAST_CHNG_USRNO) {
		LAST_CHNG_USRNO = lAST_CHNG_USRNO;
	}
	@Override
	public String toString() {
		return "JobVO [BZWR_DSTC=" + BZWR_DSTC + ", JOB_CD=" + JOB_CD + ", SQNO=" + SQNO + ", BZWR_STS=" + BZWR_STS
				+ ", BZWR_REG_DT=" + BZWR_REG_DT + ", BZWR_CMPL_DT=" + BZWR_CMPL_DT + ", BZWR_INDC_CHGR="
				+ BZWR_INDC_CHGR + ", BZWR_EXC_CHGR=" + BZWR_EXC_CHGR + ", BZWR_TTL=" + BZWR_TTL + ", BZWR_CNTN="
				+ BZWR_CNTN + ", TEMP_ONE=" + TEMP_ONE + ", TEMP_TWO=" + TEMP_TWO + ", REMARK=" + REMARK + ", CHNG_DT="
				+ CHNG_DT + ", CHNG_TM=" + CHNG_TM + ", DEL_YN=" + DEL_YN + ", FRST_REG_TMSP=" + FRST_REG_TMSP
				+ ", FRST_REG_GUID=" + FRST_REG_GUID + ", FRST_REG_USRNO=" + FRST_REG_USRNO + ", LAST_CHNG_TMSP="
				+ LAST_CHNG_TMSP + ", LAST_CHNG_GUID=" + LAST_CHNG_GUID + ", LAST_CHNG_USRNO=" + LAST_CHNG_USRNO + "]";
	}
	
	
}

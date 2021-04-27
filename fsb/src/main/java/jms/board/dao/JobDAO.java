package jms.board.dao;

import java.util.List;
import java.util.Map;

import jms.board.domain.JobHisVO;
import jms.board.domain.JobVO;

public interface JobDAO {
	
	public int writeJob(JobVO jvo) throws Exception;
	public int writeJobHis(JobHisVO jhvo) throws Exception;
	public List<JobVO> listAll(Map<String, Object> paramMap) throws Exception; 
	
}

package jms.board.dao;

import jms.board.domain.JobVO;

public interface JobDAO {
	
	public int writeJob(JobVO jvo) throws Exception;
	
}

package jms.board.service;

import jms.board.domain.JobVO;

public interface JobService {
	public int writeJob(JobVO jvo) throws Exception;
	
}

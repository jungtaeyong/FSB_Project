package jms.board.service;

import java.util.List;
import java.util.Map;

import jms.board.domain.JobHisVO;
import jms.board.domain.JobVO;

public interface JobService {
	public int writeJob(JobVO jvo, JobHisVO jhvo) throws Exception;
	public List<JobVO> listAll(Map<String, Object> paramMap) throws Exception;
}

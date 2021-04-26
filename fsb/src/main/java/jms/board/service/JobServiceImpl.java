package jms.board.service;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import jms.board.dao.JobDAO;
import jms.board.domain.JobVO;

@Service
public class JobServiceImpl implements JobService {
	
	@Inject JobDAO dao;
	
	@Override
	public int writeJob(JobVO jvo) throws Exception{
		return dao.writeJob(jvo);
	}
	
}

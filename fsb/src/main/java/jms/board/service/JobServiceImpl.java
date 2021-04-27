package jms.board.service;

import java.util.List;
import java.util.Map;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import jms.board.dao.JobDAO;
import jms.board.domain.JobHisVO;
import jms.board.domain.JobVO;

@Service
public class JobServiceImpl implements JobService {
	
	@Inject JobDAO dao;
	
	@Override
	public int writeJob(JobVO jvo, JobHisVO jhvo) throws Exception{
		dao.writeJob(jvo);
		return dao.writeJobHis(jhvo);
	}
	
	@Override
	public List<JobVO> listAll(Map<String, Object> paramMap) throws Exception{
		return dao.listAll(paramMap);
	}
	
}

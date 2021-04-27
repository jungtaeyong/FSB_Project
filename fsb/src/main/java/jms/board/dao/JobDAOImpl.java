package jms.board.dao;

import java.util.List;
import java.util.Map;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import jms.board.domain.JobHisVO;
import jms.board.domain.JobVO;

@Repository
public class JobDAOImpl implements JobDAO {
	
	@Inject SqlSession sql;
	
	private static final String ns = "jms.board.mapper.boardMapper";
	
	
	@Override
	public int writeJob(JobVO jvo) throws Exception{
		System.out.println(jvo.toString());
		return sql.insert(ns+".writeJob", jvo);
	}
	
	@Override
	public int writeJobHis(JobHisVO jhvo) throws Exception{
		System.out.println(jhvo.toString());
		return sql.insert(ns+".writeJobHis", jhvo);
	}
	
	
	@Override
	public List<JobVO> listAll(Map<String, Object> paramMap) throws Exception{
		return sql.selectList(ns+".listAll", paramMap);
	}
	
	
}

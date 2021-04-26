package jms.board.dao;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import jms.board.domain.JobVO;

@Repository
public class JobDAOImpl implements JobDAO {
	
	@Inject SqlSession sql;
	
	private static final String ns = "jms.board.mapper.boardMapper";
	
	
	@Override
	public int writeJob(JobVO jvo) throws Exception{
		System.out.println("aa");
		System.out.println(jvo.toString());
		return sql.insert(ns+".writeJob", jvo);
	}
	
}

package org.jms.web;

import java.sql.Connection;
import javax.inject.Inject;

import javax.sql.DataSource;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations= {"file:src/main/webapp/WEB-INF/spring/**/root-context.xml"})
public class MyBatisTest {
	
//	@Inject
//	private SqlSessionFactory sqlFactory;
//	
//	@Test             
//	public void testFactory() {
//		System.out.println(sqlFactory);
//	}
//	
//	@Test
//	public void testSession()throws Exception{
//		try(SqlSession session = sqlFactory.openSession()){
//			System.out.println(session);
//		}catch(Exception e) {
//			e.printStackTrace();
//		}
//	}
//	
}

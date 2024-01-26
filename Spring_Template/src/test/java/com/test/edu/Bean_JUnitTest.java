package com.test.edu;

import static org.junit.Assert.assertNotNull;

import org.apache.commons.dbcp.BasicDataSource;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.min.edu.aop.DaoLogAop_Anno;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"file:src/main/webapp/WEB-INF/spring/**/*.xml"}) // test니까 src부터!
public class Bean_JUnitTest {
	
	@Autowired
	private ApplicationContext context;
	
	@Autowired
	private SqlSessionTemplate session;
	
	@Test
	public void test() {
		BasicDataSource dataSource = context.getBean("dataSource", BasicDataSource.class);
		assertNotNull(dataSource);
		System.out.println(dataSource.getUsername());
		System.out.println(dataSource.getPassword());
		
		
		SqlSessionFactory factory = context.getBean("sqlSessionFactoryBean", SqlSessionFactory.class); // 원래 객체로 만들어줘야 하니까 factorybean 넣으면 안됨
		assertNotNull(factory);
		
//		SqlSession session = context.getBean("sqlSessionTemplate", SqlSession.class);
		assertNotNull(session);
		
		DaoLogAop_Anno anno = context.getBean("daoLogAop_Anno", DaoLogAop_Anno.class);
		assertNotNull(anno);
		
		
	}

}

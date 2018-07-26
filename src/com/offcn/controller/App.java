package com.offcn.controller;

import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import com.offcn.dao.UserDao;
import com.offcn.pojo.User;

public class App {

	private SqlSessionFactory sqlSessionFactory;
	private SqlSession sqlSession;
	
	@Before
	public void setUp() throws Exception {
		// 1、读取配置文件
		String resource = "mybatis-config.xml";
		InputStream inputStream = Resources.getResourceAsStream(resource);
		// 2、根据配置文件创建SqlSessionFactory
		sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
		//sqlSession=sqlSessionFactory.openSession();
	}

	
	@Test
	public void show(){
		
		//第一次查询
		
		SqlSession session = sqlSessionFactory.openSession();
		UserDao mapper = session.getMapper(UserDao.class);
		User findUserById = mapper.findUserById(1);
		System.out.println("--------"+findUserById);
		session.close();
		
		
		SqlSession session3 = sqlSessionFactory.openSession();
		UserDao mapper3 = session3.getMapper(UserDao.class);
		User user = new User();
		user.setUsername("u00009");
		mapper3.insertUser(user);
		session3.commit();
		session3.close();
		
		
		//第二次查询
		SqlSession session2 = sqlSessionFactory.openSession();
		UserDao mapper2 = session2.getMapper(UserDao.class);
		User findUserById2 = mapper2.findUserById(1);
		System.out.println("======"+findUserById2);
		session2.close();
		
	}	
	
}

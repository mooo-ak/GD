package com.min.edu.model.mapper;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class UserDaoimpl implements IUserDao {

	@Autowired
	private SqlSessionTemplate session;
	
}

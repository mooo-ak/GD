package com.min.edu.model.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.min.edu.model.mapper.IUserDao;

@Service
public class UserServiceImpl implements IUserService {

	@Autowired
	private IUserDao dao;
}

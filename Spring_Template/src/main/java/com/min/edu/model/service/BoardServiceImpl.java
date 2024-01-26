package com.min.edu.model.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.min.edu.model.mapper.IBoardDao;

@Service
public class BoardServiceImpl implements IBoardService {

	@Autowired
	private IBoardDao dao;
}

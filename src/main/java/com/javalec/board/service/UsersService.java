package com.javalec.board.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javalec.board.dao.UsersDao;
import com.javalec.board.vo.UsersVo;
@Service("usersService")
public class UsersService {
	@Autowired
	private UsersDao dao;
	
	public void insertusers(UsersVo vo) {
		dao.insert(vo);
	}	
	public UsersVo getusers(UsersVo vo) {
		return dao.getusers(vo);
	}
}

package com.javalec.board.dao;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.javalec.board.vo.UsersVo;

@Repository
public class UsersDao {
	
	@Autowired
	private SqlSessionTemplate mybatis;
	
	public void insert(UsersVo vo) {		
	
		mybatis.insert("UsersDao.insert", vo);
	}
	
	public UsersVo getusers(UsersVo vo) {
		return mybatis.selectOne("UsersDao.getusersvo", vo);
	}
	
}

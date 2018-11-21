package com.javalec.board.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.javalec.board.vo.BoardVo;

@Repository
public class BoardDao {
	@Autowired
	private SqlSessionTemplate mybatis;
	
	public List<BoardVo> getboardVOList(){
		return mybatis.selectList("BoardDao.getList");
	}

	public void write(BoardVo vo) {
		System.out.println(vo.toString());
		mybatis.update("BoardDao.write", vo);
	}
	
	public List<BoardVo> searchtitle(String keyword){
		return mybatis.selectList("BoardDao.searchtitle",keyword);
	}
	public List<BoardVo> searchcontent(String keyword){
		return mybatis.selectList("BoardDao.searchcontent",keyword);
	}
	
	public BoardVo selectone(BoardVo vo) {
		return mybatis.selectOne("BoardDao.searchone",vo);
	}
	
	public void cntplus(BoardVo vo) {
		mybatis.update("BoardDao.cntplus", vo);
	}

	public void delete(BoardVo vo) {
		mybatis.update("BoardDao.delete",vo);
	}

	public void update(BoardVo vo) {
		mybatis.update("BoardDao.update",vo);
	}
}

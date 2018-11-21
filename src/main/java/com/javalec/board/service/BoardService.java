package com.javalec.board.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javalec.board.dao.BoardDao;
import com.javalec.board.vo.BoardVo;

@Service("boardService")
public class BoardService {
	@Autowired
	private BoardDao dao;
	
	
	public List<BoardVo> getboardVOlist() {
		return dao.getboardVOList();
	}


	public void write(BoardVo vo) {
		System.out.println(vo.toString());
		dao.write(vo);
	}
	
	public List<BoardVo> searchtitle(String keyword){
		return dao.searchtitle(keyword);
	}
	public List<BoardVo> searchcontent(String keyword){
		return dao.searchcontent(keyword);
	}
	
	public BoardVo selectone(BoardVo vo) {
		return dao.selectone(vo);
	}
	
	public void cntplus(BoardVo vo) {
		dao.cntplus(vo);
	}


	public void delete(BoardVo vo) {
		dao.delete(vo);
	}


	public void update(BoardVo vo) {
		dao.update(vo);
	}
}
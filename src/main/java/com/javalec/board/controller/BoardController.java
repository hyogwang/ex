package com.javalec.board.controller;


import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.javalec.board.service.BoardService;
import com.javalec.board.vo.BoardVo;

@Controller
public class BoardController {
	@Autowired
	@Qualifier("boardService")
	private BoardService boardService;
	
	@RequestMapping("/boardlist.do")
	public String list(Model model, HttpServletRequest req) {

		String keyword = req.getParameter("keyword");
		String type = req.getParameter("searchCondition");
		if (keyword == null) {
			model.addAttribute("list", boardService.getboardVOlist());
		} else {
			keyword = "%" + req.getParameter("keyword") + "%";
			if (type.equals("content")) {
				model.addAttribute("list", boardService.searchcontent(keyword));
			} else {
				model.addAttribute("list", boardService.searchtitle(keyword));
			}
		}
		return "getBoardList.jsp";
	}
			
	@RequestMapping("delete.do")
	public String delete(BoardVo vo) {
		boardService.delete(vo);
		return "boardlist.do";
	}
	
	@RequestMapping("update.do")
	public String update(BoardVo vo) {
		boardService.update(vo);
		return "boardlist.do";
	}
	
	@RequestMapping("updateform.do")
	public String updateform(BoardVo vo, Model model) {
		vo = boardService.selectone(vo);
		model.addAttribute("vo", vo);
		return "modifyBoard.jsp";
	}
	
	@RequestMapping("writeBoard.do")
	public String write(BoardVo vo) {
		boardService.write(vo);
		return "boardlist.do";
	}
	
	@RequestMapping("searchone.do")
	public String searchone(BoardVo vo, Model model) {
		vo = boardService.selectone(vo);
		int cnt = vo.getCnt()+1;
		vo.setCnt(cnt);
		boardService.cntplus(vo);
		model.addAttribute("vo", vo);
		return "getBoard.jsp";
	}
}

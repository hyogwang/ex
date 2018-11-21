package com.javalec.board.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.javalec.board.service.UsersService;
import com.javalec.board.vo.UsersVo;

@Controller
public class UsersController {
	@Autowired
	@Qualifier("usersService")
	private UsersService usersService;
	
	@RequestMapping("/joinpage.do")
	public String join(UsersVo vo, HttpSession session) {
		if(usersService.getusers(vo)!=null) {
		UsersVo vo2 = usersService.getusers(vo);
	
		
		if(vo2.getPassword().equals(vo.getPassword())){
			session.setAttribute("id", vo.getId());
			session.setAttribute("password", vo.getPassword());
			return "redirect:boardlist.do";
		}else {
			session.setAttribute("error", "비밀번호를 확인해주세요");
			return "joinpage.jsp";
		}
		}else {
			session.setAttribute("error", "없는아이디입니다");
			return "joinpage.jsp";
		}

	}
	@RequestMapping("/joininsert.do")
	public String insert(UsersVo vo) {		
		usersService.insertusers(vo);
		return "joinpage.jsp";
	}
	
	@RequestMapping("/findpassword.do")
	public String findPW(UsersVo vo, @RequestParam(value="id") String id, Model model) {
		vo=usersService.getusers(vo);
		vo.getPassword();
		model.addAttribute("password",vo.getPassword());
		
		return"findpassword.jsp";
	}
	

}

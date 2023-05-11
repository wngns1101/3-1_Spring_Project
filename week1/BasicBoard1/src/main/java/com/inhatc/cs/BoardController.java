package com.inhatc.cs;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.inhatc.domain.BoardVO;
import com.inhatc.service.BoardService;

@Controller
//board 뒤에 오는 경로는 이 컨트롤러가 다룬다 homecontroller는 root만 관장
@RequestMapping("/board/*")
public class BoardController {
	
	@Inject
	private BoardService service;
	
	@RequestMapping(value="/regist", method=RequestMethod.GET)
	public String registGet(BoardVO board, Model model) throws Exception{
		System.out.println("Regist (Get) called");
		return "/board/register";
	}
	
	@RequestMapping(value="/regist", method=RequestMethod.POST)
	public String registPost(BoardVO board, Model model) throws Exception{
		System.out.println("제목:" + board.getTitle());
		System.out.println("제목:" + board.getContent());
		System.out.println("제목:" + board.getWriter());
		System.out.println("Regist (Post) called");
		service.regist(board);
		return "/home";
	}
}

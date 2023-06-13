package com.inhatc.cs;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.inhatc.domain.TestVO;
import com.inhatc.service.TestService;

@Controller
@RequestMapping("/poard/*")
public class TestController {
	
	@Inject
	private TestService service;
	
	@RequestMapping(value = "/regist", method=RequestMethod.GET) 
	public String registGET(TestVO vo, Model model) {
		System.out.println("regist (GET) 실행");
		return "/board/regist";
	}
	
	@RequestMapping(value = "/regist", method=RequestMethod.POST) 
	public String registPOST(TestVO vo, RedirectAttributes rttr) throws Exception {
		System.out.println("regist (POST) 실행");
		service.regist(vo);
		return "redirect:/board/listAll";
	}
	
	@RequestMapping(value = "/listAll", method=RequestMethod.GET)
	public String listAll(Model model) throws Exception{
		System.out.println("listAll (GET) 실행");
		model.addAttribute("list", service.listAll());
		return "board/listAll5";
	}
}

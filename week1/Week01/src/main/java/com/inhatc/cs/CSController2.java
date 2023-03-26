package com.inhatc.cs;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CSController2 {
	@RequestMapping("doC")
	// doC를 호출할 때 msg라는 이름으로 인자를 받아 view에 떨궈준
	public String doC( @ModelAttribute("msg") String msg) {
		System.out.println("doC called~");
		return "result";
	}
	
}

package com.inhatc.cs;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class CSController4 {
	@RequestMapping("doE")
	public String doE(RedirectAttributes rttr) {
		System.out.println("doE called");
		
		rttr.addFlashAttribute("msg", "redirect MSG is ~dfafdasfaf");
		
		return "redirect:/doF";
	}
	
	@RequestMapping("doF")
	// doC를 호출할 때 msg라는 이름으로 인자를 받아 view에 떨궈준
	public String doC( @ModelAttribute("msg") String msg) {
		System.out.println("doF called~");
		return "doF";
	}
}

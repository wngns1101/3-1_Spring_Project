package com.inhatc.cs;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.inhatc.domain.ProductVO;
import com.inhatc.domain.memberVO;

@Controller

public class CSController3 {
	@RequestMapping("doD")
	public String doD(Model model) {
		System.out.println("doD called");
		
		ProductVO product = new ProductVO("inhatc Product", 10000);
				
		model.addAttribute(product);
		
		return "productDetail"; //"productDetail.jsp"
	}
	
	@RequestMapping("doG")
	public String doG(Model model) {
		System.out.println("doD called");
		
		memberVO member = new memberVO();
				
		member.setId("wngns");
		member.setName("이주훈");
		
		model.addAttribute(member);
		
		return "memberDetail"; //"productDetail.jsp"
	}
}

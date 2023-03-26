package com.inhatc.cs;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller //컨트롤러가 되기 위한 지시자
public class CSController {
	@RequestMapping("doA")
	public void doA() {
		System.out.println("Do A called~~~~~~~~~~~~~~~");
	}
	
	@RequestMapping("doB")
	public String doB() {
		System.out.println("Do B called~~~~~~~~~~~~~~~");
		return "cs";
	}
}

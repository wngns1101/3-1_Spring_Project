package com.inhatc.cs;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.inhatc.domain.BoardVO;
import com.inhatc.domain.Criteria;
import com.inhatc.domain.PageMaker;
import com.inhatc.service.BoardService;

@Controller//board 뒤에 오는 경로는 이 컨트롤러가 다룬다 homecontroller는 root만 관장
@RequestMapping("board/*")
public class BoardController {
	@Inject
	private BoardService service;
	@RequestMapping(value="/regist", method=RequestMethod.GET)
	public String registGet(BoardVO board, Model model) throws Exception{
		System.out.println("Regist (Get) called");
		return "/board/register";
	}
	@RequestMapping(value="/regist", method= RequestMethod.POST)
	public String registPost(BoardVO board, RedirectAttributes rttr) throws Exception{
		System.out.println("Regist (Post) called");
		service.regist(board);
		return "redirect:/board/listAll";
	}
	@RequestMapping(value="/listAll", method=RequestMethod.GET)
	public String listAll(Model model) throws Exception{
		System.out.println("called listAll page");
		model.addAttribute("list", service.listAll());
		return "/board/listAll5";
	}
	@RequestMapping(value="/read", method=RequestMethod.GET)
	public String read(@RequestParam("bno") int bno, Model model) throws Exception{
		System.out.println("Regist read called");
		model.addAttribute(service.read(bno));
		return "/board/read5";
	}
	@RequestMapping(value="/modify", method=RequestMethod.GET)
	public String modify(@RequestParam("bno") int bno, Model model) throws Exception{
		System.out.println("Regist (modify) called");
		model.addAttribute(service.read(bno));
		return "/board/modify";
	}
	@RequestMapping(value="/modify", method=RequestMethod.POST)
	public String modifyPost(BoardVO board, RedirectAttributes rttr) throws Exception{
		System.out.println("Regist (modify) Post called");
		System.out.println("bno = " + board.getBno());
		System.out.println("title = " + board.getTitle());
		System.out.println("content = " + board.getContent());
		System.out.println("writer = " + board.getWriter());
		service.modify(board);
		return "redirect:/board/listAll";
	}
	@RequestMapping(value="/remove", method=RequestMethod.GET)
	public String remove(@RequestParam("bno") int bno, RedirectAttributes rttr) throws Exception{
		System.out.println("Regist (remove) called");
		service.remove(bno);
		System.out.println("bno = " + bno);
		return "redirect:/board/listAll";
	}
	@RequestMapping(value="/listPage", method=RequestMethod.GET)
	public String listPage(@ModelAttribute("cri") Criteria cri, Model model) throws Exception{
//		System.out.println("called listPage page (GET)");
//		int nTotalCount = service.countPaging();
//		double dTotalPage = nTotalCount / (double)10;
//		System.out.println(nTotalCount);
//		System.out.println(dTotalPage);
		model.addAttribute("list", service.listCriteria(cri));
		PageMaker pageMaker = new PageMaker();
		pageMaker.setCri(cri);
		pageMaker.setTotalCount(service.countPaging(cri));
		model.addAttribute("pageMaker", pageMaker);
		return "/board/listPage";
	}
	@RequestMapping(value="/listCriteria", method=RequestMethod.GET)
	public String listCriteria(Criteria cri, Model model) throws Exception{
		System.out.println("called listCriteria page (GET)");
		model.addAttribute("list", service.listPage(3));
		return "/board/listAll5";
	}
	@RequestMapping(value="/readPage", method=RequestMethod.GET)
	public String readPage(@RequestParam("bno") int bno, @ModelAttribute("cri") Criteria cri, Model model) throws Exception{
		System.out.println("Regist (Post) called");
		model.addAttribute(service.read(bno));
		return "/board/readPage";
	}
	@RequestMapping(value="/modifyPage", method=RequestMethod.GET)
	public String modifyPageGet(@RequestParam("bno") int bno,@ModelAttribute("cri") Criteria cri ,Model model) throws Exception{
		System.out.println("Regist (modify) called");
		model.addAttribute(service.read(bno));
		System.out.println("bno = " + bno);
		return "/board/modifyPage";
	}
	@RequestMapping(value="/modifyPage", method=RequestMethod.POST)
	public String modifyPagePost(BoardVO board, @ModelAttribute("cri") Criteria cri,RedirectAttributes rttr) throws Exception{
		service.modify(board);
		rttr.addAttribute("page", cri.getPage());
		rttr.addAttribute("perPageNum", cri.getPerPageNum());
		return "redirect:/board/listPage";
	}
	@RequestMapping(value="/removePage", method=RequestMethod.POST)
	public String removePage(@RequestParam("bno") int bno, @ModelAttribute("cri") Criteria cri, RedirectAttributes rttr) throws Exception{
		System.out.println("Regist (remove) called");
		service.remove(bno);
		rttr.addAttribute("page", cri.getPage());
		rttr.addAttribute("perPageNum", cri.getPerPageNum());
		System.out.println("bno = " + bno);
		return "redirect:/board/listPage";
	}
}

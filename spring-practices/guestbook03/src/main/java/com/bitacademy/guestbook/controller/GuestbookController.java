package com.bitacademy.guestbook.controller;

import java.util.List;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import com.bitacademy.guestbook.repository.GuestbookRepository;
import com.bitacademy.guestbook.vo.GuestbookVo;


@Controller
public class GuestbookController {
	
	@Autowired
	private GuestbookRepository GuestbookRepository;
	
	@RequestMapping("")
	public String index(Model model) {
		List<GuestbookVo> list = GuestbookRepository.findAll();
		model.addAttribute("list", list);
		return "/WEB-INF/views/index.jsp";	
	}
	
	@RequestMapping("/add")
	public String form(GuestbookVo vo) {
		GuestbookRepository.insert(vo);
		return "redirect:/";
	}
	
	@RequestMapping("/deleteform")
	public String form(@RequestParam(value="no", required=true, defaultValue="") String no,Model model) {
			
		model.addAttribute("no", no);
		return "/WEB-INF/views/deleteform.jsp";
	}
	
	@RequestMapping("/delete")
	public String delete(GuestbookVo vo) {
			
		GuestbookRepository.delete(vo);
		return "redirect:/";
	}


	
}

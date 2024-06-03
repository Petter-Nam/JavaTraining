package com.application.modudeal.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.application.modudeal.dto.MemberDTO;
import com.application.modudeal.service.MemberService;


@Controller
@RequestMapping("/moduDeal")
public class ModuDealController {

	@Value("${file.repo.path}")   
    private String fileRepositoryPath;
	
	@Autowired
	private MemberService memberService;
	
	@GetMapping("/main")
	public String main() {
		return "moduDeal/main";
	}
	
	@GetMapping("/category")
	public String category() {
		return "moduDeal/category";
	}
	
	@GetMapping("/board")
	public String board() {
		return "moduDeal/board";
	}
	
	@GetMapping("/login")
	public String login() {
		return "moduDeal/login";
	}
	
	@GetMapping("/cart")
	public String cart() {
		return "moduDeal/cart";
	}
	
	@GetMapping("/register")
	public String regit() {
		return "moduDeal/register";
	}
	
	@PostMapping("/register")
	public String regit(@ModelAttribute MemberDTO memberDTO) {
		memberService.createMember(memberDTO);
		return "redirect:/moduDeal/main";
	}
	
	@PostMapping("/validId")
	@ResponseBody
	public String validId(@RequestParam("memberId") String memberId) {
		return memberService.checkValidId(memberId);
	}
	
	
}

package com.application.modudeal.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.application.modudeal.dto.MemberDTO;
import com.application.modudeal.service.MemberService;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;


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
			
	@GetMapping("/login")
	public String login() {
		return "moduDeal/login";
	}
	
	@PostMapping("/login")
	@ResponseBody
	public String login(@RequestBody MemberDTO memberDTO, HttpServletRequest request) {
		
		System.out.println(memberDTO);
		
		String isValidMember = "n";
		MemberDTO resultDTO = memberService.login(memberDTO);
		
		if (resultDTO != null) {
			
			HttpSession session = request.getSession();
			session.setAttribute("memberId", memberDTO.getMemberId());
			
			isValidMember = "y";
		}
		
		return isValidMember;
		
	}
	
	@GetMapping("/logOut")
	@ResponseBody
	public String logOut(HttpServletRequest request) {
		HttpSession session = request.getSession();
		session.invalidate();
		
		String jsScript = """
				<script>
					alert('로그아웃 되었습니다.');
					location.href = '/moduDeal/main';
				</script>""";
		return jsScript;
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
	
	@GetMapping("/cart")
	public String cart () {
		return "/moduDeal/cart";
	}
	
	@GetMapping("/myPage")
	public String myPage(Model model, HttpServletRequest request ) {
		
		HttpSession session = request.getSession();
		String memberId = (String)session.getAttribute("memberId");
		
		model.addAttribute("memberDTO", memberService.getMemberDetail(memberId));
		
		return "/moduDeal/myPage";
	}
}

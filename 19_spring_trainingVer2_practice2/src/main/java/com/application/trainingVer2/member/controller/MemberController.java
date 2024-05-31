package com.application.trainingVer2.member.controller;

import java.io.IOException;
import java.net.MalformedURLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.Resource;
import org.springframework.core.io.UrlResource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.application.trainingVer2.member.dto.MemberDTO;
import com.application.trainingVer2.member.service.MemberService;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

@Controller
@RequestMapping("/member")
public class MemberController {

	@Value("${file.repo.path}")
	private String fileRepositoryPath;
	
	@Autowired
	private MemberService memberService;
	
	@GetMapping("/main")
	public String main() {
		return "member/main";
	}
	
	@GetMapping("/register")
	public String register() {
		return "member/register";
	}
	
	@PostMapping("/register")															// 폼전송
	public String register(@RequestParam("uploadProfile") MultipartFile uploadProfile, @ModelAttribute MemberDTO memberDTO) throws IllegalStateException, IOException {
		memberService.createMember(uploadProfile, memberDTO);
		return "redirect:/member/main";
	}
	
	@PostMapping("/validId")
	@ResponseBody
	public String validId(@RequestParam("memberId") String memberId) {
		return memberService.checkValidId(memberId);
	}
	
	@GetMapping("/login")
	public String login() {
		return "member/login";
	}
	
	@PostMapping("/login")
	@ResponseBody//짤짤이 and ajax
	public String login(@RequestBody MemberDTO memberDTO, HttpServletRequest request) {
		
		String isValidMember = "n";
		if (memberService.login(memberDTO)) {
			HttpSession session = request.getSession();
			session.setAttribute("memberId", memberDTO.getMemberId());
			isValidMember = "y";
		}
		return isValidMember;
	}
	
	@GetMapping("/logout")
	public String logut(HttpServletRequest request) {
		HttpSession session = request.getSession();
		session.invalidate();
		
		return "redirect:/member/main";
	}
	
	@GetMapping("/update")
	public String update(HttpServletRequest request, Model model) {
		HttpSession session = request.getSession();
		model.addAttribute("memberDTO", memberService.getMemberDeatil((String)session.getAttribute("memberId")));
		return "member/update";
	}
	
	@PostMapping("/update")
	public String update(@RequestParam("uploadProfile") MultipartFile uploadProfile, @ModelAttribute MemberDTO memberDTO) throws IllegalStateException, IOException {
		memberService.updateMember(uploadProfile, memberDTO);
		return "redirect:/member/main";
	}
	
	@GetMapping("/thumbnails")
	@ResponseBody
	public Resource thumbnails(@RequestParam("fileName") String fileName) throws MalformedURLException {
		return new UrlResource("file : " + fileRepositoryPath + fileName);
	}
	
	@GetMapping("/delete")
	public String delete() {
		return "member/delete";
	}
	
	@PostMapping("/delete")
	public String delete(HttpServletRequest request) {
		HttpSession session = request.getSession();
		memberService.updateInactiveMember((String)session.getAttribute("memberId"));
		session.invalidate();
		
		return "redirect:/member/main";
	}
	
}

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
	
	@GetMapping("/main") //메인화면을 불러오는 코드입니다.
	public String main() {
		return "moduDeal/main";
	}
			
	@GetMapping("/login") // 로그인 화면을 부르는 코드입니다.
	public String login() {
		return "moduDeal/login";
	}
	
	@PostMapping("/login") // 로그인 로직을 처리하는 코드입니다.
	@ResponseBody
	public String login(@RequestBody MemberDTO memberDTO, HttpServletRequest request) {
		
		String isValidMember = "n";
		MemberDTO resultDTO = memberService.login(memberDTO);
		
		if (resultDTO != null) {
			
			HttpSession session = request.getSession();
			session.setAttribute("memberId", memberDTO.getMemberId());
			
			isValidMember = "y";
		}
		
		return isValidMember;
		
	}
	
	@GetMapping("/logOut") // 로그아웃하는 코드입니다.
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
	
	@GetMapping("/register") // 회원가입 화면을 부르는 코드입니다.
	public String regit() {
		return "moduDeal/register";
	}
	
	@PostMapping("/register") // 회원가입 로직을 처리하는 코드입니다.
	public String regit(@ModelAttribute MemberDTO memberDTO) {
		memberService.createMember(memberDTO);
		return "redirect:/moduDeal/main";
	}
	
	@PostMapping("/validId") // 회원가입시 ID 중복 확인하는 코드입니다.
	@ResponseBody
	public String validId(@RequestParam("memberId") String memberId) {
		return memberService.checkValidId(memberId);
	}
	
	@GetMapping("/cart") // 카트 화면을 불러오는 코드입니다.
	public String cart () {
		return "/moduDeal/cart";
	}
	
	@GetMapping("/category")
	public String category() {
		return "/moduDeal/category";
	}
	
	@GetMapping("/myPage") // 마이페이지 화면 불러오는 코드입니다.
	public String myPage(Model model, HttpServletRequest request) {
	    HttpSession session = request.getSession();
	    String memberId = (String) session.getAttribute("memberId");
	    
	    // 로그인한 회원의 정보를 가져옵니다.
	    MemberDTO memberDTO = memberService.getMemberDetail(memberId);
	    
	    // 모델에 회원 정보를 추가합니다.
	    model.addAttribute("memberDTO", memberDTO);
	    
	    return "/moduDeal/myPage";
	}

	@PostMapping("/changePassword")
	@ResponseBody
	public String changePassword(@RequestParam("memberId") String memberId,
	                             @RequestParam("password") String newPassword,
	                             HttpServletRequest request) {
		
		
	    // 비밀번호 변경 로직을 수행합니다.
	    boolean passwordChanged = memberService.changePassword(memberId, newPassword);
	    
	    if (passwordChanged) {
	    	HttpSession session = request.getSession();
	    	session.invalidate();
	    	
	    	String jsScript = """
					<script>
						alert('로그아웃 되었습니다.');
						location.href = '/moduDeal/main';
					</script>""";
				
			return jsScript;
	    } else {
	        return "Failed to change password.";
	    }
	}
//
//	@PostMapping("/updateHp")
//	@ResponseBody
//	public String updateContact(@ModelAttribute MemberDTO memberDTO) {
//	    // 이메일과 전화번호를 업데이트합니다.
//	    boolean contactUpdated = memberService.updateHp(memberDTO);
//	    
//	    if (contactUpdated) {
//	        return "Contact information updated successfully.";
//	    } else {
//	        return "Failed to update contact information.";
//	    }
//	}
	
	//
//	@PostMapping("/updateEmail")
//	@ResponseBody
//	public String updateContact(@ModelAttribute MemberDTO memberDTO) {
//	    // 이메일과 전화번호를 업데이트합니다.
//	    boolean contactUpdated = memberService.updateHp(memberDTO);
//	    
//	    if (contactUpdated) {
//	        return "Contact information updated successfully.";
//	    } else {
//	        return "Failed to update contact information.";
//	    }
//	}

	@PostMapping("/updateAddress")
	@ResponseBody
	public String updateAddress(@ModelAttribute MemberDTO memberDTO) {
	    // 주소를 업데이트합니다.
	    boolean addressUpdated = memberService.updateAddress(memberDTO);
	    
	    if (addressUpdated) {
	    	String jsScript = """
					<script>
						alert('주소설정이 변경되었습니다.');
						location.href = '/moduDeal/myPage';
					</script>""";
				
			return jsScript;
	    } else {
	    	String jsScript = """
					<script>
						alert('주소설정이 올바르지 못한 형식입니다. 
						다시 설정하여주세요.');
						location.href = '/moduDeal/myPage';
					</script>""";
				
			return jsScript;
	    }
	}
	
}

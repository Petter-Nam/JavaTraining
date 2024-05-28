package com.application.mvc.chapter05_AJAX;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.application.mvc.data.SupposeDAO;

@Controller
@RequestMapping("/ajax")
public class AjaxAnswerController {

	@Autowired
	private SupposeDAO supposeDAO;

	@PostMapping("/ex03_answer")
	@ResponseBody
	public String answer03(@RequestBody Map<String, String> map) {
		
		String com = map.get("com");
		String me = map.get("me");
		
		String result = "";
		if (com.equals(me)) 			result = "비겼다";
		else if (me.equals("가위"))		result = "내가 졌다.";
		else if (me.equals("보"))		result = "내가 이겼다.";
		else 							result = "잘못된 입력값입니다.";
		
		return result;
	}
	
	@PostMapping("/ex04_answer")
	@ResponseBody
	public String answer04(@RequestBody Map<String, Integer> map) {
		
		int com = map.get("com");
		int me  = map.get("me");
		
		String result = "";
		
		if (me < com) result = "UP";
		else if (me == com) result = "Bingo!";
		else if (me > com)  result = "Down!";
		
		return result;
	}
	
	@PostMapping("/ex05_answer")
	@ResponseBody
	public String answer05(@RequestBody Map<String, Object> map) {
		String result = "reject";
		
		double height = Double.parseDouble(map.get("height").toString());
		String withParent = map.get("withParent").toString();
		
		if (height >= 120.0 || (height < 120.0 && withParent.equals("yes"))) {
			result = "pass";
		}
		return result;
	}
}

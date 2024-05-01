package com.application.mvc.chapter01_thymeleaf;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.application.mvc.data.SupposeDAO;

@Controller
public class ExpressionController {

	//SupposeDAO supposeDAO = new SupposeDAO();
	
	@Autowired
	private SupposeDAO supposeDAO;
	
	@GetMapping("/ex01")
	public String ex01(Model model) {
		
		// 데이터 전송 예시
		model.addAttribute("string"  , supposeDAO.getString());
		model.addAttribute("int"     , supposeDAO.getInt());
		model.addAttribute("double"  , supposeDAO.getDouble());
		model.addAttribute("boolean" , supposeDAO.getBoolean());
		model.addAttribute("date"    , supposeDAO.getDate());
		model.addAttribute("dto"     , supposeDAO.getDTO());
		model.addAttribute("dtoList" , supposeDAO.getDTOList());
		model.addAttribute("map"     , supposeDAO.getMap());
		model.addAttribute("mapList" , supposeDAO.getMapList());
		
		return "chapter01_thymeleaf/expression/expressionEx01";
	
	}
	
	
}

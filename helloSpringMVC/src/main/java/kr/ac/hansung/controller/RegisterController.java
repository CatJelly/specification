package kr.ac.hansung.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import kr.ac.hansung.dao.Offer;

@Controller //���� �ڵ� Ŭ���� �� ���
public class RegisterController {
	

	
	@RequestMapping("/register")
	public String createOffer(){	
		

		return "register";
		
	}
	
	
	

}

package br.com.maurodev.administor.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {
	//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

	@RequestMapping("/login")
	public String login(){
		
		
		return"/pages/LoginCadastro/login";
	}
	
	
	
	
	
	
}

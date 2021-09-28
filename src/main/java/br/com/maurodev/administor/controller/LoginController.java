package br.com.maurodev.administor.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {
	

	@RequestMapping("/login")
	public String loginForm(){
		
		
		return"/pages/LoginCadastro/login";
	}
	
	
	
	
	
	
}

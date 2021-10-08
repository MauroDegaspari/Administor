package br.com.maurodev.administor.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class LoginController {
	
	
	@RequestMapping(value="/login", method = RequestMethod.GET)
	public String loginForm(){
		return"/pages/LoginCadastro/login";
	}	
	@RequestMapping("/")
	public String index(){
		return"/pages/index";
	}
	
}

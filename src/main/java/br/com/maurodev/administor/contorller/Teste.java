package br.com.maurodev.administor.contorller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Teste {

	@RequestMapping("/teste")
	public String teste() {
		return "pages/teste";
	}
	
}

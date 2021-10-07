package br.com.maurodev.administor.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import br.com.maurodev.administor.model.CondominioModel;
import br.com.maurodev.administor.repository.CondominioRepository;

@Controller
public class CadastroController {

	@Autowired
	private CondominioRepository cr;
	
	@RequestMapping(value="/cadastro", method = RequestMethod.GET)
	public String loginForm(){
		return"/pages/LoginCadastro/cadastro";
	}	
	

	@RequestMapping(value="/cadastro", method = RequestMethod.POST)
	public String loginForm(CondominioModel condominio){
		cr.save(condominio);
		return"redirect:/login";
}
}

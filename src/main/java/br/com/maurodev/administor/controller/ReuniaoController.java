package br.com.maurodev.administor.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ReuniaoController {

	@RequestMapping("/reuniao")
	public String reuniao(){
		return"/pages/ReuniaoAssembleia/reuniao";
	}
}

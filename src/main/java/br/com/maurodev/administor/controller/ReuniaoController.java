package br.com.maurodev.administor.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import br.com.maurodev.administor.model.ReuniaoModel;
import br.com.maurodev.administor.repository.ReuniaoRepository;


@Controller
public class ReuniaoController {

	@Autowired
	private ReuniaoRepository rr;
	
	@RequestMapping(value="/ReuniaoForm", method = RequestMethod.GET)
	public String eventoForm() {
		return "pages/ReuniaoAssembleia/ReuniaoForm";
	}
	
	@RequestMapping(value="/ReuniaoForm", method = RequestMethod.POST)
	public String reuniaoForm(ReuniaoModel reuniao) {
		rr.save(reuniao);
		return "redirect:/reuniao";
	}
	
	@RequestMapping("/reuniao")
	public ModelAndView listaEventos() {
		ModelAndView mv = new ModelAndView("/pages/ReuniaoAssembleia/reuniao");
		List<ReuniaoModel> eventos = rr.findAll();
		mv.addObject("reuniaoHtml", eventos);
		return mv;
	}
}

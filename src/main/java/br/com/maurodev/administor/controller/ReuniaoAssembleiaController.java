package br.com.maurodev.administor.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import br.com.maurodev.administor.model.ParticipanteModel;
import br.com.maurodev.administor.model.ReuniaoModel;
import br.com.maurodev.administor.repository.ParticipanteRepository;
import br.com.maurodev.administor.repository.ReuniaoRepository;



@Controller
public class ReuniaoAssembleiaController {

	@Autowired
	private ReuniaoRepository rr;
	
	@Autowired
	private ParticipanteRepository pr;
	
	@RequestMapping(value="/ReuniaoForm", method = RequestMethod.GET)
	public String eventoForm() {
		return "pages/ReuniaoAssembleia/ReuniaoForm";
	}
	
	@RequestMapping(value="/ReuniaoForm", method = RequestMethod.POST)
	public String reuniaoForm(ReuniaoModel reuniao) {
		rr.save(reuniao);
		return "redirect:/reuniaoAssembleia";
	}
	
	@RequestMapping("/reuniaoAssembleia")
	public ModelAndView listaEventos() {
		ModelAndView mv = new ModelAndView("/pages/ReuniaoAssembleia/reuniaoAssembleia");
		List<ReuniaoModel> eventos = rr.findAll();
		mv.addObject("reuniaoHtml", eventos);
		return mv;
	}
	
	@RequestMapping(value="/{id}", method = RequestMethod.GET) //redirecionamento pro id de cada evento
	public ModelAndView reuniaoDetalhe(@PathVariable("id") long id) {
		ReuniaoModel reuniao = rr.findById(id);
		ModelAndView mv = new ModelAndView("/pages/ReuniaoAssembleia/ReuniaoDetalhes");
		mv.addObject("detalheHtml", reuniao);
		
		List<ParticipanteModel> participante = pr.findByReuniao(reuniao);
		mv.addObject("participanteHtml", participante);
		return mv;
	}
	

	@RequestMapping(value="/{id}", method = RequestMethod.POST) //redirecionamento pro id de cada evento
	public String reuniaoDetalhePost(@PathVariable("id") long id, ParticipanteModel participante) {
		ReuniaoModel reuniao = rr.findById(id);
		participante.setReuniao(reuniao);
		pr.save(participante);
		return "redirect:/{id}";

	}
}
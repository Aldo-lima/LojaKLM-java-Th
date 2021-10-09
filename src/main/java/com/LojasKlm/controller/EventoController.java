package com.LojasKlm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.LojasKlm.models.Convidado;
import com.LojasKlm.models.Evento;
import com.LojasKlm.repositores.ConvidadoRepository;
import com.LojasKlm.repositores.EventoRepository;

@Controller
public class EventoController {
	
	@Autowired
	private EventoRepository repository;
	
	@Autowired
	private ConvidadoRepository convidadoRepository;
	
	
    @RequestMapping(value="cadastrarEvento", method=RequestMethod.GET)
	public String form() {
		return "eventos/formEvento";
	}
    
    
    @RequestMapping(value="cadastrarEvento", method=RequestMethod.POST)
 	public String form(Evento evento) {
    	repository.save(evento);
 		return "redirect:/cadastrarEvento";
 	}
    @RequestMapping("/eventos")
    public ModelAndView ListarEvento() {
    	ModelAndView mv = new ModelAndView("index");
    	Iterable<Evento> eventos = repository.findAll();
    	mv.addObject("eventos", eventos);
    	return mv;
    	
    	
    }
    
    @RequestMapping(value="/{codigo}", method=RequestMethod.GET)
    public ModelAndView  detalhesEvento(@PathVariable("codigo")long codigo) {
    	Evento evento = repository.findByCodigo(codigo);
    	ModelAndView mv = new ModelAndView("eventos/detalhesEvento");
    	mv.addObject("evento", evento);
    	Iterable<Convidado> convidados = convidadoRepository.findByEvento(evento);
    	mv.addObject("convidados", convidados);
    	
    	return mv;
    }
    
    @RequestMapping(value="/{codigo}", method=RequestMethod.POST)
    public String  detalhesEventoPost(@PathVariable("codigo")long codigo, Convidado convidado) {
        Evento evento = repository.findByCodigo(codigo);
        convidado.setEvento(evento);
        convidadoRepository.save(convidado);
    	return "redirect:/{codigo}";
    }
    
    
    
    }
    
    
    


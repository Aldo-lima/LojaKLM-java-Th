package com.LojasKlm.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.LojasKlm.models.Fornecedor;
import com.LojasKlm.repositores.CategoriaRepositoes;
import com.LojasKlm.repositores.FornecedorRepository;

@Controller
public class FornecedorController {

	@Autowired
	private FornecedorRepository fornecedorRepository;

	@Autowired
	private CategoriaRepositoes categoriaEpository;

	@RequestMapping("/fornecedores")
	public ModelAndView listarfornecedores() {
		ModelAndView mv = new ModelAndView("lojaklm/fornecedores");
		Iterable<Fornecedor> fornecedores = fornecedorRepository.findAll();
		mv.addObject("fornecedores", fornecedores);
		return mv;

	}

	/*
	 * @RequestMapping(value="cadastrarFornecedor", method=RequestMethod.GET) public
	 * ModelAndView listarCategoria() { ModelAndView mv = new
	 * ModelAndView("lojaklm/formFornecedor"); Iterable<Categoria> categorias
	 * =categoriaEpository.findAll(); mv.addObject("categorias", categorias); return
	 * mv;
	 * 
	 * 
	 * }
	 */

	@RequestMapping(value = "cadastrarFornecedor", method = RequestMethod.GET)
	public ModelAndView listarCategoria() {
		ModelAndView mv = new ModelAndView("lojaklm/formFornecedor");
		return mv;

	}

	@RequestMapping(value = "cadastrarFornecedor", method = RequestMethod.POST)
	public String formpost(Fornecedor fornecedor) {
		fornecedorRepository.save(fornecedor);
		return "redirect:/fornecedores";
	}

/*	@RequestMapping(value = "fornecedor/{id}", method = RequestMethod.GET)
	public ModelAndView detalhesMerda(@PathVariable long id ) {
		Optional<Fornecedor> fornecedor = fornecedorRepository.findById(id);
		ModelAndView mv = new ModelAndView("lojaklm/fornecedorDetalhes");
		mv.addObject("fornecedor", fornecedor);

		return mv;
	}*/
	
	
  @GetMapping("/fornecedor/{id}")
  public ModelAndView merda(@PathVariable long id ) {
	  Optional<Fornecedor> optional = this.fornecedorRepository.findById(id);
	  Fornecedor fornecedor = optional.get();
	  ModelAndView mv = new  ModelAndView("lojaklm/fornecedorDetalhes");
	  mv.addObject("fornecedor", fornecedor);
	  return mv;
  }


	
    
	
	
	

}
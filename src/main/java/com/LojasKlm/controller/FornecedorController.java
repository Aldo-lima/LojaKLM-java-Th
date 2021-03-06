package com.LojasKlm.controller;

import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.LojasKlm.models.Categoria;
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

	
	 @RequestMapping(value="cadastrarFornecedor", method=RequestMethod.GET) 
	 public  ModelAndView listarCategoria() {
	 ModelAndView mv = new  ModelAndView("lojaklm/formFornecedor");
	 Iterable<Categoria> categorias  =categoriaEpository.findAll();
	 mv.addObject("categorias", categorias);
	 return  mv;
	 
	 }
	 
/*
	@RequestMapping(value = "cadastrarFornecedor", method = RequestMethod.GET)
	public ModelAndView listarCategoria() {
		ModelAndView mv = new ModelAndView("lojaklm/formFornecedor");
		return mv;

	}*/

	@PostMapping(value = "cadastrarFornecedor")
	public String create(Fornecedor fornecedor) {
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
  public ModelAndView merda(@PathVariable Integer id ) {
	  Optional<Fornecedor> optional = this.fornecedorRepository.findById(id);
	  Fornecedor fornecedor = optional.get();
	  ModelAndView mv = new  ModelAndView("lojaklm/fornecedorDetalhes");
	  mv.addObject("fornecedor", fornecedor);
	  return mv;
  }

  @GetMapping("/fornecedor/fornecedor/{id}/edit")
  public ModelAndView edit(@PathVariable Integer id) {
	   Optional<Fornecedor> fornecedor = fornecedorRepository.findById(id);
	   ModelAndView mv = new ModelAndView("lojaklm/editFornecedor");
	   mv.addObject("fornecedor", fornecedor);
	   return mv;
  }
  
  
  
  @PostMapping("/cadastrarFornecedor/{id}")
  public ModelAndView update(@PathVariable Integer id, @Valid Fornecedor fornecedorVindo) {
	  Optional<Fornecedor>opitional = this.fornecedorRepository.findById(id);
	   Fornecedor fornecedor = fornecedorVindo.toFornecedor(opitional.get());
	    this.fornecedorRepository.save(fornecedor);
	   ModelAndView mv = new ModelAndView("redirect:/fornecedores");
	   return mv;
  }
	
    
	
	
	

}
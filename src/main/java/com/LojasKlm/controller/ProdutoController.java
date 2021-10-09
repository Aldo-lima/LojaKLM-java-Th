package com.LojasKlm.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.LojasKlm.models.Fornecedor;
import com.LojasKlm.models.Produto;
import com.LojasKlm.repositores.ProdutoRepository;

@Controller
public class ProdutoController {

	
	
	@Autowired
	private ProdutoRepository produtoRepository;
	
	
	@RequestMapping("/produtos")
	public ModelAndView listarProdutos() {
		ModelAndView mv = new ModelAndView("lojaklm/produtos");
		Iterable<Produto> produtos = produtoRepository.findAll();
		mv.addObject("produtos", produtos);
		return mv;
	 
	}
	
	
	  @GetMapping("/produto/{id}")
	  public ModelAndView merda(@PathVariable long id ) {
		  Optional<Produto> optional = this.produtoRepository.findById(id);
		  Produto produto= optional.get();
		  ModelAndView mv = new  ModelAndView("lojaklm/produtoDetalhe");
		  mv.addObject("produto", produto);
		  return mv;
	  }
	 
	 
	 
}

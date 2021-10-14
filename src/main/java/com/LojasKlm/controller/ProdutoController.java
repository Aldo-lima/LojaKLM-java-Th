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

import com.LojasKlm.models.Fornecedor;
import com.LojasKlm.models.Produto;
import com.LojasKlm.repositores.FornecedorRepository;
import com.LojasKlm.repositores.ProdutoRepository;

@Controller
public class ProdutoController {

	
	
	@Autowired
	private ProdutoRepository produtoRepository;
	
	@Autowired
	private FornecedorRepository fornecedorRepository;
	
	
	@RequestMapping("/produtos")
	public ModelAndView listarProdutos() {
		ModelAndView mv = new ModelAndView("lojaklm/produtos");
		Iterable<Produto> produtos = produtoRepository.findAll();
		mv.addObject("produtos", produtos);
		return mv;
	 
	}
	
	
	  @GetMapping("/produto/{id}")
	  public ModelAndView merda(@PathVariable Integer id ) {
		  Optional<Produto> optional = this.produtoRepository.findById(id);
		  Produto produto= optional.get();
		  ModelAndView mv = new  ModelAndView("lojaklm/produtoDetalhe");
		  mv.addObject("produto", produto);
		  return mv;
	  }
	  
	  
	  @RequestMapping(value="cadastrarProduto", method=RequestMethod.GET)
	  public  ModelAndView listarfornecedor() {
			 ModelAndView mv = new  ModelAndView("lojaklm/formProduto");
			 Iterable<Fornecedor> fornecedores  = fornecedorRepository.findAll();
			 mv.addObject("fornecedores", fornecedores);
			 return  mv;
			
			}
	  
		@PostMapping(value = "cadastrarProduto")
		public String create(Produto Produto) {
			produtoRepository.save(Produto);
			return "redirect:/produtos";
		}

		
		   
		   
		   @GetMapping(value="/produto/produto/{id}/edit")
		   public ModelAndView edit(@PathVariable Integer id) {
			   Optional<Produto> produto = produtoRepository.findById(id);
			   ModelAndView mv = new ModelAndView("lojaklm/editProduto");
			   mv.addObject("produto", produto);
			   return mv;
		   }
		   
		   
		   @PostMapping("/cadastrarProduto/{id}")
		   public ModelAndView update(@PathVariable Integer id, @Valid Produto produtoEnviado) {
			   Optional<Produto>opitional = this.produtoRepository.findById(id);
			   Produto produto = produtoEnviado.toProduto(opitional.get());
			    this.produtoRepository.save(produto);
			   ModelAndView mv = new ModelAndView("redirect:/produtos");
			   return mv;
		   }
	 
	 
	 
}

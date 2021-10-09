package com.LojasKlm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.LojasKlm.models.Categoria;
import com.LojasKlm.repositores.CategoriaRepositoes;

@Controller
public class CategoriaContoller {
	
	@Autowired
	private CategoriaRepositoes categoriaEpository;
	
	  @RequestMapping("/categorias")
	    public ModelAndView listarCategoria() {
	    	ModelAndView mv = new ModelAndView("lojaklm/categorias");
	    	Iterable<Categoria> categorias =categoriaEpository.findAll();
	    	mv.addObject("categorias", categorias);
	    	return mv;
}
	
	  @RequestMapping(value="cadastrarCategoria", method=RequestMethod.GET)
		public String form() {
			return "lojaklm/formCategoria";
		}
	  
	   @RequestMapping(value="cadastrarCategoria", method=RequestMethod.POST)
	 	public String formpost(Categoria categoria) {
		   categoriaEpository.save(categoria);
	 		return "redirect:/categorias";
	 	}
	  
	
	    	
	

}

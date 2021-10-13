package com.LojasKlm.service;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.LojasKlm.models.Categoria;
import com.LojasKlm.models.Fornecedor;
import com.LojasKlm.models.Produto;
import com.LojasKlm.repositores.CategoriaRepositoes;
import com.LojasKlm.repositores.FornecedorRepository;
import com.LojasKlm.repositores.ProdutoRepository;






@Service
public class DBService {

	
	@Autowired
	private CategoriaRepositoes categoriaEpository;
	
	@Autowired
    private FornecedorRepository  fornecedorRepository;
	
	@Autowired
    private ProdutoRepository  produtoRepository;
	
	public void InstanciaBaseDeDado() {
		Categoria cat1 = new Categoria(1, "Alimento");
		Categoria cat2 = new Categoria(2, "Brinquedo");
		Categoria cat3 = new Categoria(3, "Joia");
		Categoria cat4 = new Categoria(4, "Eletro Eletronico");
		Categoria cat5 = new Categoria(5, "Cama Mesa e Banho");
		Categoria cat6 = new Categoria(6, "Artigo Esportivos");
		
		Fornecedor forn1 = new Fornecedor(null , "ProEspost", "Proesport Comercio de Artigo Esportivos S/A", "14521478451", "1245145112", "Gilberto Gomes", "complador", "19 88412457", null, null, null, null, null, null, null, null, null, null, null, cat6);
		Fornecedor forn2 = new Fornecedor(null, "nome", "nome_r", "cnpj","1245155" ,null, null, null, null, null, null, null, null, null, null, null, null, null, null, cat5);
		Fornecedor forn3 = new Fornecedor( null, "Faber Castel", "845715542-1/0001", "14521478451", null, null, null, null, null, null, null, null, null, null, null, null, null, null,null, cat4);
		Fornecedor forn4 = new Fornecedor( null, "Faber Castel", "845715542-1/0001", "14521478451", null, null, null, null, null, null, null, null, null, null, null, null, null, null,null, cat3);
		Fornecedor forn5 = new Fornecedor( null, "Faber Castel", "845715542-1/0001", "14521478451", null, null, null, null, null, null, null, null, null, null, null, null, null, null,null, cat6);
		Fornecedor forn6 = new Fornecedor(null, "Faber Castel", "845715542-1/0001", "14521478451", null, null, null, null, null, null, null, null, null, null, null, null, null, null,null, cat6);
		Fornecedor forn7 = new Fornecedor(null, "Faber Castel", "845715542-1/0001", "14521478451", null, null, null, null, null, null, null, null, null, null, null, null, null, null,null, cat6);
		Fornecedor forn8 = new Fornecedor(null, "Faber Castel", "845715542-1/0001", "14521478451", null, null, null, null, null, null, null, null, null, null, null, null, null, null,null, cat6);
	
		
		Produto podu1 = new Produto(null, "sabonete","unidade",1, 2.50,"saboneta de lavanda",forn4);
		Produto podu2 = new Produto(null, "sabonete","unidade",1, 2.50,"saboneta de lavanda",forn4);
		Produto podu3 = new Produto(null, "sabonete","unidade",1, 2.50,"saboneta de lavanda",forn4);
		Produto podu4 = new Produto(null, "sabonete","unidade",1, 2.50,"saboneta de lavanda",forn4);
		Produto podu5 = new Produto(null, "sabonete","unidade",1, 2.50,"saboneta de lavanda",forn4);
		Produto podu6 = new Produto(null, "sabonete","unidade",1, 2.50,"saboneta de lavanda",forn4);
		Produto podu7 = new Produto(null, "sabonete","unidade",1, 2.50,"saboneta de lavanda",forn4);
		Produto podu8 = new Produto(null, "sabonete","unidade",1, 2.50,"saboneta de lavanda",forn4);
		Produto podu9 = new Produto(null, "sabonete","unidade",1, 2.50,"saboneta de lavanda",forn4);
		Produto podu10 = new Produto(null, "sabonete","unidade",1, 2.50,"saboneta de lavanda",forn4);
		Produto podu11 = new Produto(null, "sabonete","unidade",1, 2.50,"saboneta de lavanda",forn4);
		Produto podu12 = new Produto(null, "sabonete","unidade",1, 2.50,"saboneta de lavanda",forn4);
		Produto podu13 = new Produto(null, "sabonete","unidade",1, 2.50,"saboneta de lavanda",forn4);
		Produto podu14 = new Produto(null, "sabonete","unidade",1, 2.50,"saboneta de lavanda",forn4);
		Produto podu15 = new Produto(null, "sabonete","unidade",1, 2.50,"saboneta de lavanda",forn4);
		Produto podu16 = new Produto(null, "sabonete","unidade",1, 2.50,"saboneta de lavanda",forn4);
		Produto podu17 = new Produto(null, "sabonete","unidade",1, 2.50,"saboneta de lavanda",forn4);
		Produto podu18 = new Produto(null, "sabonete","unidade",1, 2.50,"saboneta de lavanda",forn4);
		Produto podu19 = new Produto(null, "sabonete","unidade",1, 2.50,"saboneta de lavanda",forn4);
		Produto podu20 = new Produto(null, "sabonete","unidade",1, 2.50,"saboneta de lavanda",forn4);
	
		
		
		
		
				
		
		categoriaEpository.saveAll(Arrays.asList(cat1,cat2,cat3,cat4,cat5, cat6));
		fornecedorRepository.saveAll(Arrays.asList(forn1, forn2, forn3, forn4, forn5, forn6, forn7, forn8 ));
		 produtoRepository.saveAll(Arrays.asList(podu1, podu2, podu3, podu4, podu5, podu6, podu7, podu8, podu9, podu10, podu11, podu12, podu13, podu14, podu15, podu16, podu17, podu18, podu19, podu20 ));
		
	}
}

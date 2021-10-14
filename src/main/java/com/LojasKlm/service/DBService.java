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
		
		Fornecedor forn1 = new Fornecedor(null , "ProEspost", "Proesport Comercio de Artigo Esportivos S/A", "14521478451", "1245145112", "Gilberto Gomes", "complador", "19 88412457", "Particular", "José@gmail.com", "comercial", "Camelia", "180", "fundos", "Jd Matão", "Sumaré", "São Paulo", "padaria", "13185560", cat6);
		Fornecedor forn2 = new Fornecedor(null, "Anastasia", "Anastasia Comercio de Alimentos S/A", "cnpj","1245155" ,null, null, null, null, null, null, null, null, null, null, null, null, null, null, cat5);
		Fornecedor forn3 = new Fornecedor( null, "Faber Csatello", "Faber Castello Idustria e comercio", "14521478451", null, null, null, null, null, null, null, null, null, null, null, null, null, null,null, cat4);
		Fornecedor forn4 = new Fornecedor( null, "Brasileiras", "Lojas brasileiras", "14521478451", null, null, null, null, null, null, null, null, null, null, null, null, null, null,null, cat3);
		Fornecedor forn5 = new Fornecedor( null, "Casa America ", "José da Silva Comercio de  S/A", "14521478451", null, null, null, null, null, null, null, null, null, null, null, null, null, null,null, cat6);
		Fornecedor forn6 = new Fornecedor(null, "Mercado Tambiri", "Tanburi Comercio de Alimentos S/A", "14521478451", null, null, null, null, null, null, null, null, null, null, null, null, null, null,null, cat6);
		Fornecedor forn7 = new Fornecedor(null, "DB Brinqudos", "DB industria e comercio de brin quedos", "14521478451", null, null, null, null, null, null, null, null, null, null, null, null, null, null,null, cat6);
		Fornecedor forn8 = new Fornecedor(null, "Casas Almeida", "Aumeida comercios S/A", "14521478451", null, null, null, null, null, null, null, null, null, null, null, null, null, null,null, cat6);
	
		
		Produto podu1 = new Produto(null, "sabonete","unidade",1, 2.50,"saboneta de lavanda",forn4);
		Produto podu2 = new Produto(null, "Boneca Lili","unidade",1, 200.50," Para crianças axima de 5 anos",forn4);
		Produto podu3 = new Produto(null, "Cadeno Tlibra","unidade",1, 20.50,"Caderno 200 folhas ",forn4);
		Produto podu4 = new Produto(null, "Caneca Tematizadas","unidade",1, 2.50,"Caneca com temas",forn4);
		Produto podu5 = new Produto(null, "Bones","unidade",1, 2.50,"bone nautico",forn4);
		Produto podu6 = new Produto(null, "Caneta Bic","unidade",10, 23.50,"Caneta Bic Cristal Cor Azul",forn4);
		Produto podu7 = new Produto(null, "Robo de Brinquedo ","unidade",1, 40.50," Brinquedo com Pilha",forn4);
		Produto podu8 = new Produto(null, "Toalha de Mesa","unidade",1, 2.50,"Toalha de mesa Estampadas",forn4);
		Produto podu9 = new Produto(null, "Tv 20Polegadas","unidade",1, 2400.50,"Aparelho  de TV LG",forn4);
		Produto podu10 = new Produto(null, "Sabão Em Pó Omo","unidade",1, 2.50,"Embalagem de um Kg",forn4);
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

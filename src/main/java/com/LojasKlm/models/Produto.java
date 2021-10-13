package com.LojasKlm.models;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;



@Entity
public class Produto  implements Serializable{
	 /**
		 * 
		 */
		private static final long serialVersionUID = 1L;
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Integer id;
	    private String name;
	    private String Unidade_medida;
	    private Integer quantidade_embalagem;
	    private Double price;
	    private String descricao;
	    
	    @ManyToOne
	    @JoinColumn(name= "fornecedor_id")
	    private Fornecedor fornecedor;
	    
	    
		public Produto() {
			super();
			// TODO Auto-generated constructor stub
		}

		
		

		@Override
		public int hashCode() {
			return Objects.hash(id);
		}




		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Produto other = (Produto) obj;
			return Objects.equals(id, other.id);
		}




		public Produto(Integer id, String name, String unidade_medida, Integer quantidade_embalagem, Double price,
				String descricao, com.LojasKlm.models.Fornecedor fornecedor) {
			super();
			this.id = id;
			this.name = name;
			Unidade_medida = unidade_medida;
			this.quantidade_embalagem = quantidade_embalagem;
			this.price = price;
			this.descricao = descricao;
			this.fornecedor = fornecedor;
		}


        public Produto toProduto(Produto produto) {
        	produto.setName(this.name);
        	produto.setUnidade_medida(this.Unidade_medida);
        	produto.setPrice(this.price);
        	produto.setDescricao(this.descricao);
        	produto.setQuantidade_embalagem(this.quantidade_embalagem);
        	return produto;
        }

		public Integer getId() {
			return id;
		}


		public void setId(Integer id) {
			this.id = id;
		}


		public String getName() {
			return name;
		}


		public void setName(String name) {
			this.name = name;
		}


		public String getUnidade_medida() {
			return Unidade_medida;
		}


		public void setUnidade_medida(String unidade_medida) {
			Unidade_medida = unidade_medida;
		}


		public Integer getQuantidade_embalagem() {
			return quantidade_embalagem;
		}


		public void setQuantidade_embalagem(Integer quantidade_embalagem) {
			this.quantidade_embalagem = quantidade_embalagem;
		}


		public Double getPrice() {
			return price;
		}


		public void setPrice(Double price) {
			this.price = price;
		}


		public String getDescricao() {
			return descricao;
		}


		public void setDescricao(String descricao) {
			this.descricao = descricao;
		}


		public Fornecedor getFornecedor() {
			return fornecedor;
		}


		public void setFornecedor(Fornecedor fornecedor) {
			this.fornecedor = fornecedor;
		}



			

	










	    
}

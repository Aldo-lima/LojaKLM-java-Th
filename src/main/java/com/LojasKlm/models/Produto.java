package com.LojasKlm.models;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Produto  implements Serializable{
	 /**
		 * 
		 */
		private static final long serialVersionUID = 1L;
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;
	    private String name;
	    private String Unidade_medida;
	    private Integer quantidade_embalagem;
	    private Double price;
	    
		public Produto() {
			super();
			// TODO Auto-generated constructor stub
		}

		public Produto(Long id, String name, String unidade_medida, Integer quantidade_embalagem, Double price) {
			super();
			this.id = id;
			this.name = name;
			Unidade_medida = unidade_medida;
			this.quantidade_embalagem = quantidade_embalagem;
			this.price = price;
		}

	

	

		public Long getId() {
			return id;
		}

		public void setId(Long id) {
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
	    
	    
}

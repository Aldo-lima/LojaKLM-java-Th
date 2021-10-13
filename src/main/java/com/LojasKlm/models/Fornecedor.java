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
public class Fornecedor implements Serializable {
	   /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	   @Id
	   @GeneratedValue(strategy = GenerationType.AUTO)
	   private Integer id;
	   private String nome;
	   private String nome_r;
	   private String cnpj;
	   private String insc_esta;
	   
		
		private String nome_contato;
		private String cargo;
		private String telefone;
		private String telefone_tipo;
		private String email;
		private String email_tipo;
		
	    private String rua;
	    private String numero;
	    private String complemento;
	    private String bairro;
	    private String cidade;
	    private String estado;
	    private String proximidade;
	    private String cep;
	   
	   	   	   
	  @ManyToOne
	  @JoinColumn(name = "categoria_id")
	  private Categoria categoria;


	public Fornecedor() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Fornecedor(Integer id, String nome, String nome_r, String cnpj, String insc_esta, String nome_contato,
			String cargo, String telefone, String telefone_tipo, String email, String email_tipo, String rua,
			String numero, String complemento, String bairro, String cidade, String estado, String proximidade,
			String cep, Categoria categoria) {
		super();
		this.id = id;
		this.nome = nome;
		this.nome_r = nome_r;
		this.cnpj = cnpj;
		this.insc_esta = insc_esta;
		this.nome_contato = nome_contato;
		this.cargo = cargo;
		this.telefone = telefone;
		this.telefone_tipo = telefone_tipo;
		this.email = email;
		this.email_tipo = email_tipo;
		this.rua = rua;
		this.numero = numero;
		this.complemento = complemento;
		this.bairro = bairro;
		this.cidade = cidade;
		this.estado = estado;
		this.proximidade = proximidade;
		this.cep = cep;
		this.categoria = categoria;
	}

	public Fornecedor  toFornecedor( Fornecedor fornecedor) {
		fornecedor.setNome(this.nome);
		fornecedor.setNome_r(this.nome_r);
		fornecedor.setCnpj(this.cnpj);
		fornecedor.setInsc_esta(this.insc_esta);
		fornecedor.setNome_contato(this.nome_contato);
		fornecedor.setCargo(this.cargo);
		fornecedor.setTelefone(this.telefone);
		fornecedor.setEmail(this.email);
		fornecedor.setEmail_tipo(this.email_tipo);
		fornecedor.setEmail_tipo(this.email_tipo);
		fornecedor.setRua(this.rua);
		fornecedor.setNumero(this.numero);
		fornecedor.setComplemento(this.complemento);
		fornecedor.setBairro(this.bairro);
		fornecedor.setCidade(this.cidade);
		fornecedor.setEstado(this.estado);
		fornecedor.setProximidade(this.proximidade);
		fornecedor.setCep(this.cep);
										
		return fornecedor;
	}

	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getNome_r() {
		return nome_r;
	}


	public void setNome_r(String nome_r) {
		this.nome_r = nome_r;
	}


	public String getCnpj() {
		return cnpj;
	}


	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}


	public String getInsc_esta() {
		return insc_esta;
	}


	public void setInsc_esta(String insc_esta) {
		this.insc_esta = insc_esta;
	}


	public String getNome_contato() {
		return nome_contato;
	}


	public void setNome_contato(String nome_contato) {
		this.nome_contato = nome_contato;
	}


	public String getCargo() {
		return cargo;
	}


	public void setCargo(String cargo) {
		this.cargo = cargo;
	}


	public String getTelefone() {
		return telefone;
	}


	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}


	public String getTelefone_tipo() {
		return telefone_tipo;
	}


	public void setTelefone_tipo(String telefone_tipo) {
		this.telefone_tipo = telefone_tipo;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getEmail_tipo() {
		return email_tipo;
	}


	public void setEmail_tipo(String email_tipo) {
		this.email_tipo = email_tipo;
	}


	public String getRua() {
		return rua;
	}


	public void setRua(String rua) {
		this.rua = rua;
	}


	public String getNumero() {
		return numero;
	}


	public void setNumero(String numero) {
		this.numero = numero;
	}


	public String getComplemento() {
		return complemento;
	}


	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}


	public String getBairro() {
		return bairro;
	}


	public void setBairro(String bairro) {
		this.bairro = bairro;
	}


	public String getCidade() {
		return cidade;
	}


	public void setCidade(String cidade) {
		this.cidade = cidade;
	}


	public String getEstado() {
		return estado;
	}


	public void setEstado(String estado) {
		this.estado = estado;
	}


	public String getProximidade() {
		return proximidade;
	}


	public void setProximidade(String proximidade) {
		this.proximidade = proximidade;
	}


	public String getCep() {
		return cep;
	}


	public void setCep(String cep) {
		this.cep = cep;
	}


	public Categoria getCategoria() {
		return categoria;
	}


	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
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
		Fornecedor other = (Fornecedor) obj;
		return Objects.equals(id, other.id);
	}










	  
	  

}

package com.LojasKlm.models;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
public class Convidado  {
    
	@Id
	private String rg;
	
	private String nomecovidado;
	@ManyToOne
	private Evento evento;
	
	
	
	public Convidado(String rg, String nomecovidado, Evento evento) {
		super();
		this.rg = rg;
		this.nomecovidado = nomecovidado;
		this.evento = evento;
	}



	public Convidado() {
		super();
		// TODO Auto-generated constructor stub
	}



	public String getRg() {
		return rg;
	}



	public void setRg(String rg) {
		this.rg = rg;
	}



	public String getNomecovidado() {
		return nomecovidado;
	}



	public void setNomecovidado(String nomecovidado) {
		this.nomecovidado = nomecovidado;
	}



	public Evento getEvento() {
		return evento;
	}



	public void setEvento(Evento evento) {
		this.evento = evento;
	}



	@Override
	public int hashCode() {
		return Objects.hash(rg);
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Convidado other = (Convidado) obj;
		return Objects.equals(rg, other.rg);
	}
	
	
	
	
}

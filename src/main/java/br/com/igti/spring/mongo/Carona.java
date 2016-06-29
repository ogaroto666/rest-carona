package br.com.igti.spring.mongo;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Carona {
	@Id
	private Integer id;
	private Pessoa ofertante;
	@DBRef
	private List<Pessoa> caronistas;
	
	public List<Pessoa> getCaronistas() {
		return caronistas;
	}
	public void setCaronistas(List<Pessoa> caronistas) {
		this.caronistas = caronistas;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Pessoa getOfertante() {
		return ofertante;
	}
	public void setOfertante(Pessoa ofertante) {
		this.ofertante = ofertante;
	}
	
}

package br.com.igti.spring.mongo;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
@Document
public class Pessoa {
	
	private String nome;
	private Double latitude;
	private Double longitude;
	private String cpf;
	@Id
	private Integer id;
	
public Double getLatitude() {
	return latitude;
}
public Double getLongitude() {
	return longitude;
}
public void setLatitude(Double latitude) {
	this.latitude = latitude;
}
public void setLongitude(Double longitude) {
	this.longitude = longitude;
}
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
public void setCpf(String cpf) {
	this.cpf = cpf;
}
public Integer getId() {
	return id;
}
public void setId(Integer id) {
	this.id = id;
}

}

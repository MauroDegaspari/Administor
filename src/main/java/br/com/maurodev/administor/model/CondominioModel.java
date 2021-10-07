package br.com.maurodev.administor.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="CONDOMINIO")
@SequenceGenerator(name= "SEQ_CONDOMINIO", sequenceName ="SEQ_CONDOMINIO", initialValue = 1, allocationSize = 1)
public class CondominioModel {

	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_CONDOMINIO")
	@Column(name="id_condominio")
	private int id;

	@Column(name="sindico")
	private String sindico;
	
	@Column(name="CONDOMINIIO")
	private String condominio;
	
	@Column(name="senha")
	private String senha;
	
	public CondominioModel(){
		
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getSindico() {
		return sindico;
	}

	public void setSindico(String sindico) {
		this.sindico = sindico;
	}

	public String getCondominio() {
		return condominio;
	}

	public void setCondominio(String condominio) {
		this.condominio = condominio;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
}

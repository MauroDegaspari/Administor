package br.com.maurodev.administor.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="reuniao")
@SequenceGenerator(name= "SEQ_REUNIAO", sequenceName ="SEQ_REUNIAO", initialValue = 1, allocationSize = 1)
public class ReuniaoModel {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_CONDOMINIO")
	@Column(name="id_reuniao")
	private Long id;
	
	@Column(name="nome")
	private String nome;
	
	@Column(name="onde")
	private String local;
	
	@Column(name="dia")
	private String data;
	
	@Column(name="horario")
	private String horario;
	
	
	//construtores
	public ReuniaoModel() {
		
	}

	
	//Gettes & Settes
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getLocal() {
		return local;
	}

	public void setLocal(String local) {
		this.local = local;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public String getHorario() {
		return horario;
	}

	public void setHorario(String horario) {
		this.horario = horario;
	}
	
	

}

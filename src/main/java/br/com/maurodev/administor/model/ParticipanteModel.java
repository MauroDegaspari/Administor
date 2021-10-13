package br.com.maurodev.administor.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="PARTICIPANTE")
@SequenceGenerator(name= "SEQ_PARTICIPANTE", sequenceName ="SEQ_PARTICIPANTE", initialValue = 1, allocationSize = 1)
public class ParticipanteModel {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_PARTICIPANTE")
	private Long id;
	
	private String nome;
	private String celular;
	
	@ManyToOne
	private ReuniaoModel reuniao;
}
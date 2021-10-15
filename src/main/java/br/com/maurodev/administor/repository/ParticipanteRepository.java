package br.com.maurodev.administor.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.maurodev.administor.model.ParticipanteModel;

public interface ParticipanteRepository extends JpaRepository<ParticipanteModel, String>{

}

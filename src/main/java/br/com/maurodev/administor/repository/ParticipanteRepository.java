package br.com.maurodev.administor.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.maurodev.administor.model.ParticipanteModel;
import br.com.maurodev.administor.model.ReuniaoModel;

public interface ParticipanteRepository extends JpaRepository<ParticipanteModel, String>{
			List<ParticipanteModel> findByReuniao(ReuniaoModel reuniao);
}

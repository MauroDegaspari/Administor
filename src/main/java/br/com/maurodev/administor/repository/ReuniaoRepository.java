package br.com.maurodev.administor.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import br.com.maurodev.administor.model.ReuniaoModel;

public interface ReuniaoRepository extends JpaRepository<ReuniaoModel, String>{
	ReuniaoModel findById(long id);
}
 
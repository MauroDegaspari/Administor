package br.com.maurodev.administor.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.maurodev.administor.model.CondominioModel;

public interface CondominioRepository extends JpaRepository<CondominioModel, Long>{

}

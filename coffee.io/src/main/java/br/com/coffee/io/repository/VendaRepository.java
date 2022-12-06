package br.com.coffee.io.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.coffee.io.model.Venda;

@Repository
public interface VendaRepository extends JpaRepository<Venda, Integer>{

}

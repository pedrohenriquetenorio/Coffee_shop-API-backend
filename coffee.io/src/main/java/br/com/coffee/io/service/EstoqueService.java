package br.com.coffee.io.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import br.com.coffee.io.model.Estoque;
import br.com.coffee.io.repository.EstoqueRepository;



@Service
public class EstoqueService {
	final EstoqueRepository estoqueRepository;
	EstoqueService(EstoqueRepository estoqueRepository){
		this.estoqueRepository = estoqueRepository;
	}
	
	//FindAll
	public List<Estoque>buscarTodos(){
		return estoqueRepository.findAll(); 
	}
	
	//Create
	public Estoque salvar(Estoque estoque){	
		return estoqueRepository.save(estoque);
	}
	
	//Read
	public Optional<Estoque>pesquisar(int id){
		return estoqueRepository.findById(id);
	}
	//Update
	public Estoque alterar(Estoque estoque){
		return estoqueRepository.save(estoque);
	}
	
	//Delete
	public void excluir(int id){
		estoqueRepository.deleteById(id);
	}
}

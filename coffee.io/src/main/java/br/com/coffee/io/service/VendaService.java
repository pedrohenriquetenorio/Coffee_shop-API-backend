package br.com.coffee.io.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import br.com.coffee.io.model.Venda;
import br.com.coffee.io.repository.VendaRepository;

@Service
public class VendaService {
	VendaRepository vendaRepository;
	VendaService(VendaRepository vendaRepository){
		this.vendaRepository = vendaRepository;
	}
	//FindAll
	public List<Venda>buscarTodos(){
		return vendaRepository.findAll(); 
	}
	
	//Create
	public Venda salvar(Venda venda){	
		return vendaRepository.save(venda);
	}
	
	//Read
	public Optional<Venda>pesquisar(int id){
		return vendaRepository.findById(id);
	}
	//Update
	public Venda alterar(Venda venda){
		return vendaRepository.save(venda);
	}
	
	//Delete
	public void excluir(int id){
		vendaRepository.deleteById(id);
	}
}

package br.com.coffee.io.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import br.com.coffee.io.model.Compra;

import br.com.coffee.io.repository.CompraRepository;

@Service
public class CompraService {
	CompraRepository compraRepository;
	CompraService(CompraRepository compraRepository){
		this.compraRepository = compraRepository;
	}
	//FindAll
	public List<Compra>buscarTodos(){
		return compraRepository.findAll(); 
	}
	
	//Create
	public Compra salvar(Compra compra){	
		return compraRepository.save(compra);
	}
	
	//Read
	public Optional<Compra>pesquisar(int id){
		return compraRepository.findById(id);
	}
	//Update
	public Compra alterar(Compra compra){
		return compraRepository.save(compra);
	}
	
	//Delete
	public void excluir(int id){
		compraRepository.deleteById(id);
	}
}

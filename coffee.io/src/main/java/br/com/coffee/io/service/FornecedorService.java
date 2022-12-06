package br.com.coffee.io.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import br.com.coffee.io.model.Fornecedor;
import br.com.coffee.io.repository.FornecedorRepository;

@Service
public class FornecedorService {
	FornecedorRepository fornecedorRepository;
	FornecedorService(FornecedorRepository fornecedorRepository){
		this.fornecedorRepository = fornecedorRepository;
	}
	//FindAll
	public List<Fornecedor>buscarTodos(){
		return fornecedorRepository.findAll(); 
	}
	
	//Create
	public Fornecedor salvar(Fornecedor fornecedor){	
		return fornecedorRepository.save(fornecedor);
	}
	
	//Read
	public Optional<Fornecedor>pesquisar(int id){
		return fornecedorRepository.findById(id);
	}
	//Update
	public Fornecedor alterar(Fornecedor fornecedor){
		return fornecedorRepository.save(fornecedor);
	}
	
	//Delete
	public void excluir(int id){
		fornecedorRepository.deleteById(id);
	}
}

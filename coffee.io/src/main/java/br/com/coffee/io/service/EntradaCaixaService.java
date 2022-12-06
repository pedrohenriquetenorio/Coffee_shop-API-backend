package br.com.coffee.io.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import br.com.coffee.io.model.EntradaCaixa;
import br.com.coffee.io.repository.EntradaCaixaRepository;

@Service
public class EntradaCaixaService {
	EntradaCaixaRepository entradaCaixaRepository;
	EntradaCaixaService(EntradaCaixaRepository entradaCaixaRepository){
		this.entradaCaixaRepository = entradaCaixaRepository;
	}
	//FindAll
	public List<EntradaCaixa>buscarTodos(){
		return entradaCaixaRepository.findAll(); 
	}
	
	//Create
	public EntradaCaixa salvar(EntradaCaixa entradaCaixa){	
		return entradaCaixaRepository.save(entradaCaixa);
	}
	
	//Read
	public Optional<EntradaCaixa>pesquisar(int id){
		return entradaCaixaRepository.findById(id);
	}
	//Update
	public EntradaCaixa alterar(EntradaCaixa entradaCaixa){
		return entradaCaixaRepository.save(entradaCaixa);
	}
	
	//Delete
	public void excluir(int id){
		entradaCaixaRepository.deleteById(id);
	}
}

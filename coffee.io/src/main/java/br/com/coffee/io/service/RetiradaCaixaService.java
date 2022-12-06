package br.com.coffee.io.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import br.com.coffee.io.model.RetiradaCaixa;
import br.com.coffee.io.repository.RetiradaCaixaRepository;

@Service
public class RetiradaCaixaService {
	RetiradaCaixaRepository retiradaCaixaRepository;
	RetiradaCaixaService(RetiradaCaixaRepository retiradaCaixaRepository){
		this.retiradaCaixaRepository = retiradaCaixaRepository;
	}
	//FindAll
	public List<RetiradaCaixa>buscarTodos(){
		return retiradaCaixaRepository.findAll(); 
	}
	
	//Create
	public RetiradaCaixa salvar(RetiradaCaixa retiradaCaixa){	
		return retiradaCaixaRepository.save(retiradaCaixa);
	}
	
	//Read
	public Optional<RetiradaCaixa>pesquisar(int id){
		return retiradaCaixaRepository.findById(id);
	}
	//Update
	public RetiradaCaixa alterar(RetiradaCaixa retiradaCaixa){
		return retiradaCaixaRepository.save(retiradaCaixa);
	}
	
	//Delete
	public void excluir(int id){
		retiradaCaixaRepository.deleteById(id);
	}
}

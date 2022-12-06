package br.com.coffee.io.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import br.com.coffee.io.model.Caixa;
import br.com.coffee.io.repository.CaixaRepository;


@Service
public class CaixaService {
	
	CaixaRepository caixaRepository;
	CaixaService(CaixaRepository caixaRepository){
		this.caixaRepository = caixaRepository;
	}
	//FindAll
	public List<Caixa>BuscarTodos(){
		return caixaRepository.findAll(); 
	}
	
	//Create
	public Caixa Salvar(Caixa caixa){	
		return caixaRepository.save(caixa);
	}
	//Read
	public Optional<Caixa> Ler(int id){
		return caixaRepository.findById(id);
	}
	//Update
	public Caixa update(Caixa caixa){
		return caixaRepository.save(caixa);
	}
	
	//Delete
	public void delete(int id){
		caixaRepository.deleteById(id);
	}
	
}

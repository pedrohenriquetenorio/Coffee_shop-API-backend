package br.com.coffee.io.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import br.com.coffee.io.model.Ingrediente;
import br.com.coffee.io.repository.IngredienteRepository;

@Service
public class IngredienteService {
	IngredienteRepository ingredienteRepository;
	IngredienteService(IngredienteRepository ingredienteRepository){
		this.ingredienteRepository = ingredienteRepository;
	}
	//FindAll
	public List<Ingrediente>buscarTodos(){
		return ingredienteRepository.findAll(); 
	}
	
	//Create
	public Ingrediente salvar(Ingrediente ingrediente){	
		return ingredienteRepository.save(ingrediente);
	}
	
	//Read
	public Optional<Ingrediente>pesquisar(int id){
		return ingredienteRepository.findById(id);
	}
	//Update
	public Ingrediente alterar(Ingrediente ingrediente){
		return ingredienteRepository.save(ingrediente);
	}
	
	//Delete
	public void excluir(int id){
		ingredienteRepository.deleteById(id);
	}
}

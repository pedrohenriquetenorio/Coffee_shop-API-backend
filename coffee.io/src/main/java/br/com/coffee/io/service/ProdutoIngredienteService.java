package br.com.coffee.io.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import br.com.coffee.io.model.ProdutoIngrediente;
import br.com.coffee.io.repository.ProdutoIngredienteRepository;

@Service
public class ProdutoIngredienteService {
	ProdutoIngredienteRepository produtoIngredienteRepository;
	ProdutoIngredienteService(ProdutoIngredienteRepository produtoIngredienteRepository){
		this.produtoIngredienteRepository = produtoIngredienteRepository;
	}
	//FindAll
	public List<ProdutoIngrediente>buscarTodos(){
		return produtoIngredienteRepository.findAll(); 
	}
	
	//Create
	public ProdutoIngrediente salvar(ProdutoIngrediente produtoIngrediente){	
		return produtoIngredienteRepository.save(produtoIngrediente);
	}
	
	//Read
	public Optional<ProdutoIngrediente>pesquisar(int id){
		return produtoIngredienteRepository.findById(id);
	}
	//Update
	public ProdutoIngrediente alterar(ProdutoIngrediente produtoIngrediente){
		return produtoIngredienteRepository.save(produtoIngrediente);
	}
	
	//Delete
	public void excluir(int id){
		produtoIngredienteRepository.deleteById(id);
	}
}

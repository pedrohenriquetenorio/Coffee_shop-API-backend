package br.com.coffee.io.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import br.com.coffee.io.model.Produto;
import br.com.coffee.io.repository.ProdutoRepository;

@Service
public class ProdutoService {
	ProdutoRepository produtoRepository;
	ProdutoService(ProdutoRepository produtoRepository){
		this.produtoRepository = produtoRepository;
	}
	//FindAll
	public List<Produto>buscarTodos(){
		return produtoRepository.findAll(); 
	}
	
	//Create
	public Produto salvar(Produto produto){	
		return produtoRepository.save(produto);
	}
	
	//Read
	public Optional<Produto>pesquisar(int id){
		return produtoRepository.findById(id);
	}
	//Update
	public Produto alterar(Produto produto){
		return produtoRepository.save(produto);
	}
	
	//Delete
	public void excluir(int id){
		produtoRepository.deleteById(id);
	}
}

package br.com.coffee.io.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import br.com.coffee.io.model.ItemCompra;
import br.com.coffee.io.repository.ItemCompraRepository;

@Service
public class ItemCompraService {
	ItemCompraRepository itemCompraRepository;
	ItemCompraService(ItemCompraRepository itemCompraRepository){
		this.itemCompraRepository = itemCompraRepository;
	}
	//FindAll
	public List<ItemCompra>buscarTodos(){
		return itemCompraRepository.findAll(); 
	}
	
	//Create
	public ItemCompra salvar(ItemCompra itemCompra){	
		return itemCompraRepository.save(itemCompra);
	}
	
	//Read
	public Optional<ItemCompra>pesquisar(int id){
		return itemCompraRepository.findById(id);
	}
	//Update
	public ItemCompra alterar(ItemCompra itemCompra){
		return itemCompraRepository.save(itemCompra);
	}
	
	//Delete
	public void excluir(int id){
		itemCompraRepository.deleteById(id);
	}
}

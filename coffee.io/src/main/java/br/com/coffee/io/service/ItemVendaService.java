package br.com.coffee.io.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import br.com.coffee.io.model.ItemVenda;
import br.com.coffee.io.repository.ItemVendaRepository;

@Service
public class ItemVendaService {
	ItemVendaRepository itemVendaRepository;
	ItemVendaService(ItemVendaRepository itemVendaRepository){
		this.itemVendaRepository = itemVendaRepository;
	}
	//FindAll
	public List<ItemVenda>buscarTodos(){
		return itemVendaRepository.findAll(); 
	}
	
	//Create
	public ItemVenda salvar(ItemVenda itemVenda){	
		return itemVendaRepository.save(itemVenda);
	}
	
	//Read
	public Optional<ItemVenda>pesquisar(int id){
		return itemVendaRepository.findById(id);
	}
	//Update
	public ItemVenda alterar(ItemVenda itemVenda){
		return itemVendaRepository.save(itemVenda);
	}
	
	//Delete
	public void excluir(int id){
		itemVendaRepository.deleteById(id);
	}
}

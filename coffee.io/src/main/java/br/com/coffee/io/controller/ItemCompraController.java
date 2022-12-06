package br.com.coffee.io.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.coffee.io.model.Caixa;
import br.com.coffee.io.model.ItemCompra;
import br.com.coffee.io.service.CaixaService;
import br.com.coffee.io.service.ItemCompraService;

@RestController
public class ItemCompraController {
	
	final ItemCompraService itemCompraService;
	public ItemCompraController(ItemCompraService itemCompraService){
		this.itemCompraService = itemCompraService;
	}
	
	//FindAll
	@GetMapping(value="/listar")
	public ResponseEntity<Object>findAll(){
	return ResponseEntity.status(HttpStatus.OK).body(itemCompraService.buscarTodos());	
	}
		
	//create
	@RequestMapping(value = "/adicionar")
	@PostMapping
	public ResponseEntity<ItemCompra>adicionar(@RequestBody ItemCompra itemCompra){
	return ResponseEntity.status(HttpStatus.CREATED).body(itemCompraService.salvar(itemCompra));
	}
	
	//read
	@GetMapping(value="/findById/{id}")
	public ResponseEntity<Object>ler(@PathVariable(value="id") int id){
	return ResponseEntity.status(HttpStatus.OK).body(itemCompraService.pesquisar(id));		
	}
	
	//update
	@RequestMapping(value = "/update")
	@PutMapping
	public ResponseEntity<Object> atualizar(@RequestBody ItemCompra itemCompra){
	return ResponseEntity.status(HttpStatus.OK).body(itemCompraService.alterar(itemCompra));	
	}
	
	//delete
	@DeleteMapping(value = "/delete/{id}")
	public ResponseEntity<Void>excluir(@PathVariable int id){
		itemCompraService.excluir(id);
		return ResponseEntity.noContent().build(); // o noContent retorna um conteudo vazio 204
	}
	
}

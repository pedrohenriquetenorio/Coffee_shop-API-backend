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
import br.com.coffee.io.model.Venda;
import br.com.coffee.io.service.CaixaService;
import br.com.coffee.io.service.VendaService;

@RestController
public class VendaController {
	
	final VendaService vendaService;
	public VendaController(VendaService vendaService){
		this.vendaService = vendaService;
	}
	
	//FindAll
	@GetMapping(value="/listar")
	public ResponseEntity<Object>findAll(){
	return ResponseEntity.status(HttpStatus.OK).body(vendaService.buscarTodos());	
	}
		
	//create
	@RequestMapping(value = "/adicionar")
	@PostMapping
	public ResponseEntity<Venda>adicionar(@RequestBody Venda venda){
	return ResponseEntity.status(HttpStatus.CREATED).body(vendaService.salvar(venda));
	}
	
	//read
	@GetMapping(value="/findById/{id}")
	public ResponseEntity<Object>ler(@PathVariable(value="id") int id){
	return ResponseEntity.status(HttpStatus.OK).body(vendaService.pesquisar(id));		
	}
	
	//update
	@RequestMapping(value = "/update")
	@PutMapping
	public ResponseEntity<Object> atualizar(@RequestBody Venda venda){
	return ResponseEntity.status(HttpStatus.OK).body(vendaService.alterar(venda));	
	}
	
	//delete
	@DeleteMapping(value = "/delete/{id}")
	public ResponseEntity<Void>excluir(@PathVariable int id){
		vendaService.excluir(id);
		return ResponseEntity.noContent().build(); // o noContent retorna um conteudo vazio 204
	}
	
}

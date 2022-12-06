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

import br.com.coffee.io.model.EntradaCaixa;
import br.com.coffee.io.service.EntradaCaixaService;

@RestController
public class EntradaCaixaController {
	
	final EntradaCaixaService entradaCaixaService;
	public EntradaCaixaController(EntradaCaixaService entradaCaixaService){
		this.entradaCaixaService = entradaCaixaService;
	}
	
	//FindAll
	@GetMapping(value="/listar")
	public ResponseEntity<Object>findAll(){
	return ResponseEntity.status(HttpStatus.OK).body(entradaCaixaService.buscarTodos());	
	}
		
	//create
	@RequestMapping(value = "/adicionar")
	@PostMapping
	public ResponseEntity<EntradaCaixa>adicionar(@RequestBody EntradaCaixa entradaCaixa){
	return ResponseEntity.status(HttpStatus.CREATED).body(entradaCaixaService.salvar(entradaCaixa));
	}
	
	//read
	@GetMapping(value="/findById/{id}")
	public ResponseEntity<Object>ler(@PathVariable(value="id") int id){
	return ResponseEntity.status(HttpStatus.OK).body(entradaCaixaService.pesquisar(id));		
	}
	
	//update
	@RequestMapping(value = "/update")
	@PutMapping
	public ResponseEntity<Object> atualizar(@RequestBody EntradaCaixa entradaCaixa){
	return ResponseEntity.status(HttpStatus.OK).body(entradaCaixaService.alterar(entradaCaixa));	
	}
	
	//delete
	@DeleteMapping(value = "/delete/{id}")
	public ResponseEntity<Void>excluir(@PathVariable int id){
		entradaCaixaService.excluir(id);
		return ResponseEntity.noContent().build(); // o noContent retorna um conteudo vazio 204
	}
	
}

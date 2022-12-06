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
import br.com.coffee.io.model.RetiradaCaixa;
import br.com.coffee.io.service.CaixaService;
import br.com.coffee.io.service.RetiradaCaixaService;

@RestController
public class RetiradaCaixaController {
	
	final RetiradaCaixaService retiradaCaixaService;
	public RetiradaCaixaController(RetiradaCaixaService retiradaCaixaService){
		this.retiradaCaixaService = retiradaCaixaService;
	}
	
	//FindAll
	@GetMapping(value="/listar")
	public ResponseEntity<Object>findAll(){
	return ResponseEntity.status(HttpStatus.OK).body(retiradaCaixaService.buscarTodos());	
	}
		
	//create
	@RequestMapping(value = "/adicionar")
	@PostMapping
	public ResponseEntity<RetiradaCaixa>adicionar(@RequestBody RetiradaCaixa retiradaCaixa){
	return ResponseEntity.status(HttpStatus.CREATED).body(retiradaCaixaService.salvar(retiradaCaixa));
	}
	
	//read
	@GetMapping(value="/findById/{id}")
	public ResponseEntity<Object>ler(@PathVariable(value="id") int id){
	return ResponseEntity.status(HttpStatus.OK).body(retiradaCaixaService.pesquisar(id));		
	}
	
	//update
	@RequestMapping(value = "/update")
	@PutMapping
	public ResponseEntity<Object> atualizar(@RequestBody RetiradaCaixa retiradaCaixa){
	return ResponseEntity.status(HttpStatus.OK).body(retiradaCaixaService.alterar(retiradaCaixa));	
	}
	
	//delete
	@DeleteMapping(value = "/delete/{id}")
	public ResponseEntity<Void>excluir(@PathVariable int id){
		retiradaCaixaService.excluir(id);
		return ResponseEntity.noContent().build(); // o noContent retorna um conteudo vazio 204
	}
}

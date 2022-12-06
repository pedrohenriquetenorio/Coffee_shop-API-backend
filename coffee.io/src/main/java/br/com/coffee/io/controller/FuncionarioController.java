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
import br.com.coffee.io.model.Funcionario;
import br.com.coffee.io.service.CaixaService;
import br.com.coffee.io.service.FuncionarioService;

@RestController
public class FuncionarioController {
	
	final FuncionarioService funcionarioService;
	public FuncionarioController(FuncionarioService funcionarioService){
		this.funcionarioService = funcionarioService;
	}
	
	//FindAll
	@GetMapping(value="/listar")
	public ResponseEntity<Object>findAll(){
	return ResponseEntity.status(HttpStatus.OK).body(funcionarioService.buscarTodos());	
	}
		
	//create
	@RequestMapping(value = "/adicionar")
	@PostMapping
	public ResponseEntity<Funcionario>adicionar(@RequestBody Funcionario funcionario){
	return ResponseEntity.status(HttpStatus.CREATED).body(funcionarioService.salvar(funcionario));
	}
	
	//read
	@GetMapping(value="/findById/{id}")
	public ResponseEntity<Object>ler(@PathVariable(value="id") int id){
	return ResponseEntity.status(HttpStatus.OK).body(funcionarioService.pesquisar(id));		
	}
	
	//update
	@RequestMapping(value = "/update")
	@PutMapping
	public ResponseEntity<Object> atualizar(@RequestBody Funcionario funcionario){
	return ResponseEntity.status(HttpStatus.OK).body(funcionarioService.alterar(funcionario));	
	}
	
	//delete
	@DeleteMapping(value = "/delete/{id}")
	public ResponseEntity<Void>excluir(@PathVariable int id){
		funcionarioService.excluir(id);
		return ResponseEntity.noContent().build(); // o noContent retorna um conteudo vazio 204
	}
	
}

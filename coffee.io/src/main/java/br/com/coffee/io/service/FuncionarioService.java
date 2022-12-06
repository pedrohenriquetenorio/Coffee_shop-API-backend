package br.com.coffee.io.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import br.com.coffee.io.model.Funcionario;
import br.com.coffee.io.repository.FuncionarioRepository;

@Service
public class FuncionarioService {
	FuncionarioRepository funcionarioRepository;
	FuncionarioService(FuncionarioRepository funcionarioRepository){
		this.funcionarioRepository = funcionarioRepository;
	}
	//FindAll
	public List<Funcionario>buscarTodos(){
		return funcionarioRepository.findAll(); 
	}
	
	//Create
	public Funcionario salvar(Funcionario funcionario){	
		return funcionarioRepository.save(funcionario);
	}
	
	//Read
	public Optional<Funcionario>pesquisar(int id){
		return funcionarioRepository.findById(id);
	}
	//Update
	public Funcionario alterar(Funcionario funcionario){
		return funcionarioRepository.save(funcionario);
	}
	
	//Delete
	public void excluir(int id){
		funcionarioRepository.deleteById(id);
	}
}

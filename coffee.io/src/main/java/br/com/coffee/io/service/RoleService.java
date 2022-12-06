package br.com.coffee.io.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import br.com.coffee.io.model.Role;
import br.com.coffee.io.repository.RoleRepository;

@Service
public class RoleService {
	RoleRepository roleRepository;
	RoleService(RoleRepository roleRepository){
		this.roleRepository = roleRepository;
	}
	//FindAll
	public List<Role>buscarTodos(){
		return roleRepository.findAll(); 
	}
	
	//Create
	public Role salvar(Role role){	
		return roleRepository.save(role);
	}
	
	//Read
	public Optional<Role>pesquisar(int id){
		return roleRepository.findById(id);
	}
	//Update
	public Role alterar(Role role){
		return roleRepository.save(role);
	}
	
	//Delete
	public void excluir(int id){
		roleRepository.deleteById(id);
	}
}

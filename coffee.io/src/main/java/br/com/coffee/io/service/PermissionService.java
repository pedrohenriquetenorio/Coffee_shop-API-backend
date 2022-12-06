package br.com.coffee.io.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import br.com.coffee.io.model.Permission;
import br.com.coffee.io.repository.PermissionRepository;

@Service
public class PermissionService {
	PermissionRepository permissionRepository;
	PermissionService(PermissionRepository permissionRepository){
		this.permissionRepository = permissionRepository;
	}
	//FindAll
	public List<Permission>buscarTodos(){
		return permissionRepository.findAll(); 
	}
	
	//Create
	public Permission salvar(Permission permission){	
		return permissionRepository.save(permission);
	}
	
	//Read
	public Optional<Permission>pesquisar(int id){
		return permissionRepository.findById(id);
	}
	//Update
	public Permission alterar(Permission permission){
		return permissionRepository.save(permission);
	}
	
	//Delete
	public void excluir(int id){
		permissionRepository.deleteById(id);
	}
}

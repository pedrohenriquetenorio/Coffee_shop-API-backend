package br.com.coffee.io.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.coffee.io.model.Permission;

@Repository
public interface PermissionRepository extends JpaRepository<Permission, Integer>{

}

package br.com.coffee.io.model;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = {"id"})
@Entity
@Table(name = "funcionario")
public class Funcionario implements Serializable{
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@Column(name = "nome_completo", nullable = false)
	private String nomeCompleto;
	
	@Column(name = "cpf", nullable = false)
	private String cpf;
	
	@Column(name = "user_name", nullable = false)
	private String userName;
	
	@Column(name = "password", nullable = false)
	private String Password;
	
	@Column(name = "email", nullable = false)
	private String email;
	
	@Column(name = "celular", nullable = false)
	private String celular;
	
	@Column(name = "data_cadastro", nullable = false)
    private LocalDateTime dataCadastro;
	
	@Column(name = "data_atualizacao", nullable = false)
    private LocalDateTime dataAtualizacao;
	
	@Column(name = "ultimo_login", nullable = true)
    private LocalDateTime dataLogin;
	
	@Column(name = "status", nullable = false)
	private String status;
	
	@ManyToMany
	@JoinTable(name="funcionario_role",
				joinColumns = @JoinColumn(name = "fk_funcionario_id"),
			 	inverseJoinColumns = @JoinColumn(name="fk_role_id"))
	private List<Role>listaRoles = new ArrayList<>();
	
}



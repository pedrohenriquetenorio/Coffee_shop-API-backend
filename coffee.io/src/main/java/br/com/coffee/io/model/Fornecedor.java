package br.com.coffee.io.model;

import java.io.Serializable;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "fornecedor")
public class Fornecedor implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@Column(name = "nome", nullable = false)
	private Double nome;
	
	@Column(name = "cnpj", nullable = false)
	private Double cnpj;
	
	@Column(name = "data_cadastro", nullable = false)
    private LocalDateTime dataCadastro;
	
	@Column(name = "data_atualizacao", nullable = false)
    private LocalDateTime dataAtualizacao;
	
	@Column(name = "status", nullable = false)
	private Double status;
	
	@ManyToOne
    @JoinColumn(name= "fk_funcionario_id")
    private Funcionario funcionario;
	
}

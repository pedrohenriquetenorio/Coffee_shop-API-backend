package br.com.coffee.io.model;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
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
@Table(name = "produto")
public class Produto implements Serializable{
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@Column(name = "descricao", nullable = false)
	private String descricao;
	
	@Column(name = "data_cadastro", nullable = false)
	
    private LocalDateTime dataCadastro;
	
	@Column(name = "data_atualizacao", nullable = false)
	
    private LocalDateTime dataAtualizacao;
	
	@Column(name = "status", nullable = false)
	private String status;
	
	@OneToMany(mappedBy = "produto")
	private List<ProdutoIngrediente>listaProdutosIngredientes;
}

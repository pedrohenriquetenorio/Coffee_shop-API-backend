package br.com.coffee.io.model;

import java.io.Serializable;

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
@Table(name = "produto_ingrediente")
public class ProdutoIngrediente implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	@Column(name = "quantidade", nullable = false)
	private Double quantidade;
	
	@ManyToOne
	@JoinColumn(name = "fk_id_produto")
	private Produto produto;
	
	@ManyToOne
	@JoinColumn(name = "fk_id_ingrediente")
	private Ingrediente ingrediente;
	
	
}

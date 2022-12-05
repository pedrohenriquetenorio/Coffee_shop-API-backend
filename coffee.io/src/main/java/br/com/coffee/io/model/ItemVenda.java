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
@Table(name = "item_venda")
public class ItemVenda implements Serializable{
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
	
	@ManyToOne
    @JoinColumn(name= "fk_venda_id")
    private Venda venda;
}

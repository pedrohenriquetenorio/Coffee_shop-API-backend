package br.com.coffee.io.model;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "compra")
public class Compra implements Serializable{
	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@Column(name = "valor_total", nullable = false)
	private Double valorTotal;
	
	@Column(name = "nota_fiscal", nullable = false)
	private String notaFiscal;
	
	@Column(name = "data_compra", nullable = false)
    private LocalDateTime dataCompra;
	
	@Column(name = "data_atualizacao", nullable = false)
    private LocalDateTime data;
	
	//Status == [A]Aberto - [F]Fechado - [R]RequerAtenção;
	@Column(name = "status", nullable = false, length = 1) 
	private String status;
	//Responsavel pela lista de compra -> pessoa que salva uma compra
	@Column(name = "responsavel_registro_pedido", nullable = false)
	private String responsavelRegistroPedido;
	//Reponsavel pela adição de produtos no estoque -> pessoa que seleciona os produtos de estoque
	@Column(name = "responsavel_selecionar_pedido", nullable = false)
	private String responsavel;
	
	//fornecedor funcionario item compra
	
	@ManyToOne
    @JoinColumn(name= "fk_fornecedor_id")
    private Fornecedor fornecedor;
	
	@ManyToOne
    @JoinColumn(name= "fk_funcionario_id")
    private Funcionario funcionario;
	
	@OneToMany(mappedBy = "compra")
	private List<ItemCompra>listaItensCompra;
	
}

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
@Table(name = "caixa")
public class Caixa implements Serializable{
	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@Column(name = "data_abertura", nullable = false)
	private LocalDateTime dataAbertura;
	
	@Column(name = "data_fechamento", nullable = false)
	private LocalDateTime dataFechamento;
	
	@Column(name = "valor_inicial", nullable = false)
	private Double valorInicial;
	
	@Column(name = "valor_final", nullable = false)
	private Double valorFinal;
	
	@Column(name = "valor_fechamento", nullable = false)
	private Double valorFechamento;
	
	@Column(name = "funcionario_abertura", nullable = false)
	private String funcionarioAberturaCaixa;
	
	@Column(name = "funcionario_fechamento", nullable = false)
	private String funcionariofechamentoCaixa;
	
	@Column(name = "status", nullable = false)
	private boolean status;
	
	@Column(name = "observacao", nullable = false)
	private String observacao;
	
	@ManyToOne
	@JoinColumn(name = "fk_funcionario_id")
	private Funcionario funcionario;
	
}

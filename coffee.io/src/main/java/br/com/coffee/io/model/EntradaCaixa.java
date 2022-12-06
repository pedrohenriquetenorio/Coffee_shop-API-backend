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
@Table(name = "entrada")
public class EntradaCaixa implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@Column(name = "valor", nullable = false)
	private double valor;
	
	@Column(name = "data", nullable = false)
	private LocalDateTime data;
	
	@Column(name = "observacao", nullable = false)
	private String observacao;
	
	@ManyToOne
	@JoinColumn(name = "fk_caixa_id")
	private Caixa caixa;
	
	@ManyToOne
	@JoinColumn(name = "fk_funcionario_id")
	private Funcionario funcionario;
	
}

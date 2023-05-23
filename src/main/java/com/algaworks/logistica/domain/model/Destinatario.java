package com.algaworks.logistica.domain.model;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Transient;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Embeddable //capacidade de ser embutida
public class Destinatario {


	@Column(name = "destinario_nome")
	private String nome;
	

	@Column(name = "destinario_logradouro")
	private String logradouro;
	

	@Column(name = "destinario_numero")
	private String numero;
	

	@Column(name = "destinario_complemento")
	private String complemento;
	

	@Column(name = "destinario_bairro")
	private String bairro;
}

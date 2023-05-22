package com.algaworks.logistica.exceptionHandler;

import java.time.LocalDateTime;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ErroException {

	private Integer status;
	private LocalDateTime dataHora;
	private String titulo;
	

	
}

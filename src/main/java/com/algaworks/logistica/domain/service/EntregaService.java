package com.algaworks.logistica.domain.service;

import java.time.LocalDateTime;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.algaworks.logistica.domain.exception.NegocioException;
import com.algaworks.logistica.domain.model.Cliente;
import com.algaworks.logistica.domain.model.Entrega;
import com.algaworks.logistica.domain.model.StatusEntrega;
import com.algaworks.logistica.domain.repository.ClienteRepository;
import com.algaworks.logistica.domain.repository.EntregaRepository;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
public class EntregaService {

	private EntregaRepository entregaRepository;
	private ClienteService clienteService;
	
	@Transactional
	public Entrega solicitar(Entrega entrega) {
		
		Cliente cliente = clienteService.buscar(entrega.getCliente().getId());
		
		entrega.setCliente(cliente);				
		entrega.setStatus(StatusEntrega.PENDENTE);
		entrega.setDataPedido(LocalDateTime.now());
		
		return entregaRepository.save(entrega);
	}
}

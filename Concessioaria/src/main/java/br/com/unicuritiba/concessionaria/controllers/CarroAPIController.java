package br.com.unicuritiba.concessionaria.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

import br.com.unicuritiba.concessionaria.models.Carro;
import br.com.unicuritiba.concessionaria.repository.CarroRepository;

import java.util.List;

public class CarroAPIController {
	
	@Autowired
	private CarroRepository repositorio;
	
	@GetMapping("/carros")
	public ResponseEntity<List<Carro>> getCarros() {
		
		List<Carro> carros = repositorio.findAll();
		return ResponseEntity.ok(carros);
				
	}

}

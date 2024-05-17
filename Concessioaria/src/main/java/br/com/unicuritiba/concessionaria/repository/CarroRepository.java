package br.com.unicuritiba.concessionaria.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.RestController;
import br.com.unicuritiba.concessionaria.models.Carro;

@RestController
public interface CarroRepository extends JpaRepository<Carro, Long>{
		
	
	
}

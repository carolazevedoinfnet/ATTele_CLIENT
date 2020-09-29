package br.com.infnet.ATTele_CLIENT.model.clients;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import br.com.infnet.ATTele_CLIENT.negocio.Medico;



@FeignClient(url = "http://localhost:8081/medico", name = "medicoClient")
public interface IMedicoClient {
	
	
	@GetMapping(value = "/medicos")
	public List<Medico> obterLista(); //ListaMedicos

	@PostMapping(value = "/medico") 
	public void incluir(Medico medico);
		
	
	@DeleteMapping(value = "/medico/excluir/{id}")
	public void excluir(@PathVariable Integer id);
	

	@GetMapping(value = "/medico/{id}/consultar")
	public Medico obterPorId(@PathVariable Integer id);
	
	
	
	

}

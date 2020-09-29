package br.com.infnet.ATTele_CLIENT.model.clients;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import br.com.infnet.ATTele_CLIENT.negocio.Exame;




@FeignClient(url = "http://localhost:8081/api/telemedicina/exame", name = "exameClient")
public interface IExameClient {
	
	
	@GetMapping(value = "/exames")
	public List<Exame> obterLista(); //ListaConsulta

	@PostMapping(value = "/exame") 
	public void incluir(Exame exame);
	
	
	@DeleteMapping(value = "/exame/excluir/{id}")
	public void excluir(@PathVariable Integer id);
	

	@GetMapping(value = "/exame/{id}/consultar")
	public Exame obterPorId(@PathVariable Integer id);


	}
	
	
	
	
	

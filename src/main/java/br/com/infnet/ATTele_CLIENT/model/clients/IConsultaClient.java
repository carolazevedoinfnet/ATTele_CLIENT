package br.com.infnet.ATTele_CLIENT.model.clients;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import br.com.infnet.ATTele_CLIENT.negocio.Consulta;



@FeignClient(url = "http://localhost:8081/api/telemedicina/consulta", name = "consultaClient")

public interface IConsultaClient {
	
	
	@GetMapping(value = "/consulta/listaConsulta") public List<Consulta>
	  obterLista(); //ListaExames
	 
	@PostMapping(value = "/consulta")
	public void incluir(Consulta consulta);

	@DeleteMapping(value = "/consulta/{id}/excluir")
	public void excluir(@PathVariable Integer id);

	@GetMapping(value = "/consulta/{id}/consultar")
	public Consulta obterPorId(@PathVariable Integer id);
	



}



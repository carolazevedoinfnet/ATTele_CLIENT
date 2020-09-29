package br.com.infnet.ATTele_CLIENT.model.clients;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import br.com.infnet.ATTele_CLIENT.negocio.Paciente;




@FeignClient(url = "http://localhost:8081/api/telemedicina/paciente", name = "pacienteClient")
public interface IPacienteClient {
	
	
	
	@GetMapping(value = "/pacientes")
	public List<Paciente> obterLista(); //ListaPacientes

	@PostMapping(value = "/paciente") 
	public void incluir(Paciente paciente);
		
	
	@DeleteMapping(value = "/paciente/excluir/{id}")
	public void excluir(@PathVariable Integer id);
	

	@GetMapping(value = "/paciente/{id}/consultar")
	public Paciente obterPorId(@PathVariable Integer id);
	
	


}

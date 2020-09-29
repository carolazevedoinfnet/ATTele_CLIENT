package br.com.infnet.ATTele_CLIENT.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.infnet.ATTele_CLIENT.model.clients.IPacienteClient;
import br.com.infnet.ATTele_CLIENT.negocio.Paciente;





@Service 
public class PacienteService {
	
	@Autowired private IPacienteClient pacienteClient;


	public void incluir(Paciente paciente) {
		pacienteClient.incluir(paciente);
	}


	public List<Paciente> obterLista(){
		return pacienteClient.obterLista();
	}
	
	

	
	
	public void excluir(Integer id) {
		pacienteClient.excluir(id);
		
	
		}
}
	




package br.com.infnet.ATTele_CLIENT.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.infnet.ATTele_CLIENT.model.clients.IMedicoClient;
import br.com.infnet.ATTele_CLIENT.negocio.Medico;



@Service 
public class MedicoService {
	
	@Autowired private IMedicoClient medicoClient;


	public void incluir(Medico medico) {
		medicoClient.incluir(medico);
		
	}

	public void excluir(Integer id) {
		medicoClient.excluir(id);
}
	
		public List<Medico> obterLista(){
			return medicoClient.obterLista();
		}

		
		public Medico obterPorId(Integer id) {
			return medicoClient.obterPorId(id);
		}
		
	}




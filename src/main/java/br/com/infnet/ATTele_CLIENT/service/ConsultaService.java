package br.com.infnet.ATTele_CLIENT.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.infnet.ATTele_CLIENT.model.clients.IConsultaClient;
import br.com.infnet.ATTele_CLIENT.negocio.Consulta;




@Service 
public class ConsultaService {

	@Autowired private IConsultaClient client;


	public void incluir(Consulta consulta) {
		client.incluir(consulta);	
	}
	
	
	public List<Consulta> obterLista(){
		return client.obterLista();
	}
	

	public Consulta consultar(Integer id) {
		return client.obterPorId(id);
	}
		
		
		public void excluir(Integer id) {
			client.excluir(id);
}
	

}

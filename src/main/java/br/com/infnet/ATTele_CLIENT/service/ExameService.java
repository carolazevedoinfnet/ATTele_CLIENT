package br.com.infnet.ATTele_CLIENT.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.infnet.ATTele_CLIENT.model.clients.IExameClient;
import br.com.infnet.ATTele_CLIENT.negocio.Exame;



@Service 
public class ExameService {

	@Autowired private IExameClient exameClient;


	public void incluir(Exame exame) {
		exameClient.incluir(exame);
	}
	

	public List<Exame> obterLista(){
		return exameClient.obterLista();
	}

	
	public Exame obterPorId(Integer id) {
		return exameClient.obterPorId(id);
	}

		
		public void excluir(Integer id) {
			exameClient.excluir(id);
		}
}
		


	

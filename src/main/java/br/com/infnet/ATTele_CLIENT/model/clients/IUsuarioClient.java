package br.com.infnet.ATTele_CLIENT.model.clients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import br.com.infnet.ATTele_CLIENT.negocio.Usuario;



@FeignClient(url = "http://localhost:8081/api/telemedicina/usuario", name = "usuarioClient")
public interface IUsuarioClient {
	
	
	 @PostMapping(value = "") public boolean isValid(@RequestParam String
			  login, @RequestParam String senha);
			  
		
		  @PostMapping(value = "/{login}") public Usuario obterPorLogin(@PathVariable
		  String login);
		  
		  @PostMapping(value = "/incluir") public void incluir(@RequestBody Usuario
		  usuario);
		 
	
	

}







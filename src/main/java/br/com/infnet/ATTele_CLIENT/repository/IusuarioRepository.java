package br.com.infnet.ATTele_CLIENT.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.infnet.ATTele_CLIENT.negocio.Usuario;




@Repository
public interface IusuarioRepository extends CrudRepository<Usuario, Integer> {
	
	@Query("from Usuario u where u.login =:login and u.senha =:senha")
	Usuario autenticacao (String login, String senha);

}

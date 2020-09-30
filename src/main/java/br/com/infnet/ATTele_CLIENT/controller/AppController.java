package br.com.infnet.ATTele_CLIENT.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

import br.com.infnet.ATTele_CLIENT.negocio.Usuario;
import br.com.infnet.ATTele_CLIENT.service.UsuarioService;

@Controller
@SessionAttributes("user")
public class AppController {

	@Autowired 
	private UsuarioService usuarioService;

	@RequestMapping(value = "", method = RequestMethod.GET)
	public String showInit() {
		
		
		return "login";
	}

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String showLogin() {
		return this.showInit();
	}
	
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String showHome(
				Model model,
				@RequestParam String login,
				@RequestParam String senha
			) {

		/* Usuario usuario = usuarioService.isValid(login, senha); */
		
		Usuario usuario = new Usuario();
		usuario.setNome("Carolina");
		usuario.setLogin("Carolina");
		usuario.setSenha("Carolina");
		
		model.addAttribute("user", usuario);
		return "home";
		
		/*
		 * if(usuario == null) { model.addAttribute("mensagem",
		 * "Credenciais inválidas: " + login); return "login"; } else {
		 * model.addAttribute("user", usuario); return "home"; }
		 */	
	}

	@RequestMapping(value = "/voltar", method = RequestMethod.GET) 
	public String voltar() {		
		return "home";
	}
	
	@RequestMapping(value = "/sair", method = RequestMethod.GET)
	public String sair(SessionStatus session) {
		
		session.setComplete();
		
		return "login";
	}
}

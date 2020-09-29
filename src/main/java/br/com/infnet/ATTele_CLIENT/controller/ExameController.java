package br.com.infnet.ATTele_CLIENT.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.infnet.ATTele_CLIENT.negocio.Exame;
import br.com.infnet.ATTele_CLIENT.service.ExameService;





@Controller
public class ExameController {

	
	@Autowired 
	private ExameService exameService;
	
	
	@RequestMapping(value= "/exames", method = RequestMethod.GET) 
	public String obterListaExames(
			  Model model
			  ) {
	  
	  model.addAttribute("listaExames", exameService.obterLista());
	  
	  return "exame/listaExames"; }
	  
	  
	@RequestMapping(value= "/exame",method = RequestMethod.GET)
	public String showExame() {
		return "exame/exame";
	}
	
	  
	  @RequestMapping(value = "/exame", method = RequestMethod.POST) 
	  public String incluir(
			  Model model, 
			  Exame exame
			  ) {

			  exameService.incluir(exame);
		  	return this.obterListaExames(model); }

	  
	  @RequestMapping(value = "/exame/excluir/{id}", method = RequestMethod.GET)
	  public String excluir(
			  Model model, 
			  @PathVariable Integer id ) {
		  exameService.excluir(id); 
	return this.obterListaExames(model); 
	}
	  
	  }

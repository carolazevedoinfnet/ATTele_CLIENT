package br.com.infnet.ATTele_CLIENT.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import br.com.infnet.ATTele_CLIENT.negocio.Medico;
import br.com.infnet.ATTele_CLIENT.negocio.Paciente;
import br.com.infnet.ATTele_CLIENT.service.MedicoService;



@Controller 
public class MedicoController {

	
	@Autowired 
	private MedicoService medicoService;
	
	
	@RequestMapping(value= "/medico",method = RequestMethod.GET)
	public String showMedico(
			Model model
			) {
		return "medico/medico";
	}
  
	
	
	
	@RequestMapping(value= "/medicos", method = RequestMethod.GET) 
	public String obterListaMedico(
			  Model model
			  ) {
	  
	  model.addAttribute("listaMedicos", medicoService.obterLista());
	  
	  return "medico/listaMedicos"; }
	

	  
	  @PostMapping(value = "/medico") 
	  public String incluir(
			  Model model, 
			  Medico medico
			 //@RequestParam 
			// String[] especialidades
			 ) {

		  
			/* medico.setEspecialidades(especialidades); */
		  	medicoService.incluir(medico);
			return "redirect:/medicos";
		
	  }
	  
	  
	  
	  
	  

	  @RequestMapping(value = "/medico/excluir/{id}", method = RequestMethod.GET)
	  public String excluir(
			  Model model, 
			  @PathVariable Integer id ) {
		  medicoService.excluir(id); 
	return this.obterListaMedico(model); 
	}
	  


	  
	  }



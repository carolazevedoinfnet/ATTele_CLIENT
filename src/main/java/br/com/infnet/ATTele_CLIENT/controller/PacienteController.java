package br.com.infnet.ATTele_CLIENT.controller;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import br.com.infnet.ATTele_CLIENT.negocio.Paciente;
import br.com.infnet.ATTele_CLIENT.service.MedicoService;
import br.com.infnet.ATTele_CLIENT.service.PacienteService;




@Controller 
public class PacienteController {
	
	@Autowired 
	private PacienteService pacienteService;
	
	@Autowired
	private MedicoService medicoService;
	
	@RequestMapping(value= "/paciente",method = RequestMethod.GET)
	public String showPaciente(
			Model model
			
			) {
	
		model.addAttribute("listaMedicos", medicoService.obterLista());
		

		return "paciente/paciente";
	}

	
	@RequestMapping(value= "/pacientes", method = RequestMethod.GET) public
	  String obterListaPaciente(
			  Model model
			  ) {
	  
	  model.addAttribute("listaPacientes", pacienteService.obterLista());
	  
	  return "paciente/listaPacientes"; }
	  
	  
	  
	
	  
	  @RequestMapping(value = "/paciente", method = RequestMethod.POST) public
	  String incluir(
			  Model model, 
			  Paciente paciente
		
			  ) {
		  	  pacienteService.incluir(paciente);
		  	  return this.obterListaPaciente(model); }
	  
	  @RequestMapping(value = "/paciente/excluir/{id}", method = RequestMethod.GET)
	  public String excluir(
			  Model model, 
			  @PathVariable Integer id
			  ) {
		  
		  
		  		pacienteService.excluir(id); 
		  		return this.obterListaPaciente(model);

	  
	}
	  
	  }






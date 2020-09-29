package br.com.infnet.ATTele_CLIENT.controller;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import br.com.infnet.ATTele_CLIENT.negocio.Consulta;
import br.com.infnet.ATTele_CLIENT.negocio.Exame;
import br.com.infnet.ATTele_CLIENT.service.ConsultaService;
import br.com.infnet.ATTele_CLIENT.service.ExameService;
import br.com.infnet.ATTele_CLIENT.service.MedicoService;
import br.com.infnet.ATTele_CLIENT.service.PacienteService;



@Controller
public class ConsultaController {

	@Autowired
	private ConsultaService consultaService;
	@Autowired
	private ExameService exameService;
	@Autowired
	private MedicoService medicoService;
	@Autowired
	private PacienteService pacienteService;

	@RequestMapping(value = "/consultas", method = RequestMethod.GET)
	public String obterListaConsulta(Model model) {
		model.addAttribute("dataAtual", consultaService.obterLista());
		model.addAttribute("dataLimite", consultaService.obterLista());
		model.addAttribute("exames", exameService.obterLista());
		model.addAttribute("pacientes", pacienteService.obterLista());
		model.addAttribute("medicos", medicoService.obterLista());
		model.addAttribute("listaConsulta", consultaService.obterLista());

		return "consulta/listaConsulta";
	}

	@PostMapping(value = "/consulta")
	public String consulta(Model model, Consulta consulta) {
		consultaService.incluir(consulta);
		return "redirect:/consulta";

	}

	@RequestMapping(value = "/consulta", method = RequestMethod.GET)
	public String showConsulta(Model model) {
		model.addAttribute("pacientes", pacienteService.obterLista());
		model.addAttribute("medicos", medicoService.obterLista());
		model.addAttribute("exames", exameService.obterLista());
		
		return "consulta/consulta";
	}

	@RequestMapping(value = "/consulta/incluir", method = RequestMethod.POST)
	public String incluir(Model model, Consulta consulta, @RequestParam String dataConsulta,
			@RequestParam String horaConsulta, @RequestParam Optional<String[]> exameIds) {

		if (exameIds.isPresent()) {
			List<Exame> lista = new ArrayList<Exame>();

			for (String id : exameIds.get()) {
				lista.add(exameService.obterPorId(Integer.valueOf(id)));
			}

			consulta.setExames(lista);
		}

		try {
			if (!dataConsulta.isEmpty())
				consulta.setData(LocalDate.parse(dataConsulta, DateTimeFormatter.ofPattern("yyyy-MM-dd")));
		} catch (Exception ignored) {
		}
		;

		try {
			if (!horaConsulta.isEmpty())
				consulta.setHora(LocalTime.parse(horaConsulta, DateTimeFormatter.ofPattern("HH:mm")));
		} catch (Exception ignored) {
		}
		;

		consultaService.incluir(consulta);

		return this.obterListaConsulta(model);
	}

	@RequestMapping(value = "/consulta/excluir/{id}", method = RequestMethod.GET)
	public String excluir(Model model, @PathVariable Integer id) {
		consultaService.excluir(id);
		return this.obterListaConsulta(model);
	}

}

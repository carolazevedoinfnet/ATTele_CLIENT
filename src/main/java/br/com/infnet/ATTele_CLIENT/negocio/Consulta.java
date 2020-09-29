package br.com.infnet.ATTele_CLIENT.negocio;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;



public class Consulta {

	private Integer id;
	private String categoria;

	private LocalDate data;
	
	private LocalTime hora;
	

	
	private List<Exame> exames;
	

	private Medico medico;

	private Paciente paciente;
	
	

	public Consulta() {
		
	}
	

	@Override
	public String toString() {
		return String.format("%d - Consulta com %s ,dia: %s, hora: %s.", 
		
				this.id,
				this.categoria,
				this.data,
				this.hora
			
				);
	}


	public void imprimir() {
		System.out.println(this);

	}


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getCategoria() {
		return categoria;
	}


	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}


	public LocalDate getData() {
		return data;
	}


	public void setData(LocalDate data) {
		this.data = data;
	}


	public LocalTime getHora() {
		return hora;
	}


	public void setHora(LocalTime hora) {
		this.hora = hora;
	}


	public Medico getMedico() {
		return medico;
	}


	public void setMedico(Medico medico) {
		this.medico = medico;
	}


	public Paciente getPaciente() {
		return paciente;
	}


	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}


	public List<Exame> getExames() {
		return exames;
	}


	public void setExames(List<Exame> exames) {
		this.exames = exames;
	}


	
}

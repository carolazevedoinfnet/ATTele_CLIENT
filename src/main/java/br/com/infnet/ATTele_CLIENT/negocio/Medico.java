package br.com.infnet.ATTele_CLIENT.negocio;

import java.time.LocalDate;

public class Medico {

	private Integer id;
	private String nome;
	private String email;
	private boolean clinico;
	private boolean especialista;
	/* private String[] especialidades; */

	public Medico() {
	}

	/*
	 * public Medico(Integer id, String nome, String email, boolean clinico, boolean
	 * especialista String[] especialidades) { this.id = id; this.nome = nome;
	 * this.email = email; this.clinico = clinico; this.especialista = especialista;
	 * //this.especialidades = especialidades;
	 */
	
	
	public Medico(Integer id, String nome, String email, boolean clinico, boolean especialista/* String[] especialidades*/) {
		this.setId(id);
		this.setNome(nome);
		this.setEmail(email);
		this.setClinico(clinico);
		this.setEspecialista(especialista);
	}

	@Override
	public String toString() {

		return String.format ("%s", this.getNome());

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

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public boolean isClinico() {
		return clinico;
	}

	public void setClinico(boolean clinico) {
		this.clinico = clinico;
	}

	public boolean isEspecialista() {
		return especialista;
	}

	public void setEspecialista(boolean especialista) {
		this.especialista = especialista;
	}

	/*
	 * public String getEspecialidades() { if (especialidades ==null) return "" ;
	 * 
	 * String especi = "";
	 * 
	 * for (String spec : especialidades) { if(especi.equals("")) especi = spec;
	 * else especi = especi + ", " + spec; }
	 * 
	 * return especi; }
	 * 
	 * public void setEspecialidades(String[] especialidades) { this.especialidades
	 * = especialidades; }
	 */

}

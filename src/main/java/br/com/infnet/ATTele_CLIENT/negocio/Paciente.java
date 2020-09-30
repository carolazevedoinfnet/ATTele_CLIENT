package br.com.infnet.ATTele_CLIENT.negocio;

import java.time.LocalDate;



public class Paciente {

	

	private Integer id;
	private String nome;
	private String email;
	private String plano;
	private boolean tipo;
	private Integer carteirinha;
	

	
	public Paciente() {
		
	}
	
	// ver se necesssario abaixo
	
	public Paciente(String nome, LocalDate data, String email, String plano, Boolean tipo, Integer carteirinha) {
		this();
		this.setNome(nome);
		this.setEmail(email);
		this.setPlano(plano);
		this.setTipo(tipo);
		this.setCarteirinha(carteirinha);
	}

	//
	
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
	
	public boolean isTipo() {
		return tipo;
	}

	public void setTipo(boolean tipo) {
		this.tipo = tipo;
	}
	

	public String getPlano() {
		return plano;
	}

	public void setPlano(String plano) {
		this.plano = plano;
	}


	public Integer getCarteirinha() {
		return carteirinha;
	}

	public void setCarteirinha(Integer carteirinha) {
		this.carteirinha = carteirinha;
	}


}

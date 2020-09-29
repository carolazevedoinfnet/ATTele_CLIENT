package br.com.infnet.ATTele_CLIENT.negocio;


import java.util.List;


public class Exame {
	
	
	private Integer id;
	private String descricao;

	private List<Consulta> consultas;

	public Exame() {		
	}
	
	public Exame(Integer id, String descricao, List<Consulta> consultas) {
		super();
		this.id = id;
		this.descricao = descricao;
		this.consultas = consultas;
	}
	
	@Override
	public String toString() {
		return this.getDescricao();
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
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	  public List<Consulta> getConsultas() { return consultas; } public void
	  setConsultas(List<Consulta> consultas) { this.consultas = consultas; }
	 
}

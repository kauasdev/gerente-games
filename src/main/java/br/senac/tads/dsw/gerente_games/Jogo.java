package br.senac.tads.dsw.gerente_games;

public class Jogo {

	private Integer id;
	private String titulo;
	private int anoDeLancamento;
	private String plataforma;
	private boolean disponivel;
	private String observacoes;

	public Jogo(){

	}

	public Jogo(Integer id, String titulo, int anoDeLancamento, String plataforma, boolean disponivel, String observacoes) {
		this.id = id;
		this.titulo = titulo;
		this.anoDeLancamento = anoDeLancamento;
		this.plataforma = plataforma;
		this.disponivel = disponivel;
		this.observacoes = observacoes;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getAnoDeLancamento() {
		return anoDeLancamento;
	}

	public void setAnoDeLancamento(int anoDeLancamento) {
		this.anoDeLancamento = anoDeLancamento;
	}

	public String getPlataforma() {
		return plataforma;
	}

	public void setPlataforma(String plataforma) {
		this.plataforma = plataforma;
	}

	public String getObservacoes() {
		return observacoes;
	}

	public void setObservacoes(String observacoes) {
		this.observacoes = observacoes;
	}

	public boolean isDisponivel() {
		return disponivel;
	}

	public void setDisponivel(boolean disponivel) {
		this.disponivel = disponivel;
	}
}

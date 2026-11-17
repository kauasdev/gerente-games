package br.senac.tads.dsw.gerente_games;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class Jogo {

	private Integer id;

	@NotBlank(message = "O título é obrigatório")
	@Size(max = 64)
	private String titulo;

	@NotNull(message = "O ano de lançamento é obrigatório")
	private int anoDeLancamento;

	@NotBlank(message = "O plataforma é obrigatória")
	@Size(max = 64)
	private String plataforma;

	@NotNull
	private boolean disponivel;

	@Size(max = 100)
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

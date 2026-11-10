package br.senac.tads.dsw.gerente_games;

public class Mensagem {
	private String nome;
	private String texto;

	public Mensagem(String nome, String texto) {
		this.nome = nome;
		this.texto = texto;
	}

	public String getNome() {
		return nome;
	}

	public String getTexto() {
		return texto;
	}
}


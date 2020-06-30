package com.algaworks.brewer.model;

public enum Sabor {

	ADOCICADA("Adocicada"), 
	AMARGA("Amarga"), 
	FORTE("Fote"), 
	FRUTADA("Frutada"), 
	SUAVE("Suave");

	private String descricao;

	private Sabor(String descricao) {
		this.descricao = descricao;
	}

	public String getDescricao() {
		return descricao;
	}
}

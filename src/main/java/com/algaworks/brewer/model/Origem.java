package com.algaworks.brewer.model;

public enum Origem {

	NACIONAL("Nacional"), 
	INTERNACIONAL("Interenacional");

	private String descricao;

	Origem(String descricao) {
		this.descricao = descricao;
	}

	public String getDescricao() {
		return descricao;
	}
}

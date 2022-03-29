package br.com.floricultura.model;

public class Item {
	
	private int id;
	private String nome;
	private String descricao;
	private double preco_custo;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public double getPreco_custo() {
		return preco_custo;
	}
	public void setPreco_custo(double preco_custo) {
		this.preco_custo = preco_custo;
	}

}

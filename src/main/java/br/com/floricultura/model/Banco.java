package br.com.floricultura.model;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Banco {

	private static List<Item> itens = new ArrayList<Item>();
	private static Integer chaveSequencial = 1;
	
	//Cadastra automaticamente ao inicializar o projeto
	//Será utilizado enquanto o projeto não tiver conectado a um banco de dados
	static {
		Item i1 = new Item();
		i1.setId(chaveSequencial++);
		i1.setNome("Tulipa");
		i1.setDescricao("Coloração branco, ainda ramo, apenas botão");
		i1.setPreco_custo(5.90);
		
		Item i2 = new Item();
		i2.setId(chaveSequencial++);
		i2.setNome("Rosa");
		i2.setDescricao("Coloração artificial da cor azul, com botão subdesenvolvido, validade de 2 ou 3 dias");
		i2.setPreco_custo(8.99);
		
		Item i3 = new Item();
		i3.setId(chaveSequencial++);
		i3.setNome("Semente grama cristal");
		i3.setDescricao("Semente de grama cristal fortificada");
		i3.setPreco_custo(2.50);
		
		Banco.itens.add(i1);
		Banco.itens.add(i2);
		Banco.itens.add(i3);
	}
	
	public void add(Item item) {
		item.setId(Banco.chaveSequencial++);		
		Banco.itens.add(item);
	}
	
	public List<Item> list(){
		return Banco.itens;
	}

	public void delete(Integer id) {
		Iterator<Item> it = itens.iterator();
		
		while(it.hasNext()) {
			Item item = it.next();
			
			if(item.getId() == id)
				it.remove();
			
		}
		
	}

	public Item findById(Integer id) {
		for(Item item: itens) {
			if(item.getId() == id) {
				return item;
			}
		}
		return null;
	}
	
}

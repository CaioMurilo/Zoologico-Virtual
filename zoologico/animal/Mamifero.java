package br.com.zoologico.animal;

public class Mamifero extends Animal {
	
	// Atributos (caracteristicas)
	
	private boolean possuiPelos;

	public Mamifero(String nome, int idade, String porte, boolean possuiPelos) {
		super(nome, idade, porte);
		this.possuiPelos = possuiPelos;
	} 

	// Métodos (Ações)
	
	public void mostrarPelos() {
		if(possuiPelos) {
			System.out.println(nome+" possui pelos.");
		} else {
			System.out.println(nome+" não possui pelos.");
		}
	}
	
}
package br.com.zoologico.animal;

public class Animal {

	// Atributos (caracteristicas)
	protected String nome;
	private int idade;
	private String porte;
	
	public Animal(String nome, int idade, String porte) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.porte = porte;
	}

	// Métodos (Ações)
	public void emitirSom() {
		System.out.println(nome+" está emitindo som.");
	}
	
	public void locomover() {
		System.out.println(nome+" está se movendo.");
	}
	
	public void respirar() {
		System.out.println(nome+" está respirando.");
	}
	
	public void comer() {
		System.out.println(nome+" comeu.");
	}
	
	public void idade() {
		System.out.println("O "+nome+" possui: "+idade+" anos de vida.");
	}
}
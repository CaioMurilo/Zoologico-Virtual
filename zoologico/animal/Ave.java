package br.com.zoologico.animal;

public class Ave extends Animal {
	
	// Atributos (caracteristicas)
	
	private boolean podeVoar;
	
	public Ave(String nome, int idade, String porte, boolean podeVoar) {
		super(nome, idade, porte);
		this.podeVoar = podeVoar;
	}

	// Métodos (Ações)
	
	public void verificarVoo() {
		if(podeVoar) {
			System.out.println(nome+" pode voar.");
		} else {
			System.out.println(nome+" não pode voar.");
		}
	}
}
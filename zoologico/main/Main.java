package br.com.zoologico.main;

import br.com.zoologico.animal.Ave;
import br.com.zoologico.animal.Mamifero;

public class Main {

	public static void main(String[] args) {
		
		// Criando um Mamifero
		
		Mamifero objMamifero = new Mamifero("Golfinho", 10, "Grande", false);
		objMamifero.comer();
		objMamifero.emitirSom();
		objMamifero.locomover();
		objMamifero.respirar();
		objMamifero.idade();
		
		objMamifero.mostrarPelos();
		
		System.out.println("==============================================================");
		
		// Criando uma Ave
		
		Ave objAve = new Ave("Ararinha-azul", 6, "Pequeno", true);
		objAve.comer();
		objAve.emitirSom();
		objAve.locomover();
		objAve.respirar();
		objAve.idade();
		
		objAve.verificarVoo();
	}

}

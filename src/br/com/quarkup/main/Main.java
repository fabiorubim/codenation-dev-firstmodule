package br.com.quarkup.main; 
import br.com.quarkup.others.*;

public class Main {
	public static void main(String[] args) {
		Pessoa pessoa = new Pessoa();
				
		pessoa.nome = "Fabiu";
		System.out.println(pessoa.Nome());
		
		pessoa.MetodoEstatico(); //Instanciado
		
		Pessoa.MetodoEstatico(); //N�o instanciado
		
		System.out.println("Isto � uma soma: " + Pessoa.soma(5, 6));
	}

}


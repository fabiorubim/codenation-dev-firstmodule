package br.com.quarkup.main; 
import br.com.quarkup.others.*;

public class Main {
	public static void main(String[] args) {
		//Note que o programa é iniciado por um método chamado main(), não por uma função, como em C ou C++. 
		//Em Java, não existem funções “livres”, apenas métodos.
		
		//Em C e C++, declara-se que uma variável é um vetor colocando o par de colchetes após o nome da variável, 
		//como em char array[]. É possível fazer isso também em Java, mas geralmente é recomendado colocar o par 
		//de colchetes após o tipo, pois isso deixaria claro que o tipo da variável não é String, mas sim um vetor.

		//O parâmetro que o método main() recebe é um array com todos os argumentos que foram passados, 
		//pela linha de comando, para o programa Java, de modo semelhante aos parâmetros argc e argv da função
		//main() de C.
		
		Pessoa pessoa = new Pessoa();
				
		pessoa.nome = "Fabiu";
		System.out.println(pessoa.Nome());
		
		pessoa.MetodoEstatico(); //Instanciado
		
		Pessoa.MetodoEstatico(); //Não instanciado
		
		System.out.println("Isto é uma soma: " + Pessoa.soma(5, 6));
	}

}


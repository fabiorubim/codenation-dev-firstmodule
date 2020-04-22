package br.com.quarkup.main; 
import br.com.quarkup.others.*;

public class Main {
	public static void main(String[] args) {
		//Note que o programa � iniciado por um m�todo chamado main(), n�o por uma fun��o, como em C ou C++. 
		//Em Java, n�o existem fun��es �livres�, apenas m�todos.
		
		//Em C e C++, declara-se que uma vari�vel � um vetor colocando o par de colchetes ap�s o nome da vari�vel, 
		//como em char array[]. � poss�vel fazer isso tamb�m em Java, mas geralmente � recomendado colocar o par 
		//de colchetes ap�s o tipo, pois isso deixaria claro que o tipo da vari�vel n�o � String, mas sim um vetor.

		//O par�metro que o m�todo main() recebe � um array com todos os argumentos que foram passados, 
		//pela linha de comando, para o programa Java, de modo semelhante aos par�metros argc e argv da fun��o
		//main() de C.
		
		Pessoa pessoa = new Pessoa();
				
		pessoa.nome = "Fabiu";
		System.out.println(pessoa.Nome());
		
		pessoa.MetodoEstatico(); //Instanciado
		
		Pessoa.MetodoEstatico(); //N�o instanciado
		
		System.out.println("Isto � uma soma: " + Pessoa.soma(5, 6));
	}

}


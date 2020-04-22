package br.com.quarkup.main;

public class Basic {
	//nome � um ATRIBUTO, pertence a classe, e n�o a um m�todo.
	//Quando a classe Basic � criada, o atributo nome � alocado, e ser� desalocado somente quando o objeto
	//for destru�do pelo GC.
	//Atributos podem n�o ser inicializados, pois eles j� possum um valor padr�o.
	private String nome; //O valor padr�o para nome � null;
	private int idade; //o Valor padr�o para o tipo int � 0.
	private boolean maiorDeDezoitoAnos; //O valor padr�o para o tipo boolean � false.
	private double salario;//O valor padr�o para os tipos num�ricos s�o 0;
	private String sobreNome = "Biasi Mello Rubim";//Aqui a vari�vel sobreNome foi inicializada com um valor.
	
	public void metodoTeste() {
		//Isto � um vari�vel com o escopo local, no m�todo. Toda vez que o m�todo � executado esta vari�vel
		//� criada, utilizada e removida.
		int variavelLocal = 220;//Toda vari�vel local precisa ser inicializada com um valor. 
		
		System.out.println("Valor da vari�vel local: " + variavelLocal);
	}

	public static void main(String[] args) {
		Basic basic = new Basic();
		basic.metodoTeste();
	}
}

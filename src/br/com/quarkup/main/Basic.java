package br.com.quarkup.main;

public class Basic {
	//nome é um ATRIBUTO, pertence a classe, e não a um método.
	//Quando a classe Basic é criada, o atributo nome é alocado, e será desalocado somente quando o objeto
	//for destruído pelo GC.
	//Atributos podem não ser inicializados, pois eles já possum um valor padrão.
	private String nome; //O valor padrão para nome é null;
	private int idade; //o Valor padrão para o tipo int é 0.
	private boolean maiorDeDezoitoAnos; //O valor padrão para o tipo boolean é false.
	private double salario;//O valor padrão para os tipos numéricos são 0;
	private String sobreNome = "Biasi Mello Rubim";//Aqui a variável sobreNome foi inicializada com um valor.
	
	public void metodoTeste() {
		//Isto é um variável com o escopo local, no método. Toda vez que o método é executado esta variável
		//é criada, utilizada e removida.
		int variavelLocal = 220;//Toda variável local precisa ser inicializada com um valor. 
		
		System.out.println("Valor da variável local: " + variavelLocal);
	}

	public static void main(String[] args) {
		Basic basic = new Basic();
		basic.metodoTeste();
	}
}

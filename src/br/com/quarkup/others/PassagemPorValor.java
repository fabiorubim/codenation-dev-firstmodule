package br.com.quarkup.others;

public class PassagemPorValor {
	public static void incrementa(int num) {
		num++;
		
		System.out.println("Incrementado: " + num);
	}
	
	public static void main(String[] args) {
		
		//PassagemPorValor p = new PassagemPorValor();
		PassagemPorValor.incrementa(10);
		
		int num = 20;
		PassagemPorValor.incrementa(num);
		System.out.println("Não incrementado: " + num);
		
		
	}

}

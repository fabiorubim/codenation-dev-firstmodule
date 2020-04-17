package br.com.quarkup.others;

public class CalcVetor {
	public static void main(String[] args) {
		int[] vetor = new int[5];
		
		vetor[0] = 10;
		vetor[1] = 5;
		vetor[2] = 7;
		vetor[3] = 8;
		vetor[4] = 1;
		
		System.out.println("O somatório é: " + somatorio(vetor));
		
		System.out.println("O produtório é: " + produtorio(vetor));
	}
	
	private static int somatorio(int[] vetor) {
		int aux = 0;
		for (byte i=0; i < vetor.length; i++) {
			aux += vetor[i];
		}
		return aux;
	}
	
	private static int produtorio(int[] vetor) {
		int aux = 1;
		for (byte x = 0; x < vetor.length; x++ ) {
			aux *= vetor[x];						
		}
		return aux;
	}

}

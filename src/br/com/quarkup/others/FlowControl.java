package br.com.quarkup.others;

public class FlowControl {
	public static void main(String[] args) {
//		if (20 = 5) {
//			System.out.println("Isto não compila!");
//		}
		
		boolean x = false;
		if (x = true) {//Isto é a atribuição
			System.out.println("Isto é permitido! Pois é uma atribuição!");
		} else {
			System.out.println("Não!");				
		}
		
		
		int y = 2;
		switch (y) { //Deve haver os parênteses em torno da variável 
		case 1: {
			System.out.println("Opção 1 escolhida!");
			break;
		}
		case 2:{
			System.out.println("Opção 1 não escolhida!");
			System.out.println("Opção 2 escolhida!");
			break;
		}
		case 3:
			System.out.println("Opção 1 não escolhida!");			
			System.out.println("Opção 2 não escolhida!");
			System.out.println("Opção 3 escolhida!");
			break;
		}
	}
}

package br.com.quarkup.others;

public class FlowControl {
	public static void main(String[] args) {
//		if (20 = 5) {
//			System.out.println("Isto n�o compila!");
//		}
		
		boolean x = false;
		if (x = true) {//Isto � a atribui��o
			System.out.println("Isto � permitido! Pois � uma atribui��o!");
		} else {
			System.out.println("N�o!");				
		}
		
		
		int y = 2;
		switch (y) { //Deve haver os par�nteses em torno da vari�vel 
		case 1: {
			System.out.println("Op��o 1 escolhida!");
			break;
		}
		case 2:{
			System.out.println("Op��o 1 n�o escolhida!");
			System.out.println("Op��o 2 escolhida!");
			break;
		}
		case 3:
			System.out.println("Op��o 1 n�o escolhida!");			
			System.out.println("Op��o 2 n�o escolhida!");
			System.out.println("Op��o 3 escolhida!");
			break;
		}
	}
}

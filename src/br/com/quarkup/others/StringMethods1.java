package br.com.quarkup.others;

import java.util.Scanner;

public class StringMethods1 {

	public static void main(String[] args) {
//		String nome = "Fabio Biasi Mello Rubim";
//		System.out.println("Meu nome é: " + nome);
//		System.out.println("O tamanho da String é: " + nome.length());
//		System.out.println(((char) nome.charAt(0))); // Pq não concatena com ((char)nome.charAt(1)) ?

		String s = "Isto é um teste! Nome: Fabio Biasi Mello Rubim";
		try (Scanner ler = new Scanner(System.in)) {
			System.out.println("Digite uma palavra: ");
			s = ler.nextLine();
		}
		int ctmaius = 0, ctminus = 0, ctalfa = 0;
		int ctnum = 0, ctbit = 0, ctespaco = 0;
		int cta = 0, cte = 0, cti = 0, cto = 0, ctu = 0;
		int ctcons = 0;

		int qtdChars = s.length() - 1;

		for (int x = 0; x <= qtdChars; x++) {
			if ((s.charAt(x) >= 'A') && (s.charAt(x) <= 'Z')) {
				ctmaius++;
			}

			if ((s.charAt(x) >= 'a') && (s.charAt(x) <= 'z')) {
				ctminus++;
			}

			if (((s.charAt(x) >= 'A') && (s.charAt(x) <= 'Z')) || 
				((s.charAt(x) >= 'a') && (s.charAt(x) <= 'z'))) {
				ctalfa++;
			}
			
			if ((s.charAt(x) >= '0') && (s.charAt(x) <= '9')) {
				ctnum++;
			}
			
			if ((s.charAt(x) == '0') || (s.charAt(x) == '1')) {
				ctbit++;
			}
			
			if (s.charAt(x) == ' ') {
				ctespaco++;
			}
			
			if ((s.charAt(x) == 'A') || (s.charAt(x) == 'a')) {
				cta++;
			} else if ((s.charAt(x) == 'E') || (s.charAt(x) == 'e')) {
				cte++;
			} else if ((s.charAt(x) == 'I') || (s.charAt(x) == 'i')) {
				cti++;
			} else if ((s.charAt(x) == 'O') || (s.charAt(x) == 'o')) {
				cto++;
			} else if ((s.charAt(x) == 'U') || (s.charAt(x) == 'u')) {
				ctu++;
			}
			
			if (((s.charAt(x) >= 'A') && (s.charAt(x) <= 'Z')) || 
					((s.charAt(x) >= 'a') && (s.charAt(x) <= 'z'))) {
				if ((s.charAt(x) != 'A') && (s.charAt(x) != 'a') &&
				   (s.charAt(x) != 'E') && (s.charAt(x) != 'e') &&
				   (s.charAt(x) != 'I') && (s.charAt(x) != 'i') &&
				   (s.charAt(x) != 'O') && (s.charAt(x) != 'o') &&
				   (s.charAt(x) != 'U') && (s.charAt(x) != 'u')){
					ctcons++;
				}
			}			
		}
		
		System.out.printf("Existem %d caracteres maiúsculos.\n", ctmaius);
		System.out.printf("Existem %d caracteres minúsculos.\n", ctminus);
		System.out.printf("Existem %d caracteres alfanuméricos.\n", ctalfa);
		System.out.printf("Existem %d caracteres numéricos.\n", ctnum);
		System.out.printf("Existem %d caracteres 'bit' .\n", ctbit);
		System.out.printf("Existem %d caracteres <ESPAÇO>.\n", ctespaco);
		System.out.printf("Existem %d vogais A.\n", cta);
		System.out.printf("Existem %d vogais E.\n", cte);
		System.out.printf("Existem %d vogais I.\n", cti);
		System.out.printf("Existem %d vogais O.\n", cto);
		System.out.printf("Existem %d vogais U.\n", ctu);
		System.out.printf("Existem %d consoantes.\n", ctcons);
		
	}
}

package br.com.quarkup.others;

import java.io.IOException;
import java.util.Scanner;

public class AboutString {
	public static void main(String[] args) throws IOException {
		int i;
		//O especificador de formato para caractere (%c)
		//mostra o i-ésimo caractere da tabela ASCII
		System.out.println("Caracteres numéricos: ");
		for ( i = 48; i <= 57;i++ ) {
			System.out.printf("%c ", i);
		}
		
		System.out.printf("\n\n");
		
		System.out.println("Caracteres alfabéticos  maiúsculos: ");
		for (i = 65; i <= 90; i++) {
			System.out.printf("%c ", i);
		}
		
		System.out.printf("\n\n");
		
		System.out.println("Caracteres alfabéticos  minúsculos: ");
		for (i = 97; i <= 122; i++) {
			System.out.printf("%c ", i);
		}
		
		System.out.printf("\n\n");
		
		char c;
		int n;
		// os caracteres são tipos ordinais, portanto, podem
		// ser usados no controle de instruções de repetição
		for (c='0';c<='9'; c++) {
			//converte o caractere numérico no respectivo valor inteiro
			n = c-48;
			System.out.printf("%d X 10 = %d\n", n, (n * 10));
		}
		
		System.out.printf("\n\n");
		
		String nome;
		char sexo;
		Scanner ler = new Scanner(System.in);
		System.out.print("Informe um nome: ");
		nome = ler.nextLine();
		System.out.println("O nome informado é: " + nome);
		
		System.out.println("Informe o sexo (M/F): ");
		sexo = (char) System.in.read();//É adicionado o throws
		
		if ((sexo == 'M') || (sexo == 'm')) {
			System.out.printf("Bem vindo Sr. %s\n ", nome);			
		} else {
			System.out.printf("Bem vinda Sra. %s\n.", nome);
		}
		
		
	}

}

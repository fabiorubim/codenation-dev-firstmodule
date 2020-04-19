package br.com.quarkup.others;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class AboutArrayListClass {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		// Declarando e instanciando um agenda de contatos
		ArrayList<String> agenda = new ArrayList();

		agenda.add("Fabio Biasi Mello Rubim; 15-99142-0289");
		agenda.add("Marina Basso Maia; 15-98818-9889");
		agenda.add(0, "Val�ria; 15-3228-2451");
		agenda.set(1, "Tomaz; 15-92584-5689");

		agenda.forEach((n) -> System.out.println(n));

		agenda.add("Juca Bala;11 1111-1111");
		agenda.add("Marcos Paqueta;22 2222-2222");
		agenda.add("Maria Antonieta;33 3333-3333");
		agenda.add("Ant�nio Conselheiro;44 4444-4444");

		// Percorrendo os contatos da agenda utilizando o �ndice
		System.out.println("Percorrendo o ArrayList usando o �ndice");
		int size = agenda.size() - 1;
		for (int x = 0; x <= size; x++) {
			System.out.printf("Posi��o %d - Dados: %s\n", x, agenda.get(x));
		}

		System.out.println("Informe a posi��o a ser exclu�da: ");
		int i = ler.nextInt();

		// Remove o i-�simo contato da agenda
		try {
			agenda.remove(i);
		} catch (IndexOutOfBoundsException e) {
			System.out.printf("\nErro: posi��o inv�lida (%s)\n", e.getMessage());

		}
		
		System.out.println("Percorrendoo ArrayList (usando o forEach)");
		int idContato = 0;
		for (String contato: agenda) {
			System.out.printf("Posi��o %d - Contato %s\n", idContato, contato);
			idContato++;
		}
		
		System.out.println("Percorrendo o ArrayList (utilizando o iterator)");
		int iter = 0;
		Iterator<String> iterator = agenda.iterator();
		while (iterator.hasNext()) {
			System.out.printf("Posi��o %d - Contato %s\n", iter, iterator.next());
			iter++;
			
		}
		

	}

}

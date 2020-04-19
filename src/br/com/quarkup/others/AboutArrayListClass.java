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
		agenda.add(0, "Valéria; 15-3228-2451");
		agenda.set(1, "Tomaz; 15-92584-5689");

		agenda.forEach((n) -> System.out.println(n));

		agenda.add("Juca Bala;11 1111-1111");
		agenda.add("Marcos Paqueta;22 2222-2222");
		agenda.add("Maria Antonieta;33 3333-3333");
		agenda.add("Antônio Conselheiro;44 4444-4444");

		// Percorrendo os contatos da agenda utilizando o índice
		System.out.println("Percorrendo o ArrayList usando o índice");
		int size = agenda.size() - 1;
		for (int x = 0; x <= size; x++) {
			System.out.printf("Posição %d - Dados: %s\n", x, agenda.get(x));
		}

		System.out.println("Informe a posição a ser excluída: ");
		int i = ler.nextInt();

		// Remove o i-ésimo contato da agenda
		try {
			agenda.remove(i);
		} catch (IndexOutOfBoundsException e) {
			System.out.printf("\nErro: posição inválida (%s)\n", e.getMessage());

		}
		
		System.out.println("Percorrendoo ArrayList (usando o forEach)");
		int idContato = 0;
		for (String contato: agenda) {
			System.out.printf("Posição %d - Contato %s\n", idContato, contato);
			idContato++;
		}
		
		System.out.println("Percorrendo o ArrayList (utilizando o iterator)");
		int iter = 0;
		Iterator<String> iterator = agenda.iterator();
		while (iterator.hasNext()) {
			System.out.printf("Posição %d - Contato %s\n", iter, iterator.next());
			iter++;
			
		}
		

	}

}

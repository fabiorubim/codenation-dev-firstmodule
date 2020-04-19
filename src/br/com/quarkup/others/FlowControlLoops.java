package br.com.quarkup.others;

public class FlowControlLoops {

	public static void main(String[] args) {
		// WhileCommand();
		// doWhileCommand();
		// loopFor();
		// arrayLoop();
		// arrayForEachLoop();
		//arrayForEachEven();
		//loopLabel();
		printfWithSubst();

	}

	public static void WhileCommand() {
		byte x = 10;
		byte y = 1;
		while (x == 10) {
			System.out.println("Entrou no While: " + x);
			y = (byte) (y + (x * x * x * x * x * x * x * x * x));
			System.out.println("Vezes" + y);
			// x++;
		}
	}

	public static void doWhileCommand() {
		int x = 0;
		do {
			System.out.println("O valor é: " + x);
			x++;

		} while (x <= 100);
	}

	public static void loopFor() {

		// A condição pode ser composta
		for (int x = 0; x < 10 | (x % 2) == 0; x++) {
			System.out.println("Loop for: " + x);
		}

	}

	public static void arrayLoop() {
		int[] array = { 1, 2, 3, 4, 5, 6 };
		for (int x = 0; x <= array.length - 1; x++) {
			System.out.println("O número é: " + array[x]);
		}

	}

	public static void arrayForEachLoop() {
		int[] array = { 1, 2, 3, 4, 5, 6 };
		for (int i : array) {
			System.out.println("Each loop: " + i);
			if (i == 2)
				break;
		}

	}

	public static void arrayForEachEven() {
		int[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		for (int x : array) {
			if (x % 2 != 0)
				continue;
			System.out.println("Numero par: " + x);

		}
	}

	public static void loopLabel() {
		primeiroLoop: for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 2; j++) {

				System.out.println("Hello");

				break primeiroLoop;//Indica que o BREAK é do primeiro loop, o que está com label

			}

			System.out.println("CERTIFICACAO");

		}

		System.out.println("Good-Bye");
	}
	
	public static void printfWithSubst() {
		int idade = 33;
		String nome = "Fabio";
		System.out.printf("Meu nome é %s e minha idade é %d", nome, idade);
	}
}

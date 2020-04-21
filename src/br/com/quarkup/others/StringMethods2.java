package br.com.quarkup.others;

public class StringMethods2 {
	public static void main(String[] args) {
		String nome = "Fabio ";
		String sobrenome = "Biasi Mello Rubim";
		String nomeCompleto = nome.concat(sobrenome);
		
		System.out.println("Nome completo: " + nomeCompleto);
		
		boolean contem = nomeCompleto.contains("Fabio"); 
		if (contem) {
			System.out.println("Sim, contém");
		} else {
			System.out.println("Não contém");
		}
		
		String string1 = "Igual", string2 = "Igual", string3 = "IGUAL";
		
		if (string1.equals(string2)) {
			System.out.println("Strings iguais!");
		} else {
			System.out.println("Strings diferentes!");
		}
		
		if (string1.equals(string3)) {
			System.out.println("Strings iguais!");
		} else {
			System.out.println("Strings diferentes!");
		}
		
		if (string1.equalsIgnoreCase(string3)) {
			System.out.println("Strings iguais!");
		} else {
			System.out.println("Strings diferentes!");
		}
		
		System.out.println("Posição da primeira letra 'a': " + nome.indexOf('a'));
		System.out.println("Posição de 'Biasi': " + nomeCompleto.indexOf("Biasi"));
		System.out.println("Posição da última letra 'a': " + nomeCompleto.lastIndexOf('a'));
		System.out.println("Posição da última ocorrência de 'Biasi': " + nomeCompleto.lastIndexOf("Biasi"));
		System.out.println("Quantidade de caracteres: " + nomeCompleto.length());
		System.out.println("Tudo em maiúscula: " + nomeCompleto.toUpperCase());
		System.out.println("Tudo em minísculo: " + nomeCompleto.toLowerCase());
		String espacosInicioFim = "       Aqui tem espaços           ";
		System.out.println("Remove os espaços em 'branco' no íncio e fim da cadeia de caracteres: " + espacosInicioFim.trim());
		System.out.println("Troca de caracteres: " + nomeCompleto.replace('a', 'x'));
		System.out.println("Retorna uma 'substring' de uma string a partir de 'beginIndex' até 'endIndex':" + 
				nomeCompleto.substring(6, 11));
		int idade = 33;
		String s1 = String.valueOf(idade);
		System.out.println("ValueOf: "+ s1 + 10);
		
		boolean boleano = true;
		String s2 = String.valueOf(boleano);
		System.out.println("ValueOf boolean: " + s2);
		
		
		
		
		
		
		
		
		
	}

}

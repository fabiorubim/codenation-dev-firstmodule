package br.com.quarkup.others;

public class StringMethods2 {
	public static void main(String[] args) {
		String nome = "Fabio ";
		String sobrenome = "Biasi Mello Rubim";
		String nomeCompleto = nome.concat(sobrenome);
		
		System.out.println("Nome completo: " + nomeCompleto);
		
		boolean contem = nomeCompleto.contains("Fabio"); 
		if (contem) {
			System.out.println("Sim, cont�m");
		} else {
			System.out.println("N�o cont�m");
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
		
		System.out.println("Posi��o da primeira letra 'a': " + nome.indexOf('a'));
		System.out.println("Posi��o de 'Biasi': " + nomeCompleto.indexOf("Biasi"));
		System.out.println("Posi��o da �ltima letra 'a': " + nomeCompleto.lastIndexOf('a'));
		System.out.println("Posi��o da �ltima ocorr�ncia de 'Biasi': " + nomeCompleto.lastIndexOf("Biasi"));
		System.out.println("Quantidade de caracteres: " + nomeCompleto.length());
		System.out.println("Tudo em mai�scula: " + nomeCompleto.toUpperCase());
		System.out.println("Tudo em min�sculo: " + nomeCompleto.toLowerCase());
		String espacosInicioFim = "       Aqui tem espa�os           ";
		System.out.println("Remove os espa�os em 'branco' no �ncio e fim da cadeia de caracteres: " + espacosInicioFim.trim());
		System.out.println("Troca de caracteres: " + nomeCompleto.replace('a', 'x'));
		System.out.println("Retorna uma 'substring' de uma string a partir de 'beginIndex' at� 'endIndex':" + 
				nomeCompleto.substring(6, 11));
		int idade = 33;
		String s1 = String.valueOf(idade);
		System.out.println("ValueOf: "+ s1 + 10);
		
		boolean boleano = true;
		String s2 = String.valueOf(boleano);
		System.out.println("ValueOf boolean: " + s2);
		
		
		
		
		
		
		
		
		
	}

}

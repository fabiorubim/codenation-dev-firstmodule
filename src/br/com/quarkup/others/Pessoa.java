package br.com.quarkup.others;

public class Pessoa {
	public String nome;
	protected int idade;
	String endereco;
	
	public String Nome() {
		return nome; //No Java, ao utilizar o return, o m�todo termina sua execu��o imediatamente.
	}
	
	public int Idade() {
		return idade;
	}
	
	public int $getCalculaIdade() {
		return 0;
	}
	
	public String _getEndereco() {
		return "";
	}
	
	public static void MetodoEstatico() {
		System.out.println("Isto � um m�todo est�tico!");
	}
	
	
	public static int soma(int x, int y) {
		return x+y;
	}
	
	

}

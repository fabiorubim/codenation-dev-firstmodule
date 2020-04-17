package br.com.quarkup.others;

public class Pessoa {
	public String nome;
	protected int idade;
	String endereco;
	
	public String Nome() {
		return nome; //No Java, ao utilizar o return, o método termina sua execução imediatamente.
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
		System.out.println("Isto é um método estático!");
	}
	
	
	public static int soma(int x, int y) {
		return x+y;
	}
	
	

}

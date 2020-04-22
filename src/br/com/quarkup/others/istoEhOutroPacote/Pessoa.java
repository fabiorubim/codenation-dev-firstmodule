package br.com.quarkup.others.istoEhOutroPacote;

public class Pessoa {
	private String nome;
	private String sobreNome;
	private int idade;
	
	//Toda classe possui um construtor padr�o quando n�o declarado.
	//Para declarar um construtor explicitamente, utilize o nome da classe e uma lista de par�metros, 
	//como feito abaixo.	
	public Pessoa(String nome, String sobreNome, int idade) {
		this.nome = nome;
		this.sobreNome = sobreNome;
		this.idade = idade;
	}
	
	private String getNomeCompleto() {
		return this.nome + " " + this.sobreNome;
	}
	
	public void exibirDados() {
		System.out.println("Nome: " + this.nome + "\nSobrenome: " + this.sobreNome + "\nIdade: " + this.idade);
		System.out.println("Nome completo: " + getNomeCompleto());
	}
}

package br.com.quarkup.others;

public class PassagemPorReferencia {
	
	public void concatMensagem(StringBuffer mensagem) {
		mensagem.append("Est� mensagem foi acrescentada ao objeto StringBuffer!");
		
	}
	
	public static void main(String[] args) {
		StringBuffer texto = new StringBuffer("Texto inicial!");
		System.out.println("O valor de texto �: " + texto);
		
		PassagemPorReferencia p = new PassagemPorReferencia();
		p.concatMensagem(texto);
		System.out.println("O valor de texto �: " + texto);
		
	}

}

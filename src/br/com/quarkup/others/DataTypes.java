package br.com.quarkup.others;

import java.math.BigDecimal;

public class DataTypes {
	private int idade;//quando � uma propriedade, "vari�vel de inst�ncia", ela � inicializada, no m�todo n�o.
	private String strinDaInstancia;//valor null
	private boolean boolDaInstancia;//valor false
	 public static void main(String[] args) {
		 //Primitive types
	        System.out.println("Tipos de dados em Java: \n" +
	                "\nMenor Byte: " + Byte.MIN_VALUE +
	                "\nMaior Byte: " + Byte.MAX_VALUE +
	                "\nMenor Short Int: " + Short.MIN_VALUE +
	                "\nMaior Short Int: " + Short.MAX_VALUE +
	                "\nMenor Int: " + Integer.MIN_VALUE +
	                "\nMaior Int: " + Integer.MAX_VALUE +
	                "\nMenor Long: " + Long.MIN_VALUE +
	                "\nMaior Long:" + Long.MAX_VALUE +
	                "\nMenor Float: " + Float.MIN_VALUE +
	                "\nMaior Float: " + Float.MAX_VALUE +
	                "\nMenor Double: " + Double.MIN_VALUE +
	                "\nMaior Double: " + Double.MAX_VALUE);	    
	        BigDecimal bigdecimal = new BigDecimal("14.664444444644646464646516854108529638527418529638524185296");
	        System.out.println("BigDecimal: " + bigdecimal);
	        
          byte tipoByte = 127;
		  short tipoShort = 32767;
		  char tipoChar = 'C';
		  float tipoFloat = 2.6f;
		  double tipoDouble = 3.59;
		  int tipoInt = 2147483647;
		  long tipoLong = 9223372036854775807L;
		  boolean tipoBooleano = true;
		  System.out.println("Valor do tipoByte = " + tipoByte);
		  System.out.println("Valor do tipoShort = " + tipoShort);
		  System.out.println("Valor do tipoChar = " + tipoChar); 
		  System.out.println("Valor do tipoFloat = " + tipoFloat);
		  System.out.println("Valor do tipoDouble = " + tipoDouble);
		  System.out.println("Valor do tipoInt = " + tipoInt);
		  System.out.println("Valor do tipoLong = " + tipoLong);
		  System.out.println("Valor do tipoBooleano = " + tipoBooleano);
		  
		  int idade = 0;
		  System.out.println("Vari�vel local(dentro do m�todo) PRECISA ser inicializada. Seu valor �: " + idade);
		  
		  //Reference types
		  DataTypes dataType = new DataTypes();
		  dataType.imprimeOla();
	 
	    }
	 public void imprimeOla() {
		  System.out.println("Ol�!");
		  System.out.println("Idade: " + idade);
		  System.out.println("String da inst�ncia: " + strinDaInstancia);
		  System.out.println("Valor da vari�vel boolean da inst�ncia: " + boolDaInstancia);		  
	  }

}

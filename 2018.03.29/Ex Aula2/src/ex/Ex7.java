package ex;

public class Ex7 {
// Exerc�cio 7: Escreva um programa que exiba todos os n�meros de 1 a 100 e a cada n�mero que for m�ltiplo de 10, exiba a mensagem �M�LTIPLO DE 10�. 
  
	public static void main(String[] args) {
		
		for(int n = 0; n < 100; n++) {
			if(n%10 == 0) {
				System.out.println(n + " - MULTIPLO DE 10");
			} else {
				System.out.println(n);
			}
		}
	}
}
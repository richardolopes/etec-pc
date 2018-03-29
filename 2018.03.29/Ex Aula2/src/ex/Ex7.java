package ex;

public class Ex7 {
// Exercício 7: Escreva um programa que exiba todos os números de 1 a 100 e a cada número que for múltiplo de 10, exiba a mensagem “MÚLTIPLO DE 10”. 
  
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
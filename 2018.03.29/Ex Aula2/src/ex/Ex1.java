package ex;

public class Ex1 {
// Exerc�cio 1: Escreva um programa que exiba na tela em ordem crescente, apenas os n�meros pares existentes de 11 a 250.
	
	public static void main(String[] args) {
 
		
		for(int num = 11; num < 251; num++) {
			if(num % 2 == 0) {
				System.out.println(num);
			}
		}
	}
}
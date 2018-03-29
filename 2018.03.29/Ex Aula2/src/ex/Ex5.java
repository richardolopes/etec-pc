package ex;

import java.util.Scanner;

public class Ex5 {
// Exercício 5: Escreva um programa que leia 15 números inteiros e exiba na tela ao final, o maior número que foi digitado pelo usuário. 

	private static Scanner entrada;
	public static void main(String[] args) {
		
		entrada = new Scanner(System.in);
		
		int[] num = new int[15];
		int maior = 0;
		
		for(int contador = 0; contador < num.length; contador++) {
			System.out.print(contador + 1 + "º NUMERO: ");
			num[contador] = entrada.nextInt();
			
			if(num[contador] > maior) {
				maior = num[contador];
			}
		}
		
		System.out.println("MAIOR NUMERO DIGITADO: " + maior);
		
	}
}
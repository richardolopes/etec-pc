package ex;

import java.util.Scanner;

public class Ex4 {
// Exerc�cio 4: Escreva um programa que exiba na tela a quantidade de n�meros �mpares existentes entre dois n�meros que o usu�rio digitar (testar inclusive os n�meros digitados).
	
	private static Scanner entrada;
	public static void main(String[] args) {
		entrada = new Scanner(System.in);
		
		float num1;
		float num2;
		float aux;
		int contagem = 0;
		
		System.out.println("DIGITE UM NUMERO: ");
		num1 = entrada.nextFloat();
		
		System.out.println("DIGITE OUTRO NUMERO: ");
		num2 = entrada.nextFloat();
		
		
		if(num1 < num2) {
			aux  = num2;
			num2 = num1;
			num1 =  aux;
		}
		
		for(float contador = num1; num1 >= num2; contador++) {
			if(num1 % 2 == 1 || num1 % 2 == -1) {
        		contagem++;
        	}
        		num1--;
		}
		
		System.out.println(contagem);
	}
}
package ex;

import java.util.Scanner;

public class Ex3 {
	/* Exercício 3: Escreva um programa que exiba na tela a tabuada de um número que deverá ser informado pelo usuário (deverá ser usada qualquer estrutura de repetição). Exemplo: Digite um número: 4 
	4 x 0 = 0 
	4 x 1 = 4 
	4 x 2 = 8 
	4 x 3 = 12 
	4 x 4 = 16 
	4 x 5 = 20 
	4 x 6 = 24 
	4 x 7 = 28 
	4 x 8 = 32 
	4 x 9 = 36 
	4 x 10 = 40 
*/
	
	private static Scanner entrada;
	public static void main(String[] args) {
		entrada = new Scanner(System.in);
		
		float num1;
		float resultado;
		
		System.out.println("DIGITE UM NUMERO: ");
		num1 = entrada.nextFloat();
		    
		for(int num2 = 0; num2 < 11; num2++) {
			resultado = num1 * num2;
			System.out.println(resultado);
		}
	}
}
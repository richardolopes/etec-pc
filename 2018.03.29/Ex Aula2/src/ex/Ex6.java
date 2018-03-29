package ex;

import java.util.Scanner;

public class Ex6 {
// Exercício 6: Escreva um programa que calcule e exiba a média de 10 notas digitadas pelo usuário. Considerar notas válidas, somente valores entre 0 (zero) e 10 (dez). Se o usuário digitar algum valor inválido, deverá ser exibida uma mensagem informando o ocorrido.
	
	private static Scanner entrada;
	public static void main(String[] args) {
		entrada = new Scanner(System.in);
		
		float[] notas = new float[10];
		float media = 0;
		
		for(int contador = 0; contador < notas.length; contador++) {
			System.out.println(contador+1 + "ª NOTA:");
			notas[contador] = entrada.nextFloat();
			
			while(notas[contador] < 0 || notas[contador] > 10) {
				System.out.println("NUMERO INVALIDO.\nPOR FAVOR DIGITE APENAS NOTAS DE 0 A 10: ");
				notas[contador] = entrada.nextFloat();
			} 
			media = media + notas[contador];
		}
		media = media/10;
		System.out.print(media);
	}
}
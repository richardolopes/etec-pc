package ex;

import java.util.Scanner;

public class Ex9 {
// Exerc�cio 9: Escreva um programa que leia v�rios n�meros inteiros e ao final informe quantos n�meros pares, quantos n�meros �mpares, quantos n�meros positivos e quantos n�meros negativos foram digitados pelo usu�rio. O programa s� deve parar de rodar quando o usu�rio responder "S" na seguinte pergunta, "Deseja encerrar o programa?".
	
	private static Scanner entrada;
	public static void main(String[] args) {
		entrada = new Scanner(System.in);
		
		char r ;
		int n = 0;
		int contPar = 0;
		int contImp = 0;
		int contPos = 0;
		int contNeg = 0;
		
		do {
			System.out.println("DIGITE UM NUMERO: ");
			n = entrada.nextInt();
	
			if(n%2 == 0) {
				contPar ++;
			} else {
				contImp ++;
			}
			
			if(n>0) {
				contPos ++;
			} else {
				contNeg ++;
			}
			
			System.out.println("Deseja encerrar o programa?");
			r = entrada.next().charAt(0);
			
			
		} while(r != 'S');
		
		System.out.println("    Pares: " + contPar + "\n  Impares: " + contImp + "\nPositivos: " + contPos + "\nNegativos: " + contNeg);
	}
}
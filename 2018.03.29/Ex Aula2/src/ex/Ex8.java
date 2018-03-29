package ex;

import java.util.Scanner;

public class Ex8 {
// Exercício 8: Escreva um programa que calcule o fatorial de um número informado pelo usuário. 
//	Dica: O fatorial de um número N é dado pela fórmula: N! = 1 * 2 * 3 * 4 * 5 * ... * N 

	private static Scanner entrada;
	public static void main(String[] args) {
		entrada = new Scanner(System.in);
		
		int resultado = 1;
		int n = 0;
		
		System.out.println("DIGITE UM VALOR: ");
		n = entrada.nextInt();
		
		for(int cont = 1; cont <= n; cont++) {
			resultado = resultado * cont;
		}
		
		System.out.println(resultado);
	}
}
package exercicios;

import java.util.Scanner;
import java.util.*;

public class Slide38 {
	private static Scanner entrada;

	public static void main(String[] args) {
/*			15) Crie um programa que receba dois argumentos (nomes) e os exiba na ordem alfab�tica correta. */
		String ex15;
		String ex15_2;
		
		entrada = new Scanner(System.in); 
		
		System.out.println("Digite alguma coisa: ");
		ex15 = entrada.toString();
		
		System.out.println("Digite alguma coisa de novo: ");
		ex15_2 = entrada.toString();
		
		SortedSet<String> nomes =  new TreeSet<String>();
		nomes.add(ex15);
		nomes.add(ex15_2);

		System.out.println(nomes);
		
		
/* 			16) Crie um programa que receba dois argumentos e calcule a �rea de um quadril�tero e exiba na tela com a seguinte mensagem:
 * 					"Lado a = <a>"
 * 					"Lado b = <b>"
 * 					"A �rea � = <valor>". */		
		
		/*	
		System.out.println("Digite um valor: ");
		float a = entrada.nextFloat();
		
		System.out.println("Digite um outro valor: ");
		float b = entrada.nextFloat();
		// ?????????????????????????????????????????
		*/	
/* 			17) Incremente o programa de c�lculo de �rea (16) para exibir ao final a mensagem: 
 * 					"A figura � um quadrado, caso seja um quadrado,
 * 					ou, "A figura � um ret�ngulo", caso seja um ret�ngulo. */
		
		// ?????????????????????????????????????????
		
	}
}
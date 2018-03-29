package ex;

import java.util.Scanner;

public class Ex10 {
// Exerc�cio 10: Fa�a um programa que leia as vari�veis C e N, respectivamente c�digo e n�mero de horas trabalhadas de um oper�rio. Calcule o sal�rio sabendo-se que ele ganha R$ 10,00 por hora. Quando o n�mero de horas exceder a 50, calcule o excesso de pagamento armazenando-o na vari�vel E, caso contr�rio zerar tal vari�vel. A hora excedente de trabalho vale R$ 20,00. No final do processamento imprimir o sal�rio total e o sal�rio excedente. O programa s� deve parar de rodar quando o usu�rio responder "S" na seguinte pergunta, "Deseja encerrar o programa?".
	
	private static Scanner entrada;
	public static void main(String[] args) {
		entrada = new Scanner(System.in);
		
		 char r ;
		 
		do {
			float n = 0;
			float e = 0;
			float salario = 0;
			float aux = 0;
			int c = 0;
			
			System.out.println("DIGITE O CODIGO DO FUNCIONARIO: ");
			c = entrada.nextInt();
			
			System.out.println("HORAS TRABALHADAS: ");
			n = entrada.nextFloat();
			
			salario = n * 10;
			
			if(salario > 50) {
				salario = 50;
				
				aux = (n - 5);
				e = aux * 20;
			} else {e = 0;}
			
			System.out.println("Funcionario " + c );
			System.out.println("Salario: " + salario + "\nSalario excedente: " + (Math.round(e)));
			
			System.out.println("\n\nDeseja encerrar o programa?");
			r = entrada.next().charAt(0);
			
		} while(r != 'S') ;

	}
}
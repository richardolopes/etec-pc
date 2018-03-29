package ex;

import java.util.Scanner;

public class Ex10 {
// Exercício 10: Faça um programa que leia as variáveis C e N, respectivamente código e número de horas trabalhadas de um operário. Calcule o salário sabendo-se que ele ganha R$ 10,00 por hora. Quando o número de horas exceder a 50, calcule o excesso de pagamento armazenando-o na variável E, caso contrário zerar tal variável. A hora excedente de trabalho vale R$ 20,00. No final do processamento imprimir o salário total e o salário excedente. O programa só deve parar de rodar quando o usuário responder "S" na seguinte pergunta, "Deseja encerrar o programa?".
	
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
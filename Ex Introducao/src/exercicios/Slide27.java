package exercicios;

public class Slide27 {
	public static void main(String[]args) {
/*			7) Calcule a �rea de uma circunfer�ncia com raio 12, onde PI = 3.1415 e �rea = PI * r�. */
		double PI = 3.1415;
		double raio = 12;
		double area = 0;
		
		area = (PI * Math.pow(raio, 2));
		
/* 			8) Calcule o resto da divis�o de 99 por 4. */
		double ex8;
		
		ex8 = 99 % 4;
		
/* 			9) Divida um n�mero por 2 sem utilizar o operador /. */
		double ex9;
		
		ex9 = 10 * 0.5;
		
/* 			10) Multiplique um n�mero por 8, sem utilizar o operador *. */
		int ex10 = 5;
		for(int multi = 0; multi < 7; multi++){
			ex10 = ex10 + 5;
		}
	}
}
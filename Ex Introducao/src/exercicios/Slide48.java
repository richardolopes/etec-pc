package exercicios;

public class Slide48 {
	public static void main(String[] args) {
/* 			18) Fa�a o c�lculo do valor da vari�vel x mais y, inteiros, sem utilizar o operador +. */
		int x = 10;
		int y = -5;
		int resultado = 0 ;
		
		resultado = x-y;
		
/* 			19) Verifique o valor de X, imprimindo uma mensagem correspondendo quando for maior, menor ou igual a 10, sem usar a cl�usula if(). */
		
		System.out.println(x == 10 ? "X � igual a 10. " : x > 10 ? "X � maior que 10. " : "X menor que 10. ");

/* 			20) Fa�a a soma de todos os valores (inteiros) entrados como argumento do programa e exiba na tela a mensagem: "A soma dos valores � = <valor>. */
		System.out.println("A soma dos valores � = " + (resultado + x - y));
		
	}
}
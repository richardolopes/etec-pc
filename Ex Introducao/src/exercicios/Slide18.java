package exercicios;

public class Slide18 {
	public static void main(String[] args) {
/* 			3) Declare uma vari�vel do tipo String com a frase "Curso de Java". */
		String ex3;
		
		ex3 = "Curso de Java ";

/* 			4) Concatene na vari�vel criada acima a frase "- Exemplo String". */
		String ex4;
		
		ex4 = "- Exemplo String";
		ex4 = ex3 + ex4;
		
/* 			5) Imprima na tela (console) o n�mero de caracteres da String. */
		System.out.println("N�mero de caracteres da String ex4: " + ex4.length());
		
/*			6) Crie uma nova String, pegando o peda�o da primeira String que compreenda a frase "Exemplo String". */
		String ex6 = ex4.substring(16, 30);
	}
}
package exercicios;

public class Slide37 {
	public static void main(String[] args) {
/* 			11) Crie uma vari�vel inteira com um valor qualquer e verifique se  o valor desta vari�vel � menor que 15 ou maior que 100. */
		int ex11 = 101;
		
		if(ex11 < 15) {
			System.out.println("A vari�vel � menor que 15. ");
		}
		if(ex11 > 100) {
			System.out.println("A vari�vel � maior que 100. ");
		}
		if(ex11 == 15 || ex11 == 100) {
			System.out.println("A vari�vel � igual a " + ex11);
		}
	}
}
package atributos_estaticos;

public class Ex_contador {
	public static void main(String [] args){
		Contador c = new Contador();
		c.incrementar();
		System.out.println(Contador.count);
		Contador.count++;
		System.out.println(c.count);
	}
}
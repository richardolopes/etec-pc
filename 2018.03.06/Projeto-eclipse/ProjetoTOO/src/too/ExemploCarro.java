package too;

public class ExemploCarro {
	public static void main(String[] args) {
		
		Carro umCarro = new Carro();
		
		umCarro.modelo = "Gol";
		umCarro.cor = "preto";
		umCarro.motor = "1.0";
		
		umCarro.ligar();
		umCarro.mudarMarcha();
		umCarro.acelerar();
		umCarro.brecar();
		umCarro.desligar();
		
		umCarro = null;
	}
}
package Construcao;

public class ObjetoCarro {

	public static void main(String[] args) {
		Carro carro1 = new Carro("Amongus12345");
		Carro carro2 = new Carro(69);
		Carro carro3 = new Carro("Amongus", 12345);
		
		System.out.println(carro1.getPlaca());
		System.out.println(carro2.getNumChassi());
		System.out.println(carro3.getPlaca());
		System.out.println(carro3.getNumChassi());
	}
}

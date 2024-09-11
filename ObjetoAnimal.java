package Construcao;

public class ObjetoAnimal {

	public static void main(String[] args) {
		Animal animal1 = new Animal("vermelho");
		Animal animal2 = new Animal(69);
		Animal animal3 = new Animal("escarlate", 54);
		System.out.println(animal1.getCor());
		System.out.println(animal2.getTamanho());
		System.out.println(animal3.getCor());
		System.out.println(animal3.getTamanho());
		}
	}



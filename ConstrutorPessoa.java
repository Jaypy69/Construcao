package Construcao;

public class ConstrutorPessoa {

	public static void main(String[] args) {
		Pessoa jogador1 = new Pessoa("Leôncio",70);
		
		System.out.println(jogador1.getNome());
		System.out.println(jogador1.getIdade());
		
		Pessoa jogador2 = new Pessoa("JP");
		System.out.println(jogador2.getNome());
		
		Pessoa jogador3 = new Pessoa(17);
		System.out.println(jogador3.getIdade());
	}
}

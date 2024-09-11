package Construcao;

public class Carro {
	private String Placa;
	private int NumChassi;
	
	public Carro(String Placa) {
	this.Placa = Placa;
	}
	public Carro(int NumChassi) {
	this.NumChassi = NumChassi;
    }
    public Carro(String Placa, int NumChassi) {
	this.Placa = Placa;
	this.NumChassi = NumChassi;
	}
	public String getPlaca() {
	return Placa;
	}
	public void setNome(String Placa) {
	this.Placa = Placa;
	}
	public int getNumChassi() {
	return NumChassi;
	}
	public void NumChassi(int NumChassi) {
	this.NumChassi = NumChassi;
	}
	}
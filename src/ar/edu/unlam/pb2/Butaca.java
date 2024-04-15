package ar.edu.unlam.pb2;

public class Butaca {

	private Boolean ocupada;

	public Butaca() {
		this.ocupada = false;
	}

	public Boolean isOcupada() {
		return ocupada;
	}

	public void ocupar() {
		this.ocupada = true;
	}

	public void desocupar() {
		this.ocupada = false;
	}

}

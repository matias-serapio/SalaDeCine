package ar.edu.unlam.pb2;

public class Butaca {

	private boolean ocupada;

	public Butaca() {
		this.ocupada = false;
	}

	public boolean isOcupada() {
		return ocupada;
	}

	public void ocupar() {
		this.ocupada = true;
	}

	public void desocupar() {
		this.ocupada = false;
	}

	@Override
	public String toString() {
		return Boolean.toString(ocupada); // Devuelve "true" o "false" en lugar de la representación del objeto
	}
}

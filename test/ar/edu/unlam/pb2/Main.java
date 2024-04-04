package ar.edu.unlam.pb2;

public class Main {

	public static void main(String[] args) {

		Integer cantidadFilas = 5;
		Integer cantidadColumnas = 5;

		SalaDeCine sala = new SalaDeCine(cantidadFilas, cantidadColumnas);

		sala.mostrarButacas();
		sala.esVacia();

		Integer fila = 1;
		Integer asiento = 2;

		sala.consultarButaca(fila, asiento);
		sala.ocuparButaca(fila, asiento);
		sala.mostrarButacas();
		sala.ocuparButaca(fila, asiento);
		sala.contarButacasOcupadas();

		fila = 2;
		asiento = 3;

		sala.consultarButaca(fila, asiento);
		sala.ocuparButaca(fila, asiento);
		sala.mostrarButacas();
		sala.ocuparButaca(fila, asiento);
		sala.contarButacasOcupadas();
		sala.desocuparButaca(fila, asiento);
		sala.mostrarButacas();
		sala.contarButacasOcupadas();
	}
}

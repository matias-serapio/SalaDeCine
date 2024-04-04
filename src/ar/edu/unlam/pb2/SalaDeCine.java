package ar.edu.unlam.pb2;

public class SalaDeCine {

	private Integer butacasTotales = 0;
	private Integer cantidadColumnas = 0;
	private Integer cantidadFilas = 0;
	private Butaca[][] butacas;

	public SalaDeCine(Integer cantidadFilas, Integer cantidadColumnas) {
		this.cantidadColumnas = cantidadColumnas;
		this.cantidadFilas = cantidadFilas;
		this.butacasTotales = this.cantidadColumnas * this.cantidadFilas;
		this.butacas = new Butaca[cantidadFilas][cantidadColumnas];

		// Inicializar todas las butacas como no ocupadas
		for (int i = 0; i < cantidadFilas; i++) {
			for (int j = 0; j < cantidadColumnas; j++) {
				this.butacas[i][j] = new Butaca();
			}
		}
	}

	public void mostrarButacas() {
		for (int i = 0; i < butacas.length; i++) {
			for (int j = 0; j < butacas[i].length; j++) {
				System.out.print(butacas[i][j].isOcupada() + " ");
			}
			System.out.println();
		}
	}

	public void esVacia() {
		boolean vacia = true;
		for (int i = 0; i < cantidadFilas; i++) {
			for (int j = 0; j < cantidadColumnas; j++) {
				if (butacas[i][j].isOcupada()) {
					vacia = false;
					break;
				}
			}
			if (!vacia) {
				break;
			}
		}
		System.out.println("¿La sala está vacía? " + vacia);
	}

	public void consultarButaca(Integer fila, Integer asiento) {
		if (butacas[fila][asiento].isOcupada() == false)
			System.out.println("Butaca disponible");
		else
			System.out.println("Butaca ocupada");
	}

	public void ocuparButaca(Integer fila, Integer asiento) {
		if (!butacas[fila][asiento].isOcupada()) {
			butacas[fila][asiento].ocupar();
			System.out.println("La Butaca ingresada ha sido ocupada con éxito");
		} else {
			System.out.println("No se puede ocupar. La Butaca ingresada ya estaba ocupada");
		}
	}

	public void desocuparButaca(Integer fila, Integer asiento) {
		if (butacas[fila][asiento].isOcupada()) {
			butacas[fila][asiento].desocupar();
			System.out.println("La Butaca ha sido desocupada con éxito");
		} else {
			System.out.println("No se puede desocupar porque ya estaba desocupada");
		}
	}

	public void contarButacasOcupadas() {
		int contador = 0;
		for (int i = 0; i < cantidadFilas; i++) {
			for (int j = 0; j < cantidadColumnas; j++) {
				if (butacas[i][j].isOcupada()) {
					contador++;
				}
			}
		}
		System.out.println("Cantidad de butacas totales: " + butacasTotales);
		System.out.println("Cantidad de butacas ocupadas: " + contador);
	}

	public Integer getCantidadColumnas() {
		return cantidadColumnas;
	}

	public void setCantidadColumnas(Integer cantidadColumnas) {
		this.cantidadColumnas = cantidadColumnas;
	}

	public Integer getCantidadFilas() {
		return cantidadFilas;
	}

	public void setCantidadFilas(Integer cantidadFilas) {
		this.cantidadFilas = cantidadFilas;
	}

	public Integer getButacasTotales() {
		return butacasTotales;
	}

	public void setButacasTotales(Integer butacasTotales) {
		this.butacasTotales = butacasTotales;
	}

	// Sala de Cine Implementar la clase SalaDeCine, tal que tenga operaciones para:
	// 1. Crearla con la cantidad de butacas totales y cantidad de filas.

	// 2. Consultar si la sala está vacía
	// 3. Consultar si una butaca está ocupada (referida por fila y asiento).
	// 4. Ocupar una butaca determinada, siempre que ésta no esté previamente
	// ocupada.
	// 5. Consultar la cantidad total de butacas ocupadas.
	// 6. Consultar si es posible acomodar a un grupo de X personas, en forma
	// contigua, en la misma fila: Boolean hayEspacioPara(Integer
	// cantidadDePersonas)

}

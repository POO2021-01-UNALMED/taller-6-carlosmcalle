package vehiculos;

public class Automovil extends Vehiculo{
	int puestos;

	public int getPuestos() {
		return puestos;
	}

	public void setPuestos(int puestos) {
		this.puestos = puestos;
	}

	public Automovil(String placa, int puertas, int velocidadMaxima, String nombre, double precio, double peso,
			String traccion, Fabricante fabricante, int puestos) {
		super(placa, 4, 100, nombre, precio, peso, "FWD", fabricante);
		this.puestos = puestos;
	}

	

	
	
}
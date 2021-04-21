package vehiculos;

public class Camioneta extends Vehiculo{
	boolean volco;

	public boolean isVolco() {
		return volco;
	}

	public void setVolco(boolean volco) {
		this.volco = volco;
	}

	public Camioneta(String placa, int puertas, int velocidadMaxima, String nombre, double precio, double peso,
			String traccion, Fabricante fabricante, boolean volco) {
		super(placa, puertas, 90, nombre, precio, peso, "4X4", fabricante);
		this.volco = volco;
	}
	
	
}

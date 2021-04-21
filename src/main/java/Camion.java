package vehiculos;

public class Camion extends Vehiculo{
	int ejes;

	public int getEjes() {
		return ejes;
	}

	public void setEjes(int ejes) {
		this.ejes = ejes;
	}

	public Camion(String placa, int puertas, int velocidadMaxima, String nombre, double precio, double peso,
			String traccion, Fabricante fabricante, int ejes) {
		super(placa, 2, 80, nombre, precio, peso, "4X2", fabricante);
		this.ejes = ejes;
	}
	
	
}
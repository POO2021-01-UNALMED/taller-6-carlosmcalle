package vehiculos;

public class Camioneta extends Vehiculo{
	boolean volco;
	static int cantidadCamionetas = 0;
	public boolean isVolco() {
		return volco;
	}

	public void setVolco(boolean volco) {
		this.volco = volco;
	}

	
	
    public static int getCantidadCamionetas() {
		return cantidadCamionetas;
	}

	public Camioneta(String placa, int puertas, String nombre, int precio, int peso, Fabricante fabricante, boolean volco) {
        super(placa, puertas, 90, nombre, peso, precio, "4X4", fabricante);
        this.volco = volco;
        cantidadCamionetas++;
    }
	
	
}

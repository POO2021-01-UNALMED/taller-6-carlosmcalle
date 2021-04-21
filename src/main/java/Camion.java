package vehiculos;

public class Camion extends Vehiculo{
	int ejes;
	static int cantidadCamiones = 0;
	
	public int getEjes() {
		return ejes;
	}

	public void setEjes(int ejes) {
		this.ejes = ejes;
	}

	
    public static int getCantidadCamiones() {
		return cantidadCamiones;
	}

	

	public Camion(String placa, String nombre, int precio, int peso, Fabricante fabricante, int ejes) {
        super(placa, 2, 80, nombre, peso, precio, "4X2", fabricante);
        this.ejes = ejes;
        cantidadCamiones++;
    }
	
	
}

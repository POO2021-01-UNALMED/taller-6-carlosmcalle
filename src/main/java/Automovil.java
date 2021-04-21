package vehiculos;

public class Automovil extends Vehiculo{
	int puestos;

	public int getPuestos() {
		return puestos;
	}

	public void setPuestos(int puestos) {
		this.puestos = puestos;
	}


    public Automovil(String placa, String nombre, int precio, int peso, Fabricante fabricante, int puestos) {
        super(placa, 4, 100, nombre, peso, precio, "FWD", fabricante);
        this.puestos = puestos;
        }

	

	
	
}

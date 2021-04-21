package vehiculos;

public class Vehiculo {
	protected String placa;
	protected int puertas;
	protected int velocidadMaxima;
	protected String nombre;
	protected int peso;
	protected int precio;
	protected String traccion;
	protected Fabricante fabricante;
	protected int cantidadVehiculos = Automovil.getCantidadAutomoviles()+ Camion.getCantidadCamiones()+Camioneta.getCantidadCamionetas();
	
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public int getPuertas() {
		return puertas;
	}
	public void setPuertas(int puertas) {
		this.puertas = puertas;
	}
	public int getVelocidadMaxima() {
		return velocidadMaxima;
	}
	public void setVelocidadMaxima(int velocidadMaxima) {
		this.velocidadMaxima = velocidadMaxima;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(int precio) {
		this.precio = precio;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(int peso) {
		this.peso = peso;
	}
	public String getTraccion() {
		return traccion;
	}
	public void setTraccion(String traccion) {
		this.traccion = traccion;
	}
	public Fabricante getFabricante() {
		return fabricante;
	}
	public void setFabricante(Fabricante fabricante) {
		this.fabricante = fabricante;
	}

	
	
	public Vehiculo(String placa, int puertas, int velocidadMaxima, String nombre, int peso, int precio,
			String traccion, Fabricante fabricante) {
		this.placa = placa;
		this.puertas = puertas;
		this.velocidadMaxima = velocidadMaxima;
		this.nombre = nombre;
		this.peso = peso;
		this.precio = precio;
		this.traccion = traccion;
		this.fabricante = fabricante;
	}
	public int getCantidadVehiculos() {
		return cantidadVehiculos;
	}
	
	public void setCantidadVehiculos(int cantidadVehiclos) {
		this.cantidadVehiculos = cantidadVehiculos;
	}
	
	public String vehiculosPorTipo() {
	return "Automoviles: " + Automovil.getCantidadAutomoviles() + "\n" + "Camionetas: " +
	Camioneta.getCantidadCamionetas() + "\n" + "Camiones: " + Camion.getCantidadCamiones();
				}
	
}

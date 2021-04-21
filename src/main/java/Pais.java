package vehiculos;

import java.util.ArrayList;

public class Pais {
	
	String nombre;
	static ArrayList<Pais> paises = new ArrayList();
	int ventas = 0;
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Pais(String nombre) {
		this.nombre = nombre;
		paises.add(this);
	}
	
	public void vender() {
		ventas ++;
	}
	
	public int getVentas() {
		return ventas;
	}
	
	
	
	public static Pais paisMasVendedor() {
		Pais estrella = paises.get(0);
		for(int i=0; i<paises.size(); i++) {
			if(paises.get(i).getVentas() > estrella.getVentas()) {
				estrella = paises.get(i);
			}
		}
		
		return estrella;
	}
	
}

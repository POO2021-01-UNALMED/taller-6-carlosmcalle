package vehiculos;

import java.util.ArrayList;

public class Fabricante {
	String nombre;
	Pais pais;
	static ArrayList<Fabricante> fabricantes = new ArrayList();
	int ventas = 0;
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Pais getPais() {
		return pais;
	}
	public void setPais(Pais pais) {
		this.pais = pais;
	}
	public Fabricante(String nombre, Pais pais) {
		this.nombre = nombre;
		this.pais = pais;
	}
	
	  public void vender(){
	        ventas++;
	        pais.vender();
	    }

	    public int getVentas(){
	        return ventas;
	    }
	
	public static Fabricante paisMasVendedor() {
		Fabricante estrella = fabricantes.get(0);
		for(int i=0; i<fabricantes.size(); i++) {
			if(fabricantes.get(i).getVentas() > estrella.getVentas()) {
				estrella = fabricantes.get(i);
			}
		}
		
		return estrella;
	}
	
	
}

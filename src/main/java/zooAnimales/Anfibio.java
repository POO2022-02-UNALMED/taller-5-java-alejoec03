package zooAnimales;
import java.util.ArrayList;

import gestion.Zona;

public class Anfibio extends Animal{

	private static ArrayList<Anfibio> listado;
	public static int ranas=0;
	public static int salamandras=0;
	private String colorPiel;
	private boolean venenoso;
	
	
	
	public Anfibio(String nombre, int edad, String habitat, String genero, Zona zona, String colorPiel, boolean venenoso) {
		super(nombre, edad, habitat, genero, zona);
		this.colorPiel = colorPiel;
		this.venenoso = venenoso;
		Animal.cantAnfibio++;
	}
	public Anfibio() {Animal.cantAnfibio++;}
	
	public static ArrayList<Anfibio> getListado() {
		return listado;
	}
	public static void setListado(ArrayList<Anfibio> listado) {
		Anfibio.listado = listado;
	}
	public static int getRanas() {
		return ranas;
	}
	public static void setRanas(int ranas) {
		Anfibio.ranas = ranas;
	}
	public static int getSalamandras() {
		return salamandras;
	}
	public static void setSalamandras(int salamandras) {
		Anfibio.salamandras = salamandras;
	}
	public String getColorPiel() {
		return colorPiel;
	}
	public void setColorPiel(String colorPiel) {
		this.colorPiel = colorPiel;
	}
	public boolean isVenenoso() {
		return venenoso;
	}
	public void setVenenoso(boolean venenoso) {
		this.venenoso = venenoso;
	}
	
	public int cantidadAnfibios() {
		return ranas + salamandras;
	}
	
	public Anfibio crearRana(String nombre, int edad, String genero, Zona zona) {
		Anfibio rana = new Anfibio(nombre, edad, "selva", genero, zona, "rojo",true);
		Anfibio.ranas++;
		Anfibio.listado.add(rana);
		return rana;
	}
	
	public Anfibio crearSalamandra(String nombre, int edad, String genero, Zona zona) {
		Anfibio salamandra = new Anfibio(nombre, edad, "selva", genero, zona, "negro y amarrillo",false);
		Anfibio.salamandras++;
		Anfibio.listado.add(salamandra);
		return salamandra;
	}
	
	@Override
	public String movimiento() {
		return "saltar";
	}
	
}

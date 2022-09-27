package zooAnimales;
import java.util.ArrayList;

import gestion.Zona;

public class Ave extends Animal{

	private static ArrayList<Ave> listado;
	private static int halcones=0;
	private static int aguilas=0;
	private String colorPlumas;
	
	public static ArrayList<Ave> getListado() {
		return listado;
	}
	public static void setListado(ArrayList<Ave> listados) {
		listado = listados;
	}
	public static int getHalcones() {
		return halcones;
	}
	public static void setHalcones(int halcones) {
		Ave.halcones = halcones;
	}
	public static int getAguilas() {
		return aguilas;
	}
	public static void setAguilas(int aguilas) {
		Ave.aguilas = aguilas;
	}
	public String getColorPlumas() {
		return colorPlumas;
	}
	public void setColorPlumas(String colorPlumas) {
		this.colorPlumas = colorPlumas;
	}

	
	
	public Ave(String nombre, int edad, String habitat, String genero, Zona zona, String colorPlumas) {
		super(nombre, edad, habitat, genero, zona);
		this.colorPlumas = colorPlumas;
		Animal.cantAve++;
	}
	
	public Ave() {
		Animal.cantAve++;
	}
	
	public int cantidadAves() {
		return halcones + aguilas;
	}
	
	public Ave crearHalcon(String nombre, int edad, String genero, Zona zona) {
		Ave halcon = new Ave(nombre, edad, "montana", genero, zona, "cafe glorioso");
		Ave.halcones++;
		Ave.listado.add(halcon);
		return halcon;
	}
	
	public Ave crearAguila(String nombre, int edad, String genero, Zona zona) {
		Ave aguila = new Ave(nombre, edad, "montanas", genero, zona, "blanco y amarillo");
		Ave.aguilas++;
		Ave.listado.add(aguila);
		return aguila;
	}
	
	@Override
	public String movimiento() {
		return "volar";
	}
	
}

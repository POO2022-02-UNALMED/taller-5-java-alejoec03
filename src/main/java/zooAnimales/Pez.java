package zooAnimales;
import java.util.ArrayList;

import gestion.Zona;

public class Pez extends Animal{

	private static ArrayList<Pez> listado;
	public static int salmones=0;
	public static int bacalaos=0;
	private String colorEscamas;
	private int cantidadAletas;
	
	
	
	public Pez(String nombre, int edad, String habitat, String genero, Zona zona, String colorEscamas,
			int cantidadAletas) {
		super(nombre, edad, habitat, genero, zona);
		this.colorEscamas = colorEscamas;
		this.cantidadAletas = cantidadAletas;
		Animal.cantPez++;
	}
	
	public Pez(){Animal.cantPez++;}
	
	public static ArrayList<Pez> getListado() {
		return listado;
	}
	public static void setListado(ArrayList<Pez> listado) {
		Pez.listado = listado;
	}
	public static int getSalmones() {
		return salmones;
	}
	public static void setSalmones(int salmones) {
		Pez.salmones = salmones;
	}
	public static int getBacalaos() {
		return bacalaos;
	}
	public static void setBacalaos(int bacalaos) {
		Pez.bacalaos = bacalaos;
	}
	public String getColorEscamas() {
		return colorEscamas;
	}
	public void setColorEscamas(String colorEscamas) {
		this.colorEscamas = colorEscamas;
	}
	public int getCantidadAletas() {
		return cantidadAletas;
	}
	public void setCantidadAletas(int cantidadAletas) {
		this.cantidadAletas = cantidadAletas;
	}


	public int cantidadPeces() {
		return bacalaos + salmones;
	}
	
	public Pez crearSalmon(String nombre, int edad, String genero, Zona zona) {
		Pez salmon = new Pez(nombre, edad, "oceano", genero, zona, "rojo",6);
		Pez.salmones++;
		Pez.listado.add(salmon);
		return salmon;
	}
	
	public Pez crearBacalao(String nombre, int edad, String genero, Zona zona) {
		Pez bacalao = new Pez(nombre, edad, "oceano", genero, zona, "gris",6);
		Pez.bacalaos++;
		Pez.listado.add(bacalao);
		return bacalao;
	}
	
	
	@Override
	public String movimiento() {
		return "nadar";
	}
	
}

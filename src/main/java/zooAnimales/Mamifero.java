package zooAnimales;
import java.util.ArrayList;

import gestion.Zona;

public class Mamifero extends Animal{
	
	private static ArrayList<Mamifero> listado;
	private static int caballos=0;
	private static int leones=0;
	private boolean pelaje;
	private int patas;
	
	public Mamifero(String nombre, int edad, String habitat, String genero, Zona zona, boolean pelaje, int patas) {
		super(nombre, edad, habitat, genero, zona);
		this.pelaje = pelaje;
		this.patas = patas;
		Animal.cantMamifero++;
	}
	
	public Mamifero() {
		Animal.cantMamifero++;
	}
	
	public static ArrayList<Mamifero> getListado() {
		return listado;
	}
	public static void setListado(ArrayList<Mamifero> listado) {
		Mamifero.listado = listado;
	}
	public static int getCaballos() {
		return caballos;
	}
	public static void setCaballos(int caballos) {
		Mamifero.caballos = caballos;
	}
	public static int getLeones() {
		return leones;
	}
	public static void setLeones(int leones) {
		Mamifero.leones = leones;
	}
	public boolean isPelaje() {
		return pelaje;
	}
	public void setPelaje(boolean pelaje) {
		this.pelaje = pelaje;
	}
	public int getPatas() {
		return patas;
	}
	public void setPatas(int patas) {
		this.patas = patas;
	}
	
	public int cantidadMamiferos() {
		return caballos + leones;
	}
	
	public Mamifero crearCaballo(String nombre, int edad, String genero, Zona zona) {
		Mamifero caballo = new Mamifero(nombre, edad, "pradera", genero, zona, true, 4);
		Mamifero.caballos++;
		Mamifero.listado.add(caballo);
		return caballo;
	}
	
	public Mamifero crearLeon(String nombre, int edad, String genero, Zona zona) {
		Mamifero leon = new Mamifero(nombre, edad, "selva", genero, zona, true, 4);
		Mamifero.leones++;
		Mamifero.listado.add(leon);
		return leon;
	}
	
	

}

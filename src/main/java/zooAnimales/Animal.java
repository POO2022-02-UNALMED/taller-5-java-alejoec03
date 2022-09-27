package zooAnimales;
import gestion.Zona;

public class Animal {

	private static int totalAnimales=0;
	static int cantMamifero=0;
	static int cantAve=0;
	static int cantReptil=0;
	static int cantPez=0;
	static int cantAnfibio=0;
	private String nombre;
	private int edad;
	private String habitat;
	private String genero;
	private Zona zona;
	
	public Animal(String nombre, int edad, String habitat, String genero, Zona zona) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.habitat = habitat;
		this.genero = genero;
		this.zona = zona;
		totalAnimales++;
	}
	
	public Animal() {totalAnimales++;}
	
	public static int getTotalAnimales() {
		return totalAnimales;
	}
	public static void setTotalAnimales(int totalAnimales) {
		Animal.totalAnimales = totalAnimales;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String getHabitat() {
		return habitat;
	}
	public void setHabitat(String habitat) {
		this.habitat = habitat;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public Zona getZona() {
		return zona;
	}
	public void setZona(Zona zona) {
		this.zona = zona;
	}

	public String movimiento() {
		return "desplazarse";
	}
	
	public static String totalPorTipo() {
		return "Mamiferos:"+cantMamifero+"\n"+"Aves:"+cantAve+"\n"+"Reptiles:"+cantReptil+"\n"+"Peces:"+cantPez+"\n"+"Anfibios:"+cantAnfibio+"\n";
	}
	
	@Override
	public String toString() {
		if(this.zona==null) {
			return "Mi nombre es " + nombre + ", tengo una edad de " + edad + ", habito en" + habitat + " y mi genero es " + genero;
		}else {
			return "Mi nombre es " + nombre + ", tengo una edad de " + edad + ", habito en" + habitat + " y mi genero es " + genero + ", la zona en la que me ubico es "+this.zona.getNombre()+", en el "+ this.zona.getZoo().getNombre();
		}
	}
	
	
	
	
	
	
}

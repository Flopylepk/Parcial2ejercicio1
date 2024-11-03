package ejercicioVeterinaria;

public class Veterinaria {
	//atributos
	private String nombre;
	
	
	//constructor
	public Veterinaria(String nombre) {
		super();
		this.nombre = nombre;
	}

	//get y set
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
	//metodos
	@Override
	public String toString() {
		return "Veterinaria [nombre=" + nombre + "]";
	}
	
}

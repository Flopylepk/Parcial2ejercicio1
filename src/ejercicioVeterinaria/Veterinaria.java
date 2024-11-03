package ejercicioVeterinaria;

public class Veterinaria {
	private String nombre;

	public Veterinaria(String nombre) {
		super();
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "Veterinaria [nombre=" + nombre + "]";
	}
	
}

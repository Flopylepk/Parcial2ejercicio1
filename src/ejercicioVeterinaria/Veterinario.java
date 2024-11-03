package ejercicioVeterinaria;

public class Veterinario extends Usuario{
	private Veterinaria veterinaria;

	public Veterinario(String nombre, int edad, String dni, Veterinaria veterinaria) {
		super(nombre, edad, dni);
		this.veterinaria = veterinaria;
	}

	public Veterinaria getVeterinaria() {
		return veterinaria;
	}

	public void setVeterinaria(Veterinaria veterinaria) {
		this.veterinaria = veterinaria;
	}

	@Override
	public String toString() {
		return "Veterinario [veterinaria=" + veterinaria + ", toString()=" + super.toString() + "]";
	}

	@Override
	public void Registrarse() {
		super.Registrarse();
	}
	
}

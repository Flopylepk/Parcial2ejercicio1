package ejercicioVeterinaria;

public class Cliente extends Usuario{
	private String apellido;

	public Cliente(String nombre, int edad, String dni, String apellido) {
		super(nombre, edad, dni);
		this.apellido = apellido;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	@Override
	public String toString() {
		return "Cliente [apellido=" + apellido + ", toString()=" + super.toString() + "]";
	}

	@Override
	public void Registrarse() {
		super.Registrarse();
		apellido=validarCaracteres("ingrese su apellido");
	}
	
}

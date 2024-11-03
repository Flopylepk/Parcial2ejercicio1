package ejercicioVeterinaria;

import javax.swing.JOptionPane;

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
	
	public void RegistrarAnimales(Perro perro, Gato gato, Ave ave) {
		String[] animal= {"Perro", "Gato", "Ave"};
		int opcion=JOptionPane.showOptionDialog(null, "¿Qué animal quiere registrar?", null, 0, 0, null, animal, animal[0]);
		switch (opcion) {
		case 0:
			if (perro.getNombre().isEmpty()) {
				perro.Registrar();
			}else {
				JOptionPane.showMessageDialog(null, "usted ya registro al perro");
			}
			break;
		case 1:
			if (gato.getNombre().isEmpty()) {
				gato.Registrar();
			}else {
				JOptionPane.showMessageDialog(null, "usted ya registro al gato");
			}
			break;
		case 2:
			if (ave.getNombre().isEmpty()) {
				ave.Registrar();
			}else {
				JOptionPane.showMessageDialog(null, "usted ya registro al ave");
			}
			break;
		}
	}
	public void RevisarEstado(Perro perro, Gato gato, Ave ave) {
		String[] animal= {"Perro", "Gato", "Ave"};
		int opcion=JOptionPane.showOptionDialog(null, "¿Qué animal quiere ver el estado?", null, 0, 0, null, animal, animal[0]);
		switch (opcion) {
		case 0:
			if (perro.isPatas()==true) {
				JOptionPane.showMessageDialog(null, "Su perro esta perfectamente");
			}else {
				JOptionPane.showMessageDialog(null, "Su perro nesesita ser revisado");
			}
			break;
		case 1:
			if (gato.isCola()==true) {
				JOptionPane.showMessageDialog(null, "Su gato esta perfectamente");
			}else {
				JOptionPane.showMessageDialog(null, "Su gato nesesita ser revisado");
			}
			break;
		case 2:
			if (ave.isAlas()==true) {
				JOptionPane.showMessageDialog(null, "Su ave esta perfectamente");
			}else {
				JOptionPane.showMessageDialog(null, "Su ave nesesita ser revisado");
			}
		}
	}
	
}

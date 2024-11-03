package ejercicioVeterinaria;

import javax.swing.JOptionPane;

public class Usuario {
	//atributos
	private String nombre;
	private int edad;
	private String dni;
	
	//constructor
	public Usuario(String nombre, int edad, String dni) {
		this.nombre = nombre;
		this.edad = edad;
		this.dni = dni;
	}
	
	//get y set
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
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	
	//metodos
	@Override
	public String toString() {
		return "Usuario [nombre=" + nombre + ", edad=" + edad + ", dni=" + dni + "]";
	}
	
	//validaciones
	public void Registrarse() {
		nombre=validarCaracteres("ingrese su nombre");
		edad=validarNumeros("ingrese su edad");
		dni=validarCaracteres("ingrese su dni");
	}
	
	public void VerAnimales(Perro perro, Gato gato, Ave ave) {
		String[] animal= {"Perro", "Gato", "Ave"};
		int opcion=JOptionPane.showOptionDialog(null, "¿Qué animal quiere ver el registro?", null, 0, 0, null, animal, animal[0]);
		switch (opcion) {
		case 0:
			if (perro.getNombre().isEmpty()) {
				JOptionPane.showMessageDialog(null, "el perro no fue registrado");
			}else {
				JOptionPane.showMessageDialog(null, perro);
			}
			break;
		case 1:
			if (gato.getNombre().isEmpty()) {
				JOptionPane.showMessageDialog(null, "el gato no fue registrado");
			}else {
				JOptionPane.showMessageDialog(null, gato);
			}
			break;
		case 2:
			if (ave.getNombre().isEmpty()) {
				JOptionPane.showMessageDialog(null, "el ave no fue registrado");
			}else {
				JOptionPane.showMessageDialog(null, ave);
			}
			break;

		
		}
	}
	
	public static int validarNumeros(String mensaje) {
		boolean flag ;
		String num ="" ;
		do {
			flag =true;
			num = JOptionPane.showInputDialog(mensaje);
			while (num.isEmpty()) {
				num = JOptionPane.showInputDialog(mensaje);
			}
			for (int i = 0; i < num.length(); i++) {
				if (!Character.isDigit(num.charAt(i))) {
					flag = false;
					break;
				}
			}
		} while (!flag);
	
		return Integer.parseInt(num);
	}
	public String validarCaracteres(String mensaeje) {
		String palabra = "";
		while (palabra.equals("")) {
			palabra = JOptionPane.showInputDialog(mensaeje);
		}
		return palabra;
	}
	
}

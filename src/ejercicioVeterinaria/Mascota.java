package ejercicioVeterinaria;

import javax.swing.JOptionPane;

public class Mascota {
	//atributos
	private String nombre;
	private int edad;
	
	//constructor
	public Mascota(String nombre, int edad) {
		super();
		this.nombre = nombre;
		this.edad = edad;
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

	
	//metodos
	@Override
	public String toString() {
		return "Mascota [nombre=" + nombre + ", edad=" + edad + "]";
	}
	
	public void Registrar() {
		nombre=validarCaracteres("ingrese el nombre de su mascota");
		edad=validarNumeros("ingrese su edad");
	}
	
	//validaciones
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

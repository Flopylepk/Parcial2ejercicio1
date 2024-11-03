package ejercicioVeterinaria;

import javax.swing.JOptionPane;

public class Gato extends Mascota{
	//atributos
	private String raza;
	private boolean cola;
	
	//constructor
	public Gato(String nombre, int edad, String raza) {
		super(nombre, edad);
		this.raza = raza;
		this.cola = true;
	}
	
	//get y set
	public String getRaza() {
		return raza;
	}
	public void setRaza(String raza) {
		this.raza = raza;
	}
	public boolean isCola() {
		return cola;
	}
	public void setCola(boolean cola) {
		this.cola = cola;
	}
	
	//metodos
	@Override
	public String toString() {
		return "Gato [raza=" + raza + ", cola=" + cola + ", toString()=" + super.toString() + "]";
	}
	
	@Override
	public void Registrar() {
		super.Registrar();
		String []menu= {"si", "no"};
		raza=validarCaracteres("ingrese la raza de su gato");
		int opcion=JOptionPane.showOptionDialog(null, "¿La cola de tu gato esta bien?", null, 0, 0, null, menu, menu[0]);
		switch (opcion) {
		case 0:
			JOptionPane.showMessageDialog(null, "entonses no hay motivo para que su gato este aqui, se lo puede llevar");
			break;
		case 1:
			JOptionPane.showMessageDialog(null, "su gato va a pasar con el veterinario para ser curado");
			cola=false;
			break;
		
		}
	}
}

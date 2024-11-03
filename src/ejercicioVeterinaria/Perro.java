package ejercicioVeterinaria;

import javax.swing.JOptionPane;

public class Perro extends Mascota{
	private String raza;
	private boolean patas;
	public Perro(String nombre, int edad, String raza) {
		super(nombre, edad);
		this.raza = raza;
		this.patas = true;
	}
	public String getRaza() {
		return raza;
	}
	public void setRaza(String raza) {
		this.raza = raza;
	}
	public boolean isPatas() {
		return patas;
	}
	public void setPatas(boolean patas) {
		this.patas = patas;
	}
	@Override
	public String toString() {
		return "Perro [raza=" + raza + ", patas=" + patas + ", toString()=" + super.toString() + "]";
	}
	@Override
	public void Registrar() {
		super.Registrar();
		String []menu= {"si", "no"};
		raza=validarCaracteres("ingrese la raza de su perro");
		int opcion=JOptionPane.showOptionDialog(null, "¿Las patitas de tu perro estan bien?", null, 0, 0, null, menu, menu[0]);
		switch (opcion) {
		case 0:
			JOptionPane.showMessageDialog(null, "entonses no hay motivo para que su perro este aqui, se lo puede llevar");
			break;
		case 1:
			JOptionPane.showMessageDialog(null, "su perro va a pasar con el veterinario para ser curado");
			patas=false;
			break;
		
		}
	}
	
}

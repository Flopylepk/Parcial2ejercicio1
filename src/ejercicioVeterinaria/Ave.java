package ejercicioVeterinaria;

import javax.swing.JOptionPane;

public class Ave extends Mascota{
	//atributos
	private String tipo;
	private boolean alas;
	
	//constructor
	public Ave(String nombre, int edad, String tipo) {
		super(nombre, edad);
		this.tipo = tipo;
		this.alas = true;
	}
	
	//get y set
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public boolean isAlas() {
		return alas;
	}
	public void setAlas(boolean alas) {
		this.alas = alas;
	}
	
	//metodos
	@Override
	public String toString() {
		return "Ave [tipo=" + tipo + ", alas=" + alas + ", toString()=" + super.toString() + "]";
	}
	@Override
	public void Registrar() {
		super.Registrar();
		String []menu= {"si", "no"};
		tipo=validarCaracteres("ingrese el tipo de ave que posee");
		int opcion=JOptionPane.showOptionDialog(null, "¿Las alitas de tu ave estan bien?", null, 0, 0, null, menu, menu[0]);
		switch (opcion) {
		case 0:
			JOptionPane.showMessageDialog(null, "entonses no hay motivo para que su Ave este aqui, se lo puede llevar");
			break;
		case 1:
			JOptionPane.showMessageDialog(null, "su ave va a pasar con el veterinario para ser curado");
			alas=false;
			break;
		
		}
	}
	
}

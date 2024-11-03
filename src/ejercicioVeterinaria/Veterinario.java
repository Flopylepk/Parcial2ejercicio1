package ejercicioVeterinaria;

import javax.swing.JOptionPane;

public class Veterinario extends Usuario{
	//atributos
	private Veterinaria veterinaria;

	//constructor
	public Veterinario(String nombre, int edad, String dni, Veterinaria veterinaria) {
		super(nombre, edad, dni);
		this.veterinaria = veterinaria;
	}

	//get y set
	public Veterinaria getVeterinaria() {
		return veterinaria;
	}

	public void setVeterinaria(Veterinaria veterinaria) {
		this.veterinaria = veterinaria;
	}

	
	//metodos
	@Override
	public String toString() {
		return "Veterinario [veterinaria=" + veterinaria + ", toString()=" + super.toString() + "]";
	}

	@Override
	public void Registrarse() {
		super.Registrarse();
	}
	
	public void Revisaranimales(Perro perro, Gato gato, Ave ave) {
		
		String[] animal= {"Perro", "Gato", "Ave"};
		int opcion=JOptionPane.showOptionDialog(null, "¿Qué animal quiere revisra?", null, 0, 0, null, animal, animal[0]);
		switch (opcion) {
		case 0:
			if (perro.getNombre().isEmpty()) {
				JOptionPane.showMessageDialog(null, "el cliente no registro un perro");
			}else {
				if (perro.isPatas()==false) {
					JOptionPane.showMessageDialog(null, "el perrito tiene mal las patas");
				}else {
					JOptionPane.showMessageDialog(null, "el perrito esta perfectamente, no hace falta curarlo");
				}
			}
			break;
		case 1:
			if (gato.getNombre().isEmpty()) {
				JOptionPane.showMessageDialog(null, "el cliente no registro un gato");
			}else {
				if (gato.isCola()==false) {
					JOptionPane.showMessageDialog(null, "el gatito tiene mal la cola");
				}else {
					JOptionPane.showMessageDialog(null, "el gatito esta perfectamente, no hace falta curarlo");
				}
			}
			break;
		case 2:
			if (ave.getNombre().isEmpty()) {
				JOptionPane.showMessageDialog(null, "el cliente no registro un ave");
			}else {
				if (ave.isAlas()==false) {
					JOptionPane.showMessageDialog(null, "el ave tiene mal las alas");
				}else {
					JOptionPane.showMessageDialog(null, "el ave esta perfectamente, no hace falta curarlo");
				}
			}
			break;
		}
	}
	public void Curar(Perro perro, Gato gato, Ave ave) {
		String[] animal= {"Perro", "Gato", "Ave"};
		int opcion=JOptionPane.showOptionDialog(null, "¿Qué animal quiere curar?", null, 0, 0, null, animal, animal[0]);
		switch (opcion) {
		case 0:
			if (perro.getNombre().isEmpty()) {
				JOptionPane.showMessageDialog(null, "el cliente no registro un perro");
			}else {
				if (perro.isPatas()==false) {
					JOptionPane.showMessageDialog(null, "vamos a curarlo");
					perro.setPatas(true);
					JOptionPane.showMessageDialog(null, "felicidades, curaste al perrito");
				}else {
					JOptionPane.showMessageDialog(null, "el perrito esta perfectamente, no hace falta curarlo");
				}
			}
			break;
		case 1:
			if (gato.getNombre().isEmpty()) {
				JOptionPane.showMessageDialog(null, "el cliente no registro un gato");
			}else {
				if (gato.isCola()==false) {
					JOptionPane.showMessageDialog(null, "vamos a curarlo");
					gato.setCola(true);
					JOptionPane.showMessageDialog(null, "felicidades, curaste al gatito");
				}else {
					JOptionPane.showMessageDialog(null, "el gatito esta perfectamente, no hace falta curarlo");
				}
			}
			break;
		case 2:
			if (ave.getNombre().isEmpty()) {
				JOptionPane.showMessageDialog(null, "el cliente no registro un ave");
			}else {
				if (ave.isAlas()==false) {
					JOptionPane.showMessageDialog(null, "vamos a curarlo");
					ave.setAlas(true);
					JOptionPane.showMessageDialog(null, "felicidades, curaste al ave");
				}else {
					JOptionPane.showMessageDialog(null, "el ave esta perfectamente, no hace falta curarlo");
				}
			}
			break;
		}
		
	};
	
}

package ejercicioVeterinaria;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		Veterinaria veterinaria=new Veterinaria("Pepito");
		Veterinario veterinario=new Veterinario("",0,"", veterinaria);
		Cliente cliente=new Cliente("",0,"", "");
		Perro perro=new Perro("",0,"");
		Gato gato=new Gato("",0,"");
		Ave ave=new Ave("",0,"");

		
		String[] menu= {"Veterinario","Cliente", "Salir"};
		String[] menuV= {"Registrarse","ver cliente","ver registro de animales","revisar animales","curar animales","ver mi registro" ,"Salir"};
		String[] menuC= {"Registrarse","registrar animales","ver veterinario","ver estado de animales","ver registro de animales","ver mi registro" , "Salir"};
		
		int opcion=0;
		int opcionV=0;
		int opcionC=0;
		do {
			opcion=JOptionPane.showOptionDialog(null, "Elija que quiere ser hoy", null, 0, 0, null, menu, menu[0]);
			switch (opcion) {
			case 0:
				//veterinario
				do {
					opcionV=JOptionPane.showOptionDialog(null, "elija que hacemos", null, 0, 0, null, menuV, menuV[0]);
					switch (opcionV) {
					case 0:
						//registrarse
						if (veterinario.getNombre().isEmpty()) {
							veterinario.Registrarse();
						}else {
							JOptionPane.showMessageDialog(null, "usted ya se registro");
						}
						break;
					case 1:
						//ver cliente
						if (cliente.getNombre().isEmpty()) {
							JOptionPane.showMessageDialog(null, "el cliente no se registro");
						}else {
							JOptionPane.showMessageDialog(null, cliente);
						}
						break;
					case 2:
						//ver registro de animales
						if (veterinario.getNombre().isEmpty()) {
							JOptionPane.showMessageDialog(null, "usted tiene que registrarse primero");
						}else {
							veterinario.VerAnimales(perro, gato, ave);
						}
						break;
					case 3:
						//revisar animales
						if (veterinario.getNombre().isEmpty()) {
							JOptionPane.showMessageDialog(null, "usted tiene que registrarse primero");
						}else {
							veterinario.Revisaranimales(perro, gato, ave);
						}
						break;
					case 4:
						//curar animales
						if (veterinario.getNombre().isEmpty()) {
							JOptionPane.showMessageDialog(null, "usted tiene que registrarse primero");
						}else {
							veterinario.Curar(perro, gato, ave);;
						}
						break;
					case 5:
						//ver mi registro
						if (veterinario.getNombre().isEmpty()) {
							JOptionPane.showMessageDialog(null, "usted tiene que registrarse primero");
						}else {
							JOptionPane.showMessageDialog(null, veterinario);
						}
						break;
					case 6:
						//Salir
						JOptionPane.showMessageDialog(null, "nos vemos la proxima");
						break;
					}
				} while (opcionV!=6);
				
				break;
			case 1:
				//cliente
				do {
					opcionC=JOptionPane.showOptionDialog(null, "Elija que hacemos", null, 0, 0, null, menuC, menuC[0]);
					switch (opcionC) {
					case 0:
						//Registrarse
						if (cliente.getNombre().isEmpty()) {
							cliente.Registrarse();
						}else {
							JOptionPane.showMessageDialog(null, "usted ya se registro");
						}
						break;
					case 1:
						//ver veterinario
						if (veterinario.getNombre().isEmpty()) {
							JOptionPane.showMessageDialog(null, "EL veterinario no se registro");
						}else {
							JOptionPane.showMessageDialog(null, veterinario);
						}
						break;
					case 2:
						//registrar animales
						if (cliente.getNombre().isEmpty()) {
							JOptionPane.showMessageDialog(null, "deve registrarse primero");
						}else {
							cliente.RegistrarAnimales(perro, gato, ave);
						}
						break;
					case 3:
						//ver estado de animales
						if (cliente.getNombre().isEmpty()) {
							JOptionPane.showMessageDialog(null, "deve registrarse primero");
						}else {
							cliente.RevisarEstado(perro, gato, ave);
						}
						break;
					case 4:
						//ver registro de animales
						if (cliente.getNombre().isEmpty()) {
							JOptionPane.showMessageDialog(null, "deve registrarse primero");
						}else {
							cliente.VerAnimales(perro, gato, ave);
						}
						break;
					case 5:
						//ver mi registro
						if (cliente.getNombre().isEmpty()) {
							JOptionPane.showMessageDialog(null, "deve registrarse primero");
						}else {
							JOptionPane.showMessageDialog(null, cliente);
						}
						break;
					case 6:
						//Salir
						JOptionPane.showMessageDialog(null, "nos vemos la proxima");
						break;
					
					}
				} while (opcionC!=6);
				break;
			case 2:
				//salir
				JOptionPane.showMessageDialog(null, "nos vemos mas tarde");
				break;

			
			}
		} while (opcion!=2);
	}

}

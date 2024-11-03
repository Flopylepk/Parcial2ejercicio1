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
		String[] menuC= {"Registrarse","ver veterinario","ver estado de animales","ver registro de animales","ver mi registro" , "Salir"};
		
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
						
						break;
					case 1:
						
						break;
					case 2:
	
						break;
					case 3:
	
						break;
					case 4:
	
						break;
					case 5:
	
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
				
				break;
			case 2:
				//salir
				JOptionPane.showMessageDialog(null, "nos vemos mas tarde");
				break;

			
			}
		} while (opcion!=2);
	}

}

package coleccion;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Lista {

	private ArrayList<Persona> persona = new ArrayList<Persona>();
	Scanner ss = new Scanner(System.in);
	Scanner sn = new Scanner(System.in);
	
	//Constructores
	

	//Métodos
	public void cargar() {
		persona.add(new Persona("Adrián", "García Santos", "11111111A", 23,	"C/ Los Olivos", 3,	38493, "Santa Cruz de Tenerife"));
		persona.add(new Persona("Ana", "Méndez Núñez", "22222222B", 22, "C/ Los Pinos", 25, 38403, "Santa Cruz de Tenerife"));
		persona.add(new Persona("María", "Sánchez Camacho", "33333333C", 45, "C/ Los Franceces", 23, 38505, "Las Palmas"));
		persona.add(new Persona("Julio", "Brito González",	"44444444D", 30, "C/ Los Pinos", 25, 38403, "Las Palmas"));
	}
	
	public void listar() {
		for (Persona s: persona)
			System.out.print(s + "\n");
	}
	
	public void insertar() {		
		System.out.println("Introduzca el nombre:");
		String nombre = ss.nextLine();
		System.out.println("Introduzca los apellidos:");
		String apellidos = ss.nextLine();
		System.out.println("Introduzca el DNI:");
		String dni = ss.nextLine();
		System.out.println("Introduzca la edad:");
		int edad = sn.nextInt();
		System.out.println("Introduzca el nombre de la calle:");
		String calle = ss.nextLine();
		System.out.println("Introduzca el número de la casa:");
		int numero = sn.nextInt();
		System.out.println("Introduzca el código postal:");
		int cp = sn.nextInt();
		System.out.println("Introduzca la provincia:");
		String provincia = ss.nextLine();
		persona.add(new Persona(nombre, apellidos, dni, edad, calle, numero, cp, provincia));
	}
	
	
	public void eliminar() {
		System.out.println("Introduzca el dni de la persona a eliminar:");
		String dni = ss.nextLine();
		int posicion = buscar(dni);
		if (posicion != -1)
			persona.remove(posicion);
	}

	public int contar() {
		 return persona.size();
	}
	
	
	public void buscar() {
		System.out.println("Introduzca el dni de la persona a buscar:");
		String dni = ss.nextLine();
		int d=0;
		for(Persona s : persona) {
				if(dni.equals(s.getDni())) {
					System.out.println(s);
					d=1;
				}
		}
				if(d == 0)
					System.out.println("El número de dni que ha introducido no se encuentra en la lista");
	}
	
	public int buscar(String dni) {
		for(Persona s : persona)
			if(dni.equals(s.getDni()))
				return persona.indexOf(s);
		return -1;
	}

	public void ordenar() {
		Collections.sort(persona);
	}
}



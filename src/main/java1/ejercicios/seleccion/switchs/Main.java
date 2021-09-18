package ejercicios.seleccion.switchs;

import ejercicios.seleccion.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//hasta antes de la versión 1.7 de java, 
		//no funcionaba para strings, 
		//solo para enteros, bytes, ints
		
		Scanner teclado = new Scanner(System.in);
		String opcion;
		
		do {
		
		System.out.println("Escoja una opción");
		System.out.println("1. Realizar transferencia");
		System.out.println("2. Consultar pagos");
		System.out.println("3. Salir");
		opcion = teclado.nexLine();
		
		switch (opcion) {
		
		case "1":
		System.out.println("Ingrese número de cuenta");
		System.out.println();
		break;
		
		case "2":
		System.out.println("No existen pagos");
		System.out.println();
		break;
		
		case "3":
		System.out.println("Cerrando el sistema");
		System.out.println();
		break;
		
		default:
		System.out.println("No ha elegido ninguna opción válida");
		System.out.println();
		
		}
		
		if (opcion.equals("1")) {
		System.out.println("Ingrese número de cuenta");
		} else if (opcion.equals("2")) {
		System.out.println("No existen pagos");
		
		}
		
		} while (!opcion.equals("3"));
		System.out.println("Gracias por preferirnos");	   
	}

	}
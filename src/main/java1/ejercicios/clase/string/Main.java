package ejercicios.clase.string;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
		
		//1 Contains 
		
		String frase= "El que madruga Dios le ayuda";
		Scanner teclado = new Scanner (System.in); //Teclado
		System.out.println(" Ingrese una palabra ");
		String palabra = teclado.nextLine();
		boolean resultado = frase.contains(palabra);
		System.out.println("Contiene la palabra; " + resultado);	
		
		
		//2 Equals
		
		System.out.println("*********************************");
		
		String cadena1 = "salo";
		System.out.println("Ingrese la segunda cadena a comparar");
		String cadena2 = teclado.nextLine();
		boolean resultado2 = cadena1.equals(cadena2);
		System.out.println("Las cadenas son iguales:" + resultado2);
		
		
		//3 y 4 Upper Lower
		
		System.out.println("*********************************");
		
		String nombre1 = "nicole";
		String nombreEnMayuscula = nombre1.toUpperCase();
		System.out.println("Nombre en mayuscula:" + nombreEnMayuscula);

		System.out.println("*********************************");
		String nombre2 = "soffy";
		String nombreEnMinuscula = nombre2.toUpperCase();
		System.out.println("Nombre en minuscula:" + nombreEnMinuscula);
			
		
	}
}

package ejercicios.clase.string;

import java.util.Scanner;

public class MainEstudiante {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner teclado = new Scanner (System.in); //Teclado
		int op;
		
		System.out.println("***********************************");
		System.out.println(" 1) Ingresar nombre del estudiante ");
		System.out.println(" 2) Buscar al estudiante ");
		System.out.println("  3)  Salir  ");
		System.out.println("***********************************");
		
		op = teclado.nextInt();
		do {
			
			if (op == 1) {
			System.out.println("Ingrese identificación del estudiante");
			}
			
			else if (op == 2) {
			System.out.println("Ingrese una identificación");
			}
		}
		

	}

}

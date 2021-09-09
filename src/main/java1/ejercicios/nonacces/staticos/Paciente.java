package ejercicios.nonacces.staticos;

public class Paciente {
	private String nombre;
	private static int edad;
	private static String nacionalidad;
	private static int edadlimite = 65;
	
	public void registrar(String nombre) {
		System.out.println("Se registra el paciente: " + nombre);
		
	}
	
	private static void consultarNacionalidad() {
		System.out.println();
		
	}
	
	public static void consultaNacionalidadStatica() {
		System.out.println("La nacionalidad de:" + nacionalidad);
	}
	
	//Métodos SET y GET
			

}

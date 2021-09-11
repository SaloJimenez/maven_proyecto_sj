package ejercicios.nonacces.finall;

public class EstudianteOdontologia extends EstudianteMedicina {

	//No se puede sobrescribir un método final de la clase padre
	protected void realizarPracticas() {
		System.out.println("Realiza 50 horas de prácticas");
	
	}
	
	protected void realizarPasantias() {
		System.out.println("Realizar 200 horar de pasantías");

	}
	
}
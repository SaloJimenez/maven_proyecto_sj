package ejercicios.nonacces.finall;

public class EstudianteOdontologia extends EstudianteMedicina {

	//No se puede sobrescribir un m�todo final de la clase padre
	protected void realizarPracticas() {
		System.out.println("Realiza 50 horas de pr�cticas");
	
	}
	
	protected void realizarPasantias() {
		System.out.println("Realizar 200 horar de pasant�as");

	}
	
}
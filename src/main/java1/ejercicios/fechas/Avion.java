package ejercicios.fechas;

import java.time.LocalDate;

public class Avion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Date date = new Date();
		
		LocalDate diaHoy = LocalDate.now();
		LocalDate diaFin = diaHoy.plusDays(15);
		
		CursoVacacional curso1 = new CursoVacacional();
		curso1.setNombre("Voley principiantes");
		curso1.setFechaInicio(diaHoy);
		curso1.setFechaFin(diaFin);
		
		System.out.println("Nombre:" + curso1.getNombre());
		System.out.println("F I:" + curso1.getFechaInicio());
		System.out.println("F F:" + curso1.getFechaFin());
		
		LocalDate diaHoy2 = LocalDate.now();
		LocalDate diaQueInicio = diaHoy2.plusDays(2);
		LocalDate diaQueFinaliza = diaHoy2.plusDays(20);
	
		CursoVacacional curso2 = new CursoVacacional();
		curso2.setNombre("Natación prinpiantes");
		curso2.setFechaInicio(diaQueInicio);
		curso2.setFechaFin(diaQueFinaliza);
		
		System.out.println("Nombre:" + curso2.getNombre());
		System.out.println("F I:" + curso2.getFechaInicio());
		System.out.println("F F:" + curso2.getFechaFin());
		
		LocalDate fechaEspecifica = LocalDate.of(2022,2,15);
		System.out.println(fechaEspecifica);
		
		LocalDate fechaEsInicio = LocalDate.of (2022,2,15);
		LocalDate fechaEdFin = LocalDate.of (2022,7,10);
			
		CursoVacacional curso3 = new CursoVacacional();
		curso3.setNombre("Karate");
		curso3.setFechaInicio(fechaEsInicio);
		curso3setFechaFin(fechaEdFin);
		
		LocalDate fechaVista = curso3.getFechaFin();
		LocalDate fechaVistaNueva = fechaVista.plusDays(3);
		
		curso3.setFechaFin(fechaVistaNueva);
		
		System.out.println("Nombre:" + curso3.getNombre());
		System.out.println("F I:" + curso3.getFechaInicio());
		System.out.println("F F:" + curso3.getFechaFin());
		
	}

}

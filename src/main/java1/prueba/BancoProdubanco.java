package prueba;

public class BancoProdubanco {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner teclado = new Scanner(System.in);
		Scanner teclado2 = new Scanner(System.in);
		
		System.out.println(" Ingresar la clave: ");
		
		String num = teclado.nextLine();
		String clave="85AB";
	    boolean comparacion = num.equals(clave);
	    
	    while (comparacion == false){
	    	
	    	System.out.println(" Ingresar la clave ");
	    	num=teclado.nextLine();
	    	comparacion=num.equals(clave);
	    }
	    
	    System.out.println(" Gracias por preferirnos: ");
	    System.out.println();
	    System.out.println(" ************************ ");
	    System.out.println(" Produbanco: elija una opción ");
	    System.out.println(" 1. Realizar tranferencia ");
	    System.out.println(" 2. Consulta de transacciones ");
	    System.out.println(" 3. SALIR ");
	    System.out.println(" ************************ ");
	    
	    int opcion = teclado2.nextInt();
	    
	    while (opcion<3) {
	    	
	    	if (opcion==1) {
	    		System.out.println(" Ingrese una cuenta destino ");
	    		System.out.println();
	    	    System.out.println(" ******************************* ");
	    	    System.out.println(" Produbanco : elija una opción ");
	    	    System.out.println(" Produbanco: elija una opción ");
	    	    System.out.println(" 1. Realizar tranferencia ");
	    	    System.out.println(" 2. Consulta de transacciones ");
	    	    System.out.println(" 3. SALIR ");
	    	    System.out.println(" ************************ ");System.out.println("*****");
	    	    opcion = teclado2.nextInt();
	    	}else if (opcion==2) {
	    		System.out.println("Ingresar cuenta de destino:");
	    		String cuenta = teclado.nextLine();
	    		System.out.println("Ingresar cantidad a transferir:");
	    		int dineroTransferir = teclado2.nextInt();
	    		int saldo=1000;
	    		int nuevoSaldo=1000-dineroTransferir;
	    		System.out.println("Su nuevo saldo es: "+nuevoSaldo);
	    		System.out.println();
	    	    System.out.println("*************************");
	    	    System.out.println("Produbanco: elija una opción");
	    	    System.out.println(" Produbanco: elija una opción ");
	    	    System.out.println(" 1. Realizar tranferencia ");
	    	    System.out.println(" 2. Consulta de transacciones ");
	    	    System.out.println(" 3. SALIR ");
	    	    System.out.println(" ************************ ");System.out.println("**************");
	    	    opcion = teclado2.nextInt();
	    	}
	    }
	    if (opcion==3) {
	    	System.out.println(" Porfavor intentemás tarde ");
	    }
	}
}     
        
    }
    
}
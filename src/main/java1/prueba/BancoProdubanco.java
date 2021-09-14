package prueba;

public class BancoProdubanco {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double totalCuenta;
       
        BancoCuenta Cuenta1;
        Cuenta1 = new Cuenta(11111, 2500.70);
      
        totalCuenta = Cuenta1.saldo();
        System.out.println("Total actual en la cuenta: " + totalCuenta);
        
        double ingreso = 350.25;
        System.out.println("Se ingresan en la cuenta: " + ingreso);
        Cuenta1.depositar(ingreso);
        
        System.out.println("***************************");
        
        totalCuenta = Cuenta1.saldo();
        System.out.println("Total actual en la cuenta: " + totalCuenta);        
        
    }
    
}
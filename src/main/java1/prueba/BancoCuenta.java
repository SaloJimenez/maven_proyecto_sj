package prueba;

public class BancoCuenta extends BancoProdubanco {

	public class Cuenta {
	    
	    private int numeroCuenta;
	    private double clave;
	    
	    public Cuenta(int cuenta, double inicial) {
	        numeroCuenta = cuenta;
	        clave = inicial;
	    } 

	    public void depositar(double cantidad) {
	        clave = clave + cantidad;
	    } 

	    public void retirar(double cantidad) {
	        clave = clave - cantidad;
	    } 

	    public double clave () {
	        return clave;
	    }     
	    
	}
}

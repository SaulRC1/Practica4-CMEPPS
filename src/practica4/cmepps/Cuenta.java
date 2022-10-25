package practica4.cmepps;

public class Cuenta {
	
	private String numeroDeCuenta;
	
	private String titular;
	
	private double saldo;

	public Cuenta(String numeroDeCuenta, String titular, double saldo) {
		super();
		this.numeroDeCuenta = numeroDeCuenta;
		this.titular = titular;
		this.saldo = saldo;
	}

	public String getNumeroDeCuenta() {
		return numeroDeCuenta;
	}

	public void setNumeroDeCuenta(String numeroDeCuenta) {
		this.numeroDeCuenta = numeroDeCuenta;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public void ingresar(double importe) throws Exception {
		
		if(importe > 0) {
			
			this.saldo += importe;
			
		} else {
			throw new Exception("Importe no válido.");
		}
		
	}
	
	public void retirar(double importe) throws Exception {
		
		if(importe > 0) {
		
			this.saldo -= importe;
			
		} else {
			throw new Exception("Importe no válido.");
		}
		
	}

}

package clearminds.cuentas;

public class Cuenta {

	private String Id;
	private String Tipo;
	private double Saldo;
	
	
	public Cuenta(String id) {
		this.Id = id;
		this.Tipo = "A";
	}
	
	public Cuenta(String id, String tipo, double saldo) {
		this.Id = id;
		this.Tipo = tipo;
		this.Saldo = saldo;
	}
	
	public String getId() {
		return Id;
	}
	public String getTipo() {
		return Tipo;
	}
	public void setTipo(String tipo) {
		Tipo = tipo;
	}
	public double getSaldo() {
		return Saldo;
	}
	public void setSaldo(double saldo) {
		this.Saldo = saldo;
	}
	
	public void imprimir() {
		System.out.println("********************");
		System.out.println("");
		System.out.println("CUENTA");
		System.out.println("");
		System.out.println("********************");
		System.out.println("");
		System.out.println("Número de Cuenta: " + this.getId());
		System.out.println("Tipo: " + this.getTipo());
		System.out.println("Saldo: USD " + this.getSaldo());
		System.out.println("");
		System.out.println("********************");
	}
	
	public void imprimirConMiEstilo() {
		System.out.println("---------------------");
		System.out.println("");
		System.out.println("DETALLES DE CUENTA");
		System.out.println("");
		System.out.println("Número de Cuenta: " + this.getId());
		System.out.println("Tipo: " + this.getTipo());
		System.out.println("Saldo: $" + this.getSaldo());
		System.out.println("---------------------");
	}
	
}

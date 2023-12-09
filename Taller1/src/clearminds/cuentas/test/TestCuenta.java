package clearminds.cuentas.test;

import clearminds.cuentas.*;

public class TestCuenta {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Creo el objeto Cuenta y lo referencio con cuenta1
		Cuenta cuenta1 = new Cuenta("03476");
		
		//Coloco un valor de saldo en la cuenta1
		cuenta1.setSaldo(675);
		
		//Creo el objeto Cuenta y lo referencia con cuenta2
		Cuenta cuenta2 = new Cuenta("03476", "C", 98);
		
		//Creo el objeto Cuenta y lo referencio con cuenta3
		Cuenta cuenta3 = new Cuenta("03476");
		//Modifico el tipo de cuenta
		cuenta3.setTipo("C");
		
		
		//Imprimo cuenta1, cuenta2 y cuenta3
		System.out.println("-----------Valores Iniciales---------");
		cuenta1.imprimir();
		cuenta2.imprimir();
		cuenta3.imprimir();
		System.out.println("-----------Valores Modificados--------");
		cuenta1.setSaldo(444);
		cuenta3.setSaldo(567);
		cuenta2.setTipo("D");
		cuenta1.imprimir();
		cuenta2.imprimir();
		cuenta3.imprimir();
		
		//Creo el objeto Cuenta y lo referencio con cuenta4
		Cuenta cuenta4 = new Cuenta("0987");
		cuenta4.setSaldo(10);
		
		//Creo el objeto Cuenta y lo referencio con cuenta5
		Cuenta cuenta5 = new Cuenta("0557", "C", 10);
		
		//Creo el objeto Cuenta y lo referencio con cuenta6
		Cuenta cuenta6 = new Cuenta("0557", "A", 0);
		
		System.out.println("");
		System.out.println("-----------Imprimiendo con mi Estilo--------");
		cuenta4.imprimirConMiEstilo();
		cuenta5.imprimirConMiEstilo();
		cuenta6.imprimirConMiEstilo();
	}

}

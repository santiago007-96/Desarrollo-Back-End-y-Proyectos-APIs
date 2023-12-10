package com.cmc.directorio.entidades;

public class AdminTelefono {

	public void activarMensajeria(Telefono telefono) {
		if(telefono.getOperadora().contains("movi") ) {
			telefono.setTieneWhatsapp(true);
		}
	}
	
	public int contarMovi(Telefono telf1, Telefono telf2, Telefono telf3) {
		int Movi = 0;
		if (telf1.getOperadora().contains("movi")) {
			Movi = Movi + 1;
		} 
		if (telf2.getOperadora().contains("movi")) {
			Movi = Movi + 1;
		}
		if (telf3.getOperadora().contains("movi")) {
			Movi = Movi + 1;
		}
		
		return Movi;
	}
	
	public int contarClaro(Telefono telf1, Telefono telf2, Telefono telf3, Telefono telf4) {
		int Claro = 0;
		if (telf1.getOperadora().contains("claro")) {
			Claro = Claro + 1;
		} 
		if (telf2.getOperadora().contains("claro")) {
			Claro = Claro + 1;
		}
		if (telf3.getOperadora().contains("claro")) {
			Claro = Claro + 1;
		}
		if (telf4.getOperadora().contains("claro")) {
			Claro = Claro + 1;
		}
		
		return Claro;
	}
}

package krakedev.entidades;

import java.util.ArrayList;

public class Estudiante {

	private String nombre;
	private String apellido;
	private String cedula;
	private ArrayList<Nota> notas;
	
	public Estudiante(String nombre, String apellido, String cedula) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.cedula = cedula;
		this.notas = new ArrayList<Nota>();
	}
	
	public void agregarNota(Nota nota) {
		Nota elementoNota = null;
		Nota notaEncontrada = null;
		for(int i=0; i< this.notas.size(); i++) {
			elementoNota = this.notas.get(i);
			if(elementoNota.getMateria().getCodigo().equals(nota.getMateria().getCodigo()) != true) {
				//Materias con codigo no repetidas
				if(nota.getCalificacion() >= 0 && nota.getCalificacion() <= 10) {
					this.notas.add(nota);
				}
			}
		}
	}
	
	public void modificarNota(String codigoMateria, double nuevaNota) {
		Nota elementoNota = null;
		for(int i=0; i< this.notas.size(); i++) {
			elementoNota = this.notas.get(i);
			if(elementoNota.getMateria().getCodigo().equals(codigoMateria)) {
				if(nuevaNota >= 0 && nuevaNota <= 10) {
					elementoNota.setCalificacion(nuevaNota);
				}
			}
		}
	}
	

		
	}
}

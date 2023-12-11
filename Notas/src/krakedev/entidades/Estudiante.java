package krakedev.entidades;

import java.util.ArrayList;

public class Estudiante {

	private String nombre;
	private String apellido;
	private String cedula;
	private ArrayList<Nota> notas;
	
	public Estudiante(String cedula, String nombre, String apellido) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.cedula = cedula;
		this.notas = new ArrayList<Nota>();
	}
	
	
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public ArrayList<Nota> getNotas() {
		return notas;
	}

	public void setNotas(ArrayList<Nota> notas) {
		this.notas = notas;
	}

	
	public void agregarNota(Nota nota) {
		Nota elementoNota = null;
		Nota notaEncontrada = null;
		if(this.notas.size() == 0) {
			this.notas.add(nota);
		} else {
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
	
	public double calcularPromedioNotasEstudiante() {
		int totalArrayListNotas = this.notas.size();
		double totalNotas = Double.valueOf(totalArrayListNotas);
		double sumatotalNotas = 0;
		double promedioNotasEstudiante = 0;
		Nota elementoNota = null;
		for(int i=0; i< this.notas.size(); i++) {
			elementoNota = this.notas.get(i);
			sumatotalNotas = sumatotalNotas + elementoNota.getCalificacion();
		}
		
		promedioNotasEstudiante = sumatotalNotas / totalNotas;
		return promedioNotasEstudiante;
	}
		
	public void mostrar() {
		Nota elementoNota = null;
		for(int i=0; i< this.notas.size(); i++) {
			elementoNota = this.notas.get(i);
			System.out.println("Nota [Codigo = " + elementoNota.getMateria().getCodigo() + ", Nombre =" + elementoNota.getMateria().getNombre() + ", Calificacion = " + elementoNota.getCalificacion() + "]");
		}
	}
	
	
}

package krakedev.entidades;

import java.util.ArrayList;

public class Curso {

	private ArrayList<Estudiante> estudiantes;
	
	
	public Curso() {
		this.estudiantes = new ArrayList<Estudiante>();
	}

	
	public ArrayList<Estudiante> getEstudiantes() {
		return estudiantes;
	}


	public void setEstudiantes(ArrayList<Estudiante> estudiantes) {
		this.estudiantes = estudiantes;
	}


	public String buscarEstudiantePorCedula(Estudiante estudiante) {
		Estudiante elementoEstudiante = null;
		String msm = null;
		for(int i=0; i<this.estudiantes.size(); i++) {
			elementoEstudiante = this.estudiantes.get(i);
			if(elementoEstudiante.getCedula().equals(estudiante.getCedula())) {
				msm = "Estudiante encontrado!";
			}
		}
		
		return msm;
	}
	
	public void matricularEstudiante(Estudiante estudiante) {
		Estudiante elementoEstudiante = null;
		for(int i=0; i<this.estudiantes.size(); i++) {
			elementoEstudiante = this.estudiantes.get(i);
			if(elementoEstudiante.getCedula().equals(estudiante.getCedula()) != true) {
				this.estudiantes.add(estudiante);
				return;
			}
		}
	}
	
	public double calcularPromedioCurso() {
		int totalEstudiantes = this.estudiantes.size();
		double totalEstudiantesMat = Double.valueOf(totalEstudiantes);
		double sumatotalPromCadaEstudiante = 0;
		double promedioCurso = 0;
		Estudiante elementoEstudiante = null;
		for(int i=0; i<this.estudiantes.size(); i++) {
			elementoEstudiante = this.estudiantes.get(i);
			double promedioCadaEstudiante = elementoEstudiante.calcularPromedioNotasEstudiante();
			sumatotalPromCadaEstudiante = sumatotalPromCadaEstudiante + promedioCadaEstudiante;
			
		}
		
		promedioCurso = sumatotalPromCadaEstudiante / totalEstudiantesMat;
		return promedioCurso;	
	}
	
	public void mostrar() {
		Estudiante elementoEstudiante = null;
		for(int i=0; i< this.estudiantes.size(); i++) {
			elementoEstudiante = this.estudiantes.get(i);
			System.out.println("Nota [Cédula = " + elementoEstudiante.getCedula() + ", Nombre =" + elementoEstudiante.getNombre() + ", Apellido = " + elementoEstudiante.getApellido());
		}
	}
}

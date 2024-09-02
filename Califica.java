public class Califica {
	public static void main (String[] args){
		Alumno alumno = new Alumno();
		Profesor profe = new Profesor();

		profe.asignarCalificacionAlumno(alumno);
		System.out.println(alumno.mostrarCalificacion());
	}
}

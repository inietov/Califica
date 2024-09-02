class Profesor {
	private String nombre;

	public void setNombre(String nombre){
		this.nombre = nombre;
	}

	public String getNombre (){
		return this.nombre;
	}

	public void asignarCalificacionAlumno(Alumno alum){
		alum.setCalificacion(8.9);
	}
}

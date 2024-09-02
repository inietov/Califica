class Alumno {
	private double calificacion;
	private String nombre;

	public void setCalificacion(double calificacion){
		this.calificacion = calificacion;
	}

	public double mostrarCalificacion(){
		return calificacion;
	}

	public void setNombre(String nombre){
		this.nombre = nombre;
	}

	public String getNombre(){
		return this.nombre;
	}
}

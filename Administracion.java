package clasesCifoCom;

public class Administracion extends Empleados {
	private String Seccion;

	public Administracion(String nombre, String dni, double sueldo) {
		super(nombre, dni, sueldo);	
	}

	public String getSeccion() {
		return Seccion;
	}

	public void setSeccion(String seccion) {
		Seccion = seccion;
	}
}

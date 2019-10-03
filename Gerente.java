package clasesCifoCom;

public class Gerente extends Empleados {
	private String departamento;
	private int dietas;
	
	public Gerente(String nombre, String dni, double sueldo, String departamento, int dietas) {
		super(nombre, dni, sueldo);
		this.departamento = departamento;
		this.dietas = dietas;
	}

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

	public int getDietas() {
		return dietas;
	}

	public void setDietas(int dietas) {
		this.dietas = dietas;
	}

	public double setSueldoNetoDietas() {
		double netoDietas;
		netoDietas = setSueldoNeto() + dietas;
		return netoDietas;	
	}
}

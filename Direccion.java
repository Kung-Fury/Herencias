package clasesCifoCom;

public class Direccion extends Empleados {
	private int StockOptions;

	public Direccion(String nombre, String dni, double sueldo, int stockOption) {
		super(nombre, dni, sueldo);
		StockOptions = stockOption;
	}

	public int getStockOptions() {
		return StockOptions;
	}

	public void setStockOptions(int stockOption) {
		StockOptions = stockOption;
	}
	
	public double setSueldoNetoStocks() {
		double aux_stock;
		aux_stock = setSueldoNeto() + StockOptions*0.1;
		return aux_stock;
	}
}

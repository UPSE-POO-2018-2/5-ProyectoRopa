
public class Pantalon extends Prenda{
	
	private TiroPantalon tiroPantalon;
	
	public Pantalon(long id, int talla, double precio , String nombre, 
			String marca, String descripcion, TiroPantalon tiroPantalon) {
		super(id, talla, precio, nombre, marca, descripcion);
		this.tiroPantalon = tiroPantalon;
	}

	public TiroPantalon getTiroPantalon() {
		return tiroPantalon;
	}

	public void setTiroPantalon(TiroPantalon tiroPantalon) {
		this.tiroPantalon = tiroPantalon;
	}

	public double descuentoPantalon(int porcentaje)
	{
		double descuento = this.precio * porcentaje/100;
		return precio - descuento;
	}
	
	@Override
	public void draw()
	{
		String dibujo = ",==c==.\n" + 
				"|_/|\\_|\n" + 
				"| ´|` |\n" + 
				"|  |  |\n" + 
				"|  |  |\n" + 
				"|__|__|";
		
		System.out.println(dibujo);
	}

	@Override
	public String describirEnTexto() {
		String descripcion = "Esta imagen corresponde un pantalon " + this.nombre 
				+ " de tiro " + this.tiroPantalon
				+ " y color " + this.color
				+ " con las siguientes caracteristicas " 
				+ this.descripcion;
		return descripcion;
	}
	
}

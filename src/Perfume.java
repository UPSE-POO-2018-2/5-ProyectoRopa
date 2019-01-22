
public class Perfume extends Producto {

	private double volumen;
	private String fragancia;
	public static final double IMPUESTO_PERFUME = 0.15;
	
	public Perfume(long id, double precio, String nombre, double volumen, 
			String fragancia, Genero generoObjetivo) {
		super(id, precio, nombre);
		this.volumen = volumen;
		this.fragancia = fragancia;
		this.generoObjetivo = generoObjetivo;
	}

	public double getVolumen() {
		return volumen;
	}

	public void setVolumen(double volumen) {
		this.volumen = volumen;
	}

	public String getFragancia() {
		return fragancia;
	}

	public void setFragancia(String fragancia) {
		this.fragancia = fragancia;
	}

	@Override
	public String toString() {
		return "Perfume [id=" + id +  ", nombre=" + nombre + ",volumen=" + volumen + ", fragancia=" + fragancia + ",  precio=" + precio
				+ ", marca=" + marca + ", generoObjetivo=" + generoObjetivo + "]";
	}
	
//	public double calcularImpuestoEspecial()
//	{
//		double impuesto = super.calcularImpuesto() + precio * IMPUESTO_PERFUME;
//		return impuesto;
//	}
	
//	@Override
//	public double calcularImpuesto()
//	{
//		double impuesto = super.calcularImpuesto() + precio * IMPUESTO_PERFUME;
//		return impuesto;
//	}

	@Override
	public void draw() {
		String dibujo ="       _/\\_\n" + 
				"       \\__/\n" + 
				"       /  \\\n" + 
				"      |\\/\\/|\n" + 
				"      |\\/\\/|\n" + 
				"       \\__/\n" + 
				"       /__\\ ";
		System.out.println(dibujo);
	}

	@Override
	public String describirEnTexto() {
		String descripcion = "Esta imagen corresponde al perfume " + this.nombre 
				+ " con la fragancia " + this.fragancia 
				+ " y las siguientes caracteristicas " 
				+ this.descripcion;
		return descripcion;
	}
	
	@Override
	public double calcularTributo() 
	{
		double impuesto = this.precio * TASAIMPUESTO + this.precio * IMPUESTO_PERFUME;
		return impuesto;
	}

}

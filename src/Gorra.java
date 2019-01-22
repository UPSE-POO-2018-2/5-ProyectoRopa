
public class Gorra extends Prenda {

	TipoGorra tipoGorra;
	
	public Gorra(long id, int talla, double precio, String nombre, 
			String marca, String descripcion, TipoGorra tipoGorra) {
		super(id, talla, precio, nombre, marca, descripcion);
		this.tipoGorra = tipoGorra;
		
	}

	@Override
	public void draw() {
		String dibujo = "         _____\n" + 
				"      .-'     `-.\n" + 
				"     /           \\\n" + 
				"    |-.           |\n" + 
				"    |  \\          |\n" + 
				"VK  [__|__________|_______";
		System.out.println(dibujo);

	}

	@Override
	public String describirEnTexto() {
		String descripcion = "Esta imagen corresponde una gorra " + this.nombre 
				+ this.generoObjetivo
				+ " y color " + this.color
				+ " con las siguientes caracteristicas " 
				+ this.descripcion;
		return descripcion;
	}

	
	
}

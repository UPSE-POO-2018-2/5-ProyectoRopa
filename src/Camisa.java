
public class Camisa extends Prenda{

	private TipoManga tipoManga;
	
	public Camisa(long id, int talla, double precio, String nombre, String marca, 
			String descripcion, TipoManga tipoManga) {
		super(id, talla, precio, nombre, marca, descripcion);
		this.tipoManga = tipoManga;
	}

	public TipoManga getTipoManga() {
		return tipoManga;
	}

	public void setTipoManga(TipoManga tipoManga) {
		this.tipoManga = tipoManga;
	}

	@Override
	public String toString() {
		return "Camisa [tipoManga=" + tipoManga + super.toString() + "]";
	}

	@Override
	public void draw() {
		String dibujo = "   ___ ___\n" + 
				" /| |/|\\| |\\\n" + 
				"/_| ´ |.` |_\\\n" + 
				"  |   |.  |\n" + 
				"  |   |.  |\n" + 
				"  |___|.__|";
		
		System.out.println(dibujo);
		
	}

	@Override
	public String describirEnTexto() {
		String descripcion = "Esta imagen corresponde una camisa " + this.nombre 
				+ " de marca " + this.marca
				+ " y color " + this.color
				+ " con las siguientes caracteristicas " 
				+ this.descripcion;
		return descripcion;
	}

	

}

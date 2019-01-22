
public abstract class Prenda extends Producto {
	

	protected int talla;
	protected String tela;
	protected String color;
	

	
	public Prenda(long id, int talla, double precio, String nombre, String marca, String descripcion) {
		super(id, precio, nombre, marca, descripcion);
		this.talla = talla;
	}

	public int getTalla() {
		return talla;
	}

	public void setTalla(int talla) {
		this.talla = talla;
	}

	public String getTela() {
		return tela;
	}

	public void setTela(String tela) {
		this.tela = tela;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}


	@Override
	public String toString() {
		return "Prenda [id=" + id + ", talla=" + talla + ", precio=" + precio + ", nombre=" + nombre + ", marca="
				+ marca + "]";
	}


	
	
}

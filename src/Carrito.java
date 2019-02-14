import java.util.ArrayList;
import java.util.List;

public class Carrito {

	public static int NUMERO_GLOBAL_CARRITOS = 0;
	private long id;
	private Cliente cliente;
	private List<Producto> productos = new ArrayList<Producto>();
	private MedioPago medioDePago;
	private double total = 0;
	
	public Carrito(long id, Cliente cliente, List<Producto> productos) {
		super();
		this.id = id;
		this.cliente = cliente;
		this.productos = productos;
	}

	public Carrito(long id, Cliente cliente) {
		super();
		this.id = id;
		this.cliente = cliente;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public List<Producto> getProductos() {
		return productos;
	}

	public void setProductos(List<Producto> productos) {
		this.productos = productos;
	}

	public MedioPago getMedioDePago() {
		return medioDePago;
	}

	public void setMedioDePago(MedioPago medioDePago) {
		this.medioDePago = medioDePago;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	public long getId() {
		return id;
	}
	
	public void agregarProducto(Producto p)
	{
		productos.add(p);
	}
	
	public boolean quitarProducto(Producto p, int codigo)
	{
		//Aqui podria poner validacion codigo supervisor
		if(codigo == 4562)
		{
			return productos.remove(p);
		}else {
			return false;
		}
	}

	@Override
	public String toString() {
		return "Carrito [id=" + id + ", cliente=" + cliente + ", productos=" + productos + ", medioDePago="
				+ medioDePago + ", total=" + total + "]";
	}
	


}

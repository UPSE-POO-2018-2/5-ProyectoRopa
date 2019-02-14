import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;
import java.util.TreeSet;

public class MainTienda {

	public static Carrito carrito;
	public static Cliente consumidorFinal =
			new Cliente("0000000000", "Consumidor Final");
	public static Cliente clienteReal;
	public static Set<Producto> catalogo;
	
	public static void cargarCatalogo()
	{
		Producto gorra = new Gorra(1, 5, 15, "Gorra Nengo", "NBA", "Gorra de los Lakers", TipoGorra.BASKETBALL);
		Producto jean1 = new Pantalon(2, 34, 10, "Jean Levi", "Levi", "Jean Acampanado", TiroPantalon.LARGO);
		Producto boss = new Perfume(4, 10, "Obsession", 0.20, "Rocas rocosas de la tierra", Genero.MASCULINO);
		Producto boss2 = new Perfume(4, 10, "Obsession", 0.20, "Rocas rocosas de la tierra", Genero.MASCULINO);
		Producto polo = new Camisa(5, 38, 10, "Camisa Polo Ralph", "Ralph Lauren", "Camisa polo Roja y Azul", TipoManga.CORTA);
		Producto studioF = new Pantalon(7, 32, 40, "jean StudioF", "StudioF", "Jean andrajoso y roto, como te gusta", TiroPantalon.LARGO);
		studioF.setGeneroObjetivo(Genero.FEMENINO);
		catalogo = new HashSet<Producto>();
		catalogo.add(jean1);
		catalogo.add(polo);
		catalogo.add(boss);
		catalogo.add(boss2);
		catalogo.add(gorra);
		catalogo.add(studioF);
	}
	
	public static Producto buscarProductoEnCatalogo(long id)
	{
		for(Producto p: catalogo)
		{
			if(p.getId()==id)
			{
				return p;
			}
		}
		return null;
	}
	
	public static void main(String[] args) {
		cargarCatalogo();
		InterfazCLI.saludar();
	}

}

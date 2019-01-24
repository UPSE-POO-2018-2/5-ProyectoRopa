import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class MainTienda {

	public static void main(String[] args) {

		Producto gorra = new Gorra(1, 5, 15, "Gorra Nengo", "NBA", "Gorra de los Lakers", TipoGorra.BASKETBALL);
		Producto jean1 = new Pantalon(1, 34, 10, "Jean Levi", "Levi", "Jean Acampanado", TiroPantalon.LARGO);
		Producto boss = new Perfume(4, 10, "Obsession", 0.20, "Rocas rocosas de la tierra", Genero.MASCULINO);
		Producto boss2 = new Perfume(4, 10, "Obsession", 0.20, "Rocas rocosas de la tierra", Genero.MASCULINO);
		Producto polo = new Camisa(5, 38, 10, "Camisa Polo Ralph", "Ralph Lauren", "Camisa polo Roja y Azul", TipoManga.CORTA);
		Producto studioF = new Pantalon(7, 32, 40, "jean StudioF", "StudioF", "Jean andrajoso y roto, como te gusta", TiroPantalon.LARGO);
		studioF.setGeneroObjetivo(Genero.FEMENINO);

		System.out.println("Impuesto Gorra: " + gorra.calcularTributo());
		System.out.println("Impuesto Perfume: " + boss.calcularTributo());
		System.out.println("Impuesto Jean: " + jean1.calcularTributo());
		System.out.println("Impuesto Polo: " + polo.calcularTributo());
		System.out.println("Impuesto Perfume 2: " + boss2.calcularTributo());

		System.out.println();
		System.out.println("*****************");
		System.out.println("Inventario");
		List<Producto> inventario = new ArrayList<Producto>();
		inventario.add(jean1);
		inventario.add(polo);
		inventario.add(jean1);
		inventario.add(boss);
		inventario.add(boss2);
		inventario.add(gorra);
		inventario.add(studioF);
		
		System.out.println("Con for regular");
		for(int i=0; i<inventario.size(); i++)
		{
			System.out.println(inventario.get(i));
		}
		System.out.println();
		System.out.println("Con for Each");
		for(Producto p:inventario)
		{
			System.out.println(p);
		}

		System.out.println("Catalogo");
		Set<Producto> catalogo = new HashSet<Producto>();
		catalogo.add(jean1);
		catalogo.add(polo);
		catalogo.add(jean1);
		catalogo.add(boss);
		catalogo.add(boss2);
		catalogo.add(gorra);
		catalogo.add(studioF);
		
		for(Producto p:catalogo)
		{
			System.out.println(p);
		}
		
		if(catalogo.contains(studioF))
		{
			System.out.println("Si esta ese producto en el catalogo.");
		}
		
		System.out.println("Catalogo Ordenado por Insercion");
		Set<Producto> catalogoOrdenado = new LinkedHashSet<Producto>();
		catalogoOrdenado.add(jean1);
		catalogoOrdenado.add(polo);
		catalogoOrdenado.add(jean1);
		catalogoOrdenado.add(boss);
		catalogoOrdenado.add(boss2);
		catalogoOrdenado.add(gorra);
		catalogoOrdenado.add(studioF);
		
		for(Producto p:catalogoOrdenado)
		{
			System.out.println(p);
		}
		
		System.out.println("Catalogo Ordenado por mi Criterio");
		Set<Producto> catalogoOrdenadoPorCriterio = new TreeSet<Producto>();
		catalogoOrdenadoPorCriterio.add(jean1);
		catalogoOrdenadoPorCriterio.add(polo);
		catalogoOrdenadoPorCriterio.add(jean1);
		catalogoOrdenadoPorCriterio.add(boss);
		catalogoOrdenadoPorCriterio.add(boss2);
		catalogoOrdenadoPorCriterio.add(gorra);
		catalogoOrdenadoPorCriterio.add(studioF);
		
		for(Producto p:catalogoOrdenadoPorCriterio)
		{
			System.out.println(p);
		}
		
//		for(Genero gen: Genero.values())
//		{
//			System.out.println("Los productos del genero " + gen + " ABREV:" + gen.abreviatura);
//			for(Producto p:inventario)
//			{
//				if(p.generoObjetivo == gen)
//				{
//					System.out.println(p);
//				}
//			}
//			System.out.println("**************");
//		}

	}

}

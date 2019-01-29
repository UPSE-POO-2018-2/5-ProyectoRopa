import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;
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
		System.out.println("Inventario ArrayList");
		List<Producto> inventario = new ArrayList<Producto>();
		inventario.add(jean1);
		inventario.add(polo);
		inventario.add(jean1);
		inventario.add(boss);
		inventario.add(boss2);
		inventario.add(gorra);
		inventario.add(studioF);
		
		System.out.println("Con for regular");
		long startTimeArrayList = System.nanoTime();
		for(int i=0; i<inventario.size(); i++)
		{
			System.out.println(inventario.get(i));
		}
		long endTimeArrayList = System.nanoTime();
		long totalTimeArrayList = endTimeArrayList-startTimeArrayList;
		System.out.println("Tiempo Operacion Recorrido ArrayList " + totalTimeArrayList);
		
		System.out.println();
		System.out.println("Con for Each");
		for(Producto p:inventario)
		{
			System.out.println(p);
		}
		

		System.out.println();
		System.out.println("Inventario LinkedList");
		List<Producto> inventarioLinkedList = new LinkedList<Producto>();
		inventarioLinkedList.add(jean1);
		inventarioLinkedList.add(polo);
		inventarioLinkedList.add(jean1);
		inventarioLinkedList.add(boss);
		inventarioLinkedList.add(boss2);
		inventarioLinkedList.add(gorra);
		inventarioLinkedList.add(studioF);
		
		LinkedList<Producto>  inventarioLinkedList2 = (LinkedList<Producto>) inventarioLinkedList;
		inventarioLinkedList2.add(polo);
		inventarioLinkedList2.removeFirst();
		
		long startTimeLinkedList = System.nanoTime();
		for(Producto p:inventarioLinkedList)
		{
			System.out.println(p);
		}
		long endTimeLinkedList = System.nanoTime();
		long totalTimeLinkedList = endTimeLinkedList - startTimeLinkedList;

		System.out.println("Tiempo Operacion Recorrido ArrayList " + totalTimeLinkedList);
		
		
		
		for(int i=0; i<inventarioLinkedList.size(); i++)
		{
			System.out.println(inventarioLinkedList.get(i));
		}
		
		////////*************
		System.out.println();	
		System.out.println("Inventario Stack");
		
		List<Producto> inventarioStack = new Stack<Producto>();
		inventarioStack.add(jean1);
		inventarioStack.add(polo);
		inventarioStack.add(jean1);
		inventarioStack.add(boss);
		inventarioStack.add(boss2);
		inventarioStack.add(gorra);
		inventarioStack.add(studioF);
		
		Stack<Producto> inventarioStack2 =(Stack<Producto>) inventarioStack;
		Producto ultimoProducto = inventarioStack2.pop();
		System.out.println("El ultimo producto fue: " + ultimoProducto);
		inventarioStack2.push(polo);
		
		for(Producto p:inventarioStack)
		{
			System.out.println(p);
		}
		
		System.out.println();System.out.println();
		
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
		
		System.out.println();
		System.out.println("Cola de Productos");
		Queue<Producto> colaProductos = new PriorityQueue<Producto>(new Comparator<Producto>() {

			@Override
			public int compare(Producto o1, Producto o2) {
				if(o1.descripcion.length()<o2.descripcion.length())
					return -1;
				if(o1.descripcion.length()>o2.descripcion.length())
					return 1;
				if(o1.descripcion.length()==o2.descripcion.length())
					return 0;
				return 0;
			}
		});
		colaProductos.add(jean1);
		colaProductos.add(polo);
		colaProductos.add(jean1);
		colaProductos.add(boss);
		colaProductos.add(boss2);
		colaProductos.add(gorra);
		colaProductos.add(studioF);
		
		PriorityQueue colaProductos2 = (PriorityQueue<Producto>) colaProductos;
		
		
		Producto primerElementoVer = colaProductos.peek();
		System.out.println("El primer elemento de la cola es: " + primerElementoVer );
		
		Producto primerElementoTomar = colaProductos.poll();
		System.out.println("El elemento atendido es: " + primerElementoTomar);
		
		for(Producto p: colaProductos)
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

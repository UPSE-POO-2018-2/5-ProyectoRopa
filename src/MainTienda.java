import java.util.ArrayList;
import java.util.List;

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

		List<Producto> inventario = new ArrayList<Producto>();
		inventario.add(jean1);
		inventario.add(polo);
		inventario.add(boss);
		inventario.add(boss2);
		inventario.add(gorra);
		inventario.add(studioF);

		
		for(Genero gen: Genero.values())
		{
			System.out.println("Los productos del genero " + gen + " ABREV:" + gen.abreviatura);
			for(Producto p:inventario)
			{
				if(p.generoObjetivo == gen)
				{
					System.out.println(p);
				}
			}
			System.out.println("**************");
		}

	}

}

import java.util.Scanner;

public class InterfazCLI {

	public static Scanner scanner = new Scanner(System.in);
	
	public InterfazCLI() {
		// TODO Auto-generated constructor stub
	}
	
	public static void saludar()
	{
		System.out.println("***********Bienvenidos a la Tienda de Briggitte*************");
		System.out.println("Si es cliente, presione 1.");
		System.out.println("Si es vendedor, presione 2.");
		System.out.println("Si desea salir, presione 0.");
		int opcion = scanner.nextInt();
		switch (opcion) {
		case 0:
			System.exit(0);
			break;
		case 1:
			interfazCliente();
			break;
		case 2: 
			interfazVendedor();
			break;
		default:
			System.out.println("Esa no es una opcion valida. Presione 0 para salir.");
			saludar();
			break;
		}
	}

	private static void interfazVendedor() {
		System.out.println("Ud. ha ingresado como vendedor.");
		System.out.println("Presione 0 para salir.");
		System.out.println("Presione 1 para crear nuevo carrito.");
		System.out.println("Presione 2 para agregar producto al carrito.");
		System.out.println("Presione 3 para quitar producto");
		System.out.println("Presione 4 para consultar el precio de un producto.");
		System.out.println("Presione 5 para agregar datos de cliente.");
		System.out.println("Presione 9 para volver al menu principal");
		int opcion = scanner.nextInt();
		
		switch (opcion) {
		case 0:
			System.exit(0);
			break;
		case 1:
			int idCarrito = Carrito.NUMERO_GLOBAL_CARRITOS + 1;
			MainTienda.carrito = new Carrito(idCarrito, MainTienda.consumidorFinal);
			System.out.println("Carrito creado para consumidor final. Se desea datos use la opcion 5.");
			System.out.println();
			interfazVendedor();
			break;
		case 2:
			validarCarrito();
			System.out.println("Introduzca el codigo de producto para agregar al carrito:");
			long codigoProducto = scanner.nextLong();

			//buscar Producto en el catalogo
			Producto p = MainTienda.buscarProductoEnCatalogo(codigoProducto);
			
			if(p!=null)
			{
				MainTienda.carrito.agregarProducto(p);
				System.out.println("Producto " + p.getNombre() + " agregado al carrito." );
				System.out.println();
				interfazVendedor();
			}else {
				System.out.println("Producto no existe en el catalogo.");
				interfazVendedor();
			}
			break;
		case 9:
			System.out.println();
			saludar();
			break;
		default:
			break;
		}
	}

	public static void validarCarrito() {
		if(MainTienda.carrito==null)
		{
			System.err.println("Carrito no esta creado. Por favor use la opcion 1.");
			interfazVendedor();
			System.out.println();
		}
	}

	private static void interfazCliente() {
		// TODO Auto-generated method stub
		
	}

}

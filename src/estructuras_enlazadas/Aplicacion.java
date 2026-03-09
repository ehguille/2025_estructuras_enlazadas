package estructuras_enlazadas;

import depurador.Depurador;

public class Aplicacion {

	public Aplicacion() throws Exception {
		ListaSimpleEnlazada<String> les=new ListaSimpleEnlazada<String>();

		les.insertarPorDelante("Tres");
		les.insertarPorDelante("Dos");
		les.insertarPorDelante("Uno");
		les.insertarPorDelante("Cero");

		System.out.println(les);
		System.out.println(les.extraer(0));		
		System.out.println(les);

	}
	
	public static void main(String[] args) throws Exception {
		Depurador.encender();
		new Aplicacion();
	}

}

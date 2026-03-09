package estructuras_enlazadas;

import depurador.Depurador;

public class Aplicacion {

	public Aplicacion() throws Exception {
		
		Depurador.apagar();
		
		ListaSimpleEnlazada<String> les=new ListaSimpleEnlazada<String>();

		les.insertar("Uno");
		les.insertar("Dos");
		les.insertar("Tres");

		System.out.println(les);
		System.out.println(les.extraer(0));		
		System.out.println(les);

		ListaSimpleEnlazadaOrdenada<Integer> lseo=new ListaSimpleEnlazadaOrdenada<Integer>();
		lseo.insertar(3);
		lseo.insertar(5);
		lseo.insertar(2);
		lseo.insertar(4);
		lseo.insertar(1);
		System.out.println(lseo);
		lseo.extraer(2);
		lseo.insertar(5);
		System.out.println(lseo);
		lseo.borrar(1);
		lseo.borrar(5);
		lseo.borrar(5);
		lseo.borrar(2);
		lseo.borrar(4);
		lseo.borrar(4);
		System.out.println(lseo);
	}
	
	public static void main(String[] args) throws Exception {
		Depurador.encender();
		new Aplicacion();
	}

}

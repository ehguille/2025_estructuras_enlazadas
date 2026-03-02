package estructuras_enlazadas;

import depurador.Depurador;

public class Aplicacion {

	public Aplicacion() {
		ListaSimpleEnlazada<String> les=new ListaSimpleEnlazada<String>();
		les.insertar("Hola");
		les.insertar("Adios");
		System.out.println(les);
		

	}
	
	public static void main(String[] args) {
		Depurador.encender();
		new Aplicacion();
	}

}

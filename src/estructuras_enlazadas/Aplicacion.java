package estructuras_enlazadas;

import depurador.Depurador;

public class Aplicacion {

	public Aplicacion() {
		ListaSimpleEnlazada les=new ListaSimpleEnlazada();
	}
	
	public static void main(String[] args) {
		Depurador.encender();
		new Aplicacion();
	}

}

/**
 * Enunciado derivado de la siguiente URL:
 * https://www.it.uc3m.es/java/2011-12/units/pilas-colas/guides/2/guide_es_solution.html
 * Se ha modificado en clase.
 * 
 * ¿Cómo funciona la visibilidad en clases anidadas?
 * https://stackoverflow.com/questions/28267896/how-does-visibility-work-for-java-nested-classes
 * @param <T>
 */

package estructuras_enlazadas;
import depurador.Depurador;

public class ListaSimpleEnlazada<T> {

	private class Nodo {
		private T contenido; //Estas variables podrían ser públicas y no cambiaría nada.
		private Nodo siguiente;
		
		private Nodo(T contenido) {
			this.contenido=contenido;
			this.siguiente=null;
		}
	}
	
	private Nodo cabecera;
	
	public ListaSimpleEnlazada(){
		cabecera=null;
	}
	
	public void insertar(T contenido) {
		if(cabecera==null)
			cabecera=new Nodo(contenido);
		else {
			Nodo nodoIterador=cabecera;
			while(nodoIterador.siguiente!=null) {
				nodoIterador=nodoIterador.siguiente;
			}
			nodoIterador.siguiente=new Nodo(contenido);
		}
	}

	
/*	public T extraer() {
		
	}
	
	public T consultar(int i) {
		
	}
	*/
}

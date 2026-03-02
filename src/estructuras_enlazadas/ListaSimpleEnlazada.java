/**
 * Enunciado derivado de la siguiente URL:
 * https://www.it.uc3m.es/java/2011-12/units/pilas-colas/guides/2/guide_es_solution.html
 * Se ha modificado en clase.
 * @param <T>
 */

package estructuras_enlazadas;
import depurador.Depurador;

public class ListaSimpleEnlazada<T> {

	public class Nodo<T> {
		public T contenido;
		public Nodo<T> siguiente;
		
		public Nodo(T contenido) {
			this.contenido=contenido;
			this.siguiente=null;
		}
	}
	
	Nodo<T> cabecera;
	
	public ListaSimpleEnlazada(){
		cabecera=null;
	}
	
	public void insertar(T contenido) {
		Nodo<T> nuevoNodo=new Nodo<T>(contenido);
		if(cabecera==null)
			cabecera=nuevoNodo;
			
	}
	
	public T extraer() {
		
	}
	
	public T consultar(int i) {
		
	}
	
}

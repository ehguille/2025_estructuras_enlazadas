package estructuras_enlazadas.dobles;

import depurador.Depurador;
import estructuras_enlazadas.EstructuraDeDatos;

/**
 * https://www.youtube.com/watch?v=Tkf3nD9oUdQ&t=146s
 * https://ocw.uc3m.es/pluginfile.php/3726/mod_page/content/20/MC-F-002.6%20Unit%202.4.2%20Doubly%20Linked%20List%202018_es.pdf
 */

public class ListaDoblementeEnlazada<T> implements EstructuraDeDatos<T>{
	
	protected class Nodo {
		
		protected T dato;
		Nodo siguiente;
		Nodo anterior;
		
		protected Nodo(T contenido){
			dato=contenido;
			siguiente=null;
			anterior=null;
			//anterior tiene que apuntar al último nodo
			//¿igual hay que pasarle el nodo anterior como parámetro?
		}
		
	}
	
	private Nodo lista;//cabecera
	private int size;
	
	public ListaDoblementeEnlazada() {
		size=0;
		lista=null;//cabecera
	}

	public void insertar(T dato) {
		Nodo n=new Nodo(dato);
		if(size==0) {
			lista=n;			
			size++;
		}
		else {
			Nodo nodoIterador=lista;
			while(nodoIterador.siguiente!=null) 
				nodoIterador=nodoIterador.siguiente;
			nodoIterador.siguiente=n;
			n.anterior=nodoIterador;
			size++;
		}		
	}
	
	//Borrar el elemento en el que estoy
	public void borrar() {	}
	
	//Borrar en una posición determinada
	public void borrar(int posicion) {}
	
	public void avanzar() {}
	
	public void retroceder() {}
	
	public T extraer(int i) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}	
	
	//Obtiene el elemento y lo saca de la lista
	public T extraer() throws Exception {
		return null;
	}
	
	public T consultar(int i) {
		return null;
	}
	
	public String toString() {
		String resultado= "[";
		Nodo nodoIterador=lista;
		while(nodoIterador!=null) {
			resultado+=nodoIterador.dato.toString();
		if(nodoIterador.siguiente!=null)
			resultado+=",";
		nodoIterador=nodoIterador.siguiente;
		}
		resultado+="]";
		return resultado;
	}



}

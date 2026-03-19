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

	//TODO: Revisar, falla al añadir más de 2 elementos
	public void insertar(T dato) {
		Nodo nuevo=new Nodo(dato);
		//Para una lista vacía
		if(size==0) {
			nuevo.anterior=lista;
			lista=nuevo;
			size++;
			Depurador.trazar("LISTA PREVIAMENTE VACÍA");
			Depurador.trazar(this.toString());
		}
		else {
			Nodo nodoIterador=lista;
			//Si solo hay un elemento
			if(nodoIterador.siguiente==null) {
				nodoIterador.siguiente=nuevo;
				nuevo.anterior=nodoIterador;
				size++;
				Depurador.trazar("LISTA PREVIAMENTE CON UN ELEMENTO");
				Depurador.trazar(this.toString());
			} 
			else {
				System.out.println(this);
				while(nodoIterador!=null) {
					if(nodoIterador.siguiente!=null) {
						nodoIterador=nodoIterador.siguiente;
						Depurador.trazar("SALTANDO DE NODO");
					}
					else {
						nuevo.anterior=nodoIterador;
						nodoIterador.siguiente=nuevo;
						size++;
						Depurador.trazar("LISTA PREVIAMENTE CON MÁS DE UN ELEMENTO");
						Depurador.trazar(this.toString());
					}
				}
			}
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

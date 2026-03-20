package estructuras_enlazadas.dobles;

import depurador.Depurador;
import estructuras_enlazadas.EstructuraDeDatos;
import estructuras_enlazadas.ListaException;

/**
 * https://www.youtube.com/watch?v=Tkf3nD9oUdQ&t=146s
 * https://ocw.uc3m.es/pluginfile.php/3726/mod_page/content/20/MC-F-002.6%20Unit%202.4.2%20Doubly%20Linked%20List%202018_es.pdf
 */

public class ListaDoblementeEnlazada<T> implements EstructuraDeDatos<T>{
	
	protected class Nodo {
		
		protected T dato;
		protected Nodo siguiente, anterior;
		
		protected Nodo(T contenido){
			dato=contenido;
		}
		
	}
	
	private Nodo lista, actual;//cabecera
	private int size;
	
	//HECHO
	public void insertar(T dato) {
		Nodo n=new Nodo(dato);
		if(size==0) {
			lista=n;
			actual=n;
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
	
	//HECHO
	public void avanzar() {
		if(actual!=null&&actual.siguiente!=null)
			actual=actual.siguiente;
	}
	
	//HECHO
	public void retroceder() {
		if(actual!=null&&actual.anterior!=null) {
			actual=actual.anterior;
		}
	}
		
	//hecho
	public T consultar(int i) throws ListaException {
		Nodo iterador=lista;
		if(size==0) 
			throw new ListaException("La lista está vacía.");
		else if(i>=size) 
			throw new ListaException("No se puede acceder a una posición mayor que el tamaño de la lista.");
		else if(i<0) 
			throw new ListaException("No se puede acceder a una posición negativa.");
		else 
			for(int j=0;j<i;j++)
				iterador=iterador.siguiente;
		return iterador.dato;
	}
	
	//hecho
	public T consultar() {
		return actual.dato;		
	}

	//REVISAR (no he probado el borrado intermedio): Borrar el elemento en el que estoy
	public void borrar() {	
		if(size==1) {
			lista=null;
			actual=null;
		}
		else if (size>1) {
			if(actual==lista) { //Primer nodo
				lista=actual.siguiente;
				actual=actual.siguiente;
				actual.anterior=null;
			} 
			else if(actual.siguiente==null){ //Último nodo
				actual=actual.anterior;
				actual.siguiente=null;
			}
			else {
				actual=actual.anterior;
				actual.siguiente=actual.siguiente.siguiente;
				actual.siguiente.siguiente.anterior=actual;
			}
		}
	}
	
	//PDTE: Borrar en una posición determinada
	public void borrar(int posicion) {}
	
	//PDTE
	public T extraer(int i) throws Exception {
		//consultar() y después borrar()
		// TODO Auto-generated method stub
		return null;
	}		
	
	//PDTE: Obtiene el elemento y lo saca de la lista
	public T extraer() throws Exception {
		//consultar()+borrar()
		return null;
	}
	
	//hecho
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

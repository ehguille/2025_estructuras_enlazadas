/**
 * Enunciado derivado de la siguiente URL:
 * https://www.it.uc3m.es/java/2011-12/units/pilas-colas/guides/2/guide_es_solution.html
 * Se ha modificado en clase.
 * 
 * https://youtu.be/0NzAFk1CwaQ
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
	private int size;
	
	public ListaSimpleEnlazada(){
		size=0;
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
		size++;
	}
	
	public void insertarPorDelante(T contenido) {
		Nodo n=new Nodo(contenido);
		n.siguiente=cabecera;
		cabecera=n;
		size++;
	}
	
	public int getSize() {
		return size;
	}
	
	public T extraer(int posicion) throws Exception {
		if(posicion>=size||posicion<0)
			throw new Exception("Índice no válido (tamaño de la lista="+size+")");
		//Para eliminar el primer elemento.
		if(posicion==0) {
			T contenido=cabecera.contenido;
			cabecera=cabecera.siguiente;
			return contenido;
		}
		//Para eliminar el resto.
		Nodo iterador=cabecera;
		for(int i=0;i<posicion-1;i++) {
			iterador=iterador.siguiente;
		}
		T contenido=iterador.siguiente.contenido;
		iterador.siguiente=iterador.siguiente.siguiente;
		return contenido;
	}

	public T consultar(int posicion) throws Exception {
		if(posicion>=size||posicion<0)
			throw new Exception("Índice no válido (tamaño de la lista="+size+")");
		Nodo iterador=cabecera;
		for(int i=0;i<posicion;i++) {
			iterador=iterador.siguiente;
		}
		return iterador.contenido;
	}
	
	
	public String toString() {
		String resultado= "[";
		Nodo nodoIterador=cabecera;
		while(nodoIterador!=null) {
			resultado+=nodoIterador.contenido.toString();
		if(nodoIterador.siguiente!=null)
			resultado+=",";
		nodoIterador=nodoIterador.siguiente;
		}
		resultado+="]";
		return resultado;
		
	}
	
}

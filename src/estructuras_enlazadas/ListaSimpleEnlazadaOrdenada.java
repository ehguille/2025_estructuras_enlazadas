package estructuras_enlazadas;

import depurador.Depurador;

public class ListaSimpleEnlazadaOrdenada<T extends Comparable<T>> extends ListaSimpleEnlazada<T> {

	public void insertar(T contenido) {
		Nodo nuevoNodo=new Nodo(contenido);
		//Insertar al principio si la lista está vacía o si es menor al primer elemento
		if(cabecera==null||cabecera.contenido.compareTo(contenido)>0) {
			Depurador.trazar("El elemento "+contenido+" es el primero de la lista.");
			nuevoNodo.siguiente=cabecera;
			cabecera=nuevoNodo;
		}
		else {
			Nodo ni=cabecera;//Nodo iterador
			//Insertar al medio o al final
			while(ni.siguiente!=null && ni.siguiente.contenido.compareTo(contenido) <= 0) {
				Depurador.trazar("Comparando "+ni.siguiente.contenido+" con el valor a insertar "+contenido);
				ni=ni.siguiente;
			}
			nuevoNodo.siguiente=ni.siguiente;
			ni.siguiente=nuevoNodo;
		}
		size++;
	}
	
}

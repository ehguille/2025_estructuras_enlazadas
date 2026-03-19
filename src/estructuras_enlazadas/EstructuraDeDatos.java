package estructuras_enlazadas;

public interface EstructuraDeDatos<T> {
	
	public void insertar(T dato);
	
	public String toString();
	
	public T consultar(int i) throws Exception;
	
	public T extraer(int i) throws Exception;

}

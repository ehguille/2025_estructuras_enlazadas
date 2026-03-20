package estructuras_enlazadas;

public class ListaException extends Exception {
	
	public ListaException(String mensaje) {
		super("Error de lista:" +mensaje);
	}

}

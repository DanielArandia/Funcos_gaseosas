package modelo;
import cliente.Cliente;
import controlador.Eventos;
import vista.Ventana;

public class Launcher {

	public static void main(String[] args) {
		
		Cliente cl = new Cliente();
		
		Eventos ev = new Eventos(cl); 

		
		Ventana ventana = new Ventana(ev);
	}

}

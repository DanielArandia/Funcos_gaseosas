package modelo;
import vista.Ventana;
import controlador.Eventos;

public class Launcher {

	public static void main(String[] args) {
		
		Logica l = new Logica();
		
		Eventos ev = new Eventos(l); 
		
		Ventana ventana = new Ventana(ev);
	}

}

package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import modelo.Logica;

public class Eventos implements ActionListener{
	
	Logica l;
	
	public Eventos(Logica l) {
		this.l = l;
	}
	

	public void actionPerformed(ActionEvent e) {
		System.out.println(l.darMensaje());
		
	}

}

package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import cliente.Cliente;

public class Eventos implements ActionListener {
	
	Cliente cl;
	     
	public Eventos(Cliente cl) {
		this.cl = cl;
	}



	public void actionPerformed(ActionEvent e) {
		JButton button = (JButton) e.getSource();

		if(button.getText() == "Cocacola" ){
			cl.cocacola();
		}
		else if(button.getText()=="Pepsi"){
			cl.pepsi();
		}
	}
	
}

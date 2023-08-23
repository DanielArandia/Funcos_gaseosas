package vista;

import javax.swing.JButton;
import javax.swing.JFrame;

import controlador.Eventos;

public class Ventana extends JFrame{
	
	private Eventos ev;
	
	public Ventana(Eventos e) {
		super("Mi ventana");
		ev = e;
		initComponents();
	
	}
	public void initComponents() {
		this.setSize(400,400);
		this.setVisible(true);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLayout(null);
		this.addButtons();	
		
		
	}
	public void addButtons() {
		JButton button1 = new JButton("Cocacola");
		button1.setBounds(90, 80, 200, 60);
		button1.addActionListener(ev);
		this.add(button1);
			
		
	}

}

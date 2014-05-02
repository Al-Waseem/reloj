package Aplicacion;

import javax.swing.JFrame;

import ventana.Film;

public class App {
	
	private Film reloj;
	
	App(){
		reloj = new Film();
		reloj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		reloj.setSize(600,100);
		reloj.setVisible(true);
		windows.Window.centrar(reloj);
	}
	
	public static void main(String[] args) {
		
		//mostrar el reloj
		new App();
	}

}

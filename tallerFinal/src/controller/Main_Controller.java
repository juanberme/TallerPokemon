package controller;

import model.Logic;
import processing.core.PApplet;
import view.Main;

public class Main_Controller {

	private Logic lo;
	private PApplet app;
	private int pantallas=0;
	
	
	public Main_Controller(Main main) {
		app = main;
		
		pantallas=2;
		lo = new Logic(app);
		}

	public void draw() {

		lo.draw();

	}

	public void mousePressed() {

		// Boton Start
		if (lo.getPantalla()==0 && app.mouseX > 205 && app.mouseX < 301 && app.mouseY > 217 && app.mouseY < 244) {
			lo.setPantalla(1);
		}

		// Boton escoger nombre y continuar
		if (lo.getPantalla()==1 &&app.mouseX > 378 && app.mouseX < 450 && app.mouseY > 200 && app.mouseY < 223) {
			lo.setPantalla(2);
		}

		// Boton escoger osquirtle
		if (lo.getPantalla()==2 &&  app.mouseY > 245 && app.mouseY < 264 && app.mouseX > 194 && app.mouseX < 259) {

			lo.setPantalla(3);
			lo.setPokemn(1);
			
		}

		// Boton escoger charmalian
		if (lo.getPantalla()==2 && app.mouseY > 245 && app.mouseY < 264 && app.mouseX > 284 && app.mouseX < 346) {
			lo.setPantalla(3);
			lo.setPokemn(2);
			
		}

		// Boton escoger bermisaur
		if (lo.getPantalla()==2 && app.mouseY > 245 && app.mouseY < 264 && app.mouseX > 373 && app.mouseX < 435) {
			lo.setPantalla(3);
			lo.setPokemn(3);
			
			
		}
	}

	public void keyPressed(char key) {

		// personaje Caminando

		if (lo.getPantalla()==3 && app.keyCode == app.UP) {
			
			lo.movimientoarriba();
			
			
		}
		
		if (lo.getPantalla()==3 && app.keyCode == app.DOWN) {
			
			lo.movimientoabajo();
			
		}
		
		if (lo.getPantalla()==3 && app.keyCode == app.LEFT) {
			
			
			lo.movimientoladoi();
			
		}
		
		if (lo.getPantalla()==3 && app.keyCode == app.RIGHT) {
			
			
			lo.movimientoladod();
			
		}
		
		
		
		
		
		
		// En menu para pasar a pokedex
		if (lo.getPantalla()==3 && (key == 'p' || key == 'P')) {
			lo.setPantalla(4);
		} else {
			if ((lo.getPantalla()==4 || lo.getPantalla()==5|| lo.getPantalla()==6 || lo.getPantalla()==7) && (key == 'p' || key == 'P')) {
				lo.setPantalla(3);
				
			}
		}

		// Desplazarse desde pokedex a registros y devolverse
		if (lo.getPantalla()==4 && (key == 'r' || key == 'R')) {
			lo.setPantalla(8);
		} else if(lo.getPantalla()==8 && (key == 'p' || key == 'P')) {
			lo.setPantalla(4);
		}
				
			
		
		
		

	} // llave del keyPressed

}

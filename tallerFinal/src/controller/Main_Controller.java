package controller;

import model.Logic;
import processing.core.PApplet;
import view.Main;

public class Main_Controller {

	private Logic lo;
	private PApplet app;

	public Main_Controller(Main main) {

		lo = new Logic();
		app = main;

	}

	public void draw() {

		lo.draw();

	}

	public void mousePressed() {

		// Boton Start
		if (app.mouseX > 205 && app.mouseX < 301 && app.mouseY > 217 && app.mouseY < 244) {

		}

		// Boton escoger nombre y continuar
		if (app.mouseX > 378 && app.mouseX < 450 && app.mouseY > 200 && app.mouseY < 223) {

		}

		// Boton escoger osquirtle
		if (app.mouseY > 245 && app.mouseY < 264 && app.mouseX > 194 && app.mouseX < 259) {

		}

		// Boton escoger charmalian
		if (app.mouseY > 245 && app.mouseY < 264 && app.mouseX > 284 && app.mouseX < 346) {

		}

		// Boton escoger bermisaur
		if (app.mouseY > 245 && app.mouseY < 264 && app.mouseX > 373 && app.mouseX < 435) {

		}
	}

	public void keyPressed(char key) {

		
		
		
		
		
		
		
		
		
	
		
		
		
	}

}

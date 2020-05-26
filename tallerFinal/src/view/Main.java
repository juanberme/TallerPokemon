package view;

import controller.Main_Controller;
import exceptions.Excepcion1;
import processing.core.PApplet;
import processing.core.PImage;


public class Main extends PApplet {

	//Instancia del controller
	private Main_Controller mc;
	private boolean mensaje=false;
	PImage mensaje1,mensaje2,mensaje3;

	public static void main(String[] args) {
		PApplet.main("view.Main");
	}


	public void settings() {
		size(500, 375);
	}

	public void setup() {
		mc =new Main_Controller(this);
		
		mensaje1 = loadImage("../insumos/mensajePerdiste.png");
		
		
	}

	public void draw() {
		mc.draw();
		
		
		zonaCombate();
		if (mensaje==true) {
			
			image(mensaje1,0,0);
			
		}
		
	}

	public void mouseClicked() {
		
		mc.mouseClicked(); 
	}
	
	public void mousePressed() {
		mc.mousePressed();
	}

	public void keyPressed() {
		mc.keyPressed(key);
	}

	
	public void primerae() {
		
		try {
			mc.excepcionprimera();
			
		} catch (Excepcion1 e) {
			// TODO Auto-generated catch block
			mensaje=true;
			
			e.printStackTrace();
		}
	}
	
	public void zonaCombate() {
		
	 mc.zonaCombate();
	 
		
		
	}
}

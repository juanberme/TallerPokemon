package model;

import processing.core.PApplet;
import processing.core.PImage;

public class Jugador extends Entidades {
	
	private PApplet app;
	private int posx,posy,tipo=0;
	PImage eric1,eric2,eric3,eric4;
	private String eric;
	

	public Jugador(int pox, int poy, PApplet apP) {
		
		posx=pox;
		posy=poy;
		app=apP;
		eric2 = app.loadImage("../insumos/arriba.png");
		eric1 = app.loadImage("../insumos/abajo.png");
		eric3 = app.loadImage("../insumos/izquierda.png");
		eric4 = app.loadImage("../insumos/derecha.png");
		eric="eric1";
	}
	
	public void draw() {
		
		switch(getTipo()) {
		
		case 0:
			
			app.image(eric1,posx,posy);
		
		break;
			
		case 1:
			System.out.println(getTipo());
			app.image(eric2, posx, posy);
			
		break;	
		
		case 2:
			app.image(eric3, posx, posy);
			
		break;
		
		case 3:
			app.image(eric4, posx, posy);
			
		break;
		
		
		
		}
		
		
		
	}

	public void movimientoarriba() {

		
		setTipo(1);
		
	}

	

	public void movimientoabajo() {

		setTipo(0);
		
		
	}

	public void movimientoladod() {

		setTipo(3);
		
	}

	public void movimientoladoi() {

		
		setTipo(2);
		
	}
	
	
	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}

}

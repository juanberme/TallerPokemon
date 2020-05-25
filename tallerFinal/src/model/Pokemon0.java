package model;

import processing.core.PApplet;

public class Pokemon0 extends Entidades {

	private int pokemon,vida,tipo;
	private PApplet app;
	private float posXper,posYper;
	
	
	public Pokemon0(int i, PApplet apP, int pokemn, float posxper, float posyper) {
		
		app=apP;
		pokemon= pokemn;
		vida= i;
		posXper = posxper;
		posYper = posyper; 
		tipo=0;
		
	}
	
	
	public void draw(){
		
		if(pokemon==1) {
			
			
			
		}else if(pokemon==2) {
			
			
			
			
		}else if (pokemon==3) {
			
			
			
		}
		
		
	}	

public void movimientoarriba() {
		
		
		
		
		posYper=  (float) (posYper + (19.737));
		
		
		setPosYper(posYper);
		setTipo(1);
		
	}

	

	public void movimientoabajo() {
		posYper= (float)(posYper - (19.737));
		
		
		setPosYper(posYper);
		
		setTipo(0);
		
		
	}

	public void movimientoladod() {
		posXper=(float) (posXper - (21.739));
		
		
		setPosXper(posXper);
		setTipo(3);
		
	}

	public void movimientoladoi() {

		posXper= (float)(posXper + (21.739));
		
		
		setPosXper(posXper);
		setTipo(2);
		
	}


	public int getTipo() {
		return tipo;
	}


	public void setTipo(int tipo) {
		this.tipo = tipo;
	}


	public float getPosXper() {
		return posXper;
	}


	public void setPosXper(float posXper) {
		this.posXper = posXper;
	}


	public float getPosYper() {
		return posYper;
	}


	public void setPosYper(float posYper) {
		this.posYper = posYper;
	}
	
	
	

}

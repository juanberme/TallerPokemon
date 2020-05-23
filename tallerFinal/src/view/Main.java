package view;

import controller.Main_Controller;
import processing.core.PApplet;
import processing.core.PImage;





public class Main extends PApplet {

	//Instancia del controller
	private Main_Controller mc;
	
	
	//Declaración de variables 
	int pantallas;
	int posx;
	int posy;
	
	boolean escogeOsquirtle;
	boolean escogeCharmalian;
	boolean escogeBermisaur;
	boolean escogeRatata;

	PImage fondo;
	PImage fondoCuadricula;
	PImage inicio;
	PImage interior;
	PImage pokedexOsqui;
	PImage pokedexBermi;
	PImage pokedexJuli;
	PImage pokedexRatata;
	PImage saludo;
	PImage saludoProfesor;
	PImage interrogante;
	PImage arriba;
	PImage abajo;
	PImage izquierda;
	PImage derecha;

	public static void main(String[] args) {

		PApplet.main("view.Main");

	}


	public void settings() {
		size(500, 375);
	}

	public void setup() {

		mc =new Main_Controller(this);
		
		
		pantallas = 0;
		posx = 239;
		posy = 178;

		escogeOsquirtle = false;
		escogeCharmalian = false;
		escogeBermisaur = false;
		escogeRatata = false;

		fondo = loadImage("../insumos/fondo.png");
		fondoCuadricula = loadImage("../insumos/fondoCuadricula.png");
		inicio = loadImage("../insumos/inicio.png");
		interior = loadImage("../insumos/interior.png");
		pokedexOsqui = loadImage("../insumos/pokedexOsqui.png");
		pokedexBermi = loadImage("../insumos/pokedexBermi.png");
		pokedexJuli = loadImage("../insumos/pokedexJuli.png");
		pokedexRatata = loadImage("../insumos/pokedexRatata.png");
		saludo = loadImage("../insumos/saludo.png");
		saludoProfesor = loadImage("../insumos/saludoProfesor.png");
		interrogante = loadImage("../insumos/interrogante.png");
		arriba = loadImage("../insumos/arriba.png");
		abajo = loadImage("../insumos/abajo.png");
		izquierda = loadImage("../insumos/izquierda.png");
		derecha = loadImage("../insumos/derecha.png");
	}

	public void draw() {
		
		mc.draw();
		
		
		
		background(100);

		switch (pantallas) {

		case 0:
			image(inicio, 0, 0);
			textSize(25);
			text(("x: " + mouseX + ", y: " + mouseY), mouseX, mouseY);
			break;
		case 1:
			image(saludo, 0, 0);
			fill(0);
			textSize(10);
			text(("x: " + mouseX + ", y: " + mouseY), mouseX, mouseY);
			break;
		case 2:
			image(saludoProfesor, 0, 0);
			textSize(10);
			text(("x: " + mouseX + ", y: " + mouseY), mouseX, mouseY);
			break;
		case 3:
			image(fondo, 0, 0);
			
			//personaje inicial
			image(abajo,posx,posy);
			
			textSize(10);
			text(("x: " + mouseX + ", y: " + mouseY), mouseX, mouseY);
			break;

		// pokedex Osquirtle
		case 4:
			image(pokedexOsqui, 0, 0);

			if (escogeOsquirtle == false) {
				image(interrogante, 0, 0);
			}

			textSize(10);
			text(("x: " + mouseX + ", y: " + mouseY), mouseX, mouseY);
			break;

		// pokedex Charmalian
		case 5:
			image(pokedexJuli, 0, 0);

			if (escogeCharmalian == false) {
				image(interrogante, 0, 0);
			}

			textSize(10);
			text(("x: " + mouseX + ", y: " + mouseY), mouseX, mouseY);
			break;

		// pokedex Bermisaur
		case 6:
			image(pokedexBermi, 0, 0);

			if (escogeBermisaur == false) {
				image(interrogante, 0, 0);
			}

			textSize(10);
			text(("x: " + mouseX + ", y: " + mouseY), mouseX, mouseY);
			break;

		// pokedex Ratata
		case 7:
			image(pokedexRatata, 0, 0);

			if (escogeRatata == false) {
				image(interrogante, 0, 0);
			}

			textSize(10);
			text(("x: " + mouseX + ", y: " + mouseY), mouseX, mouseY);
			break;
		}

	}

	public void mousePressed() {

		mc.mousePressed();
		
	}

	public void keyPressed() {
		
		
		mc.keyPressed(key);
		
		
		//personaje Caminando
		
		
			
		
			
		

		// En menu para pasar a pokedex
		if (pantallas == 3 && (key == 'p'||key == 'P')) {
			pantallas = 4;
		} else {
			if ((pantallas == 4 || pantallas == 5 || pantallas == 6 || pantallas == 7) && (key == 'p'||key == 'P')) {
				pantallas = 3;
			}
		}

		// Desplazarse en pokedex desde Osquirtle
		if (pantallas == 4 && keyCode == UP) {
			pantallas = 6;
		} else {
			if (pantallas == 4 && keyCode == DOWN) {
				pantallas = 7;
			} else {

				// Desplazarse en pokedex desde Charmalian
				if (pantallas == 5 && keyCode == UP) {
					pantallas = 7;
				} else {
					if (pantallas == 5 && keyCode == DOWN) {
						pantallas = 6;
					} else {

						// Desplazarse en pokedex desde Bermisaur
						if (pantallas == 6 && keyCode == UP) {
							pantallas = 5;
						} else if (pantallas == 6 && keyCode == DOWN) {
							pantallas = 4;

						} else {

							// Desplazarse en pokedex desde Ratata
							if (pantallas == 7 && keyCode == UP) {
								pantallas = 4;
							} else {
								if (pantallas == 7 && keyCode == DOWN) {
									pantallas = 5;
								}
							}
						}
					}
				}
			}
		}

	}


}

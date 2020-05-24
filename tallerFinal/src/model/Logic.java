package model;

import java.util.LinkedList;

import processing.core.PApplet;
import processing.core.PImage;

public class Logic {
	private LinkedList <Entidades> entidad;
	private LinkedList <Usuario> user;
	private int pantalla,pox,poy;
	private int matrizMapa[][] = 
		{	{1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},
			{1,1,3,3,3,3,3,3,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1},
			{1,1,3,3,3,3,3,3,0,0,0,0,0,0,1,1,1,1,1,0,0,1,1},
			{1,1,3,3,3,3,3,3,0,0,0,0,0,0,1,1,1,1,1,0,0,1,1},
			{1,1,3,3,3,3,3,3,0,0,0,0,0,0,1,1,1,1,1,0,0,1,1},
			{1,1,3,3,3,3,3,3,0,0,0,0,0,0,1,1,1,1,1,0,0,1,1},
			{1,1,3,3,3,3,3,3,0,0,0,0,0,0,1,1,1,1,1,0,0,1,1},
			{1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1},
			{1,1,0,0,1,1,1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1},
			{1,1,0,0,1,1,1,1,1,0,0,0,0,0,0,0,0,0,0,0,0,1,1},
			{1,1,0,0,1,1,1,1,1,0,0,0,0,0,0,0,0,0,0,0,0,1,1},
			{1,1,0,0,1,1,1,1,1,0,0,0,0,0,0,0,0,0,0,0,0,1,1},
			{1,1,0,0,1,1,1,1,1,0,0,0,0,0,0,3,3,3,3,3,3,1,1},
			{1,1,0,0,1,1,1,1,1,0,0,0,0,0,0,3,3,3,3,3,3,1,1},
			{1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,3,3,3,3,3,3,1,1},
			{1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,3,3,3,3,3,3,1,1},
			{1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,3,3,3,3,3,3,1,1},
			{1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,3,3,3,3,3,3,1,1},
			{1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1}
	};
	private PApplet apP;
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

	float posx = 239;
	float posy = 178;
	boolean escogeOsquirtle;
	boolean escogeCharmalian;
	boolean escogeBermisaur;
	boolean escogeRatata;
	private int arribita,abajito,derechita,izquier,pomax,pomay;
	
	public Logic(PApplet app) {
		pantalla =0;
		apP=app;
		cargarImagenes();
		escogeOsquirtle = false;
		escogeCharmalian = false;
		escogeBermisaur = false;
		escogeRatata = false;
		entidad = new LinkedList<Entidades>();
		user = new LinkedList<Usuario>();
		crearPersonajes();
		
	
	
		
		
		
		
	}
	
	public void cargarImagenes() {
		
		fondo = apP.loadImage("../insumos/fondo.png");
		fondoCuadricula = apP.loadImage("../insumos/fondoCuadricula.png");
		inicio = apP.loadImage("../insumos/inicio.png");
		interior = apP.loadImage("../insumos/interior.png");
		pokedexOsqui = apP.loadImage("../insumos/pokedexOsqui.png");
		pokedexBermi = apP.loadImage("../insumos/pokedexBermi.png");
		pokedexJuli = apP.loadImage("../insumos/pokedexJuli.png");
		pokedexRatata = apP.loadImage("../insumos/pokedexRatata.png");
		saludo = apP.loadImage("../insumos/saludo.png");
		saludoProfesor = apP.loadImage("../insumos/saludoProfesor.png");
		interrogante = apP.loadImage("../insumos/interrogante.png");
		
	}
	
	public void crearPersonajes() {
		
		entidad.add(new Jugador(posx,posy,apP));
		entidad.add(new Pokemon0(200,apP));
		entidad.add(new Pokemon1(250,apP));
		entidad.add(new Pokemon2(230,apP));
		entidad.add(new Pokemon3(220,apP));
		
		
	} 
	public void draw() {
		 
		apP.background(100);

		switch (pantalla) {

		case 0:
			apP.image(inicio, 0, 0);
			apP.textSize(25);
			apP.text(("x: " + apP.mouseX + ", y: " + apP.mouseY), apP.mouseX, apP.mouseY);
			break;
		case 1:
			apP.image(saludo, 0, 0);
			apP.fill(0);
			apP.textSize(10);
			apP.text(("x: " + apP.mouseX + ", y: " + apP.mouseY), apP.mouseX, apP.mouseY);
			break;
		case 2:
			apP.image(saludoProfesor, 0, 0);
			apP.textSize(10);
			apP.text(("x: " + apP.mouseX + ", y: " + apP.mouseY), apP.mouseX, apP.mouseY);
			break;
		case 3:
			apP.image(fondoCuadricula, 0, 0);
			
			//personaje inicial
			entidad.get(0).draw();
			
			
			Thread Nh;
			Nh = new Thread(entidad.get(0));
			Nh.start();
			
			
			
			
			apP.textSize(10);
			apP.text(("x: " + apP.mouseX + ", y: " + apP.mouseY), apP.mouseX, apP.mouseY);
			break;

		// pokedex Osquirtle
		case 4:
			apP.image(pokedexOsqui, 0, 0);

			if (escogeOsquirtle == false) {
				apP.image(interrogante, 0, 0);
			}

			apP.textSize(10);
			apP.text(("x: " + apP.mouseX + ", y: " + apP.mouseY), apP.mouseX, apP.mouseY);
			break;

		// pokedex Charmalian
		case 5:
			apP.image(pokedexJuli, 0, 0);

			if (escogeCharmalian == false) {
				apP.image(interrogante, 0, 0);
			}

			apP.textSize(10);
			apP.text(("x: " + apP.mouseX + ", y: " + apP.mouseY), apP.mouseX, apP.mouseY);
			break;

		// pokedex Bermisaur
		case 6:
			apP.image(pokedexBermi, 0, 0);

			if (escogeBermisaur == false) {
				apP.image(interrogante, 0, 0);
			}

			apP.textSize(10);
			apP.text(("x: " + apP.mouseX + ", y: " + apP.mouseY), apP.mouseX, apP.mouseY);
			break;

		// pokedex Ratata
		case 7:
			apP.image(pokedexRatata, 0, 0);

			if (escogeRatata == false) {
				apP.image(interrogante, 0, 0);
			}

			apP.textSize(10);
			apP.text(("x: " + apP.mouseX + ", y: " + apP.mouseY), apP.mouseX, apP.mouseY);
			break;
		}
		
		
	}

	public int[][] getMatrizMapa() {
		return matrizMapa;
	}

	public void setMatrizMapa(int matrizMapa[][]) {
		this.matrizMapa = matrizMapa;
	}
	
	
	public int getPantalla() {
		return pantalla;
	}

	public void setPantalla(int pantalla) {
		this.pantalla = pantalla;
	}

	public void movimientoarriba() {
		
		//System.out.println("arriba");
		pomax= entidad.get(0).getPoxm();
		pomay= entidad.get(0).getPoym();
		System.out.println(matrizMapa[pomay][pomax]);
		if(matrizMapa[pomay-1][pomax]==0 || matrizMapa[pomay-1][pomax]==3 ) {
			
			entidad.get(0).setArribita(1);
			
			
		}
		

		
	}
	public void movimientoabajo() {
		
		//System.out.println("entro");
		pomax= entidad.get(0).getPoxm();
		pomay= entidad.get(0).getPoym();
		System.out.println(matrizMapa[pomay][pomax]);
		
		if(matrizMapa[pomay+1][pomax]==0 || matrizMapa[pomay+1][pomax]==3) {
		
		entidad.get(0).setAbajito(1);
		}
		
		
		
	}
	public void movimientoladod() {
		//System.out.println("entro");
		pomax= entidad.get(0).getPoxm();
		pomay= entidad.get(0).getPoym();
		System.out.println(matrizMapa[pomay][pomax]);
		
		
		if(matrizMapa[pomay][pomax+1]==0 || matrizMapa[pomay][pomax+1]==3) {
		entidad.get(0).setDerechita(1);
		
		}
		
		
		
	}
	public void movimientoladoi() {
		
		//System.out.println("entro");
		pomax= entidad.get(0).getPoxm();
		pomay= entidad.get(0).getPoym();
		System.out.println(matrizMapa[pomay][pomax]);
		
		if(matrizMapa[pomay][pomax-1]==0 || matrizMapa[pomay][pomax-1]==3) {
		entidad.get(0).setIzquier(1);
		}
		
		
	}
	
	
	
	
}

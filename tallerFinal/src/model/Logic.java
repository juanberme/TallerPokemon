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
	PImage ataque;
	PImage registros;
	PImage berDerecha;
	PImage berIzquierda;
	PImage charDerecha;
	PImage charIzquierda;
	PImage osqDerecha;
	PImage osqIzquierda;
	PImage ratDerecha;
	PImage ratIzquierda;
	PImage cincoIzquierda;
	PImage cuatroIzquierda;
	PImage tresIzquierda;
	PImage dosIzquierda;
	PImage unoIzquierda;
	PImage cincoDerecha;
	PImage cuatroDerecha;
	PImage tresDerecha;
	PImage dosDerecha;
	PImage unoDerecha;
	PImage tresIzq, dosIzq, unoIzq, tresDer, dosDer, unoDer;
	PImage juliPokedex, osquiPokedex, rataPokedex, bermiPokedex, pokedex;
	PImage derJuli, derOsqui, frenteBermi, derBermi, frenteOsqui, atrasBermi, frenteJuli, izqBermi, izqJuli, izqOsqui;
	
	float posx = 239;
	float posy = 178;
	boolean escogeOsquirtle,escogeCharmalian,escogeBermisaur,escogeRatata;
	private int pomax,pomay,pokemn=0;
	private float posxper,posyper;
	
	
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
		
		tresIzq = apP.loadImage("../insumos/tresIzq.png");
		dosIzq = apP.loadImage("../insumos/dosIzq.png");
		unoIzq = apP.loadImage("../insumos/unoIzq.png");
		tresDer = apP.loadImage("../insumos/tresDer.png");
		dosDer = apP.loadImage("../insumos/dosDer.png");
		unoDer = apP.loadImage("../insumos/unoDer.png");
		juliPokedex = apP.loadImage("../insumos/juliPokedex.png"); 
		osquiPokedex = apP.loadImage("../insumos/osquiPokedex.png");
		rataPokedex = apP.loadImage("../insumos/rataPokedex.png");
		bermiPokedex = apP.loadImage("../insumos/bermiPokedex.png");
		pokedex = apP.loadImage("../insumos/pokedex.png");
		
		ataque = apP.loadImage("../insumos/ataque.png");
		registros = apP.loadImage("../insumos/registros.png");
		berDerecha = apP.loadImage("../insumos/berDerecha.png");
		berIzquierda = apP.loadImage("../insumos/berIzquierda.png");
		charDerecha = apP.loadImage("../insumos/charDerecha.png");
		charIzquierda = apP.loadImage("../insumos/charIzquierda.png");
		osqDerecha = apP.loadImage("../insumos/osqDerecha.png");
		osqIzquierda = apP.loadImage("../insumos/osqIzquierda.png");
		ratDerecha = apP.loadImage("../insumos/ratDerecha.png");
		ratIzquierda = apP.loadImage("../insumos/ratIzquierda.png");
		cincoIzquierda = apP.loadImage("../insumos/cincoIzquierda.png");
		cuatroIzquierda = apP.loadImage("../insumos/cuatroIzquierda.png");
		tresIzquierda = apP.loadImage("../insumos/tresIzquierda.png");
		dosIzquierda = apP.loadImage("../insumos/dosIzquierda.png");
		unoIzquierda = apP.loadImage("../insumos/unoIzquierda.png");
		cincoDerecha = apP.loadImage("../insumos/cincoDerecha.png");
		cuatroDerecha = apP.loadImage("../insumos/cuatroDerecha.png");
		tresDerecha = apP.loadImage("../insumos/tresDerecha.png");
		dosDerecha = apP.loadImage("../insumos/dosDerecha.png");
		unoDerecha = apP.loadImage("../insumos/unoDerecha.png");
		
		derJuli = apP.loadImage("../insumos/derJuli.png");
		derOsqui = apP.loadImage("../insumos/derOsqui.png");
		frenteBermi = apP.loadImage("../insumos/frenteBermi.png");
		derBermi = apP.loadImage("../insumos/derBermi.png");
		frenteOsqui = apP.loadImage("../insumos/frenteOsqui.png");
		atrasBermi = apP.loadImage("../insumos/atrasBermi.png");
		frenteJuli = apP.loadImage("../insumos/frenteBermi.png");
		izqBermi = apP.loadImage("../insumos/izqBermi.png");
		izqJuli = apP.loadImage("../insumos/izqJuli.png");
		izqOsqui = apP.loadImage("../insumos/izqOsqui.png");
		
	}
	
	public void crearPersonajes() {
		
		entidad.add(new Jugador(posx,posy,apP));
		posxper= entidad.get(0).getPosx();
		posyper = entidad.get(0).getPosy();
		entidad.add(new Pokemon0(200,apP,pokemn,posxper,posyper));
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
			apP.image(fondo, 0, 0);
			
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
			apP.image(pokedex, 0, 0);

			apP.textSize(10);
			apP.text(("x: " + apP.mouseX + ", y: " + apP.mouseY), apP.mouseX, apP.mouseY);
			break;

		// pokedex Charmalian
		case 5:
			apP.image(pokedexJuli, 0, 0);

			apP.textSize(10);
			apP.text(("x: " + apP.mouseX + ", y: " + apP.mouseY), apP.mouseX, apP.mouseY);
			break;

		// pokedex Bermisaur
		case 6:
			apP.image(pokedexBermi, 0, 0);

			apP.textSize(10);
			apP.text(("x: " + apP.mouseX + ", y: " + apP.mouseY), apP.mouseX, apP.mouseY);
			break;

		// pokedex Ratata
		case 7:
			apP.image(pokedexRatata, 0, 0);

			apP.textSize(10);
			apP.text(("x: " + apP.mouseX + ", y: " + apP.mouseY), apP.mouseX, apP.mouseY);
			break;
			
		// registros	
		case 8:
			apP.image(registros, 0, 0);

			apP.textSize(10);
			apP.text(("x: " + apP.mouseX + ", y: " + apP.mouseY), apP.mouseX, apP.mouseY);
			break;
			
			
			
			
			
		}//llave del switch
		
		
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

	
	
	public int getPokemn() {
		return pokemn;
	}

	public void setPokemn(int pokemn) {
		this.pokemn = pokemn;
	}

	
	
	
	
	
	
}
